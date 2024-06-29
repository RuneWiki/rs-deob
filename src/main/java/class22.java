import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public abstract class class22 extends class21 {

    @OriginalMember(owner = "mapview!la", name = "ab", descriptor = "[[B")
    private byte[][] field322 = new byte[256][];

    @OriginalMember(owner = "mapview!la", name = "Z", descriptor = "I")
    private int field321 = 0;

    @OriginalMember(owner = "mapview!la", name = "P", descriptor = "[I")
    private int[] field311;

    @OriginalMember(owner = "mapview!la", name = "A", descriptor = "[I")
    private int[] field297;

    @OriginalMember(owner = "mapview!la", name = "U", descriptor = "[I")
    private int[] field316;

    @OriginalMember(owner = "mapview!la", name = "S", descriptor = "[I")
    private int[] field314;

    @OriginalMember(owner = "mapview!la", name = "B", descriptor = "I")
    private static int field298 = 256;

    @OriginalMember(owner = "mapview!la", name = "I", descriptor = "I")
    private static int field304 = 0;

    @OriginalMember(owner = "mapview!la", name = "z", descriptor = "Lna;")
    private static class26 field296 = class30.method205((byte) 33, ")4str");

    @OriginalMember(owner = "mapview!la", name = "C", descriptor = "I")
    private static int field299 = -1;

    @OriginalMember(owner = "mapview!la", name = "D", descriptor = "I")
    private static int field300 = -1;

    @OriginalMember(owner = "mapview!la", name = "W", descriptor = "I")
    private static int field318 = 0;

    @OriginalMember(owner = "mapview!la", name = "K", descriptor = "Lna;")
    private static class26 field306 = class30.method205((byte) 51, "shad");

    @OriginalMember(owner = "mapview!la", name = "V", descriptor = "I")
    private static int field317 = -1;

    @OriginalMember(owner = "mapview!la", name = "M", descriptor = "Lna;")
    private static class26 field308 = class30.method205((byte) 112, "u");

    @OriginalMember(owner = "mapview!la", name = "Y", descriptor = "Lna;")
    private static class26 field320 = class30.method205((byte) 73, "shad=");

    @OriginalMember(owner = "mapview!la", name = "y", descriptor = "Lna;")
    private static class26 field295 = class30.method205((byte) 74, ")4col");

    @OriginalMember(owner = "mapview!la", name = "N", descriptor = "Lna;")
    private static class26 field309 = class30.method205((byte) 79, "lt");

    @OriginalMember(owner = "mapview!la", name = "O", descriptor = "I")
    private static int field310 = 0;

    @OriginalMember(owner = "mapview!la", name = "X", descriptor = "Lna;")
    private static class26 field319 = class30.method205((byte) 80, "col=");

    @OriginalMember(owner = "mapview!la", name = "bb", descriptor = "Lna;")
    private static class26 field323 = class30.method205((byte) 125, "img=");

    @OriginalMember(owner = "mapview!la", name = "cb", descriptor = "I")
    private static int field324 = -1;

    @OriginalMember(owner = "mapview!la", name = "db", descriptor = "Lna;")
    private static class26 field325 = class30.method205((byte) 33, ")4shad");

    @OriginalMember(owner = "mapview!la", name = "Q", descriptor = "I")
    private static int field312 = 0;

    @OriginalMember(owner = "mapview!la", name = "R", descriptor = "Lna;")
    private static class26 field313 = class30.method205((byte) 34, "str");

    @OriginalMember(owner = "mapview!la", name = "E", descriptor = "I")
    private static int field301 = 256;

    @OriginalMember(owner = "mapview!la", name = "fb", descriptor = "Lna;")
    private static class26 field327 = class30.method205((byte) 84, "str=");

    @OriginalMember(owner = "mapview!la", name = "J", descriptor = "Lna;")
    private static class26 field305 = class30.method205((byte) 60, ")4u");

    @OriginalMember(owner = "mapview!la", name = "gb", descriptor = "Lna;")
    private static class26 field328 = class30.method205((byte) 69, "u=");

    @OriginalMember(owner = "mapview!la", name = "G", descriptor = "Lna;")
    private static class26 field303 = class30.method205((byte) 39, "gt");

    @OriginalMember(owner = "mapview!la", name = "eb", descriptor = "Lna;")
    private static class26 field326 = class30.method205((byte) 119, "br");

    @OriginalMember(owner = "mapview!la", name = "F", descriptor = "[B")
    private byte[] field302;

    @OriginalMember(owner = "mapview!la", name = "L", descriptor = "[I")
    private int[] field307;

    @OriginalMember(owner = "mapview!la", name = "T", descriptor = "[Lma;")
    private static class24[] field315;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Lna;IIII)V", line = 16)
    public final void method140(class26 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method151(arg3, arg4);
            this.method153(arg0, arg1 - this.method149(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([B)V", line = 32)
    private final void method141(byte[] arg0) {
        this.field307 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field307.length; var2++) {
                this.field307[var2] = arg0[var2] & 0xFF;
            }
            this.field321 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field307[var4] = arg0[var3++] & 0xFF;
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
        this.field302 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field302[(var17 << 8) + var18] = (byte) method148(var9, var13, var6, this.field307, var5, var17, var18);
                    }
                }
            }
        }
        this.field321 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([I[BIIIIIII)V", line = 149)
    public static final void method142(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(Lna;IIII)V", line = 218)
    public final void method143(class26 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method151(arg3, arg4);
            this.method153(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "([BIIIIII)V", line = 227)
    private static final void method144(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class21.field291 * arg2 + arg1;
        int var8 = class21.field291 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class21.field290) {
            int var11 = class21.field290 - arg2;
            arg4 -= var11;
            arg2 = class21.field290;
            var10 += arg3 * var11;
            var7 += class21.field291 * var11;
        }
        if (arg2 + arg4 > class21.field288) {
            arg4 -= arg2 + arg4 - class21.field288;
        }
        if (arg1 < class21.field292) {
            int var12 = class21.field292 - arg1;
            arg3 -= var12;
            arg1 = class21.field292;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class21.field289) {
            int var13 = arg1 + arg3 - class21.field289;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method150(class21.field294, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(III)V", line = 277)
    private final void method145(int arg0, int arg1, int arg2) {
        field299 = -1;
        field300 = -1;
        field324 = arg1;
        field317 = arg1;
        field312 = arg0;
        field304 = arg0;
        field301 = arg2;
        field298 = arg2;
        field318 = 0;
        field310 = 0;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Lna;)V", line = 311)
    private final void method146(class26 arg0) {
        try {
            if (arg0.method170(field319, (byte) 80)) {
                field304 = arg0.method178(4, true).method175(16, (byte) -127);
            } else if (arg0.method173(field295, -2093)) {
                field304 = field312;
            } else if (arg0.method170(field327, (byte) -127)) {
                field299 = arg0.method178(4, true).method175(16, (byte) 13);
            } else if (arg0.method173(field313, -2093)) {
                field299 = 8388608;
            } else if (arg0.method173(field296, -2093)) {
                field299 = -1;
            } else if (arg0.method170(field328, (byte) -54)) {
                field300 = arg0.method178(2, true).method175(16, (byte) -123);
            } else if (arg0.method173(field308, -2093)) {
                field300 = 0;
            } else if (arg0.method173(field305, -2093)) {
                field300 = -1;
            } else if (arg0.method170(field320, (byte) -59)) {
                field317 = arg0.method178(5, true).method175(16, (byte) 53);
            } else if (arg0.method173(field306, -2093)) {
                field317 = 0;
            } else if (arg0.method173(field325, -2093)) {
                field317 = field324;
            } else if (arg0.method173(field326, -2093)) {
                this.method145(field312, field324, field301);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "([BIIIII)V", line = 366)
    private static final void method147(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class21.field291 * arg2 + arg1;
        int var7 = class21.field291 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class21.field290) {
            int var10 = class21.field290 - arg2;
            arg4 -= var10;
            arg2 = class21.field290;
            var9 += arg3 * var10;
            var6 += class21.field291 * var10;
        }
        if (arg2 + arg4 > class21.field288) {
            arg4 -= arg2 + arg4 - class21.field288;
        }
        if (arg1 < class21.field292) {
            int var11 = class21.field292 - arg1;
            arg3 -= var11;
            arg1 = class21.field292;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class21.field289) {
            int var12 = arg1 + arg3 - class21.field289;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method142(class21.field294, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 444)
    private static final int method148(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 804)
    public class22(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field311 = arg1;
        this.field297 = arg2;
        this.field316 = arg3;
        this.field314 = arg4;
        this.method141(arg0);
        this.field322 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field297[var10] < var8 && this.field314[var10] != 0) {
                var8 = this.field297[var10];
            }
            if (this.field314[var10] + this.field297[var10] > var9) {
                var9 = this.field314[var10] + this.field297[var10];
            }
        }
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(Lna;)I", line = 539)
    public final int method149(class26 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field367; var5++) {
            int var6 = arg0.field358[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class26 var7 = arg0.method180(var5, true, var2 + 1);
                    var2 = -1;
                    if (var7.method173(field309, -2093)) {
                        var6 = 60;
                    } else {
                        if (!var7.method173(field303, -2093)) {
                            if (var7.method170(field323, (byte) -89)) {
                                try {
                                    int var8 = var7.method178(4, true).method174((byte) 104);
                                    var4 += field315[var8].field338;
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
                    var4 += this.field307[var6];
                    if (this.field302 != null && var3 != -1) {
                        var4 += this.field302[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([I[BIIIIIIII)V", line = 607)
    public static final void method150(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(II)V", line = 646)
    private final void method151(int arg0, int arg1) {
        field299 = -1;
        field300 = -1;
        field324 = arg1;
        field317 = arg1;
        field312 = arg0;
        field304 = arg0;
        field301 = 256;
        field298 = 256;
        field318 = 0;
        field310 = 0;
    }

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "()V", line = 666)
    public static void method152() {
        field309 = null;
        field303 = null;
        field323 = null;
        field326 = null;
        field319 = null;
        field295 = null;
        field328 = null;
        field308 = null;
        field305 = null;
        field320 = null;
        field306 = null;
        field325 = null;
        field327 = null;
        field313 = null;
        field296 = null;
        field315 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Lna;II)V", line = 688)
    private final void method153(class26 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field321;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field367; var7++) {
            int var8 = arg0.field358[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class26 var9 = arg0.method180(var7, true, var5 + 1);
                    var5 = -1;
                    if (var9.method173(field309, -2093)) {
                        var8 = 60;
                    } else {
                        if (!var9.method173(field303, -2093)) {
                            if (var9.method170(field323, (byte) -98)) {
                                try {
                                    int var10 = var9.method178(4, true).method174((byte) 49);
                                    class24 var11 = field315[var10];
                                    var11.method163(arg1, this.field321 + var4 - var11.field337);
                                    arg1 += var11.field338;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method146(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field302 != null && var6 != -1) {
                        arg1 += this.field302[(var6 << 8) + var8];
                    }
                    int var13 = this.field316[var8];
                    int var14 = this.field314[var8];
                    if (var8 == 32) {
                        if (field318 > 0) {
                            field310 += field318;
                            arg1 += field310 >> 8;
                            field310 &= 0xFF;
                        }
                    } else if (field298 == 256) {
                        if (field317 != -1) {
                            method147(this.field322[var8], this.field311[var8] + arg1 + 1, this.field297[var8] + var4 + 1, var13, var14, field317);
                        }
                        this.method28(this.field322[var8], this.field311[var8] + arg1, this.field297[var8] + var4, var13, var14, field304);
                    } else {
                        if (field317 != -1) {
                            method144(this.field322[var8], this.field311[var8] + arg1 + 1, this.field297[var8] + var4 + 1, var13, var14, field317, field298);
                        }
                        this.method29(this.field322[var8], this.field311[var8] + arg1, this.field297[var8] + var4, var13, var14, field304, field298);
                    }
                    int var15 = this.field307[var8];
                    if (field299 != -1) {
                        class21.method133(arg1, (int) ((double) this.field321 * 0.7D) + var4, var15, field299);
                    }
                    if (field300 != -1) {
                        class21.method133(arg1, this.field321 + var4 + 1, var15, field300);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "(Lna;IIII)V", line = 798)
    public final void method154(class26 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method151(arg3, arg4);
            this.method153(arg0, arg1 - this.method149(arg0), arg2);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([BIIIIII)V")
    public abstract void method29(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "([BIIIII)V")
    public abstract void method28(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
