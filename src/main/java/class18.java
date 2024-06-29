import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class70 {

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
    public int field394 = 0;

    @OriginalMember(owner = "client!cc", name = "pb", descriptor = "[[B")
    private byte[][] field398 = new byte[256][];

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "Ljava/util/Random;")
    private Random field389 = new Random();

    @OriginalMember(owner = "client!cc", name = "sb", descriptor = "[I")
    private int[] field401;

    @OriginalMember(owner = "client!cc", name = "qb", descriptor = "[I")
    private int[] field399;

    @OriginalMember(owner = "client!cc", name = "Db", descriptor = "[I")
    private int[] field412;

    @OriginalMember(owner = "client!cc", name = "Gb", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client!cc", name = "Fb", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "Lu;")
    private static class135 field393 = class87.method676((byte) -77, "or1");

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "Lu;")
    private static class135 field392 = class87.method676((byte) -55, "gr2");

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "Lu;")
    private static class135 field397 = class87.method676((byte) -117, "cya");

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "Lu;")
    private static class135 field391 = class87.method676((byte) -45, "whi");

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "Lu;")
    private static class135 field395 = class87.method676((byte) -47, "gr3");

    @OriginalMember(owner = "client!cc", name = "ub", descriptor = "Lu;")
    private static class135 field403 = class87.method676((byte) -113, "dbl");

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "Lu;")
    private static class135 field388 = class87.method676((byte) -80, "gre");

    @OriginalMember(owner = "client!cc", name = "vb", descriptor = "Lu;")
    private static class135 field404 = class87.method676((byte) -42, "str");

    @OriginalMember(owner = "client!cc", name = "rb", descriptor = "Lu;")
    private static class135 field400 = class87.method676((byte) -97, "mag");

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "Lu;")
    private static class135 field390 = class87.method676((byte) -93, "or3");

    @OriginalMember(owner = "client!cc", name = "zb", descriptor = "[Lu;")
    private static class135[] field408 = new class135[100];

    @OriginalMember(owner = "client!cc", name = "wb", descriptor = "Lu;")
    private static class135 field405 = class87.method676((byte) -50, "or2");

    @OriginalMember(owner = "client!cc", name = "xb", descriptor = "Lu;")
    private static class135 field406 = class87.method676((byte) -124, "gr1");

    @OriginalMember(owner = "client!cc", name = "Cb", descriptor = "Lu;")
    private static class135 field411 = class87.method676((byte) -57, "@str@");

    @OriginalMember(owner = "client!cc", name = "tb", descriptor = "Lu;")
    private static class135 field402 = class87.method676((byte) -117, "blu");

    @OriginalMember(owner = "client!cc", name = "Bb", descriptor = "Lu;")
    private static class135 field410 = class87.method676((byte) -101, "lre");

    @OriginalMember(owner = "client!cc", name = "yb", descriptor = "Lu;")
    private static class135 field407 = class87.method676((byte) -52, "yel");

    @OriginalMember(owner = "client!cc", name = "Ab", descriptor = "Lu;")
    private static class135 field409 = class87.method676((byte) -82, "bla");

    @OriginalMember(owner = "client!cc", name = "Hb", descriptor = "Lu;")
    private static class135 field416 = class87.method676((byte) -47, "dre");

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "Z")
    private static boolean field396 = false;

    @OriginalMember(owner = "client!cc", name = "Eb", descriptor = "Lu;")
    private static class135 field413 = class87.method676((byte) -83, "red");

    @OriginalMember(owner = "client!cc", name = "Ib", descriptor = "Lu;")
    private static class135 field417 = class87.method676((byte) -101, "dma");

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;)I")
    public final int method115(class135 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field3255; var3++) {
            var2 += this.field399[arg0.field3266[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;III)V")
    public final void method116(class135 arg0, int arg1, int arg2, int arg3) {
        this.method121(arg0, arg1 - this.method115(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;IIIZ)V")
    public final void method117(class135 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method137(arg0, arg1 - this.method120(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method118(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;I)I")
    public final int method119(class135 arg0, int arg1) {
        return this.method126(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lu;)I")
    public final int method120(class135 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field3255; var3++) {
            if (arg0.field3266[var3] == 64 && var3 + 4 < arg0.field3255 && arg0.field3266[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field399[arg0.field3266[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lu;III)V")
    public final void method121(class135 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field394;
        for (int var6 = 0; var6 < arg0.field3255; var6++) {
            int var7 = arg0.field3266[var6] & 0xFF;
            if (var7 != 32) {
                method122(this.field398[var7], arg1, this.field401[var7] + var5, this.field399[var7], this.field412[var7], arg3);
            }
            arg1 += this.field399[var7];
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIIIII)V")
    private static final void method122(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class70.field1717 * arg2 + arg1;
        int var7 = class70.field1717 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class70.field1720) {
            int var10 = class70.field1720 - arg2;
            arg4 -= var10;
            arg2 = class70.field1720;
            var9 += arg3 * var10;
            var6 += class70.field1717 * var10;
        }
        if (arg2 + arg4 > class70.field1719) {
            arg4 -= arg2 + arg4 - class70.field1719;
        }
        if (arg1 < class70.field1716) {
            int var11 = class70.field1716 - arg1;
            arg3 -= var11;
            arg1 = class70.field1716;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class70.field1718) {
            int var12 = arg1 + arg3 - class70.field1718;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method118(class70.field1714, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)I")
    public final int method123(int arg0) {
        return this.field399[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;IIIIIZIII)V")
    public final void method124(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field394;
        }
        boolean var11 = true;
        if (arg4 < this.field415 + this.field414 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method126(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field415 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field415 - this.field414 - (var12 - 1) * arg9) / 2 + this.field415 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field414 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field415 - this.field414 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field415 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method137(field408[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method130(field408[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method117(field408[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method137(field408[var15], arg1, var13, arg5, arg6);
            } else {
                this.method135(field408[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lu;)I")
    private final int method125(class135 arg0) {
        if (arg0.method1101(field413, (byte) 98)) {
            return 16711680;
        } else if (arg0.method1101(field388, (byte) 115)) {
            return 65280;
        } else if (arg0.method1101(field402, (byte) 83)) {
            return 255;
        } else if (arg0.method1101(field407, (byte) 125)) {
            return 16776960;
        } else if (arg0.method1101(field397, (byte) 78)) {
            return 65535;
        } else if (arg0.method1101(field400, (byte) 79)) {
            return 16711935;
        } else if (arg0.method1101(field391, (byte) 99)) {
            return 16777215;
        } else if (arg0.method1101(field409, (byte) 121)) {
            return 0;
        } else if (arg0.method1101(field416, (byte) 121)) {
            return 8388608;
        } else if (arg0.method1101(field403, (byte) 82)) {
            return 128;
        } else if (arg0.method1101(field417, (byte) 90)) {
            return 8388736;
        } else if (arg0.method1101(field410, (byte) 88)) {
            return 16748608;
        } else if (arg0.method1101(field393, (byte) 120)) {
            return 16756736;
        } else if (arg0.method1101(field405, (byte) 90)) {
            return 16740352;
        } else if (arg0.method1101(field390, (byte) 112)) {
            return 16723968;
        } else if (arg0.method1101(field406, (byte) 123)) {
            return 12648192;
        } else if (arg0.method1101(field392, (byte) 113)) {
            return 8453888;
        } else if (arg0.method1101(field395, (byte) 84)) {
            return 4259584;
        } else {
            if (arg0.method1101(field404, (byte) 107)) {
                field396 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;IZ)I")
    private final int method126(class135 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class135 var6 = client.method167(0, 100);
        int var7 = -1;
        int var8 = 0;
        class135 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method1063(-64);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method1071(61, var15);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method1071(61, var15 + 4) == 64) {
                class135 var17 = arg0.method1074(var15, var15 + 5, -27090);
                if (var17.method1101(field404, (byte) 123)) {
                    var11 = true;
                    var12 = var6.method1063(-64);
                } else {
                    var9 = var17;
                    var10 = var6.method1063(-64);
                }
                var6.method1075(var17, 0);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method1071(61, var15 + 1) == 110) {
                field408[var13++] = var6.method1074(var5, var6.method1063(-64), -27090).method1086((byte) -50);
                var5 = var6.method1063(-64);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method1066(var16, true);
                var4 += this.method123(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method1063(-64);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field408[var13++] = var6.method1074(var5, var7, -27090).method1086((byte) 81);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method1073((byte) -41, var9, var5);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method1073((byte) -43, field411, var5);
                    }
                }
            }
        }
        if (var6.method1063(-64) > var5) {
            field408[var13++] = var6.method1074(var5, var6.method1063(-64), -27090).method1086((byte) -106);
        }
        return var13;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lu;III)V")
    public final void method127(class135 arg0, int arg1, int arg2, int arg3) {
        this.method121(arg0, arg1 - this.method115(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIIIIII)V")
    private static final void method128(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class70.field1717 * arg2 + arg1;
        int var8 = class70.field1717 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class70.field1720) {
            int var11 = class70.field1720 - arg2;
            arg4 -= var11;
            arg2 = class70.field1720;
            var10 += arg3 * var11;
            var7 += class70.field1717 * var11;
        }
        if (arg2 + arg4 > class70.field1719) {
            arg4 -= arg2 + arg4 - class70.field1719;
        }
        if (arg1 < class70.field1716) {
            int var12 = class70.field1716 - arg1;
            arg3 -= var12;
            arg1 = class70.field1716;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class70.field1718) {
            int var13 = arg1 + arg3 - class70.field1718;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method138(class70.field1714, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;IIII)V")
    public final void method129(class135 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method115(arg0) / 2;
        int var7 = arg2 - this.field394;
        for (int var8 = 0; var8 < arg0.field3255; var8++) {
            int var9 = arg0.field3266[var8] & 0xFF;
            if (var9 != 32) {
                method122(this.field398[var9], var6, this.field401[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field399[var9], this.field412[var9], arg3);
            }
            var6 += this.field399[var9];
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lu;IIIZ)V")
    public final void method130(class135 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method137(arg0, arg1 - this.method120(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lu;I)I")
    public final int method131(class135 arg0, int arg1) {
        int var3 = this.method126(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method120(field408[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;IIIII)V")
    public final void method132(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method115(arg0) / 2;
        int var10 = arg2 - this.field394;
        for (int var11 = 0; var11 < arg0.method1063(-64); var11++) {
            int var12 = arg0.field3266[var11] & 0xFF;
            if (var12 != 32) {
                method122(this.field398[var12], var9, this.field401[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field399[var12], this.field412[var12], arg3);
            }
            var9 += this.field399[var12];
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lu;IIII)V")
    public final void method133(class135 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method115(arg0) / 2;
        int var7 = arg2 - this.field394;
        for (int var8 = 0; var8 < arg0.method1063(-64); var8++) {
            int var9 = arg0.field3266[var8] & 0xFF;
            if (var9 != 32) {
                method122(this.field398[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field401[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field399[var9], this.field412[var9], arg3);
            }
            var6 += this.field399[var9];
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
    public static void method134() {
        field404 = null;
        field411 = null;
        field413 = null;
        field388 = null;
        field402 = null;
        field407 = null;
        field397 = null;
        field400 = null;
        field391 = null;
        field409 = null;
        field416 = null;
        field403 = null;
        field417 = null;
        field410 = null;
        field393 = null;
        field405 = null;
        field390 = null;
        field406 = null;
        field392 = null;
        field395 = null;
        field408 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;IIIZI)V")
    private final void method135(class135 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class135 var7 = arg0.method1086((byte) -122);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method1063(-64); var9++) {
            if (var7.method1071(61, var9) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method120(var7)) * 256 / var8;
        }
        field396 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field394;
        for (int var14 = 0; var14 < var7.field3255; var14++) {
            if (var7.field3266[var14] == 64 && var14 + 4 < var7.field3255 && var7.field3266[var14 + 4] == 64) {
                int var15 = this.method125(var7.method1074(var14 + 1, var14 + 4, -27090));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field3266[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        method122(this.field398[var16], arg1 + 1, this.field401[var16] + var13 + 1, this.field399[var16], this.field412[var16], 0);
                    }
                    method122(this.field398[var16], arg1, this.field401[var16] + var13, this.field399[var16], this.field412[var16], arg3);
                }
                arg1 += this.field399[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (field396) {
            class70.method568(var12, (int) ((double) this.field394 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lu;IIIZI)V")
    public final void method136(class135 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field389.setSeed((long) arg5);
        int var7 = (this.field389.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field394;
        for (int var9 = 0; var9 < arg0.field3255; var9++) {
            if (arg0.field3266[var9] == 64 && var9 + 4 < arg0.field3255 && arg0.field3266[var9 + 4] == 64) {
                int var10 = this.method125(arg0.method1074(var9 + 1, var9 + 4, -27090));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field3266[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        method128(this.field398[var11], arg1 + 1, this.field401[var11] + var8 + 1, this.field399[var11], this.field412[var11], 0, 192);
                    }
                    method128(this.field398[var11], arg1, this.field401[var11] + var8, this.field399[var11], this.field412[var11], arg3, var7);
                }
                arg1 += this.field399[var11];
                if ((this.field389.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lu;IIIZ)V")
    public final void method137(class135 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field396 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field394;
        for (int var8 = 0; var8 < arg0.field3255; var8++) {
            if (arg0.field3266[var8] == 64 && var8 + 4 < arg0.field3255 && arg0.field3266[var8 + 4] == 64) {
                int var9 = this.method125(arg0.method1074(var8 + 1, var8 + 4, -27090));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field3266[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method122(this.field398[var10], arg1 + 1, this.field401[var10] + var7 + 1, this.field399[var10], this.field412[var10], 0);
                    }
                    method122(this.field398[var10], arg1, this.field401[var10] + var7, this.field399[var10], this.field412[var10], arg3);
                }
                arg1 += this.field399[var10];
            }
        }
        if (field396) {
            class70.method568(var6, (int) ((double) this.field394 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method138(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class18(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field401 = arg0;
        this.field399 = arg1;
        this.field412 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field398 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field401[var10] < var8 && this.field412[var10] != 0) {
                var8 = this.field401[var10];
            }
            if (this.field412[var10] + this.field401[var10] > var9) {
                var9 = this.field412[var10] + this.field401[var10];
            }
            byte[] var11 = this.field398[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field394 = this.field412[32] + this.field401[32];
        this.field415 = this.field394 - var8;
        this.field414 = var9 - this.field394;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "([B)V")
    public class18(byte[] arg0) {
        this.field399 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field399.length; var2++) {
            this.field399[var2] = arg0[var2] & 0xFF;
        }
    }
}
