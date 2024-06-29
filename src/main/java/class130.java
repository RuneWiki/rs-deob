import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class130 extends class55 {

    @OriginalMember(owner = "client!vd", name = "Bb", descriptor = "I")
    public int field3156 = 0;

    @OriginalMember(owner = "client!vd", name = "Db", descriptor = "[[B")
    private byte[][] field3158 = new byte[256][];

    @OriginalMember(owner = "client!vd", name = "ob", descriptor = "Ljava/util/Random;")
    private Random field3143 = new Random();

    @OriginalMember(owner = "client!vd", name = "Jb", descriptor = "Z")
    private boolean field3164 = false;

    @OriginalMember(owner = "client!vd", name = "tb", descriptor = "[I")
    private int[] field3148;

    @OriginalMember(owner = "client!vd", name = "Hb", descriptor = "[I")
    private int[] field3162;

    @OriginalMember(owner = "client!vd", name = "vb", descriptor = "[I")
    private int[] field3150;

    @OriginalMember(owner = "client!vd", name = "Kb", descriptor = "I")
    private int field3165;

    @OriginalMember(owner = "client!vd", name = "Ib", descriptor = "I")
    private int field3163;

    @OriginalMember(owner = "client!vd", name = "lb", descriptor = "Lad;")
    private static class5 field3140 = class88.method674("cya", -101);

    @OriginalMember(owner = "client!vd", name = "kb", descriptor = "Lad;")
    private static class5 field3139 = class88.method674("yel", 106);

    @OriginalMember(owner = "client!vd", name = "qb", descriptor = "Lad;")
    private static class5 field3145 = class88.method674("or3", -108);

    @OriginalMember(owner = "client!vd", name = "mb", descriptor = "Lad;")
    private static class5 field3141 = class88.method674("gr2", 100);

    @OriginalMember(owner = "client!vd", name = "rb", descriptor = "Lad;")
    private static class5 field3146 = class88.method674("str", -74);

    @OriginalMember(owner = "client!vd", name = "ub", descriptor = "Lad;")
    private static class5 field3149 = class88.method674("red", 71);

    @OriginalMember(owner = "client!vd", name = "jb", descriptor = "Lad;")
    private static class5 field3138 = class88.method674("or1", -70);

    @OriginalMember(owner = "client!vd", name = "pb", descriptor = "[Lad;")
    private static class5[] field3144 = new class5[100];

    @OriginalMember(owner = "client!vd", name = "yb", descriptor = "Lad;")
    private static class5 field3153 = class88.method674("gre", 19);

    @OriginalMember(owner = "client!vd", name = "zb", descriptor = "Lad;")
    private static class5 field3154 = class88.method674("whi", 92);

    @OriginalMember(owner = "client!vd", name = "nb", descriptor = "Lad;")
    private static class5 field3142 = class88.method674("dbl", 32);

    @OriginalMember(owner = "client!vd", name = "wb", descriptor = "Lad;")
    private static class5 field3151 = class88.method674("gr3", 88);

    @OriginalMember(owner = "client!vd", name = "Cb", descriptor = "Lad;")
    private static class5 field3157 = class88.method674("mag", -65);

    @OriginalMember(owner = "client!vd", name = "Gb", descriptor = "Lad;")
    private static class5 field3161 = class88.method674("dre", -100);

    @OriginalMember(owner = "client!vd", name = "Fb", descriptor = "Lad;")
    private static class5 field3160 = class88.method674("gr1", -110);

    @OriginalMember(owner = "client!vd", name = "Ab", descriptor = "Lad;")
    private static class5 field3155 = class88.method674("or2", -104);

    @OriginalMember(owner = "client!vd", name = "xb", descriptor = "Lad;")
    private static class5 field3152 = class88.method674("blu", 99);

    @OriginalMember(owner = "client!vd", name = "sb", descriptor = "Lad;")
    private static class5 field3147 = class88.method674("bla", -69);

    @OriginalMember(owner = "client!vd", name = "Eb", descriptor = "Lad;")
    private static class5 field3159 = class88.method674("lre", 127);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lad;IIIZ)V", line = 4)
    public final void method1000(class5 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method1016(arg0, arg1 - this.method1006(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lad;IIII)V", line = 7)
    public final void method1001(class5 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method1007(arg0) / 2;
        int var7 = arg2 - this.field3156;
        for (int var8 = 0; var8 < arg0.method33(102); var8++) {
            int var9 = arg0.field164[var8] & 0xFF;
            if (var9 != 32) {
                this.method1008(this.field3158[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field3148[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field3162[var9], this.field3150[var9], arg3);
            }
            var6 += this.field3162[var9];
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lad;IIII)V", line = 30)
    public final void method1002(class5 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method1007(arg0) / 2;
        int var7 = arg2 - this.field3156;
        for (int var8 = 0; var8 < arg0.field183; var8++) {
            int var9 = arg0.field164[var8] & 0xFF;
            if (var9 != 32) {
                this.method1008(this.field3158[var9], var6, this.field3148[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field3162[var9], this.field3150[var9], arg3);
            }
            var6 += this.field3162[var9];
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lad;IIIZI)V", line = 51)
    public final void method1003(class5 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field3143.setSeed((long) arg5);
        int var7 = (this.field3143.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field3156;
        for (int var9 = 0; var9 < arg0.field183; var9++) {
            if (arg0.field164[var9] == 64 && var9 + 4 < arg0.field183 && arg0.field164[var9 + 4] == 64) {
                int var10 = this.method1010(arg0.method51((byte) -90, var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field164[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        this.method1020(this.field3158[var11], arg1 + 1, this.field3148[var11] + var8 + 1, this.field3162[var11], this.field3150[var11], 0, 192);
                    }
                    this.method1020(this.field3158[var11], arg1, this.field3148[var11] + var8, this.field3162[var11], this.field3150[var11], arg3, var7);
                }
                arg1 += this.field3162[var11];
                if ((this.field3143.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lad;III)V", line = 101)
    public final void method1004(class5 arg0, int arg1, int arg2, int arg3) {
        this.method1014(arg0, arg1 - this.method1007(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lad;IIIIIZIII)V", line = 111)
    public final void method1005(class5 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        int var12 = 0;
        class5 var13 = class103.method830((byte) 78, 100);
        int var14 = -1;
        int var15 = 0;
        class5 var16 = null;
        if (arg9 == 0) {
            arg9 = this.field3165;
        }
        boolean var17 = true;
        if (arg4 < this.field3165 + this.field3163 + arg9 && arg4 < arg9 + arg9) {
            var17 = false;
        }
        int var18 = 0;
        int var19 = arg0.method33(95);
        for (int var20 = 0; var20 < var19; var20++) {
            int var24 = arg0.method55(var20, 255);
            if (var24 == 64 && var20 + 4 < var19 && arg0.method55(var20 + 4, 255) == 64) {
                var16 = arg0.method51((byte) -49, var20, var20 + 5);
                var13.method35(var16, -120);
                var20 += 4;
            } else if (var24 == 92 && var20 + 1 < var19 && arg0.method55(var20 + 1, 255) == 110) {
                var16 = null;
                field3144[var18++] = var13.method51((byte) -44, var12, var13.method33(126)).method39((byte) 127);
                var12 = var13.method33(60);
                var11 = 0;
                var14 = -1;
                var20++;
            } else {
                var13.method57(var24, 92);
                var11 += this.method1012(var24);
                if (var24 == 32 || var24 == 45) {
                    var14 = var13.method33(57);
                    var15 = var11;
                }
                if (var17 && var11 > arg3 && var14 >= 0) {
                    field3144[var18++] = var13.method51((byte) -32, var12, var14).method39((byte) 127);
                    var12 = var14;
                    var14 = -1;
                    var11 -= var15;
                    if (var16 != null && var12 > 4) {
                        var12 -= 5;
                        var13.method63(var12, var16, 12);
                    }
                }
            }
        }
        if (var13.method33(42) > var12) {
            field3144[var18++] = var13.method51((byte) -16, var12, var13.method33(81)).method39((byte) 127);
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field3165 + arg2;
        } else if (arg8 == 1) {
            var21 = (arg4 - this.field3165 - this.field3163 - (var18 - 1) * arg9) / 2 + this.field3165 + arg2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field3163 - (var18 - 1) * arg9;
        } else {
            int var22 = (arg4 - this.field3165 - this.field3163 - (var18 - 1) * arg9) / (var18 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            var21 = this.field3165 + arg2 + var22;
            arg9 += var22;
        }
        for (int var23 = 0; var23 < var18; var23++) {
            if (arg7 == 0) {
                this.method1016(field3144[var23], arg1, var21, arg5, arg6);
            } else if (arg7 == 1) {
                this.method1000(field3144[var23], arg3 / 2 + arg1, var21, arg5, arg6);
            } else if (arg7 == 2) {
                this.method1009(field3144[var23], arg1 + arg3, var21, arg5, arg6);
            } else if (var18 - 1 == var23) {
                this.method1016(field3144[var23], arg1, var21, arg5, arg6);
            } else {
                this.method1015(field3144[var23], arg1, var21, arg5, arg6, arg3);
            }
            var21 += arg9;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lad;)I", line = 254)
    public final int method1006(class5 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field183; var3++) {
            if (arg0.field164[var3] == 64 && var3 + 4 < arg0.field183 && arg0.field164[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field3162[arg0.field164[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lad;)I", line = 277)
    public final int method1007(class5 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field183; var3++) {
            var2 += this.field3162[arg0.field164[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([BIIIII)V", line = 293)
    private final void method1008(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class55.field1381 * arg2 + arg1;
        int var8 = class55.field1381 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class55.field1375) {
            int var11 = class55.field1375 - arg2;
            arg4 -= var11;
            arg2 = class55.field1375;
            var10 += arg3 * var11;
            var7 += class55.field1381 * var11;
        }
        if (arg2 + arg4 > class55.field1378) {
            arg4 -= arg2 + arg4 - class55.field1378;
        }
        if (arg1 < class55.field1377) {
            int var12 = class55.field1377 - arg1;
            arg3 -= var12;
            arg1 = class55.field1377;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class55.field1379) {
            int var13 = arg1 + arg3 - class55.field1379;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method1018(class55.field1380, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lad;IIIZ)V", line = 340)
    public final void method1009(class5 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method1016(arg0, arg1 - this.method1006(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Lad;)I", line = 343)
    private final int method1010(class5 arg0) {
        if (arg0.method66((byte) -90, field3149)) {
            return 16711680;
        } else if (arg0.method66((byte) -108, field3153)) {
            return 65280;
        } else if (arg0.method66((byte) -121, field3152)) {
            return 255;
        } else if (arg0.method66((byte) -128, field3139)) {
            return 16776960;
        } else if (arg0.method66((byte) -97, field3140)) {
            return 65535;
        } else if (arg0.method66((byte) -108, field3157)) {
            return 16711935;
        } else if (arg0.method66((byte) -125, field3154)) {
            return 16777215;
        } else if (arg0.method66((byte) -80, field3147)) {
            return 0;
        } else if (arg0.method66((byte) -110, field3159)) {
            return 16748608;
        } else if (arg0.method66((byte) -113, field3161)) {
            return 8388608;
        } else if (arg0.method66((byte) -86, field3142)) {
            return 128;
        } else if (arg0.method66((byte) -82, field3138)) {
            return 16756736;
        } else if (arg0.method66((byte) -83, field3155)) {
            return 16740352;
        } else if (arg0.method66((byte) -81, field3145)) {
            return 16723968;
        } else if (arg0.method66((byte) -91, field3160)) {
            return 12648192;
        } else if (arg0.method66((byte) -85, field3141)) {
            return 8453888;
        } else if (arg0.method66((byte) -118, field3151)) {
            return 4259584;
        } else {
            if (arg0.method66((byte) -104, field3146)) {
                this.field3164 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()V", line = 401)
    public static void method1011() {
        field3149 = null;
        field3153 = null;
        field3152 = null;
        field3139 = null;
        field3140 = null;
        field3157 = null;
        field3154 = null;
        field3147 = null;
        field3159 = null;
        field3161 = null;
        field3142 = null;
        field3138 = null;
        field3155 = null;
        field3145 = null;
        field3160 = null;
        field3141 = null;
        field3151 = null;
        field3146 = null;
        field3144 = null;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)I", line = 428)
    public final int method1012(int arg0) {
        return this.field3162[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lad;IIIII)V", line = 437)
    public final void method1013(class5 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method1007(arg0) / 2;
        int var10 = arg2 - this.field3156;
        for (int var11 = 0; var11 < arg0.method33(122); var11++) {
            int var12 = arg0.field164[var11] & 0xFF;
            if (var12 != 32) {
                this.method1008(this.field3158[var12], var9, this.field3148[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field3162[var12], this.field3150[var12], arg3);
            }
            var9 += this.field3162[var12];
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lad;III)V", line = 478)
    public final void method1014(class5 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field3156;
        for (int var6 = 0; var6 < arg0.field183; var6++) {
            int var7 = arg0.field164[var6] & 0xFF;
            if (var7 != 32) {
                this.method1008(this.field3158[var7], arg1, this.field3148[var7] + var5, this.field3162[var7], this.field3150[var7], arg3);
            }
            arg1 += this.field3162[var7];
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 809)
    public class130(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field3148 = arg0;
        this.field3162 = arg1;
        this.field3150 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field3158 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3148[var10] < var8) {
                var8 = this.field3148[var10];
            }
            if (this.field3150[var10] + this.field3148[var10] > var9) {
                var9 = this.field3150[var10] + this.field3148[var10];
            }
            byte[] var11 = this.field3158[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field3156 = this.field3150[32] + this.field3148[32];
        this.field3165 = this.field3156 - var8;
        this.field3163 = var9 - this.field3156;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lad;IIIZI)V", line = 501)
    private final void method1015(class5 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class5 var7 = arg0.method39((byte) 127);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method33(63); var9++) {
            if (var7.method55(var9, 255) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method1006(var7)) * 256 / var8;
        }
        this.field3164 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field3156;
        for (int var14 = 0; var14 < var7.field183; var14++) {
            if (var7.field164[var14] == 64 && var14 + 4 < var7.field183 && var7.field164[var14 + 4] == 64) {
                int var15 = this.method1010(var7.method51((byte) -90, var14 + 1, var14 + 4));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field164[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        this.method1008(this.field3158[var16], arg1 + 1, this.field3148[var16] + var13 + 1, this.field3162[var16], this.field3150[var16], 0);
                    }
                    this.method1008(this.field3158[var16], arg1, this.field3148[var16] + var13, this.field3162[var16], this.field3150[var16], arg3);
                }
                arg1 += this.field3162[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (this.field3164) {
            class55.method444(var12, (int) ((double) this.field3156 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Lad;IIIZ)V", line = 573)
    public final void method1016(class5 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3164 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field3156;
        for (int var8 = 0; var8 < arg0.field183; var8++) {
            if (arg0.field164[var8] == 64 && var8 + 4 < arg0.field183 && arg0.field164[var8 + 4] == 64) {
                int var9 = this.method1010(arg0.method51((byte) -11, var8 + 1, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field164[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method1008(this.field3158[var10], arg1 + 1, this.field3148[var10] + var7 + 1, this.field3162[var10], this.field3150[var10], 0);
                    }
                    this.method1008(this.field3158[var10], arg1, this.field3148[var10] + var7, this.field3162[var10], this.field3150[var10], arg3);
                }
                arg1 += this.field3162[var10];
            }
        }
        if (this.field3164) {
            class55.method444(var6, (int) ((double) this.field3156 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Lad;III)V", line = 615)
    public final void method1017(class5 arg0, int arg1, int arg2, int arg3) {
        this.method1014(arg0, arg1 - this.method1007(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([I[BIIIIIII)V", line = 621)
    private final void method1018(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
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
            for (int var14 = var11; var14 < 0; var14++) {
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

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([I[BIIIIIIII)V", line = 685)
    private final void method1019(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var12 = 256 - arg9;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var15 = arg0[arg4];
                    arg0[arg4++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([BIIIIII)V", line = 721)
    private final void method1020(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class55.field1381 * arg2 + arg1;
        int var9 = class55.field1381 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class55.field1375) {
            int var12 = class55.field1375 - arg2;
            arg4 -= var12;
            arg2 = class55.field1375;
            var11 += arg3 * var12;
            var8 += class55.field1381 * var12;
        }
        if (arg2 + arg4 > class55.field1378) {
            arg4 -= arg2 + arg4 - class55.field1378;
        }
        if (arg1 < class55.field1377) {
            int var13 = class55.field1377 - arg1;
            arg3 -= var13;
            arg1 = class55.field1377;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class55.field1379) {
            int var14 = arg1 + arg3 - class55.field1379;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method1019(class55.field1380, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}
