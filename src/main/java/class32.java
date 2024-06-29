import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public abstract class class32 extends class8 {

    @OriginalMember(owner = "mapview!r", name = "X", descriptor = "I")
    private int field457 = 0;

    @OriginalMember(owner = "mapview!r", name = "M", descriptor = "[[B")
    public byte[][] field446 = new byte[256][];

    @OriginalMember(owner = "mapview!r", name = "F", descriptor = "[I")
    private int[] field439;

    @OriginalMember(owner = "mapview!r", name = "db", descriptor = "[I")
    private int[] field463;

    @OriginalMember(owner = "mapview!r", name = "fb", descriptor = "[I")
    private int[] field465;

    @OriginalMember(owner = "mapview!r", name = "V", descriptor = "[I")
    private int[] field455;

    @OriginalMember(owner = "mapview!r", name = "N", descriptor = "Lia;")
    private static class15 field447 = class28.method196("u=", false);

    @OriginalMember(owner = "mapview!r", name = "E", descriptor = "I")
    private static int field438 = -1;

    @OriginalMember(owner = "mapview!r", name = "U", descriptor = "Lia;")
    private static class15 field454 = class28.method196("shad", false);

    @OriginalMember(owner = "mapview!r", name = "H", descriptor = "I")
    private static int field441 = -1;

    @OriginalMember(owner = "mapview!r", name = "S", descriptor = "I")
    private static int field452 = 0;

    @OriginalMember(owner = "mapview!r", name = "D", descriptor = "Lia;")
    private static class15 field437 = class28.method196("str", false);

    @OriginalMember(owner = "mapview!r", name = "Y", descriptor = "I")
    private static int field458 = 0;

    @OriginalMember(owner = "mapview!r", name = "G", descriptor = "Lia;")
    private static class15 field440 = class28.method196("img=", false);

    @OriginalMember(owner = "mapview!r", name = "L", descriptor = "Lia;")
    private static class15 field445 = class28.method196("lt", false);

    @OriginalMember(owner = "mapview!r", name = "ab", descriptor = "Lia;")
    private static class15 field460 = class28.method196(")4col", false);

    @OriginalMember(owner = "mapview!r", name = "I", descriptor = "Lia;")
    private static class15 field442 = class28.method196(")4str", false);

    @OriginalMember(owner = "mapview!r", name = "Z", descriptor = "Lia;")
    private static class15 field459 = class28.method196("str=", false);

    @OriginalMember(owner = "mapview!r", name = "cb", descriptor = "Lia;")
    private static class15 field462 = class28.method196("col=", false);

    @OriginalMember(owner = "mapview!r", name = "P", descriptor = "I")
    private static int field449 = 0;

    @OriginalMember(owner = "mapview!r", name = "bb", descriptor = "Lia;")
    private static class15 field461 = class28.method196(")4shad", false);

    @OriginalMember(owner = "mapview!r", name = "eb", descriptor = "I")
    private static int field464 = -1;

    @OriginalMember(owner = "mapview!r", name = "R", descriptor = "I")
    private static int field451 = 0;

    @OriginalMember(owner = "mapview!r", name = "jb", descriptor = "Lia;")
    private static class15 field469 = class28.method196("u", false);

    @OriginalMember(owner = "mapview!r", name = "Q", descriptor = "I")
    private static int field450 = -1;

    @OriginalMember(owner = "mapview!r", name = "ib", descriptor = "I")
    private static int field468 = 256;

    @OriginalMember(owner = "mapview!r", name = "hb", descriptor = "Lia;")
    private static class15 field467 = class28.method196("gt", false);

    @OriginalMember(owner = "mapview!r", name = "O", descriptor = "I")
    private static int field448 = 256;

    @OriginalMember(owner = "mapview!r", name = "gb", descriptor = "Lia;")
    private static class15 field466 = class28.method196(")4u", false);

    @OriginalMember(owner = "mapview!r", name = "W", descriptor = "Lia;")
    private static class15 field456 = class28.method196("shad=", false);

    @OriginalMember(owner = "mapview!r", name = "kb", descriptor = "Lia;")
    private static class15 field470 = class28.method196("br", false);

    @OriginalMember(owner = "mapview!r", name = "T", descriptor = "[B")
    private byte[] field453;

    @OriginalMember(owner = "mapview!r", name = "K", descriptor = "[I")
    private int[] field444;

    @OriginalMember(owner = "mapview!r", name = "J", descriptor = "[Lv;")
    private static class40[] field443;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 14)
    private static final int method212(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Lia;)I", line = 67)
    public final int method213(class15 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field142; var5++) {
            int var6 = arg0.field148[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class15 var7 = arg0.method122(var5, -21024, var2 + 1);
                    var2 = -1;
                    if (var7.method105((byte) 55, field445)) {
                        var6 = 60;
                    } else {
                        if (!var7.method105((byte) 55, field467)) {
                            if (var7.method104((byte) 14, field440)) {
                                try {
                                    int var8 = var7.method117(4, (byte) 37).method101(-74);
                                    var4 += field443[var8].field523;
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
                    var4 += this.field444[var6];
                    if (this.field453 != null && var3 != -1) {
                        var4 += this.field453[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Lia;II)V", line = 135)
    private final void method214(class15 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field457;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field142; var7++) {
            int var8 = arg0.field148[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class15 var9 = arg0.method122(var7, -21024, var5 + 1);
                    var5 = -1;
                    if (var9.method105((byte) 55, field445)) {
                        var8 = 60;
                    } else {
                        if (!var9.method105((byte) 55, field467)) {
                            if (var9.method104((byte) 14, field440)) {
                                try {
                                    int var10 = var9.method117(4, (byte) 37).method101(-114);
                                    class40 var11 = field443[var10];
                                    if (field448 == 256) {
                                        var11.method257(arg1, this.field457 + var4 - var11.field526);
                                    } else {
                                        var11.method254(arg1, this.field457 + var4 - var11.field526, field448);
                                    }
                                    arg1 += var11.field523;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method215(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field453 != null && var6 != -1) {
                        arg1 += this.field453[(var6 << 8) + var8];
                    }
                    int var13 = this.field465[var8];
                    int var14 = this.field455[var8];
                    if (var8 == 32) {
                        if (field451 > 0) {
                            field452 += field451;
                            arg1 += field452 >> 8;
                            field452 &= 0xFF;
                        }
                    } else if (field448 == 256) {
                        if (field441 != -1) {
                            this.method224(var8, this.field439[var8] + arg1 + 1, this.field463[var8] + var4 + 1, var13, var14, field441);
                        }
                        this.method152(var8, this.field439[var8] + arg1, this.field463[var8] + var4, var13, var14, field449);
                    } else {
                        if (field441 != -1) {
                            this.method222(var8, this.field439[var8] + arg1 + 1, this.field463[var8] + var4 + 1, var13, var14, field441, field448);
                        }
                        this.method153(var8, this.field439[var8] + arg1, this.field463[var8] + var4, var13, var14, field449, field448);
                    }
                    int var15 = this.field444[var8];
                    if (field464 != -1) {
                        class8.method43(arg1, (int) ((double) this.field457 * 0.7D) + var4, var15, field464);
                    }
                    if (field438 != -1) {
                        class8.method43(arg1, this.field457 + var4 + 1, var15, field438);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(Lia;)V", line = 255)
    private final void method215(class15 arg0) {
        try {
            if (arg0.method104((byte) 14, field462)) {
                field449 = arg0.method117(4, (byte) 37).method113(16, false);
            } else if (arg0.method105((byte) 55, field460)) {
                field449 = field458;
            } else if (arg0.method104((byte) 14, field459)) {
                field464 = arg0.method117(4, (byte) 37).method113(16, false);
            } else if (arg0.method105((byte) 55, field437)) {
                field464 = 8388608;
            } else if (arg0.method105((byte) 55, field442)) {
                field464 = -1;
            } else if (arg0.method104((byte) 14, field447)) {
                field438 = arg0.method117(2, (byte) 37).method113(16, false);
            } else if (arg0.method105((byte) 55, field469)) {
                field438 = 0;
            } else if (arg0.method105((byte) 55, field466)) {
                field438 = -1;
            } else if (arg0.method104((byte) 14, field456)) {
                field441 = arg0.method117(5, (byte) 37).method113(16, false);
            } else if (arg0.method105((byte) 55, field454)) {
                field441 = 0;
            } else if (arg0.method105((byte) 55, field461)) {
                field441 = field450;
            } else if (arg0.method105((byte) 55, field470)) {
                this.method225(field458, field450, field468);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "()V", line = 326)
    public static void method216() {
        field445 = null;
        field467 = null;
        field440 = null;
        field470 = null;
        field462 = null;
        field460 = null;
        field447 = null;
        field469 = null;
        field466 = null;
        field456 = null;
        field454 = null;
        field461 = null;
        field459 = null;
        field437 = null;
        field442 = null;
        field443 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Lia;IIII)V", line = 351)
    public final void method217(class15 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method219(arg3, arg4);
            this.method214(arg0, arg1 - this.method213(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(Lia;IIII)V", line = 360)
    public final void method218(class15 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method219(arg3, arg4);
            this.method214(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 742)
    public class32(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field439 = arg1;
        this.field463 = arg2;
        this.field465 = arg3;
        this.field455 = arg4;
        this.method220(arg0);
        this.field446 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field463[var10] < var8 && this.field455[var10] != 0) {
                var8 = this.field463[var10];
            }
            if (this.field463[var10] + this.field455[var10] > var9) {
                var9 = this.field463[var10] + this.field455[var10];
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(II)V", line = 385)
    private final void method219(int arg0, int arg1) {
        field464 = -1;
        field438 = -1;
        field450 = arg1;
        field441 = arg1;
        field458 = arg0;
        field449 = arg0;
        field468 = 256;
        field448 = 256;
        field451 = 0;
        field452 = 0;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([B)V", line = 399)
    private final void method220(byte[] arg0) {
        this.field444 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field444.length; var2++) {
                this.field444[var2] = arg0[var2] & 0xFF;
            }
            this.field457 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field444[var4] = arg0[var3++] & 0xFF;
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
        this.field453 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field453[(var17 << 8) + var18] = (byte) method212(var9, var13, var6, this.field444, var5, var17, var18);
                    }
                }
            }
        }
        this.field457 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([I[BIIIIIII)V", line = 530)
    public static final void method221(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(IIIIIII)V", line = 597)
    private final void method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class8.field67 * arg2 + arg1;
        int var9 = class8.field67 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class8.field68) {
            int var12 = class8.field68 - arg2;
            arg4 -= var12;
            arg2 = class8.field68;
            var11 += arg3 * var12;
            var8 += class8.field67 * var12;
        }
        if (arg2 + arg4 > class8.field66) {
            arg4 -= arg2 + arg4 - class8.field66;
        }
        if (arg1 < class8.field69) {
            int var13 = class8.field69 - arg1;
            arg3 -= var13;
            arg1 = class8.field69;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class8.field72) {
            int var14 = arg1 + arg3 - class8.field72;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method226(class8.field70, this.field446[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(Lia;IIII)V", line = 657)
    public final void method223(class15 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method219(arg3, arg4);
            this.method214(arg0, arg1 - this.method213(arg0), arg2);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(IIIIII)V", line = 692)
    private final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class8.field67 * arg2 + arg1;
        int var8 = class8.field67 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class8.field68) {
            int var11 = class8.field68 - arg2;
            arg4 -= var11;
            arg2 = class8.field68;
            var10 += arg3 * var11;
            var7 += class8.field67 * var11;
        }
        if (arg2 + arg4 > class8.field66) {
            arg4 -= arg2 + arg4 - class8.field66;
        }
        if (arg1 < class8.field69) {
            int var12 = class8.field69 - arg1;
            arg3 -= var12;
            arg1 = class8.field69;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class8.field72) {
            int var13 = arg1 + arg3 - class8.field72;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method221(class8.field70, this.field446[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(III)V", line = 780)
    private final void method225(int arg0, int arg1, int arg2) {
        field464 = -1;
        field438 = -1;
        field450 = arg1;
        field441 = arg1;
        field458 = arg0;
        field449 = arg0;
        field468 = arg2;
        field448 = arg2;
        field451 = 0;
        field452 = 0;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([I[BIIIIIIII)V", line = 816)
    public static final void method226(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(IIIIII)V")
    public abstract void method152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
