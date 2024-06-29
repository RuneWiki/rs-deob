import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class571 extends class270 {

    @OriginalMember(owner = "client!go", name = "m", descriptor = "Low;")
    private class314 field8089;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "Lod;")
    private class463 field8090;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "Lfo;")
    private class473 field8111;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "I")
    private int field8103;

    @OriginalMember(owner = "client!go", name = "E", descriptor = "I")
    private int field8107;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    private int field8092;

    @OriginalMember(owner = "client!go", name = "w", descriptor = "I")
    private int field8099;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "[[F")
    private float[][] field8091;

    @OriginalMember(owner = "client!go", name = "C", descriptor = "[[F")
    private float[][] field8105;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "[[F")
    private float[][] field8109;

    @OriginalMember(owner = "client!go", name = "x", descriptor = "I")
    private int field8100;

    @OriginalMember(owner = "client!go", name = "B", descriptor = "Ltj;")
    private class180 field8104;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "Ltfa;")
    private class31 field8093;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "Ltq;")
    private class572 field8108;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8095;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8112;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "I")
    private int field8102;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field8106 = new String[5];

    @OriginalMember(owner = "client!go", name = "y", descriptor = "Z")
    public static boolean field8101 = false;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "Lfv;")
    public static class108 field8094 = new class108(1, 2, 2, 0);

    @OriginalMember(owner = "client!go", name = "t", descriptor = "F")
    public static float field8096;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!go", name = "v", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 3)
    public static void method3222(int arg0) {
        field8106 = null;
        if (arg0 == 0) {
            field8094 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BS)V", line = 19)
    private final void method3223(byte arg0, short arg1) {
        field8113++;
        if (Stream.method3440()) {
            this.field8112.method3435(arg1);
        } else {
            this.field8112.method3439(arg1);
        }
        if (arg0 < 33) {
            this.method3223((byte) -69, (short) 21);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIZI[[Z)V", line = 41)
    public final void method3224(int arg0, int arg1, boolean arg2, int arg3, boolean[][] arg4) {
        if (!arg2) {
            return;
        }
        field8097++;
        if (this.field8104 == null || this.field8103 > arg0 + arg3 || arg0 - arg3 > this.field8107 || arg1 + arg3 < this.field8092 || this.field8099 < arg1 - arg3) {
            return;
        }
        for (int var6 = this.field8092; var6 <= this.field8099; var6++) {
            for (int var7 = this.field8103; var7 <= this.field8107; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg1;
                if (var8 > (-arg3) && var8 < arg3 && -arg3 < var9 && arg3 > var9 && arg4[arg3 + var8][var9 + arg3]) {
                    this.field8111.method2742((byte) ((int) (this.field8090.method2635(108) * 255.0F)), -9391);
                    this.field8111.method1198(0, (byte) 114, this.field8093);
                    this.field8111.method1174(0, this.field8111.field6898);
                    this.field8111.method1154(0, 0, (byte) 123, class565.field8009, this.field8104, this.field8100 / 3, this.field8102);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)V", line = 103)
    public static final void method3225(int arg0, boolean arg1) {
        if (!arg1) {
            field8094 = null;
        }
        class580.field8249 = -1;
        field8098++;
        class306.field3998 = arg0;
        class472.field6590 = -1;
        class99.method613((byte) 96);
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lfo;Low;Lod;[I)V", line = 128)
    public class571(class473 arg0, class314 arg1, class463 arg2, int[] arg3) {
        this.field8089 = arg1;
        this.field8090 = arg2;
        this.field8111 = arg0;
        int var5 = this.field8090.method2637(79) - (arg1.field1561 >> 1);
        this.field8103 = this.field8090.method2640(-2049) - var5 >> arg1.field1560;
        this.field8107 = this.field8090.method2640(-2049) + var5 >> arg1.field1560;
        this.field8092 = this.field8090.method2641((byte) -14) - var5 >> arg1.field1560;
        this.field8099 = var5 + this.field8090.method2641((byte) -14) >> arg1.field1560;
        int var6 = this.field8107 + 1 - this.field8103;
        int var7 = this.field8099 + 1 - this.field8092;
        this.field8091 = new float[var6 + 1][var7 + 1];
        this.field8105 = new float[var6 + 1][var7 + 1];
        this.field8109 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = var8 + this.field8092;
            if (var27 > 0 && var27 < this.field8089.field1562 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field8103 + var28;
                    if (var29 > 0 && var29 < (this.field8089.field1558 - 1)) {
                        int var30 = arg1.method253(var29 + 1, var27) - arg1.method253(var29 - 1, var27);
                        int var31 = arg1.method253(var29, var27 + 1) - arg1.method253(var29, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field8105[var28][var8] = (float) var30 * var32;
                        this.field8091[var28][var8] = var32 * -256.0F;
                        this.field8109[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8092; var10 <= this.field8099; var10++) {
            if (var10 >= 0 && arg1.field1562 > var10) {
                for (int var23 = this.field8103; var23 <= this.field8107; var23++) {
                    if (var23 >= 0 && var23 < arg1.field1558) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field4046[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field8100 += 3;
                                    }
                                }
                            } else {
                                this.field8100 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8107 - this.field8103;
            }
        }
        if (this.field8100 <= 0) {
            this.field8104 = null;
            this.field8093 = null;
        } else {
            this.field8108 = new class572(class146.method799(this.field8100, -128));
            this.field8104 = this.field8111.method1181((byte) 79, false);
            this.field8104.method1024(103, this.field8100);
            NativeHeapBuffer var11 = this.field8111.method2684((byte) -77, this.field8100 * 16, false);
            this.field8095 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field8104.method167(18829, true);
                } while (var12 == null);
                this.field8112 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field8092; var15 <= this.field8099; var15++) {
                    if (var15 >= 0 && var15 < arg1.field1562) {
                        int var16 = 0;
                        for (int var17 = this.field8103; var17 <= this.field8107; var17++) {
                            if (var17 >= 0 && var17 < arg1.field1558) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field4046[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field4058[var17][var15];
                                        int[] var21 = arg1.field4040[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3226(var16, var21[var22], 13360, var14, var17, var20[var22], var15);
                                                    var22++;
                                                    this.method3226(var16, var21[var22], 13360, var14, var17, var20[var22], var15);
                                                    var22++;
                                                    this.method3226(var16, var21[var22], 13360, var14, var17, var20[var22], var15);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3226(var16, 0, 13360, var14, var17, 0, var15);
                                        this.method3226(var16, 0, 13360, var14, var17, arg1.field1561, var15);
                                        this.method3226(var16, arg1.field1561, 13360, var14, var17, 0, var15);
                                    } else if (var18 == 2) {
                                        this.method3226(var16, 0, 13360, var14, var17, arg1.field1561, var15);
                                        this.method3226(var16, arg1.field1561, 13360, var14, var17, arg1.field1561, var15);
                                        this.method3226(var16, 0, 13360, var14, var17, 0, var15);
                                    } else if (var18 == 5) {
                                        this.method3226(var16, arg1.field1561, 13360, var14, var17, arg1.field1561, var15);
                                        this.method3226(var16, arg1.field1561, 13360, var14, var17, 0, var15);
                                        this.method3226(var16, 0, 13360, var14, var17, arg1.field1561, var15);
                                    } else if (var18 == 4) {
                                        this.method3226(var16, arg1.field1561, 13360, var14, var17, 0, var15);
                                        this.method3226(var16, 0, 13360, var14, var17, 0, var15);
                                        this.method3226(var16, arg1.field1561, 13360, var14, var17, arg1.field1561, var15);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field8107 - this.field8103;
                    }
                    var14++;
                }
                this.field8112.method3434();
                if (this.field8104.method170(9406)) {
                    this.field8095.method3434();
                    this.field8093 = this.field8111.method1203(false, false);
                    this.field8093.method168(var11, 16, (byte) -127, this.field8102 * 16);
                    break;
                }
                this.field8095.method3432(0);
                this.field8108.method3227((byte) 119);
            }
        }
        this.field8105 = this.field8091 = this.field8109 = null;
        this.field8095 = null;
        this.field8112 = null;
        this.field8108 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIII)V", line = 391)
    private final void method3226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8110++;
        long var8 = -1L;
        int var10 = (arg4 << this.field8089.field1560) + arg5;
        int var11 = (arg6 << this.field8089.field1560) + arg1;
        int var12 = this.field8089.method242(var10, var11);
        if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class270 var13 = this.field8108.method3234((byte) -61, var8);
            if (var13 != null) {
                this.method3223((byte) 40, ((class498) var13).field7187);
                return;
            }
        }
        short var14 = (short) (this.field8102++);
        if (var8 != -1L) {
            this.field8108.method3235(var8, -1, new class498(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg1 == 0) {
            var15 = this.field8105[arg0][arg3];
            var16 = this.field8109[arg0][arg3];
            var17 = this.field8091[arg0][arg3];
        } else if (this.field8089.field1561 == arg5 && arg1 == 0) {
            var16 = this.field8109[arg0 + 1][arg3];
            var17 = this.field8091[arg0 + 1][arg3];
            var15 = this.field8105[arg0 + 1][arg3];
        } else if (this.field8089.field1561 == arg5 && this.field8089.field1561 == arg1) {
            var15 = this.field8105[arg0 + 1][arg3 + 1];
            var17 = this.field8091[arg0 + 1][arg3 + 1];
            var16 = this.field8109[arg0 + 1][arg3 + 1];
        } else if (arg5 == 0 && this.field8089.field1561 == arg1) {
            var16 = this.field8109[arg0][arg3 + 1];
            var15 = this.field8105[arg0][arg3 + 1];
            var17 = this.field8091[arg0][arg3 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field8089.field1561;
            float var19 = (float) arg1 / (float) this.field8089.field1561;
            float var20 = this.field8105[arg0][arg3];
            float var21 = this.field8091[arg0][arg3];
            float var22 = this.field8109[arg0][arg3];
            float var23 = this.field8105[arg0 + 1][arg3];
            float var24 = this.field8091[arg0 + 1][arg3];
            float var25 = (this.field8109[arg0][arg3 + 1] - var22) * var18 + var22;
            float var26 = (this.field8105[arg0 + 1][arg3 + 1] - var23) * var18 + var23;
            float var27 = this.field8109[arg0 + 1][arg3];
            float var28 = (this.field8105[arg0][arg3 + 1] - var20) * var18 + var20;
            float var29 = (this.field8091[arg0][arg3 + 1] - var21) * var18 + var21;
            float var30 = (this.field8091[arg0 + 1][arg3 + 1] - var24) * var18 + var24;
            var17 = (var30 - var29) * var19 + var29;
            float var31 = (this.field8109[arg0 + 1][arg3 + 1] - var27) * var18 + var27;
            var15 = (var26 - var28) * var19 + var28;
            var16 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field8090.method2640(arg2 - 15409) - var10);
        float var33 = (float) (this.field8090.method2638((byte) -96) - var12);
        float var34 = (float) (this.field8090.method2641((byte) -14) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field8090.method2637(105);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var37 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8090.method2634(true);
        int var45 = (int) ((float) ((var44 & 0xFFAD3B) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF71) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3440()) {
            this.field8095.method3438((float) var10);
            this.field8095.method3438((float) var12);
            this.field8095.method3438((float) var11);
        } else {
            this.field8095.method3444((float) var10);
            this.field8095.method3444((float) var12);
            this.field8095.method3444((float) var11);
        }
        if (arg2 != 13360) {
            return;
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field8111.field6825 == 0) {
            this.field8095.method3445(var47);
            this.field8095.method3445(var46);
            this.field8095.method3445(var45);
        } else {
            this.field8095.method3445(var45);
            this.field8095.method3445(var46);
            this.field8095.method3445(var47);
        }
        this.field8095.method3445(255);
        this.method3223((byte) 40, var14);
    }
}
