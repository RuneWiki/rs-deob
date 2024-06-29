import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class43 extends class401 {

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Ltw;")
    private class186 field504;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "Lnv;")
    private class382 field520;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lida;")
    private class214 field498;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "[[F")
    private float[][] field516;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "[[F")
    private float[][] field524;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "[[F")
    private float[][] field501;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Ljea;")
    private class415 field499;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Lvc;")
    private class288 field511;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "Lfaa;")
    private class139 field525;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Ljaclib/memory/Stream;")
    private Stream field527;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "Ljaclib/memory/Stream;")
    private Stream field513;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field515 = 0;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field500 = 0;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
    public static int[] field510 = new int[4];

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Z")
    public static boolean field509 = false;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Lkr;")
    public static class693 field508 = new class693();

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Lrc;")
    public static class499 field518;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "[Lsr;")
    public static class228[] field526;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "[S")
    public static short[] field517;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lvv;)V")
    public static final void method367(class295 arg0) {
        class401.field5619.method154(arg0.field4042, arg0.field4052 + (arg0.method217(31) >> 1), arg0.field4047, class683.field9757);
        arg0.field4039 = class683.field9757[0];
        arg0.field4055 = class683.field9757[1];
        arg0.field4038 = class683.field9757[2];
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIILsea;)Lvn;")
    public static final class283 method368(int arg0, int arg1, int arg2, class648 arg3) {
        field519++;
        byte[] var4 = arg3.method3654(-15615, arg2, arg0);
        if (var4 == null) {
            return null;
        } else if (arg1 >= -20) {
            return null;
        } else {
            return new class283(var4);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZI)V")
    public final void method369(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field514++;
        if (this.field499 == null || this.field521 > (arg0 + arg2) || arg0 - arg2 > this.field523 || (arg1 + arg2) < this.field506 || this.field503 < (arg1 - arg2)) {
            return;
        }
        int var6 = this.field506;
        if (arg4 > -5) {
            return;
        }
        while (var6 <= this.field503) {
            for (int var7 = this.field521; var7 <= this.field523; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg1;
                if (var8 > -arg2 && var8 < arg2 && var9 > (-arg2) && arg2 > var9 && arg3[arg2 + var8][arg2 + var9]) {
                    this.field520.method2196((byte) 117, (byte) ((int) (this.field504.method1285(-1120) * 255.0F)));
                    this.field520.method1021(this.field511, (byte) 115, 0);
                    this.field520.method1050(0, this.field520.field5388);
                    this.field520.method1065(class345.field4628, this.field505, 0, this.field512 / 3, 0, this.field499, (byte) -104);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
    public static void method370(boolean arg0) {
        field508 = null;
        if (!arg0) {
            field515 = -84;
        }
        field518 = null;
        field526 = null;
        field510 = null;
        field517 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(SI)V")
    private final void method371(short arg0, int arg1) {
        if (arg1 != 0) {
            field517 = null;
        }
        if (Stream.method3484()) {
            this.field513.method3476(arg0);
        } else {
            this.field513.method3479(arg0);
        }
        field502++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILtba;[BB)Lwda;")
    public static final class592 method372(int arg0, class147 arg1, byte[] arg2, byte arg3) {
        field507++;
        if (arg2 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramRawARB(arg0, 34933, arg2);
        int var5 = 125 % ((arg3 + 27) / 49);
        OpenGL.glGetIntegerv(34379, class12.field119, 0);
        if (class12.field119[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class592(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
    private final void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field522++;
        long var8 = -1L;
        if (arg2 != -28925) {
            this.field512 = -97;
        }
        int var10 = arg3 + (arg5 << this.field498.field447);
        int var11 = (arg4 << this.field498.field447) + arg1;
        int var12 = this.field498.method331(var11, (byte) 50, var10);
        if ((arg3 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class401 var13 = this.field525.method970((byte) 89, var8);
            if (var13 != null) {
                this.method371(((class1) var13).field1, arg2 + 28925);
                return;
            }
        }
        short var14 = (short) (this.field505++);
        if (var8 != -1L) {
            this.field525.method968(var8, new class1(var14), -1);
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg1 == 0) {
            var15 = this.field524[arg6][arg0];
            var16 = this.field501[arg6][arg0];
            var17 = this.field516[arg6][arg0];
        } else if (this.field498.field441 == arg3 && arg1 == 0) {
            var16 = this.field501[arg6 + 1][arg0];
            var15 = this.field524[arg6 + 1][arg0];
            var17 = this.field516[arg6 + 1][arg0];
        } else if (this.field498.field441 == arg3 && this.field498.field441 == arg1) {
            var17 = this.field516[arg6 + 1][arg0 + 1];
            var16 = this.field501[arg6 + 1][arg0 + 1];
            var15 = this.field524[arg6 + 1][arg0 + 1];
        } else if (arg3 == 0 && this.field498.field441 == arg1) {
            var17 = this.field516[arg6][arg0 + 1];
            var16 = this.field501[arg6][arg0 + 1];
            var15 = this.field524[arg6][arg0 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field498.field441;
            float var19 = (float) arg1 / (float) this.field498.field441;
            float var20 = this.field524[arg6][arg0];
            float var21 = this.field516[arg6][arg0];
            float var22 = this.field501[arg6][arg0];
            float var23 = this.field524[arg6 + 1][arg0];
            float var24 = this.field516[arg6 + 1][arg0];
            float var25 = (this.field524[arg6][arg0 + 1] - var20) * var18 + var20;
            float var26 = this.field501[arg6 + 1][arg0];
            float var27 = (this.field516[arg6 + 1][arg0 + 1] - var24) * var18 + var24;
            float var28 = (this.field501[arg6][arg0 + 1] - var22) * var18 + var22;
            float var29 = (this.field524[arg6 + 1][arg0 + 1] - var23) * var18 + var23;
            float var30 = (this.field516[arg6][arg0 + 1] - var21) * var18 + var21;
            var15 = (var29 - var25) * var19 + var25;
            var17 = (var27 - var30) * var19 + var30;
            float var31 = (this.field501[arg6 + 1][arg0 + 1] - var26) * var18 + var26;
            var16 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field504.method1280(true) - var10);
        float var33 = (float) (this.field504.method1282((byte) 102) - var12);
        float var34 = (float) (this.field504.method1279(arg2 + 28925) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field504.method1281(70);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var38 + var15 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field504.method1283(0);
        int var45 = (int) ((float) ((var44 & 0xFF131D) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF64) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3484()) {
            this.field527.method3486((float) var10);
            this.field527.method3486((float) var12);
            this.field527.method3486((float) var11);
        } else {
            this.field527.method3478((float) var10);
            this.field527.method3478((float) var12);
            this.field527.method3478((float) var11);
        }
        if (this.field520.field5313 == 0) {
            this.field527.method3481(var47);
            this.field527.method3481(var46);
            this.field527.method3481(var45);
        } else {
            this.field527.method3481(var45);
            this.field527.method3481(var46);
            this.field527.method3481(var47);
        }
        this.field527.method3481(255);
        this.method371(var14, 0);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lnv;Lida;Ltw;[I)V")
    public class43(class382 arg0, class214 arg1, class186 arg2, int[] arg3) {
        this.field504 = arg2;
        this.field520 = arg0;
        this.field498 = arg1;
        int var5 = this.field504.method1281(48) - (arg1.field441 >> 1);
        this.field521 = this.field504.method1280(true) - var5 >> arg1.field447;
        this.field523 = var5 + this.field504.method1280(true) >> arg1.field447;
        this.field506 = this.field504.method1279(0) - var5 >> arg1.field447;
        this.field503 = var5 + this.field504.method1279(0) >> arg1.field447;
        int var6 = this.field523 + 1 - this.field521;
        int var7 = this.field503 + 1 - this.field506;
        this.field516 = new float[var6 + 1][var7 + 1];
        this.field524 = new float[var6 + 1][var7 + 1];
        this.field501 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field506 + var8;
            if (var27 > 0 && var27 < this.field498.field438 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field521 + var28;
                    if (var29 > 0 && var29 < (this.field498.field446 - 1)) {
                        int var30 = arg1.method332(var27, 1, var29 + 1) - arg1.method332(var27, 1, var29 - 1);
                        int var31 = arg1.method332(var27 + 1, 1, var29) - arg1.method332(var27 - 1, 1, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field524[var28][var8] = (float) var30 * var32;
                        this.field516[var28][var8] = var32 * -256.0F;
                        this.field501[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field506; var10 <= this.field503; var10++) {
            if (var10 >= 0 && var10 < arg1.field438) {
                for (int var23 = this.field521; var23 <= this.field523; var23++) {
                    if (var23 >= 0 && arg1.field446 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field3021[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field512 += 3;
                                    }
                                }
                            } else {
                                this.field512 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field523 - this.field521;
            }
        }
        if (this.field512 <= 0) {
            this.field499 = null;
            this.field511 = null;
        } else {
            this.field525 = new class139(class206.method1334(-1, this.field512));
            this.field499 = this.field520.method1062(false, 18554);
            this.field499.method1116(this.field512, -123);
            NativeHeapBuffer var11 = this.field520.method2215(false, this.field512 * 16, 0);
            this.field527 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field499.method1119(94, true);
                } while (var12 == null);
                this.field513 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field506; var15 <= this.field503; var15++) {
                    if (var15 >= 0 && arg1.field438 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field521; var17 <= this.field523; var17++) {
                            if (var17 >= 0 && var17 < arg1.field446) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field3021[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field3013[var17][var15];
                                        int[] var21 = arg1.field2992[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method373(var14, var21[var22], -28925, var20[var22], var15, var17, var16);
                                                    var22++;
                                                    this.method373(var14, var21[var22], -28925, var20[var22], var15, var17, var16);
                                                    var22++;
                                                    this.method373(var14, var21[var22], -28925, var20[var22], var15, var17, var16);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method373(var14, 0, -28925, 0, var15, var17, var16);
                                        this.method373(var14, 0, -28925, arg1.field441, var15, var17, var16);
                                        this.method373(var14, arg1.field441, -28925, 0, var15, var17, var16);
                                    } else if (var18 == 2) {
                                        this.method373(var14, 0, -28925, arg1.field441, var15, var17, var16);
                                        this.method373(var14, arg1.field441, -28925, arg1.field441, var15, var17, var16);
                                        this.method373(var14, 0, -28925, 0, var15, var17, var16);
                                    } else if (var18 == 5) {
                                        this.method373(var14, arg1.field441, -28925, arg1.field441, var15, var17, var16);
                                        this.method373(var14, arg1.field441, -28925, 0, var15, var17, var16);
                                        this.method373(var14, 0, -28925, arg1.field441, var15, var17, var16);
                                    } else if (var18 == 4) {
                                        this.method373(var14, arg1.field441, -28925, 0, var15, var17, var16);
                                        this.method373(var14, 0, -28925, 0, var15, var17, var16);
                                        this.method373(var14, arg1.field441, -28925, arg1.field441, var15, var17, var16);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field523 - this.field521;
                    }
                    var14++;
                }
                this.field513.method3477();
                if (this.field499.method1121(false)) {
                    this.field527.method3477();
                    this.field511 = this.field520.method1038(false, -50);
                    this.field511.method1770(var11, 16, this.field505 * 16, -15029);
                    break;
                }
                this.field527.method3480(0);
                this.field525.method974(-20470);
            }
        }
        this.field527 = null;
        this.field525 = null;
        this.field513 = null;
        this.field524 = this.field516 = this.field501 = null;
    }
}
