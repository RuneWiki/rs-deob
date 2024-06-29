import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class786 extends class101 {

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "Lew;")
    private class520 field10815;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "Lai;")
    private class626 field10831;

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "Luca;")
    private class540 field10828;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
    private int field10822;

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
    private int field10825;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
    private int field10829;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    private int field10811;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "[[F")
    private float[][] field10818;

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "[[F")
    private float[][] field10821;

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "[[F")
    private float[][] field10827;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    private int field10816;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "Lee;")
    private class706 field10814;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "Loh;")
    private class427 field10813;

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "Ljaclib/memory/Stream;")
    private Stream field10823;

    @OriginalMember(owner = "client!lo", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field10826;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "Lid;")
    private class612 field10812;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    private int field10817;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
    public static int field10820 = 2;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    public static int field10819;

    @OriginalMember(owner = "client!lo", name = "A", descriptor = "I")
    public static int field10824;

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
    public static int field10830;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    public static int field10832;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static final void method4345(int arg0) {
        class111.field1528 = new class668[class777.field10678.method2094((byte) -115)][];
        field10832++;
        class376.field5492 = new class668[class777.field10678.method2094((byte) -115)][];
        int var1 = 84 / ((arg0 - 24) / 62);
        class634.field8855 = new boolean[class777.field10678.method2094((byte) -115)];
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([[ZIIII)V")
    public final void method4346(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field10824++;
        if (this.field10813 == null || (arg1 + arg2) < this.field10822 || (arg2 - arg1) > this.field10825 || this.field10829 > arg3 + arg1 || this.field10811 < (arg3 - arg1)) {
            return;
        }
        for (int var6 = this.field10829; var6 <= this.field10811; var6++) {
            for (int var7 = this.field10822; var7 <= this.field10825; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg3;
                if ((-arg1) < var8 && arg1 > var8 && var9 > -arg1 && var9 < arg1 && arg0[var8 + arg1][arg1 + var9]) {
                    this.field10831.method3485((byte) ((int) (this.field10828.method3083((byte) -41) * 255.0F)), (byte) -117);
                    this.field10831.method883(this.field10812, 0, arg4 ^ 0xFFFFFFC6);
                    this.field10831.method913(this.field10831.field8763, (byte) -63);
                    this.field10831.method864(this.field10816 / 3, 0, this.field10813, 0, this.field10817, true, class235.field3174);
                    return;
                }
            }
        }
        if (arg4 != -1) {
            this.method4348(2, -124, -128, 38, 7, (byte) 100, -101);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lr;III[Z)V")
    public static final void method4347(class195 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class538.field7317 == class528.field7227) {
            return;
        }
        int var5 = class412.field5933[arg1].method1882(arg3, 0, arg2);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class296 var7 = class412.field5933[var6];
                if (var7 != null) {
                    var7.method1138(arg0, arg2, var5 - var7.method1882(arg3, 0, arg2), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIBI)V")
    private final void method4348(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field10819++;
        long var8 = -1L;
        int var10 = (arg1 << this.field10815.field4297) + arg4;
        int var11 = (arg6 << this.field10815.field4297) + arg3;
        int var12 = this.field10815.method1882(var11, 0, var10);
        if ((arg4 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class101 var13 = this.field10814.method3953(var8, 14);
            if (var13 != null) {
                this.method4349(((class172) var13).field2301, 1);
                return;
            }
        }
        short var14 = (short) (this.field10817++);
        if (var8 != -1L) {
            this.field10814.method3962(var8, new class172(var14), arg5 - 111);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg3 == 0) {
            var15 = this.field10827[arg0][arg2];
            var16 = this.field10821[arg0][arg2];
            var17 = this.field10818[arg0][arg2];
        } else if (this.field10815.field4295 == arg4 && arg3 == 0) {
            var17 = this.field10818[arg0 + 1][arg2];
            var15 = this.field10827[arg0 + 1][arg2];
            var16 = this.field10821[arg0 + 1][arg2];
        } else if (this.field10815.field4295 == arg4 && this.field10815.field4295 == arg3) {
            var15 = this.field10827[arg0 + 1][arg2 + 1];
            var17 = this.field10818[arg0 + 1][arg2 + 1];
            var16 = this.field10821[arg0 + 1][arg2 + 1];
        } else if (arg4 == 0 && this.field10815.field4295 == arg3) {
            var17 = this.field10818[arg0][arg2 + 1];
            var15 = this.field10827[arg0][arg2 + 1];
            var16 = this.field10821[arg0][arg2 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field10815.field4295;
            float var19 = (float) arg3 / (float) this.field10815.field4295;
            float var20 = this.field10818[arg0][arg2];
            float var21 = this.field10827[arg0][arg2];
            float var22 = this.field10821[arg0][arg2];
            float var23 = this.field10818[arg0 + 1][arg2];
            float var24 = this.field10827[arg0 + 1][arg2];
            float var25 = (this.field10821[arg0][arg2 + 1] - var22) * var18 + var22;
            float var26 = (this.field10827[arg0][arg2 + 1] - var21) * var18 + var21;
            float var27 = (this.field10827[arg0 + 1][arg2 + 1] - var24) * var18 + var24;
            float var28 = (this.field10818[arg0 + 1][arg2 + 1] - var23) * var18 + var23;
            float var29 = (this.field10818[arg0][arg2 + 1] - var20) * var18 + var20;
            float var30 = this.field10821[arg0 + 1][arg2];
            var15 = (var27 - var26) * var19 + var26;
            var17 = (var28 - var29) * var19 + var29;
            float var31 = (this.field10821[arg0 + 1][arg2 + 1] - var30) * var18 + var30;
            var16 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field10828.method3085(24859) - var10);
        float var33 = (float) (this.field10828.method3082(-16) - var12);
        float var34 = (float) (this.field10828.method3084((byte) -16) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field10828.method3081(arg5 + 7045);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var38 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field10828.method3080((byte) -104);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (arg5 != -9) {
            return;
        }
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3926()) {
            this.field10823.method3930((float) var10);
            this.field10823.method3930((float) var12);
            this.field10823.method3930((float) var11);
        } else {
            this.field10823.method3929((float) var10);
            this.field10823.method3929((float) var12);
            this.field10823.method3929((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field10831.field8716 == 0) {
            this.field10823.method3917(var47);
            this.field10823.method3917(var46);
            this.field10823.method3917(var45);
        } else {
            this.field10823.method3917(var45);
            this.field10823.method3917(var46);
            this.field10823.method3917(var47);
        }
        this.field10823.method3917(255);
        this.method4349(var14, 1);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(SI)V")
    private final void method4349(short arg0, int arg1) {
        if (Stream.method3926()) {
            this.field10826.method3918(arg0);
        } else {
            this.field10826.method3921(arg0);
        }
        if (arg1 != 1) {
            this.field10817 = 52;
        }
        field10830++;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lai;Lew;Luca;[I)V")
    public class786(class626 arg0, class520 arg1, class540 arg2, int[] arg3) {
        this.field10815 = arg1;
        this.field10831 = arg0;
        this.field10828 = arg2;
        int var5 = this.field10828.method3081(7036) - (arg1.field4295 >> 1);
        this.field10822 = this.field10828.method3085(24859) - var5 >> arg1.field4297;
        this.field10825 = this.field10828.method3085(24859) + var5 >> arg1.field4297;
        this.field10829 = this.field10828.method3084((byte) -16) - var5 >> arg1.field4297;
        this.field10811 = this.field10828.method3084((byte) -16) + var5 >> arg1.field4297;
        int var6 = this.field10825 + 1 - this.field10822;
        int var7 = this.field10811 + 1 - this.field10829;
        this.field10818 = new float[var6 + 1][var7 + 1];
        this.field10821 = new float[var6 + 1][var7 + 1];
        this.field10827 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = var8 + this.field10829;
            if (var27 > 0 && (this.field10815.field4300 - 1) > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field10822 + var28;
                    if (var29 > 0 && var29 < this.field10815.field4301 - 1) {
                        int var30 = arg1.method1880(var29 + 1, false, var27) - arg1.method1880(var29 - 1, false, var27);
                        int var31 = arg1.method1880(var29, false, var27 + 1) - arg1.method1880(var29, false, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + (var31 * var31) + 65536)));
                        this.field10818[var28][var8] = (float) var30 * var32;
                        this.field10827[var28][var8] = var32 * -256.0F;
                        this.field10821[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field10829; var10 <= this.field10811; var10++) {
            if (var10 >= 0 && arg1.field4300 > var10) {
                for (int var23 = this.field10822; var23 <= this.field10825; var23++) {
                    if (var23 >= 0 && arg1.field4301 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7135[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field10816 += 3;
                                    }
                                }
                            } else {
                                this.field10816 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field10825 - this.field10822;
            }
        }
        if (this.field10816 > 0) {
            this.field10814 = new class706(class719.method4014(this.field10816, (byte) -100));
            this.field10813 = this.field10831.method908(-1, false);
            this.field10813.method2615(this.field10816, (byte) -73);
            NativeHeapBuffer var11 = this.field10831.method3473(false, 12, this.field10816 * 16);
            this.field10823 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field10813.method2613(true, 3754);
                } while (var12 == null);
                this.field10826 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field10829; var15 <= this.field10811; var15++) {
                    if (var15 >= 0 && arg1.field4300 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field10822; var17 <= this.field10825; var17++) {
                            if (var17 >= 0 && arg1.field4301 > var17) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field7135[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7100[var17][var15];
                                        int[] var21 = arg1.field7131[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method4348(var16, var17, var13, var21[var22], var20[var22], (byte) -9, var15);
                                                    var22++;
                                                    this.method4348(var16, var17, var13, var21[var22], var20[var22], (byte) -9, var15);
                                                    var22++;
                                                    this.method4348(var16, var17, var13, var21[var22], var20[var22], (byte) -9, var15);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method4348(var16, var17, var13, 0, 0, (byte) -9, var15);
                                        this.method4348(var16, var17, var13, 0, arg1.field4295, (byte) -9, var15);
                                        this.method4348(var16, var17, var13, arg1.field4295, 0, (byte) -9, var15);
                                    } else if (var18 == 2) {
                                        this.method4348(var16, var17, var13, 0, arg1.field4295, (byte) -9, var15);
                                        this.method4348(var16, var17, var13, arg1.field4295, arg1.field4295, (byte) -9, var15);
                                        this.method4348(var16, var17, var13, 0, 0, (byte) -9, var15);
                                    } else if (var18 == 5) {
                                        this.method4348(var16, var17, var13, arg1.field4295, arg1.field4295, (byte) -9, var15);
                                        this.method4348(var16, var17, var13, arg1.field4295, 0, (byte) -9, var15);
                                        this.method4348(var16, var17, var13, 0, arg1.field4295, (byte) -9, var15);
                                    } else if (var18 == 4) {
                                        this.method4348(var16, var17, var13, arg1.field4295, 0, (byte) -9, var15);
                                        this.method4348(var16, var17, var13, 0, 0, (byte) -9, var15);
                                        this.method4348(var16, var17, var13, arg1.field4295, arg1.field4295, (byte) -9, var15);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field10825 - this.field10822;
                    }
                    var13++;
                }
                this.field10826.method3922();
                if (this.field10813.method2611(26937)) {
                    this.field10823.method3922();
                    this.field10812 = this.field10831.method902(0, false);
                    this.field10812.method2639(this.field10817 * 16, 16, -959, var11);
                    break;
                }
                this.field10823.method3925(0);
                this.field10814.method3959(0);
            }
        } else {
            this.field10812 = null;
            this.field10813 = null;
        }
        this.field10818 = this.field10827 = this.field10821 = null;
        this.field10814 = null;
        this.field10826 = null;
        this.field10823 = null;
    }
}
