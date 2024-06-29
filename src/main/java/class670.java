import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class670 extends class71 {

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lrl;")
    private class232 field9254;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Leha;")
    private class166 field9247;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Ltj;")
    private class687 field9256;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    private int field9243;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    private int field9262;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    private int field9246;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    private int field9245;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "[[F")
    private float[][] field9242;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "[[F")
    private float[][] field9260;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "[[F")
    private float[][] field9250;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    private int field9244;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Ljs;")
    private class174 field9241;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lrv;")
    private class440 field9253;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lbaa;")
    private class130 field9252;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9265;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9249;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    private int field9255;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field9248 = 0;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Z")
    public static volatile boolean field9263 = false;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method3775(byte arg0) {
        field9257++;
        if (class25.field320 || class655.field8752 == null) {
            return "";
        } else if (arg0 > -112) {
            return null;
        } else {
            return class655.field8752.field7755;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
    public static final int method3776(int arg0) {
        field9259++;
        if (arg0 != 16) {
            method3776(-77);
        }
        return 16;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(JJ)J")
    public static long method3777(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII[[Z)V")
    public final void method3778(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field9251++;
        if (this.field9241 == null || this.field9243 > arg0 + arg3 || arg0 - arg3 > this.field9262) {
            return;
        }
        int var6 = 98 % ((-arg1 - 33) / 43);
        if (arg2 + arg3 < this.field9246 || this.field9245 < (arg2 - arg3)) {
            return;
        }
        for (int var7 = this.field9246; var7 <= this.field9245; var7++) {
            for (int var8 = this.field9243; var8 <= this.field9262; var8++) {
                int var9 = var8 - arg0;
                int var10 = var7 - arg2;
                if ((-arg3) < var9 && var9 < arg3 && -arg3 < var10 && arg3 > var10 && arg4[arg3 + var9][arg3 + var10]) {
                    this.field9254.method1435((byte) ((int) (this.field9256.method3871(16043) * 255.0F)), 688583916);
                    this.field9254.method314(-117, 0, this.field9253);
                    this.field9254.method265(1024, this.field9254.field3448);
                    this.field9254.method342(this.field9255, 7, this.field9241, class542.field7529, this.field9244 / 3, 0, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lve;")
    public static final class262 method3779(int arg0, int arg1, int arg2) {
        if (class137.field1948[arg0][arg1][arg2] == null) {
            boolean var3 = class137.field1948[0][arg1][arg2] != null && class137.field1948[0][arg1][arg2].field3847 != null;
            if (var3 && arg0 >= class370.field5229 - 1) {
                return null;
            }
            class462.method2830(arg0, arg1, arg2);
        }
        return class137.field1948[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIZII)V")
    private final void method3780(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            return;
        }
        field9264++;
        long var8 = -1L;
        int var10 = arg6 + (arg1 << this.field9247.field4822);
        int var11 = (arg3 << this.field9247.field4822) + arg2;
        int var12 = this.field9247.method2172(var10, -1, var11);
        if ((arg6 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class71 var13 = this.field9252.method812(122, var8);
            if (var13 != null) {
                this.method3781(((class248) var13).field3646, 50);
                return;
            }
        }
        short var14 = (short) (this.field9255++);
        if (var8 != -1L) {
            this.field9252.method820(var8, (byte) -42, new class248(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg2 == 0) {
            var15 = this.field9260[arg5][arg0];
            var16 = this.field9242[arg5][arg0];
            var17 = this.field9250[arg5][arg0];
        } else if (this.field9247.field4818 == arg6 && arg2 == 0) {
            var16 = this.field9242[arg5 + 1][arg0];
            var15 = this.field9260[arg5 + 1][arg0];
            var17 = this.field9250[arg5 + 1][arg0];
        } else if (this.field9247.field4818 == arg6 && this.field9247.field4818 == arg2) {
            var17 = this.field9250[arg5 + 1][arg0 + 1];
            var15 = this.field9260[arg5 + 1][arg0 + 1];
            var16 = this.field9242[arg5 + 1][arg0 + 1];
        } else if (arg6 == 0 && this.field9247.field4818 == arg2) {
            var15 = this.field9260[arg5][arg0 + 1];
            var16 = this.field9242[arg5][arg0 + 1];
            var17 = this.field9250[arg5][arg0 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field9247.field4818;
            float var19 = (float) arg2 / (float) this.field9247.field4818;
            float var20 = this.field9260[arg5][arg0];
            float var21 = this.field9250[arg5][arg0];
            float var22 = this.field9242[arg5][arg0];
            float var23 = this.field9260[arg5 + 1][arg0];
            float var24 = this.field9250[arg5 + 1][arg0];
            float var25 = (this.field9242[arg5][arg0 + 1] - var22) * var18 + var22;
            float var26 = (this.field9260[arg5][arg0 + 1] - var20) * var18 + var20;
            float var27 = (this.field9260[arg5 + 1][arg0 + 1] - var23) * var18 + var23;
            float var28 = (this.field9250[arg5 + 1][arg0 + 1] - var24) * var18 + var24;
            float var29 = (this.field9250[arg5][arg0 + 1] - var21) * var18 + var21;
            float var30 = this.field9242[arg5 + 1][arg0];
            float var31 = (this.field9242[arg5 + 1][arg0 + 1] - var30) * var18 + var30;
            var17 = (var28 - var29) * var19 + var29;
            var15 = (var27 - var26) * var19 + var26;
            var16 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field9256.method3873((byte) -7) - var10);
        float var33 = (float) (this.field9256.method3867(false) - var12);
        float var34 = (float) (this.field9256.method3870(104) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field9256.method3866((byte) -107);
        float var41 = 1.0F - var40 * var40;
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
        int var44 = this.field9256.method3868(6);
        int var45 = (int) ((float) ((var44 & 0xFFAF24) >> 16) * var43);
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
        if (Stream.method2614()) {
            this.field9265.method2608((float) var10);
            this.field9265.method2608((float) var12);
            this.field9265.method2608((float) var11);
        } else {
            this.field9265.method2617((float) var10);
            this.field9265.method2617((float) var12);
            this.field9265.method2617((float) var11);
        }
        if (this.field9254.field3435 == 0) {
            this.field9265.method2606(var47);
            this.field9265.method2606(var46);
            this.field9265.method2606(var45);
        } else {
            this.field9265.method2606(var45);
            this.field9265.method2606(var46);
            this.field9265.method2606(var47);
        }
        this.field9265.method2606(255);
        this.method3781(var14, 111);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(SI)V")
    private final void method3781(short arg0, int arg1) {
        field9258++;
        if (Stream.method2614()) {
            this.field9249.method2610(arg0);
        } else {
            this.field9249.method2619(arg0);
        }
        int var3 = 58 % ((arg1 + 80) / 35);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)Z")
    public static final boolean method3782(int arg0, int arg1, int arg2) {
        if (arg1 == 544) {
            field9261++;
            return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lrl;Leha;Ltj;[I)V")
    public class670(class232 arg0, class166 arg1, class687 arg2, int[] arg3) {
        this.field9254 = arg0;
        this.field9247 = arg1;
        this.field9256 = arg2;
        int var5 = this.field9256.method3866((byte) -57) - (arg1.field4818 >> 1);
        this.field9243 = this.field9256.method3873((byte) -7) - var5 >> arg1.field4822;
        this.field9262 = this.field9256.method3873((byte) -7) + var5 >> arg1.field4822;
        this.field9246 = this.field9256.method3870(96) - var5 >> arg1.field4822;
        this.field9245 = var5 + this.field9256.method3870(108) >> arg1.field4822;
        int var6 = this.field9262 + 1 - this.field9243;
        int var7 = this.field9245 + 1 - this.field9246;
        this.field9242 = new float[var6 + 1][var7 + 1];
        this.field9260 = new float[var6 + 1][var7 + 1];
        this.field9250 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field9246 + var8;
            if (var27 > 0 && var27 < this.field9247.field4817 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field9243 + var28;
                    if (var29 > 0 && this.field9247.field4814 - 1 > var29) {
                        int var30 = arg1.method2171(var27, var29 + 1, 31) - arg1.method2171(var27, var29 - 1, 31);
                        int var31 = arg1.method2171(var27 + 1, var29, 31) - arg1.method2171(var27 - 1, var29, 31);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field9260[var28][var8] = (float) var30 * var32;
                        this.field9250[var28][var8] = var32 * -256.0F;
                        this.field9242[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field9246; var10 <= this.field9245; var10++) {
            if (var10 >= 0 && arg1.field4817 > var10) {
                for (int var23 = this.field9243; var23 <= this.field9262; var23++) {
                    if (var23 >= 0 && arg1.field4814 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field2274[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field9244 += 3;
                                    }
                                }
                            } else {
                                this.field9244 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field9262 - this.field9243;
            }
        }
        if (this.field9244 <= 0) {
            this.field9241 = null;
            this.field9253 = null;
        } else {
            this.field9252 = new class130(class606.method3450(this.field9244, (byte) -25));
            this.field9241 = this.field9254.method294(false, (byte) -74);
            this.field9241.method969(false, this.field9244);
            NativeHeapBuffer var11 = this.field9254.method1500(false, this.field9244 * 16, false);
            this.field9265 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field9241.method968(true, (byte) 45);
                } while (var12 == null);
                this.field9249 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field9246; var15 <= this.field9245; var15++) {
                    if (var15 >= 0 && arg1.field4817 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field9243; var17 <= this.field9262; var17++) {
                            if (var17 >= 0 && var17 < arg1.field4814) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field2274[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field2294[var17][var15];
                                        int[] var21 = arg1.field2276[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3780(var13, var17, var21[var22], var15, true, var16, var20[var22]);
                                                    var22++;
                                                    this.method3780(var13, var17, var21[var22], var15, true, var16, var20[var22]);
                                                    var22++;
                                                    this.method3780(var13, var17, var21[var22], var15, true, var16, var20[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3780(var13, var17, 0, var15, true, var16, 0);
                                        this.method3780(var13, var17, 0, var15, true, var16, arg1.field4818);
                                        this.method3780(var13, var17, arg1.field4818, var15, true, var16, 0);
                                    } else if (var18 == 2) {
                                        this.method3780(var13, var17, 0, var15, true, var16, arg1.field4818);
                                        this.method3780(var13, var17, arg1.field4818, var15, true, var16, arg1.field4818);
                                        this.method3780(var13, var17, 0, var15, true, var16, 0);
                                    } else if (var18 == 5) {
                                        this.method3780(var13, var17, arg1.field4818, var15, true, var16, arg1.field4818);
                                        this.method3780(var13, var17, arg1.field4818, var15, true, var16, 0);
                                        this.method3780(var13, var17, 0, var15, true, var16, arg1.field4818);
                                    } else if (var18 == 4) {
                                        this.method3780(var13, var17, arg1.field4818, var15, true, var16, 0);
                                        this.method3780(var13, var17, 0, var15, true, var16, 0);
                                        this.method3780(var13, var17, arg1.field4818, var15, true, var16, arg1.field4818);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field9262 - this.field9243;
                    }
                    var13++;
                }
                this.field9249.method2613();
                if (this.field9241.method975(-79)) {
                    this.field9265.method2613();
                    this.field9253 = this.field9254.method319((byte) 100, false);
                    this.field9253.method2141(this.field9255 * 16, 16, false, var11);
                    break;
                }
                this.field9265.method2618(0);
                this.field9252.method819(23738);
            }
        }
        this.field9252 = null;
        this.field9249 = null;
        this.field9265 = null;
        this.field9260 = this.field9250 = this.field9242 = null;
    }
}
