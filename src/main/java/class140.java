import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class140 extends class120 {

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "[[B")
    private byte[][] field3278 = new byte[256][];

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public int field3268 = 0;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "Ljava/util/Random;")
    private Random field3279 = new Random();

    @OriginalMember(owner = "client!v", name = "wb", descriptor = "[I")
    private int[] field3291;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "[I")
    private int[] field3283;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "[I")
    private int[] field3281;

    @OriginalMember(owner = "client!v", name = "xb", descriptor = "I")
    private int field3292;

    @OriginalMember(owner = "client!v", name = "yb", descriptor = "I")
    private int field3293;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "[Lwd;")
    private static class150[] field3269 = new class150[100];

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "Lwd;")
    private static class150 field3270 = class2.method9(true, "mag");

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "Lwd;")
    private static class150 field3274 = class2.method9(true, "gr1");

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "Lwd;")
    private static class150 field3271 = class2.method9(true, "or2");

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "Lwd;")
    private static class150 field3273 = class2.method9(true, "cya");

    @OriginalMember(owner = "client!v", name = "db", descriptor = "Lwd;")
    private static class150 field3272 = class2.method9(true, "bla");

    @OriginalMember(owner = "client!v", name = "W", descriptor = "Lwd;")
    private static class150 field3265 = class2.method9(true, "@str@");

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "Lwd;")
    private static class150 field3267 = class2.method9(true, "lre");

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "Lwd;")
    private static class150 field3277 = class2.method9(true, "gre");

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "Lwd;")
    private static class150 field3275 = class2.method9(true, "or3");

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "Lwd;")
    private static class150 field3282 = class2.method9(true, "dbl");

    @OriginalMember(owner = "client!v", name = "X", descriptor = "Lwd;")
    private static class150 field3266 = class2.method9(true, "str");

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "Lwd;")
    private static class150 field3285 = class2.method9(true, "whi");

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "Lwd;")
    private static class150 field3276 = class2.method9(true, "dre");

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "Lwd;")
    private static class150 field3280 = class2.method9(true, "red");

    @OriginalMember(owner = "client!v", name = "tb", descriptor = "Lwd;")
    private static class150 field3288 = class2.method9(true, "yel");

    @OriginalMember(owner = "client!v", name = "ub", descriptor = "Lwd;")
    private static class150 field3289 = class2.method9(true, "or1");

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "Z")
    private static boolean field3284 = false;

    @OriginalMember(owner = "client!v", name = "vb", descriptor = "Lwd;")
    private static class150 field3290 = class2.method9(true, "gr3");

    @OriginalMember(owner = "client!v", name = "rb", descriptor = "Lwd;")
    private static class150 field3286 = class2.method9(true, "gr2");

    @OriginalMember(owner = "client!v", name = "sb", descriptor = "Lwd;")
    private static class150 field3287 = class2.method9(true, "blu");

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method1033(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwd;III)V")
    public final void method1034(class150 arg0, int arg1, int arg2, int arg3) {
        this.method1053(arg0, arg1 - this.method1038(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwd;IIIZI)V")
    public final void method1035(class150 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field3279.setSeed((long) arg5);
        int var7 = (this.field3279.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field3268;
        for (int var9 = 0; var9 < arg0.field3718; var9++) {
            if (arg0.field3678[var9] == 64 && var9 + 4 < arg0.field3718 && arg0.field3678[var9 + 4] == 64) {
                int var10 = this.method1044(arg0.method1202(var9 + 1, var9 + 4, 0));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field3678[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        method1048(this.field3278[var11], arg1 + 1, this.field3291[var11] + var8 + 1, this.field3283[var11], this.field3281[var11], 0, 192);
                    }
                    method1048(this.field3278[var11], arg1, this.field3291[var11] + var8, this.field3283[var11], this.field3281[var11], arg3, var7);
                }
                arg1 += this.field3283[var11];
                if ((this.field3279.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)I")
    public final int method1036(int arg0) {
        return this.field3283[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwd;IIII)V")
    public final void method1037(class150 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method1038(arg0) / 2;
        int var7 = arg2 - this.field3268;
        for (int var8 = 0; var8 < arg0.method1174((byte) -126); var8++) {
            int var9 = arg0.field3678[var8] & 0xFF;
            if (var9 != 32) {
                method1045(this.field3278[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field3291[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field3283[var9], this.field3281[var9], arg3);
            }
            var6 += this.field3283[var9];
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwd;)I")
    public final int method1038(class150 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field3718; var3++) {
            var2 += this.field3283[arg0.field3678[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwd;I)I")
    public final int method1039(class150 arg0, int arg1) {
        return this.method1041(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwd;IIIIIZIII)V")
    public final void method1040(class150 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field3268;
        }
        boolean var11 = true;
        if (arg4 < this.field3293 + this.field3292 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method1041(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3292 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3292 - this.field3293 - (var12 - 1) * arg9) / 2 + this.field3292 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3293 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3292 - this.field3293 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3292 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method1047(field3269[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method1055(field3269[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method1050(field3269[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method1047(field3269[var15], arg1, var13, arg5, arg6);
            } else {
                this.method1046(field3269[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwd;IZ)I")
    private final int method1041(class150 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class150 var6 = class128.method970(100, (byte) 56);
        int var7 = -1;
        int var8 = 0;
        class150 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method1174((byte) -118);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method1206(var15, -27473);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method1206(var15 + 4, -27473) == 64) {
                class150 var17 = arg0.method1202(var15, var15 + 5, 0);
                if (var17.method1192(field3266, 1)) {
                    var11 = true;
                    var12 = var6.method1174((byte) -122);
                } else {
                    var9 = var17;
                    var10 = var6.method1174((byte) -127);
                }
                var6.method1183((byte) -8, var17);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method1206(var15 + 1, -27473) == 110) {
                field3269[var13++] = var6.method1202(var5, var6.method1174((byte) -119), 0).method1201(true);
                var5 = var6.method1174((byte) -125);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method1194((byte) 20, var16);
                var4 += this.method1036(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method1174((byte) -123);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field3269[var13++] = var6.method1202(var5, var7, 0).method1201(true);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method1204(false, var5, var9);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method1204(false, var5, field3265);
                    }
                }
            }
        }
        if (var6.method1174((byte) -114) > var5) {
            field3269[var13++] = var6.method1202(var5, var6.method1174((byte) -123), 0).method1201(true);
        }
        return var13;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwd;IIIII)V")
    public final void method1042(class150 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method1038(arg0) / 2;
        int var10 = arg2 - this.field3268;
        for (int var11 = 0; var11 < arg0.method1174((byte) -127); var11++) {
            int var12 = arg0.field3678[var11] & 0xFF;
            if (var12 != 32) {
                method1045(this.field3278[var12], var9, this.field3291[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field3283[var12], this.field3281[var12], arg3);
            }
            var9 += this.field3283[var12];
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lwd;)I")
    public final int method1043(class150 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field3718; var3++) {
            if (arg0.field3678[var3] == 64 && var3 + 4 < arg0.field3718 && arg0.field3678[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field3283[arg0.field3678[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(Lwd;)I")
    private final int method1044(class150 arg0) {
        if (arg0.method1192(field3280, 1)) {
            return 16711680;
        } else if (arg0.method1192(field3277, 1)) {
            return 65280;
        } else if (arg0.method1192(field3287, 1)) {
            return 255;
        } else if (arg0.method1192(field3288, 1)) {
            return 16776960;
        } else if (arg0.method1192(field3273, 1)) {
            return 65535;
        } else if (arg0.method1192(field3270, 1)) {
            return 16711935;
        } else if (arg0.method1192(field3285, 1)) {
            return 16777215;
        } else if (arg0.method1192(field3272, 1)) {
            return 0;
        } else if (arg0.method1192(field3267, 1)) {
            return 16748608;
        } else if (arg0.method1192(field3276, 1)) {
            return 8388608;
        } else if (arg0.method1192(field3282, 1)) {
            return 128;
        } else if (arg0.method1192(field3289, 1)) {
            return 16756736;
        } else if (arg0.method1192(field3271, 1)) {
            return 16740352;
        } else if (arg0.method1192(field3275, 1)) {
            return 16723968;
        } else if (arg0.method1192(field3274, 1)) {
            return 12648192;
        } else if (arg0.method1192(field3286, 1)) {
            return 8453888;
        } else if (arg0.method1192(field3290, 1)) {
            return 4259584;
        } else {
            if (arg0.method1192(field3266, 1)) {
                field3284 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BIIIII)V")
    private static final void method1045(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class120.field2775 * arg2 + arg1;
        int var7 = class120.field2775 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class120.field2770) {
            int var10 = class120.field2770 - arg2;
            arg4 -= var10;
            arg2 = class120.field2770;
            var9 += arg3 * var10;
            var6 += class120.field2775 * var10;
        }
        if (arg2 + arg4 > class120.field2773) {
            arg4 -= arg2 + arg4 - class120.field2773;
        }
        if (arg1 < class120.field2774) {
            int var11 = class120.field2774 - arg1;
            arg3 -= var11;
            arg1 = class120.field2774;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class120.field2776) {
            int var12 = arg1 + arg3 - class120.field2776;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1056(class120.field2771, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lwd;IIIZI)V")
    private final void method1046(class150 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class150 var7 = arg0.method1201(true);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method1174((byte) -115); var9++) {
            if (var7.method1206(var9, -27473) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method1043(var7)) * 256 / var8;
        }
        field3284 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field3268;
        for (int var14 = 0; var14 < var7.field3718; var14++) {
            if (var7.field3678[var14] == 64 && var14 + 4 < var7.field3718 && var7.field3678[var14 + 4] == 64) {
                int var15 = this.method1044(var7.method1202(var14 + 1, var14 + 4, 0));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field3678[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        method1045(this.field3278[var16], arg1 + 1, this.field3291[var16] + var13 + 1, this.field3283[var16], this.field3281[var16], 0);
                    }
                    method1045(this.field3278[var16], arg1, this.field3291[var16] + var13, this.field3283[var16], this.field3281[var16], arg3);
                }
                arg1 += this.field3283[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (field3284) {
            class120.method867(var12, (int) ((double) this.field3268 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwd;IIIZ)V")
    public final void method1047(class150 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3284 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field3268;
        for (int var8 = 0; var8 < arg0.field3718; var8++) {
            if (arg0.field3678[var8] == 64 && var8 + 4 < arg0.field3718 && arg0.field3678[var8 + 4] == 64) {
                int var9 = this.method1044(arg0.method1202(var8 + 1, var8 + 4, 0));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field3678[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method1045(this.field3278[var10], arg1 + 1, this.field3291[var10] + var7 + 1, this.field3283[var10], this.field3281[var10], 0);
                    }
                    method1045(this.field3278[var10], arg1, this.field3291[var10] + var7, this.field3283[var10], this.field3281[var10], arg3);
                }
                arg1 += this.field3283[var10];
            }
        }
        if (field3284) {
            class120.method867(var6, (int) ((double) this.field3268 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BIIIIII)V")
    private static final void method1048(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class120.field2775 * arg2 + arg1;
        int var8 = class120.field2775 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class120.field2770) {
            int var11 = class120.field2770 - arg2;
            arg4 -= var11;
            arg2 = class120.field2770;
            var10 += arg3 * var11;
            var7 += class120.field2775 * var11;
        }
        if (arg2 + arg4 > class120.field2773) {
            arg4 -= arg2 + arg4 - class120.field2773;
        }
        if (arg1 < class120.field2774) {
            int var12 = class120.field2774 - arg1;
            arg3 -= var12;
            arg1 = class120.field2774;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class120.field2776) {
            int var13 = arg1 + arg3 - class120.field2776;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1033(class120.field2771, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lwd;IIII)V")
    public final void method1049(class150 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method1038(arg0) / 2;
        int var7 = arg2 - this.field3268;
        for (int var8 = 0; var8 < arg0.field3718; var8++) {
            int var9 = arg0.field3678[var8] & 0xFF;
            if (var9 != 32) {
                method1045(this.field3278[var9], var6, this.field3291[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field3283[var9], this.field3281[var9], arg3);
            }
            var6 += this.field3283[var9];
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lwd;IIIZ)V")
    public final void method1050(class150 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method1047(arg0, arg1 - this.method1043(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
    public static void method1051() {
        field3266 = null;
        field3265 = null;
        field3280 = null;
        field3277 = null;
        field3287 = null;
        field3288 = null;
        field3273 = null;
        field3270 = null;
        field3285 = null;
        field3272 = null;
        field3267 = null;
        field3276 = null;
        field3282 = null;
        field3289 = null;
        field3271 = null;
        field3275 = null;
        field3274 = null;
        field3286 = null;
        field3290 = null;
        field3269 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lwd;III)V")
    public final void method1052(class150 arg0, int arg1, int arg2, int arg3) {
        this.method1053(arg0, arg1 - this.method1038(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(Lwd;III)V")
    public final void method1053(class150 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field3268;
        for (int var6 = 0; var6 < arg0.field3718; var6++) {
            int var7 = arg0.field3678[var6] & 0xFF;
            if (var7 != 32) {
                method1045(this.field3278[var7], arg1, this.field3291[var7] + var5, this.field3283[var7], this.field3281[var7], arg3);
            }
            arg1 += this.field3283[var7];
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lwd;I)I")
    public final int method1054(class150 arg0, int arg1) {
        int var3 = this.method1041(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1038(field3269[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(Lwd;IIIZ)V")
    public final void method1055(class150 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method1047(arg0, arg1 - this.method1043(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method1056(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class140(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field3291 = arg0;
        this.field3283 = arg1;
        this.field3281 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field3278 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3291[var10] < var8 && this.field3281[var10] != 0) {
                var8 = this.field3291[var10];
            }
            if (this.field3291[var10] + this.field3281[var10] > var9) {
                var9 = this.field3291[var10] + this.field3281[var10];
            }
            byte[] var11 = this.field3278[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field3268 = this.field3291[32] + this.field3281[32];
        this.field3292 = this.field3268 - var8;
        this.field3293 = var9 - this.field3268;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B)V")
    public class140(byte[] arg0) {
        this.field3283 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field3283.length; var2++) {
            this.field3283[var2] = arg0[var2] & 0xFF;
        }
    }
}
