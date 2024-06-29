import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class624 extends class504 {

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "Lan;")
    private class22 field8250;

    @OriginalMember(owner = "client!aga", name = "v", descriptor = "Lej;")
    private class111 field8263;

    @OriginalMember(owner = "client!aga", name = "F", descriptor = "Lpv;")
    private class65 field8272;

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "I")
    private int field8255;

    @OriginalMember(owner = "client!aga", name = "E", descriptor = "I")
    private int field8271;

    @OriginalMember(owner = "client!aga", name = "r", descriptor = "I")
    private int field8259;

    @OriginalMember(owner = "client!aga", name = "p", descriptor = "I")
    private int field8257;

    @OriginalMember(owner = "client!aga", name = "q", descriptor = "[[F")
    private float[][] field8258;

    @OriginalMember(owner = "client!aga", name = "u", descriptor = "[[F")
    private float[][] field8262;

    @OriginalMember(owner = "client!aga", name = "y", descriptor = "[[F")
    private float[][] field8266;

    @OriginalMember(owner = "client!aga", name = "G", descriptor = "I")
    private int field8273;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "Leu;")
    private class448 field8251;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "Lft;")
    private class4 field8252;

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "Ljw;")
    private class520 field8254;

    @OriginalMember(owner = "client!aga", name = "s", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8260;

    @OriginalMember(owner = "client!aga", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8264;

    @OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
    private int field8268;

    @OriginalMember(owner = "client!aga", name = "x", descriptor = "Z")
    public static boolean field8265 = false;

    @OriginalMember(owner = "client!aga", name = "D", descriptor = "Ldb;")
    public static class298 field8270 = new class298(9, 8);

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!aga", name = "t", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!aga", name = "B", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIIII)V", line = 12)
    private final void method3406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8256++;
        long var8 = -1L;
        int var10 = (arg0 << this.field8250.field2245) + arg4;
        int var11 = (arg3 << this.field8250.field2245) + arg6;
        int var12 = this.field8250.method200(var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class504 var13 = this.field8254.method2918(var8, (byte) -126);
            if (var13 != null) {
                this.method3409(((class286) var13).field4030, arg2 - 111);
                return;
            }
        }
        short var14 = (short) (this.field8268++);
        if (var8 != -1L) {
            this.field8254.method2911(var8, new class286(var14), (byte) -28);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg6 == 0) {
            var15 = this.field8262[arg1][arg5];
            var16 = this.field8266[arg1][arg5];
            var17 = this.field8258[arg1][arg5];
        } else if (this.field8250.field2250 == arg4 && arg6 == 0) {
            var16 = this.field8266[arg1 + 1][arg5];
            var17 = this.field8258[arg1 + 1][arg5];
            var15 = this.field8262[arg1 + 1][arg5];
        } else if (this.field8250.field2250 == arg4 && this.field8250.field2250 == arg6) {
            var16 = this.field8266[arg1 + 1][arg5 + 1];
            var15 = this.field8262[arg1 + 1][arg5 + 1];
            var17 = this.field8258[arg1 + 1][arg5 + 1];
        } else if (arg4 == 0 && this.field8250.field2250 == arg6) {
            var15 = this.field8262[arg1][arg5 + 1];
            var17 = this.field8258[arg1][arg5 + 1];
            var16 = this.field8266[arg1][arg5 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field8250.field2250;
            float var19 = (float) arg6 / (float) this.field8250.field2250;
            float var20 = this.field8266[arg1][arg5];
            float var21 = this.field8262[arg1][arg5];
            float var22 = this.field8258[arg1][arg5];
            float var23 = this.field8266[arg1 + 1][arg5];
            float var24 = this.field8262[arg1 + 1][arg5];
            float var25 = (this.field8258[arg1][arg5 + 1] - var22) * var18 + var22;
            float var26 = this.field8258[arg1 + 1][arg5];
            float var27 = (this.field8266[arg1 + 1][arg5 + 1] - var23) * var18 + var23;
            float var28 = (this.field8262[arg1 + 1][arg5 + 1] - var24) * var18 + var24;
            float var29 = (this.field8262[arg1][arg5 + 1] - var21) * var18 + var21;
            float var30 = (this.field8266[arg1][arg5 + 1] - var20) * var18 + var20;
            var16 = (var27 - var30) * var19 + var30;
            float var31 = (this.field8258[arg1 + 1][arg5 + 1] - var26) * var18 + var26;
            var15 = (var28 - var29) * var19 + var29;
            var17 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field8272.method515((byte) 121) - var10);
        float var33 = (float) (this.field8272.method516(-18736) - var12);
        float var34 = (float) (this.field8272.method518((byte) 43) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field8272.method522(arg2 ^ 0xFFFFFFC5);
        float var41 = (float) arg2 - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var38 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8272.method514(86);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3473()) {
            this.field8260.method3480((float) var10);
            this.field8260.method3480((float) var12);
            this.field8260.method3480((float) var11);
        } else {
            this.field8260.method3477((float) var10);
            this.field8260.method3477((float) var12);
            this.field8260.method3477((float) var11);
        }
        if (this.field8263.field1835 == 0) {
            this.field8260.method3482(var47);
            this.field8260.method3482(var46);
            this.field8260.method3482(var45);
        } else {
            this.field8260.method3482(var45);
            this.field8260.method3482(var46);
            this.field8260.method3482(var47);
        }
        this.field8260.method3482(255);
        this.method3409(var14, arg2 - 68);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lbi;I)V", line = 188)
    public static final void method3407(class449 arg0, int arg1) {
        class235.field3313 = arg0;
        if (arg1 != -30121) {
            method3407(null, 103);
        }
        field8267++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V", line = 214)
    public static void method3408(int arg0) {
        field8270 = null;
        if (arg0 < 83) {
            method3407(null, -17);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(SI)V", line = 224)
    private final void method3409(short arg0, int arg1) {
        if (Stream.method3473()) {
            this.field8264.method3474(arg0);
        } else {
            this.field8264.method3478(arg0);
        }
        if (arg1 >= -12) {
            method3408(61);
        }
        field8269++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II[[ZIB)V", line = 241)
    public final void method3410(int arg0, int arg1, boolean[][] arg2, int arg3, byte arg4) {
        field8261++;
        if (this.field8252 == null || arg1 + arg3 < this.field8255 || this.field8271 < arg3 - arg1 || (arg0 + arg1) < this.field8259) {
            return;
        }
        int var6 = -61 % ((-arg4 - 24) / 44);
        if (arg0 - arg1 > this.field8257) {
            return;
        }
        for (int var7 = this.field8259; var7 <= this.field8257; var7++) {
            for (int var8 = this.field8255; var8 <= this.field8271; var8++) {
                int var9 = var8 - arg3;
                int var10 = var7 - arg0;
                if ((-arg1) < var9 && arg1 > var9 && -arg1 < var10 && var10 < arg1 && arg2[arg1 + var9][arg1 + var10]) {
                    this.field8263.method856((byte) 100, (byte) ((int) (this.field8272.method519(true) * 255.0F)));
                    this.field8263.method48((byte) -32, this.field8251, 0);
                    this.field8263.method62(false, this.field8263.field1931);
                    this.field8263.method53(0, 0, class620.field8229, this.field8252, 0, this.field8268, this.field8273 / 3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lej;Lan;Lpv;[I)V", line = 299)
    public class624(class111 arg0, class22 arg1, class65 arg2, int[] arg3) {
        this.field8250 = arg1;
        this.field8263 = arg0;
        this.field8272 = arg2;
        int var5 = this.field8272.method522(-91) - (arg1.field2250 >> 1);
        this.field8255 = this.field8272.method515((byte) 119) - var5 >> arg1.field2245;
        this.field8271 = this.field8272.method515((byte) 113) + var5 >> arg1.field2245;
        this.field8259 = this.field8272.method518((byte) -126) - var5 >> arg1.field2245;
        this.field8257 = this.field8272.method518((byte) -128) + var5 >> arg1.field2245;
        int var6 = this.field8271 + 1 - this.field8255;
        int var7 = this.field8257 - (this.field8259 - 1);
        this.field8258 = new float[var6 + 1][var7 + 1];
        this.field8262 = new float[var6 + 1][var7 + 1];
        this.field8266 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field8259 + var8;
            if (var27 > 0 && this.field8250.field2248 - 1 > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = var28 + this.field8255;
                    if (var29 > 0 && var29 < (this.field8250.field2247 - 1)) {
                        int var30 = arg1.method195(var29 + 1, var27) - arg1.method195(var29 - 1, var27);
                        int var31 = arg1.method195(var29, var27 + 1) - arg1.method195(var29, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field8266[var28][var8] = (float) var30 * var32;
                        this.field8262[var28][var8] = var32 * -256.0F;
                        this.field8258[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8259; var10 <= this.field8257; var10++) {
            if (var10 >= 0 && var10 < arg1.field2248) {
                for (int var23 = this.field8255; var23 <= this.field8271; var23++) {
                    if (var23 >= 0 && arg1.field2247 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field335[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field8273 += 3;
                                    }
                                }
                            } else {
                                this.field8273 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8271 - this.field8255;
            }
        }
        if (this.field8273 <= 0) {
            this.field8251 = null;
            this.field8252 = null;
        } else {
            this.field8254 = new class520(class587.method3231(true, this.field8273));
            this.field8252 = this.field8263.method105(false, 10);
            this.field8252.method26(-24955, this.field8273);
            NativeHeapBuffer var11 = this.field8263.method847(true, this.field8273 * 16, false);
            this.field8260 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field8252.method27((byte) -64, true);
                } while (var12 == null);
                this.field8264 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field8259; var15 <= this.field8257; var15++) {
                    if (var15 >= 0 && arg1.field2248 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field8255; var17 <= this.field8271; var17++) {
                            if (var17 >= 0 && var17 < arg1.field2247) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field335[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field353[var17][var15];
                                        int[] var21 = arg1.field336[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3406(var17, var16, 1, var15, var20[var22], var14, var21[var22]);
                                                    var22++;
                                                    this.method3406(var17, var16, 1, var15, var20[var22], var14, var21[var22]);
                                                    var22++;
                                                    this.method3406(var17, var16, 1, var15, var20[var22], var14, var21[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3406(var17, var16, 1, var15, 0, var14, 0);
                                        this.method3406(var17, var16, 1, var15, arg1.field2250, var14, 0);
                                        this.method3406(var17, var16, 1, var15, 0, var14, arg1.field2250);
                                    } else if (var18 == 2) {
                                        this.method3406(var17, var16, 1, var15, arg1.field2250, var14, 0);
                                        this.method3406(var17, var16, 1, var15, arg1.field2250, var14, arg1.field2250);
                                        this.method3406(var17, var16, 1, var15, 0, var14, 0);
                                    } else if (var18 == 5) {
                                        this.method3406(var17, var16, 1, var15, arg1.field2250, var14, arg1.field2250);
                                        this.method3406(var17, var16, 1, var15, 0, var14, arg1.field2250);
                                        this.method3406(var17, var16, 1, var15, arg1.field2250, var14, 0);
                                    } else if (var18 == 4) {
                                        this.method3406(var17, var16, 1, var15, 0, var14, arg1.field2250);
                                        this.method3406(var17, var16, 1, var15, 0, var14, 0);
                                        this.method3406(var17, var16, 1, var15, arg1.field2250, var14, arg1.field2250);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field8271 - this.field8255;
                    }
                    var14++;
                }
                this.field8264.method3479();
                if (this.field8252.method28(11390)) {
                    this.field8260.method3479();
                    this.field8251 = this.field8263.method108(false, 15918);
                    this.field8251.method2521((byte) -61, 16, this.field8268 * 16, var11);
                    break;
                }
                this.field8260.method3475(0);
                this.field8254.method2916((byte) 98);
            }
        }
        this.field8264 = null;
        this.field8266 = this.field8262 = this.field8258 = null;
        this.field8254 = null;
        this.field8260 = null;
    }
}
