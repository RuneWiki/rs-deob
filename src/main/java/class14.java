import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public abstract class class14 extends class40 {

    @OriginalMember(owner = "mapview!ga", name = "bb", descriptor = "[[B")
    private byte[][] field134 = new byte[256][];

    @OriginalMember(owner = "mapview!ga", name = "T", descriptor = "I")
    private int field126 = 0;

    @OriginalMember(owner = "mapview!ga", name = "cb", descriptor = "[I")
    private int[] field135;

    @OriginalMember(owner = "mapview!ga", name = "Y", descriptor = "[I")
    private int[] field131;

    @OriginalMember(owner = "mapview!ga", name = "V", descriptor = "[I")
    private int[] field128;

    @OriginalMember(owner = "mapview!ga", name = "G", descriptor = "[I")
    private int[] field113;

    @OriginalMember(owner = "mapview!ga", name = "H", descriptor = "Lu;")
    private static class38 field114 = class28.method177("img=", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "E", descriptor = "Lu;")
    private static class38 field111 = class28.method177("u", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "K", descriptor = "Lu;")
    private static class38 field117 = class28.method177("str", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "J", descriptor = "Lu;")
    private static class38 field116 = class28.method177("shad", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "X", descriptor = "Lu;")
    private static class38 field130 = class28.method177("shad=", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "I", descriptor = "I")
    private static int field115 = 0;

    @OriginalMember(owner = "mapview!ga", name = "S", descriptor = "I")
    private static int field125 = -1;

    @OriginalMember(owner = "mapview!ga", name = "Q", descriptor = "Lu;")
    private static class38 field123 = class28.method177("str=", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "L", descriptor = "Lu;")
    private static class38 field118 = class28.method177("u=", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "db", descriptor = "Lu;")
    private static class38 field136 = class28.method177("br", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "P", descriptor = "Lu;")
    private static class38 field122 = class28.method177("lt", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "Z", descriptor = "Lu;")
    private static class38 field132 = class28.method177("gt", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "ab", descriptor = "Lu;")
    private static class38 field133 = class28.method177(")4str", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "R", descriptor = "Lu;")
    private static class38 field124 = class28.method177("col=", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "U", descriptor = "I")
    private static int field127 = -1;

    @OriginalMember(owner = "mapview!ga", name = "F", descriptor = "I")
    private static int field112 = -1;

    @OriginalMember(owner = "mapview!ga", name = "hb", descriptor = "Lu;")
    private static class38 field140 = class28.method177(")4u", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "ib", descriptor = "I")
    private static int field141 = 0;

    @OriginalMember(owner = "mapview!ga", name = "jb", descriptor = "Lu;")
    private static class38 field142 = class28.method177(")4col", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "M", descriptor = "I")
    private static int field119 = 0;

    @OriginalMember(owner = "mapview!ga", name = "C", descriptor = "Lu;")
    private static class38 field109 = class28.method177(")4shad", (byte) -84);

    @OriginalMember(owner = "mapview!ga", name = "W", descriptor = "I")
    private static int field129 = 256;

    @OriginalMember(owner = "mapview!ga", name = "O", descriptor = "I")
    private static int field121 = 256;

    @OriginalMember(owner = "mapview!ga", name = "gb", descriptor = "I")
    private static int field139 = -1;

    @OriginalMember(owner = "mapview!ga", name = "fb", descriptor = "I")
    private static int field138 = 0;

    @OriginalMember(owner = "mapview!ga", name = "eb", descriptor = "[B")
    private byte[] field137;

    @OriginalMember(owner = "mapview!ga", name = "D", descriptor = "[I")
    private int[] field110;

    @OriginalMember(owner = "mapview!ga", name = "N", descriptor = "[Lca;")
    private static class6[] field120;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(II)V", line = 7)
    private final void method64(int arg0, int arg1) {
        field125 = -1;
        field139 = -1;
        field112 = arg1;
        field127 = arg1;
        field115 = arg0;
        field141 = arg0;
        field129 = 256;
        field121 = 256;
        field138 = 0;
        field119 = 0;
    }

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "()V", line = 22)
    public static void method65() {
        field122 = null;
        field132 = null;
        field114 = null;
        field136 = null;
        field124 = null;
        field142 = null;
        field118 = null;
        field111 = null;
        field140 = null;
        field130 = null;
        field116 = null;
        field109 = null;
        field123 = null;
        field117 = null;
        field133 = null;
        field120 = null;
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Lu;IIII)V", line = 40)
    public final void method66(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method64(arg3, arg4);
            this.method78(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Lu;)I", line = 55)
    public final int method68(class38 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field494; var5++) {
            int var6 = arg0.field483[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class38 var7 = arg0.method226(var5, true, var2 + 1);
                    var2 = -1;
                    if (var7.method229(field122, 107)) {
                        var6 = 60;
                    } else {
                        if (!var7.method229(field132, 89)) {
                            if (var7.method232(field114, (byte) -49)) {
                                try {
                                    int var8 = var7.method230(0, 4).method239(10);
                                    var4 += field120[var8].field57;
                                    var3 = -1;
                                } catch (Exception var10) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field110[var6];
                    if (this.field137 != null && var3 != -1) {
                        var4 += this.field137[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(Lu;IIII)V", line = 125)
    public final void method69(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method64(arg3, arg4);
            this.method78(arg0, arg1 - this.method68(arg0), arg2);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "(Lu;IIII)V", line = 143)
    public final void method70(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method64(arg3, arg4);
            this.method78(arg0, arg1 - this.method68(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([I[BIIIIIIII)V", line = 181)
    public static final void method72(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 223)
    private static final int method73(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "([BIIIII)V", line = 270)
    private static final void method74(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class40.field518 * arg2 + arg1;
        int var7 = class40.field518 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class40.field520) {
            int var10 = class40.field520 - arg2;
            arg4 -= var10;
            arg2 = class40.field520;
            var9 += arg3 * var10;
            var6 += class40.field518 * var10;
        }
        if (arg2 + arg4 > class40.field517) {
            arg4 -= arg2 + arg4 - class40.field517;
        }
        if (arg1 < class40.field519) {
            int var11 = class40.field519 - arg1;
            arg3 -= var11;
            arg1 = class40.field519;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class40.field516) {
            int var12 = arg1 + arg3 - class40.field516;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method76(class40.field515, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "([BIIIIII)V", line = 323)
    private static final void method75(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class40.field518 * arg2 + arg1;
        int var8 = class40.field518 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class40.field520) {
            int var11 = class40.field520 - arg2;
            arg4 -= var11;
            arg2 = class40.field520;
            var10 += arg3 * var11;
            var7 += class40.field518 * var11;
        }
        if (arg2 + arg4 > class40.field517) {
            arg4 -= arg2 + arg4 - class40.field517;
        }
        if (arg1 < class40.field519) {
            int var12 = class40.field519 - arg1;
            arg3 -= var12;
            arg1 = class40.field519;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class40.field516) {
            int var13 = arg1 + arg3 - class40.field516;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method72(class40.field515, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([I[BIIIIIII)V", line = 393)
    public static final void method76(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(Lu;)V", line = 462)
    private final void method77(class38 arg0) {
        try {
            if (arg0.method232(field124, (byte) -49)) {
                field141 = arg0.method230(0, 4).method227(-58, 16);
            } else if (arg0.method229(field142, 64)) {
                field141 = field115;
            } else if (arg0.method232(field123, (byte) -49)) {
                field125 = arg0.method230(0, 4).method227(-58, 16);
            } else if (arg0.method229(field117, 115)) {
                field125 = 8388608;
            } else if (arg0.method229(field133, -64)) {
                field125 = -1;
            } else if (arg0.method232(field118, (byte) -49)) {
                field139 = arg0.method230(0, 2).method227(-58, 16);
            } else if (arg0.method229(field111, -43)) {
                field139 = 0;
            } else if (arg0.method229(field140, 103)) {
                field139 = -1;
            } else if (arg0.method232(field130, (byte) -49)) {
                field127 = arg0.method230(0, 5).method227(-58, 16);
            } else if (arg0.method229(field116, -116)) {
                field127 = 0;
            } else if (arg0.method229(field109, -111)) {
                field127 = field112;
            } else if (arg0.method229(field136, 77)) {
                this.method79(field115, field112, field129);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Lu;II)V", line = 537)
    private final void method78(class38 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field126;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field494; var7++) {
            int var8 = arg0.field483[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class38 var9 = arg0.method226(var7, true, var5 + 1);
                    var5 = -1;
                    if (var9.method229(field122, -67)) {
                        var8 = 60;
                    } else {
                        if (!var9.method229(field132, 100)) {
                            if (var9.method232(field114, (byte) -49)) {
                                try {
                                    int var10 = var9.method230(0, 4).method239(10);
                                    class6 var11 = field120[var10];
                                    var11.method32(arg1, this.field126 + var4 - var11.field54);
                                    arg1 += var11.field57;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method77(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field137 != null && var6 != -1) {
                        arg1 += this.field137[(var6 << 8) + var8];
                    }
                    int var13 = this.field128[var8];
                    int var14 = this.field113[var8];
                    if (var8 == 32) {
                        if (field138 > 0) {
                            field119 += field138;
                            arg1 += field119 >> 8;
                            field119 &= 0xFF;
                        }
                    } else if (field121 == 256) {
                        if (field127 != -1) {
                            method74(this.field134[var8], this.field135[var8] + arg1 + 1, this.field131[var8] + var4 + 1, var13, var14, field127);
                        }
                        this.method71(this.field134[var8], this.field135[var8] + arg1, this.field131[var8] + var4, var13, var14, field141);
                    } else {
                        if (field127 != -1) {
                            method75(this.field134[var8], this.field135[var8] + arg1 + 1, this.field131[var8] + var4 + 1, var13, var14, field127, field121);
                        }
                        this.method67(this.field134[var8], this.field135[var8] + arg1, this.field131[var8] + var4, var13, var14, field141, field121);
                    }
                    int var15 = this.field110[var8];
                    if (field125 != -1) {
                        class40.method262(arg1, (int) ((double) this.field126 * 0.7D) + var4, var15, field125);
                    }
                    if (field139 != -1) {
                        class40.method262(arg1, this.field126 + var4 + 1, var15, field139);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(III)V", line = 653)
    private final void method79(int arg0, int arg1, int arg2) {
        field125 = -1;
        field139 = -1;
        field112 = arg1;
        field127 = arg1;
        field115 = arg0;
        field141 = arg0;
        field129 = arg2;
        field121 = arg2;
        field138 = 0;
        field119 = 0;
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([B)V", line = 670)
    private final void method80(byte[] arg0) {
        this.field110 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field110.length; var2++) {
                this.field110[var2] = arg0[var2] & 0xFF;
            }
            this.field126 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field110[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var11 = 0;
            for (int var12 = 0; var12 < var9[var10].length; var12++) {
                var11 += arg0[var3++];
                var9[var10][var12] = var11;
            }
        }
        byte[][] var13 = new byte[256][];
        for (int var14 = 0; var14 < 256; var14++) {
            var13[var14] = new byte[var5[var14]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var13[var14].length; var16++) {
                var15 += arg0[var3++];
                var13[var14][var16] = var15;
            }
        }
        this.field137 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field137[(var17 << 8) + var18] = (byte) method73(var9, var13, var6, this.field110, var5, var17, var18);
                    }
                }
            }
        }
        this.field126 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "mapview!ga", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 799)
    public class14(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field135 = arg1;
        this.field131 = arg2;
        this.field128 = arg3;
        this.field113 = arg4;
        this.method80(arg0);
        this.field134 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field131[var10] < var8 && this.field113[var10] != 0) {
                var8 = this.field131[var10];
            }
            if (this.field131[var10] + this.field113[var10] > var9) {
                var9 = this.field131[var10] + this.field113[var10];
            }
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([BIIIIII)V")
    public abstract void method67(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([BIIIII)V")
    public abstract void method71(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
