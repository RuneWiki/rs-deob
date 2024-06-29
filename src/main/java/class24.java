import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class24 extends class17 {

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public int field411 = 0;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "[[B")
    public byte[][] field408 = new byte[256][];

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "[I")
    private int[] field422;

    @OriginalMember(owner = "client!cd", name = "sb", descriptor = "[I")
    private int[] field430;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "[I")
    private int[] field415;

    @OriginalMember(owner = "client!cd", name = "tb", descriptor = "[I")
    private int[] field431;

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "Lsd;")
    private static class166 field407 = class135.method935(")4col", 0);

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "Lsd;")
    private static class166 field404 = class135.method935("shad=", 0);

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "Lsd;")
    private static class166 field406 = class135.method935("img=", 0);

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "[Lsd;")
    private static class166[] field414 = new class166[100];

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "Lsd;")
    private static class166 field413 = class135.method935(")4u", 0);

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "Lsd;")
    private static class166 field405 = class135.method935("u=", 0);

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
    private static int field418 = 256;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    private static int field409 = 0;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "Lsd;")
    private static class166 field420 = class135.method935("u", 0);

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    private static int field410 = -1;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "Lsd;")
    private static class166 field412 = class135.method935("gt", 0);

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "Lsd;")
    private static class166 field421 = class135.method935(")4str", 0);

    @OriginalMember(owner = "client!cd", name = "rb", descriptor = "I")
    private static int field429 = 0;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
    private static int field417 = 0;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
    private static int field423 = -1;

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "Lsd;")
    private static class166 field424 = class135.method935("str", 0);

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lsd;")
    private static class166 field416 = class135.method935("str=", 0);

    @OriginalMember(owner = "client!cd", name = "ub", descriptor = "Lsd;")
    private static class166 field432 = class135.method935("lt", 0);

    @OriginalMember(owner = "client!cd", name = "wb", descriptor = "I")
    private static int field434 = 0;

    @OriginalMember(owner = "client!cd", name = "yb", descriptor = "Lsd;")
    private static class166 field436 = class135.method935("br", 0);

    @OriginalMember(owner = "client!cd", name = "vb", descriptor = "Lsd;")
    private static class166 field433 = class135.method935("shad", 0);

    @OriginalMember(owner = "client!cd", name = "qb", descriptor = "I")
    private static int field428 = -1;

    @OriginalMember(owner = "client!cd", name = "Ab", descriptor = "I")
    private static int field438 = -1;

    @OriginalMember(owner = "client!cd", name = "xb", descriptor = "Lsd;")
    private static class166 field435 = class135.method935("col=", 0);

    @OriginalMember(owner = "client!cd", name = "Bb", descriptor = "Lsd;")
    private static class166 field439 = class135.method935(")4shad", 0);

    @OriginalMember(owner = "client!cd", name = "Cb", descriptor = "I")
    private static int field440 = 256;

    @OriginalMember(owner = "client!cd", name = "ob", descriptor = "[B")
    private byte[] field426;

    @OriginalMember(owner = "client!cd", name = "pb", descriptor = "[I")
    private int[] field427;

    @OriginalMember(owner = "client!cd", name = "zb", descriptor = "[Lkf;")
    public static class96[] field437;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;I)I")
    public final int method161(class166 arg0, int arg1) {
        return this.method184(arg0, new int[] { arg1 }, field414);
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(IIIIII)V")
    public abstract void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;)Lsd;")
    public static final class166 method164(class166 arg0) {
        int var1 = arg0.method1143(true);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field3162[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class166 var4 = new class166();
        var4.field3187 = var1 + var2;
        var4.field3162 = new byte[var4.field3187];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field3162[var6];
            if (var7 == 60) {
                var4.field3162[var5++] = 60;
                var4.field3162[var5++] = 108;
                var4.field3162[var5++] = 116;
                var4.field3162[var5++] = 62;
            } else if (var7 == 62) {
                var4.field3162[var5++] = 60;
                var4.field3162[var5++] = 103;
                var4.field3162[var5++] = 116;
                var4.field3162[var5++] = 62;
            } else {
                var4.field3162[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;IIIILjava/util/Random;I)I")
    public final int method165(class166 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method176(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field3187];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field3187; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method175(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;II)V")
    private final void method166(class166 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field411;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field3187; var7++) {
            int var8 = arg0.field3162[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class166 var9 = arg0.method1121(10876, var7, var5 + 1);
                    var5 = -1;
                    if (var9.method1138(field432, (byte) 97)) {
                        var8 = 60;
                    } else {
                        if (!var9.method1138(field412, (byte) 78)) {
                            if (var9.method1142(27575, field406)) {
                                try {
                                    int var10 = var9.method1155(4, (byte) -72).method1139((byte) 12);
                                    class96 var11 = field437[var10];
                                    if (field440 == 256) {
                                        var11.method731(arg1, this.field411 + var4 - var11.field1850);
                                    } else {
                                        var11.method728(arg1, this.field411 + var4 - var11.field1850, field440);
                                    }
                                    arg1 += var11.field1851;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method180(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field426 != null && var6 != -1) {
                        arg1 += this.field426[(var6 << 8) + var8];
                    }
                    int var12 = this.field415[var8];
                    int var13 = this.field431[var8];
                    if (var8 == 32) {
                        if (field417 > 0) {
                            field434 += field417;
                            arg1 += field434 >> 8;
                            field434 &= 0xFF;
                        }
                    } else if (field440 == 256) {
                        if (field428 != -1) {
                            this.method172(var8, this.field422[var8] + arg1 + 1, this.field430[var8] + var4 + 1, var12, var13, field428);
                        }
                        this.method162(var8, this.field422[var8] + arg1, this.field430[var8] + var4, var12, var13, field429);
                    } else {
                        if (field428 != -1) {
                            this.method168(var8, this.field422[var8] + arg1 + 1, this.field430[var8] + var4 + 1, var12, var13, field428, field440);
                        }
                        this.method163(var8, this.field422[var8] + arg1, this.field430[var8] + var4, var12, var13, field429, field440);
                    }
                    int var14 = this.field427[var8];
                    if (field410 != -1) {
                        class17.method106(arg1, (int) ((double) this.field411 * 0.7D) + var4, var14, field410);
                    }
                    if (field438 != -1) {
                        class17.method106(arg1, this.field411 + var4 + 1, var14, field438);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;IIIII)V")
    public final void method167(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method177(arg3, arg4);
        int[] var7 = new int[arg0.field3187];
        int[] var8 = new int[arg0.field3187];
        for (int var9 = 0; var9 < arg0.field3187; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method175(arg0, arg1 - this.method171(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIIIIII)V")
    private final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class17.field282 * arg2 + arg1;
        int var9 = class17.field282 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class17.field285) {
            int var12 = class17.field285 - arg2;
            arg4 -= var12;
            arg2 = class17.field285;
            var11 += arg3 * var12;
            var8 += class17.field282 * var12;
        }
        if (arg2 + arg4 > class17.field281) {
            arg4 -= arg2 + arg4 - class17.field281;
        }
        if (arg1 < class17.field283) {
            int var13 = class17.field283 - arg1;
            arg3 -= var13;
            arg1 = class17.field283;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class17.field279) {
            int var14 = arg1 + arg3 - class17.field279;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method189(class17.field284, this.field408[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;IIIIIIIIII)I")
    private final int method169(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method176(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field411;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field425 + this.field419 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method184(arg0, var12, field414);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field425 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field425 - this.field419 - (var13 - 1) * arg10) / 2 + this.field425 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field419 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field425 - this.field419 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field425 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method166(field414[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method166(field414[var16], arg1 + (arg3 - this.method171(field414[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method166(field414[var16], arg1 + arg3 - this.method171(field414[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method166(field414[var16], arg1, var14);
            } else {
                this.method173(field414[var16], arg3);
                this.method166(field414[var16], arg1, var14);
                field417 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()V")
    public static void method170() {
        field432 = null;
        field412 = null;
        field406 = null;
        field436 = null;
        field435 = null;
        field407 = null;
        field405 = null;
        field420 = null;
        field413 = null;
        field404 = null;
        field433 = null;
        field439 = null;
        field416 = null;
        field424 = null;
        field421 = null;
        field437 = null;
        field414 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lsd;)I")
    public final int method171(class166 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field3187; var5++) {
            int var6 = arg0.field3162[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class166 var7 = arg0.method1121(10876, var5, var2 + 1);
                    var2 = -1;
                    if (var7.method1138(field432, (byte) 122)) {
                        var6 = 60;
                    } else {
                        if (!var7.method1138(field412, (byte) 124)) {
                            if (var7.method1142(27575, field406)) {
                                try {
                                    int var8 = var7.method1155(4, (byte) -72).method1139((byte) 12);
                                    var4 += field437[var8].field1851;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field427[var6];
                    if (this.field426 != null && var3 != -1) {
                        var4 += this.field426[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(IIIIII)V")
    private final void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class17.field282 * arg2 + arg1;
        int var8 = class17.field282 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class17.field285) {
            int var11 = class17.field285 - arg2;
            arg4 -= var11;
            arg2 = class17.field285;
            var10 += arg3 * var11;
            var7 += class17.field282 * var11;
        }
        if (arg2 + arg4 > class17.field281) {
            arg4 -= arg2 + arg4 - class17.field281;
        }
        if (arg1 < class17.field283) {
            int var12 = class17.field283 - arg1;
            arg3 -= var12;
            arg1 = class17.field283;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class17.field279) {
            int var13 = arg1 + arg3 - class17.field279;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method183(class17.field284, this.field408[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lsd;I)V")
    private final void method173(class166 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method1143(true); var5++) {
            int var6 = arg0.method1152(-100, var5);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field417 = (arg1 - this.method171(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)I")
    private final int method174(int arg0) {
        return this.field427[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;II[I[I)V")
    private final void method175(class166 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field411;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field3187; var10++) {
            int var11 = arg0.field3162[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class166 var12 = arg0.method1121(10876, var10, var7 + 1);
                    var7 = -1;
                    if (var12.method1138(field432, (byte) 101)) {
                        var11 = 60;
                    } else {
                        if (!var12.method1138(field412, (byte) 120)) {
                            if (var12.method1142(27575, field406)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method1155(4, (byte) -72).method1139((byte) 12);
                                    class96 var16 = field437[var15];
                                    if (field440 == 256) {
                                        var16.method731(arg1 + var13, this.field411 + var6 - var16.field1850 + var14);
                                    } else {
                                        var16.method728(arg1 + var13, this.field411 + var6 - var16.field1850 + var14, field440);
                                    }
                                    arg1 += var16.field1851;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method180(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field426 != null && var8 != -1) {
                        arg1 += this.field426[(var8 << 8) + var11];
                    }
                    int var17 = this.field415[var11];
                    int var18 = this.field431[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field417 > 0) {
                            field434 += field417;
                            arg1 += field434 >> 8;
                            field434 &= 0xFF;
                        }
                    } else if (field440 == 256) {
                        if (field428 != -1) {
                            this.method172(var11, this.field422[var11] + arg1 + var19 + 1, this.field430[var11] + var6 + 1 + var20, var17, var18, field428);
                        }
                        this.method162(var11, this.field422[var11] + arg1 + var19, this.field430[var11] + var6 + var20, var17, var18, field429);
                    } else {
                        if (field428 != -1) {
                            this.method168(var11, this.field422[var11] + arg1 + var19 + 1, this.field430[var11] + var6 + 1 + var20, var17, var18, field428, field440);
                        }
                        this.method163(var11, this.field422[var11] + arg1 + var19, this.field430[var11] + var6 + var20, var17, var18, field429, field440);
                    }
                    int var21 = this.field427[var11];
                    if (field410 != -1) {
                        class17.method106(arg1, (int) ((double) this.field411 * 0.7D) + var6, var21, field410);
                    }
                    if (field438 != -1) {
                        class17.method106(arg1, this.field411 + var6, var21, field438);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    private final void method176(int arg0, int arg1, int arg2) {
        field410 = -1;
        field438 = -1;
        field423 = arg1;
        field428 = arg1;
        field409 = arg0;
        field429 = arg0;
        field418 = arg2;
        field440 = arg2;
        field417 = 0;
        field434 = 0;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
    private final void method177(int arg0, int arg1) {
        field410 = -1;
        field438 = -1;
        field423 = arg1;
        field428 = arg1;
        field409 = arg0;
        field429 = arg0;
        field418 = 256;
        field440 = 256;
        field417 = 0;
        field434 = 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;IIII)V")
    public final void method178(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method177(arg3, arg4);
            this.method166(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;IIIIIIIII)I")
    public final int method179(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method169(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lsd;)V")
    private final void method180(class166 arg0) {
        try {
            if (arg0.method1142(27575, field435)) {
                field429 = arg0.method1155(4, (byte) -72).method1141(16, (byte) 80);
                return;
            }
            if (arg0.method1138(field407, (byte) 88)) {
                field429 = field409;
                return;
            }
            if (arg0.method1142(27575, field416)) {
                field410 = arg0.method1155(4, (byte) -72).method1141(16, (byte) 103);
                return;
            }
            if (arg0.method1138(field424, (byte) 61)) {
                field410 = 8388608;
                return;
            }
            if (arg0.method1138(field421, (byte) 106)) {
                field410 = -1;
                return;
            }
            if (arg0.method1142(27575, field405)) {
                field438 = arg0.method1155(2, (byte) -72).method1141(16, (byte) 109);
                return;
            }
            if (arg0.method1138(field420, (byte) 107)) {
                field438 = 0;
                return;
            }
            if (arg0.method1138(field413, (byte) 119)) {
                field438 = -1;
                return;
            }
            if (arg0.method1142(27575, field404)) {
                field428 = arg0.method1155(5, (byte) -72).method1141(16, (byte) 112);
                return;
            }
            if (arg0.method1138(field433, (byte) 112)) {
                field428 = 0;
                return;
            }
            if (arg0.method1138(field439, (byte) 66)) {
                field428 = field423;
                return;
            }
            if (arg0.method1138(field436, (byte) 91)) {
                this.method176(field409, field423, field418);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lsd;IIII)V")
    public final void method181(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method177(arg3, arg4);
            this.method166(arg0, arg1 - this.method171(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lsd;IIII)V")
    public final void method182(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method177(arg3, arg4);
            this.method166(arg0, arg1 - this.method171(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method183(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;[I[Lsd;)I")
    private final int method184(class166 arg0, int[] arg1, class166[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class166 var6 = class128.method910(true, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method1143(true);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method1152(-126, var14);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class166 var16 = arg0.method1121(10876, var14, var10 + 1);
                    var10 = -1;
                    var6.method1128((byte) 103, 60);
                    var6.method1151(-113, var16);
                    var6.method1128((byte) 108, 62);
                    if (var16.method1138(field436, (byte) 81)) {
                        arg2[var12++] = var6.method1121(10876, var6.method1143(true), var5);
                        var5 = var6.method1143(true);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method1138(field432, (byte) 119)) {
                        var4 += this.method174(60);
                        if (this.field426 != null && var11 != -1) {
                            var4 += this.field426[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method1138(field412, (byte) 74)) {
                        var4 += this.method174(62);
                        if (this.field426 != null && var11 != -1) {
                            var4 += this.field426[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method1142(27575, field406)) {
                        try {
                            int var17 = var16.method1155(4, (byte) -72).method1139((byte) 12);
                            var4 += field437[var17].field1851;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method1128((byte) 112, var15);
                        var4 += this.method174(var15);
                        if (this.field426 != null && var11 != -1) {
                            var4 += this.field426[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method1143(true);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method1121(10876, var7 - var9, var5);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method1143(true);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method1143(true) > var5) {
            arg2[var12++] = var6.method1121(10876, var6.method1143(true), var5);
        }
        return var12;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lsd;IIIII)V")
    public final void method185(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method177(arg3, arg4);
        int[] var7 = new int[arg0.field3187];
        for (int var8 = 0; var8 < arg0.field3187; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method175(arg0, arg1 - this.method171(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lsd;I)I")
    public final int method186(class166 arg0, int arg1) {
        int var3 = this.method184(arg0, new int[] { arg1 }, field414);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method171(field414[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsd;IIIIII)V")
    public final void method187(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method177(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field3187];
        for (int var11 = 0; var11 < arg0.field3187; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method175(arg0, arg1 - this.method171(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([B)V")
    private final void method188(byte[] arg0) {
        this.field427 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field427.length; var2++) {
                this.field427[var2] = arg0[var2] & 0xFF;
            }
            this.field411 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field427[var4] = arg0[var3++] & 0xFF;
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
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field426 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field426[(var13 << 8) + var14] = (byte) method190(var9, var11, var6, this.field427, var5, var13, var14);
                    }
                }
            }
        }
        this.field411 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method189(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class24(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field422 = arg1;
        this.field430 = arg2;
        this.field415 = arg3;
        this.field431 = arg4;
        this.method188(arg0);
        this.field408 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field430[var10] < var8 && this.field431[var10] != 0) {
                var8 = this.field430[var10];
            }
            if (this.field431[var10] + this.field430[var10] > var9) {
                var9 = this.field431[var10] + this.field430[var10];
            }
        }
        this.field425 = this.field411 - var8;
        this.field419 = var9 - this.field411;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method190(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B)V")
    public class24(byte[] arg0) {
        this.method188(arg0);
    }
}
