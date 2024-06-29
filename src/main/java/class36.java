import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public abstract class class36 extends class27 {

    @OriginalMember(owner = "mapview!sa", name = "ab", descriptor = "[[B")
    private byte[][] field476 = new byte[256][];

    @OriginalMember(owner = "mapview!sa", name = "bb", descriptor = "I")
    private int field477 = 0;

    @OriginalMember(owner = "mapview!sa", name = "db", descriptor = "[I")
    private int[] field479;

    @OriginalMember(owner = "mapview!sa", name = "T", descriptor = "[I")
    private int[] field469;

    @OriginalMember(owner = "mapview!sa", name = "W", descriptor = "[I")
    private int[] field472;

    @OriginalMember(owner = "mapview!sa", name = "D", descriptor = "[I")
    private int[] field453;

    @OriginalMember(owner = "mapview!sa", name = "C", descriptor = "I")
    private static int field452 = -1;

    @OriginalMember(owner = "mapview!sa", name = "G", descriptor = "Lu;")
    private static class38 field456 = class9.method45(-41, "shad=");

    @OriginalMember(owner = "mapview!sa", name = "B", descriptor = "Lu;")
    private static class38 field451 = class9.method45(-41, "str=");

    @OriginalMember(owner = "mapview!sa", name = "F", descriptor = "I")
    private static int field455 = -1;

    @OriginalMember(owner = "mapview!sa", name = "R", descriptor = "I")
    private static int field467 = -1;

    @OriginalMember(owner = "mapview!sa", name = "Q", descriptor = "Lu;")
    private static class38 field466 = class9.method45(-41, "shad");

    @OriginalMember(owner = "mapview!sa", name = "U", descriptor = "Lu;")
    private static class38 field470 = class9.method45(-41, "u");

    @OriginalMember(owner = "mapview!sa", name = "J", descriptor = "I")
    private static int field459 = 0;

    @OriginalMember(owner = "mapview!sa", name = "P", descriptor = "Lu;")
    private static class38 field465 = class9.method45(-41, "br");

    @OriginalMember(owner = "mapview!sa", name = "S", descriptor = "Lu;")
    private static class38 field468 = class9.method45(-41, "str");

    @OriginalMember(owner = "mapview!sa", name = "N", descriptor = "I")
    private static int field463 = 256;

    @OriginalMember(owner = "mapview!sa", name = "V", descriptor = "Lu;")
    private static class38 field471 = class9.method45(-41, "lt");

    @OriginalMember(owner = "mapview!sa", name = "L", descriptor = "I")
    private static int field461 = 0;

    @OriginalMember(owner = "mapview!sa", name = "O", descriptor = "Lu;")
    private static class38 field464 = class9.method45(-41, "col=");

    @OriginalMember(owner = "mapview!sa", name = "H", descriptor = "Lu;")
    private static class38 field457 = class9.method45(-41, "u=");

    @OriginalMember(owner = "mapview!sa", name = "X", descriptor = "I")
    private static int field473 = -1;

    @OriginalMember(owner = "mapview!sa", name = "Z", descriptor = "I")
    private static int field475 = 0;

    @OriginalMember(owner = "mapview!sa", name = "E", descriptor = "I")
    private static int field454 = 0;

    @OriginalMember(owner = "mapview!sa", name = "K", descriptor = "Lu;")
    private static class38 field460 = class9.method45(-41, "img=");

    @OriginalMember(owner = "mapview!sa", name = "Y", descriptor = "Lu;")
    private static class38 field474 = class9.method45(-41, "gt");

    @OriginalMember(owner = "mapview!sa", name = "fb", descriptor = "Lu;")
    private static class38 field481 = class9.method45(-41, ")4col");

    @OriginalMember(owner = "mapview!sa", name = "eb", descriptor = "Lu;")
    private static class38 field480 = class9.method45(-41, ")4shad");

    @OriginalMember(owner = "mapview!sa", name = "hb", descriptor = "Lu;")
    private static class38 field483 = class9.method45(-41, ")4str");

    @OriginalMember(owner = "mapview!sa", name = "gb", descriptor = "Lu;")
    private static class38 field482 = class9.method45(-41, ")4u");

    @OriginalMember(owner = "mapview!sa", name = "cb", descriptor = "[B")
    private byte[] field478;

    @OriginalMember(owner = "mapview!sa", name = "M", descriptor = "[I")
    private int[] field462;

    @OriginalMember(owner = "mapview!sa", name = "I", descriptor = "[Ld;")
    private static class7[] field458;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([BIIIIII)V", line = 8)
    private static final void method201(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class27.field337 * arg2 + arg1;
        int var8 = class27.field337 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class27.field339) {
            int var11 = class27.field339 - arg2;
            arg4 -= var11;
            arg2 = class27.field339;
            var10 += arg3 * var11;
            var7 += class27.field337 * var11;
        }
        if (arg2 + arg4 > class27.field336) {
            arg4 -= arg2 + arg4 - class27.field336;
        }
        if (arg1 < class27.field340) {
            int var12 = class27.field340 - arg1;
            arg3 -= var12;
            arg1 = class27.field340;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class27.field341) {
            int var13 = arg1 + arg3 - class27.field341;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method210(class27.field338, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([B)V", line = 58)
    private final void method202(byte[] arg0) {
        this.field462 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field462.length; var2++) {
                this.field462[var2] = arg0[var2] & 0xFF;
            }
            this.field477 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field462[var4] = arg0[var3++] & 0xFF;
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
        this.field478 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field478[(var17 << 8) + var18] = (byte) method214(var9, var13, var6, this.field462, var5, var17, var18);
                    }
                }
            }
        }
        this.field477 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "()V", line = 179)
    public static void method203() {
        field471 = null;
        field474 = null;
        field460 = null;
        field465 = null;
        field464 = null;
        field481 = null;
        field457 = null;
        field470 = null;
        field482 = null;
        field456 = null;
        field466 = null;
        field480 = null;
        field451 = null;
        field468 = null;
        field483 = null;
        field458 = null;
    }

    static {
        new Random();
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([I[BIIIIIII)V", line = 202)
    public static final void method204(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Lu;)I", line = 268)
    public final int method206(class38 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field492; var5++) {
            int var6 = arg0.field487[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class38 var7 = arg0.method217(var2 + 1, var5, (byte) -49);
                    var2 = -1;
                    if (var7.method227(120, field471)) {
                        var6 = 60;
                    } else {
                        if (!var7.method227(127, field474)) {
                            if (var7.method220(field460, (byte) -82)) {
                                try {
                                    int var8 = var7.method241(0, 4).method235(-21452);
                                    var4 += field458[var8].field57;
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
                    var4 += this.field462[var6];
                    if (this.field478 != null && var3 != -1) {
                        var4 += this.field478[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Lu;IIII)V", line = 345)
    public final void method207(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method208(arg3, arg4);
            this.method209(arg0, arg1 - this.method206(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(II)V", line = 361)
    private final void method208(int arg0, int arg1) {
        field452 = -1;
        field473 = -1;
        field467 = arg1;
        field455 = arg1;
        field459 = arg0;
        field454 = arg0;
        field463 = 256;
        field475 = 0;
        field461 = 0;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Lu;II)V", line = 374)
    private final void method209(class38 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field477;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field492; var7++) {
            int var8 = arg0.field487[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class38 var9 = arg0.method217(var5 + 1, var7, (byte) -17);
                    var5 = -1;
                    if (var9.method227(125, field471)) {
                        var8 = 60;
                    } else {
                        if (!var9.method227(116, field474)) {
                            if (var9.method220(field460, (byte) -114)) {
                                try {
                                    int var10 = var9.method241(0, 4).method235(-21452);
                                    class7 var11 = field458[var10];
                                    var11.method27(arg1, this.field477 + var4 - var11.field59);
                                    arg1 += var11.field57;
                                    var6 = -1;
                                } catch (Exception var16) {
                                }
                            } else {
                                this.method212(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field478 != null && var6 != -1) {
                        arg1 += this.field478[(var6 << 8) + var8];
                    }
                    int var13 = this.field472[var8];
                    int var14 = this.field453[var8];
                    if (var8 == 32) {
                        if (field475 > 0) {
                            field461 += field475;
                            arg1 += field461 >> 8;
                            field461 &= 0xFF;
                        }
                    } else if (field463 == 256) {
                        if (field455 != -1) {
                            method216(this.field476[var8], this.field479[var8] + arg1 + 1, this.field469[var8] + var4 + 1, var13, var14, field455);
                        }
                        this.method213(this.field476[var8], this.field479[var8] + arg1, this.field469[var8] + var4, var13, var14, field454);
                    } else {
                        if (field455 != -1) {
                            method201(this.field476[var8], this.field479[var8] + arg1 + 1, this.field469[var8] + var4 + 1, var13, var14, field455, field463);
                        }
                        this.method205(this.field476[var8], this.field479[var8] + arg1, this.field469[var8] + var4, var13, var14, field454, field463);
                    }
                    int var15 = this.field462[var8];
                    if (field452 != -1) {
                        class27.method157(arg1, (int) ((double) this.field477 * 0.7D) + var4, var15, field452);
                    }
                    if (field473 != -1) {
                        class27.method157(arg1, this.field477 + var4 + 1, var15, field473);
                    }
                    arg1 += var15;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([I[BIIIIIIII)V", line = 487)
    public static final void method210(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "(Lu;IIII)V", line = 518)
    public final void method211(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method208(arg3, arg4);
            this.method209(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "(Lu;)V", line = 530)
    private final void method212(class38 arg0) {
        try {
            if (arg0.method220(field464, (byte) -91)) {
                field454 = arg0.method241(0, 4).method218(-102, 16);
            } else if (arg0.method227(126, field481)) {
                field454 = field459;
            } else if (arg0.method220(field451, (byte) -127)) {
                field452 = arg0.method241(0, 4).method218(-99, 16);
            } else if (arg0.method227(120, field468)) {
                field452 = 8388608;
            } else if (arg0.method227(126, field483)) {
                field452 = -1;
            } else if (arg0.method220(field457, (byte) -61)) {
                field473 = arg0.method241(0, 2).method218(-115, 16);
            } else if (arg0.method227(121, field470)) {
                field473 = 0;
            } else if (arg0.method227(123, field482)) {
                field473 = -1;
            } else if (arg0.method220(field456, (byte) -67)) {
                field455 = arg0.method241(0, 5).method218(39, 16);
            } else if (arg0.method227(120, field466)) {
                field455 = 0;
            } else if (arg0.method227(119, field480)) {
                field455 = field467;
            } else if (arg0.method227(122, field465)) {
                this.method208(field459, field467);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([[B[[B[I[I[III)I", line = 605)
    private static final int method214(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "mapview!sa", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 788)
    public class36(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field479 = arg1;
        this.field469 = arg2;
        this.field472 = arg3;
        this.field453 = arg4;
        this.method202(arg0);
        this.field476 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field469[var10] < var8 && this.field453[var10] != 0) {
                var8 = this.field469[var10];
            }
            if (this.field469[var10] + this.field453[var10] > var9) {
                var9 = this.field469[var10] + this.field453[var10];
            }
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "(Lu;IIII)V", line = 718)
    public final void method215(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method208(arg3, arg4);
            this.method209(arg0, arg1 - this.method206(arg0), arg2);
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "([BIIIII)V", line = 732)
    private static final void method216(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class27.field337 * arg2 + arg1;
        int var7 = class27.field337 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class27.field339) {
            int var10 = class27.field339 - arg2;
            arg4 -= var10;
            arg2 = class27.field339;
            var9 += arg3 * var10;
            var6 += class27.field337 * var10;
        }
        if (arg2 + arg4 > class27.field336) {
            arg4 -= arg2 + arg4 - class27.field336;
        }
        if (arg1 < class27.field340) {
            int var11 = class27.field340 - arg1;
            arg3 -= var11;
            arg1 = class27.field340;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class27.field341) {
            int var12 = arg1 + arg3 - class27.field341;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method204(class27.field338, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "([BIIIIII)V")
    public abstract void method205(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([BIIIII)V")
    public abstract void method213(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
