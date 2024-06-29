import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class416 extends class513 {

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "Lpga;")
    private class492 field5795;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "Lkb;")
    private class757 field5786;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "Lsba;")
    private class556 field5794;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    private int field5783;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    private int field5778;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    private int field5797;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    private int field5780;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "[[F")
    private float[][] field5799;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "[[F")
    private float[][] field5777;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "[[F")
    private float[][] field5790;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    private int field5801;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "Lho;")
    private class212 field5792;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "Llk;")
    private class251 field5784;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "Lgca;")
    private class209 field5781;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5782;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5779;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
    private int field5787;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "[I")
    public static int[] field5788 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public static int field5798 = -1;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "Lqk;")
    public static class148 field5796 = new class148(35, 8);

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "Lju;")
    public static class102 field5802 = new class102(34, 3);

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIBI)V", line = 3)
    public static final void method2528(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5785++;
        int var6 = 0;
        if (arg4 != -34) {
            return;
        }
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class721.method4044(class591.field8480[arg5], arg1 - arg3, (byte) -122, arg1 + arg3, arg2);
        int var20 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var21 = arg5 - var7;
            int var22 = arg5 + var7;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class721.method4044(class591.field8480[var21], var24, (byte) -119, var23, arg2);
            class721.method4044(class591.field8480[var22], var24, (byte) -128, var23, arg2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIII)V", line = 91)
    private final void method2529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5800++;
        long var8 = -1L;
        int var10 = (arg3 << this.field5794.field4349) + arg1;
        int var11 = arg5 + (arg4 << this.field5794.field4349);
        int var12 = this.field5794.method1960(var10, var11, 114);
        if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class513 var13 = this.field5781.method1381(true, var8);
            if (var13 != null) {
                this.method2531(((class366) var13).field4701, 418);
                return;
            }
        }
        short var14 = (short) (this.field5787++);
        if (var8 != -1L) {
            this.field5781.method1387(new class366(var14), var8, (byte) -128);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg5 == 0) {
            var15 = this.field5777[arg0][arg6];
            var16 = this.field5790[arg0][arg6];
            var17 = this.field5799[arg0][arg6];
        } else if (this.field5794.field4346 == arg1 && arg5 == 0) {
            var16 = this.field5790[arg0 + 1][arg6];
            var17 = this.field5799[arg0 + 1][arg6];
            var15 = this.field5777[arg0 + 1][arg6];
        } else if (this.field5794.field4346 == arg1 && this.field5794.field4346 == arg5) {
            var16 = this.field5790[arg0 + 1][arg6 + 1];
            var17 = this.field5799[arg0 + 1][arg6 + 1];
            var15 = this.field5777[arg0 + 1][arg6 + 1];
        } else if (arg1 == 0 && this.field5794.field4346 == arg5) {
            var16 = this.field5790[arg0][arg6 + 1];
            var15 = this.field5777[arg0][arg6 + 1];
            var17 = this.field5799[arg0][arg6 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field5794.field4346;
            float var19 = (float) arg5 / (float) this.field5794.field4346;
            float var20 = this.field5790[arg0][arg6];
            float var21 = this.field5799[arg0][arg6];
            float var22 = this.field5777[arg0][arg6];
            float var23 = this.field5790[arg0 + 1][arg6];
            float var24 = this.field5799[arg0 + 1][arg6];
            float var25 = this.field5777[arg0 + 1][arg6];
            float var26 = (this.field5777[arg0][arg6 + 1] - var22) * var18 + var22;
            float var27 = (this.field5790[arg0][arg6 + 1] - var20) * var18 + var20;
            float var28 = (this.field5790[arg0 + 1][arg6 + 1] - var23) * var18 + var23;
            float var29 = (this.field5799[arg0][arg6 + 1] - var21) * var18 + var21;
            float var30 = (this.field5799[arg0 + 1][arg6 + 1] - var24) * var18 + var24;
            var17 = (var30 - var29) * var19 + var29;
            float var31 = (this.field5777[arg0 + 1][arg6 + 1] - var25) * var18 + var25;
            var16 = (var28 - var27) * var19 + var27;
            var15 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field5786.method4203(20918) - var10);
        float var33 = (float) (this.field5786.method4212(-54) - var12);
        float var34 = (float) (this.field5786.method4205((byte) 8) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field5786.method4206((byte) 27);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var39 + var16 * var37 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field5786.method4209((byte) -66);
        int var45 = (int) ((float) ((var44 & 0xFF6CE1) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF51) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method2541()) {
            this.field5782.method2552((float) var10);
            this.field5782.method2552((float) var12);
            this.field5782.method2552((float) var11);
        } else {
            this.field5782.method2550((float) var10);
            this.field5782.method2550((float) var12);
            this.field5782.method2550((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (~this.field5795.field6886 == arg2) {
            this.field5782.method2542(var47);
            this.field5782.method2542(var46);
            this.field5782.method2542(var45);
        } else {
            this.field5782.method2542(var45);
            this.field5782.method2542(var46);
            this.field5782.method2542(var47);
        }
        this.field5782.method2542(255);
        this.method2531(var14, 418);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 267)
    public static final void method2530(byte arg0) {
        field5789++;
        int var1 = class594.field8557.length;
        if (arg0 < 76) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class594.field8557[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class675.field9511; var4++) {
                    if (class592.field8537[var2] == class321.field4129[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class321.field4129[class675.field9511] = class592.field8537[var2];
                    var3 = class675.field9511++;
                }
                class26 var5 = new class26(class594.field8557[var2]);
                int var6 = 0;
                while (class594.field8557[var2].length > var5.field330 && var6 < 511 && class676.field9533 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method193(2);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class592.field8537[var2] >> 8) * 64 + var10 - class179.field2535;
                    int var13 = (class592.field8537[var2] & 0xFF) * 64 + var11 - class510.field7109;
                    class11 var14 = class643.field9112.method3887(var5.method193(2), false);
                    class15 var15 = (class15) class403.field5587.method1381(true, (long) var7);
                    if (var15 == null && (var14.field135 & 0x1) > 0 && class183.field2654 == var9 && var12 >= 0 && var14.field134 + var12 < class514.field7179 && var13 >= 0 && (var14.field134 + var13) < class456.field6281) {
                        class55 var16 = new class55();
                        var16.field8344 = var7;
                        class15 var17 = new class15(var16);
                        class403.field5587.method1387(var17, (long) var7, (byte) -113);
                        class312.field4003[class287.field3776++] = var17;
                        class731.field10231[class676.field9533++] = var7;
                        var16.field8367 = class245.field3409;
                        var16.method379(var14, -128);
                        var16.method3474((byte) 122, var16.field771.field134);
                        var16.field8322 = var16.field771.field146 << 3;
                        var16.method3471((var16.field771.field147 + 4 & 0x81600007) << 11, (byte) -125, true);
                        var16.method367(var9, -2, true, var16.method3470(-1), var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(SI)V", line = 367)
    private final void method2531(short arg0, int arg1) {
        field5793++;
        if (Stream.method2541()) {
            this.field5779.method2554(arg0);
        } else {
            this.field5779.method2544(arg0);
        }
        if (arg1 != 418) {
            this.method2534(-66, -113, 98, -10, null);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V", line = 388)
    public static void method2532(byte arg0) {
        if (arg0 != -48) {
            field5788 = null;
        }
        field5802 = null;
        field5788 = null;
        field5796 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)V", line = 402)
    public static final void method2533(int arg0, int arg1, int arg2, int arg3) {
        class38 var4 = class352.field4549[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class95 var5 = var4.field542;
        class95 var6 = var4.field533;
        if (var5 != null) {
            var5.field1384 = (short) (var5.field1384 * arg3 / (0x10 << class509.field7106 - 7));
            var5.field1389 = (short) (var5.field1389 * arg3 / (0x10 << class509.field7106 - 7));
        }
        if (var6 != null) {
            var6.field1384 = (short) (var6.field1384 * arg3 / (0x10 << class509.field7106 - 7));
            var6.field1389 = (short) (var6.field1389 * arg3 / (0x10 << class509.field7106 - 7));
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII[[Z)V", line = 427)
    public final void method2534(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        if (arg3 != 20212) {
            return;
        }
        field5791++;
        if (this.field5792 == null || this.field5783 > arg1 + arg0 || this.field5778 < arg1 - arg0 || (arg0 + arg2) < this.field5797 || arg2 - arg0 > this.field5780) {
            return;
        }
        for (int var6 = this.field5797; var6 <= this.field5780; var6++) {
            for (int var7 = this.field5783; var7 <= this.field5778; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg2;
                if (var8 > (-arg0) && arg0 > var8 && var9 > -arg0 && var9 < arg0 && arg4[arg0 + var8][var9 + arg0]) {
                    this.field5795.method2894((byte) ((int) (this.field5786.method4211((byte) -35) * 255.0F)), -86);
                    this.field5795.method564(0, this.field5784, false);
                    this.field5795.method565(false, this.field5795.field6929);
                    this.field5795.method612(class756.field10497, 0, 0, true, this.field5787, this.field5792, this.field5801 / 3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lpga;Lsba;Lkb;[I)V", line = 503)
    public class416(class492 arg0, class556 arg1, class757 arg2, int[] arg3) {
        this.field5795 = arg0;
        this.field5786 = arg2;
        this.field5794 = arg1;
        int var5 = this.field5786.method4206((byte) 12) - (arg1.field4346 >> 1);
        this.field5783 = this.field5786.method4203(20918) - var5 >> arg1.field4349;
        this.field5778 = var5 + this.field5786.method4203(20918) >> arg1.field4349;
        this.field5797 = this.field5786.method4205((byte) 8) - var5 >> arg1.field4349;
        this.field5780 = this.field5786.method4205((byte) 8) + var5 >> arg1.field4349;
        int var6 = this.field5778 + 1 - this.field5783;
        int var7 = this.field5780 + 1 - this.field5797;
        this.field5799 = new float[var6 + 1][var7 + 1];
        this.field5777 = new float[var6 + 1][var7 + 1];
        this.field5790 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field5797 + var8;
            if (var27 > 0 && (this.field5794.field4348 - 1) > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field5783 + var28;
                    if (var29 > 0 && this.field5794.field4344 - 1 > var29) {
                        int var30 = arg1.method1959(125, var27, var29 + 1) - arg1.method1959(123, var27, var29 - 1);
                        int var31 = arg1.method1959(127, var27 + 1, var29) - arg1.method1959(125, var27 - 1, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + (var31 * var31) + 65536)));
                        this.field5790[var28][var8] = (float) var30 * var32;
                        this.field5799[var28][var8] = var32 * -256.0F;
                        this.field5777[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field5797; var10 <= this.field5780; var10++) {
            if (var10 >= 0 && arg1.field4348 > var10) {
                for (int var23 = this.field5783; var23 <= this.field5778; var23++) {
                    if (var23 >= 0 && var23 < arg1.field4344) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7854[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field5801 += 3;
                                    }
                                }
                            } else {
                                this.field5801 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field5778 - this.field5783;
            }
        }
        if (this.field5801 <= 0) {
            this.field5792 = null;
            this.field5784 = null;
        } else {
            this.field5781 = new class209(class670.method3834(this.field5801, 23538));
            this.field5792 = this.field5795.method634(false, true);
            this.field5792.method1399(this.field5801, true);
            NativeHeapBuffer var11 = this.field5795.method2924((byte) -60, this.field5801 * 16, false);
            this.field5782 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field5792.method1401(true, 27);
                } while (var12 == null);
                this.field5779 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field5797; var15 <= this.field5780; var15++) {
                    if (var15 >= 0 && arg1.field4348 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field5783; var17 <= this.field5778; var17++) {
                            if (var17 >= 0 && var17 < arg1.field4344) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field7854[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7876[var17][var15];
                                        int[] var21 = arg1.field7878[var17][var15];
                                        int var22 = 0;
                                        label121: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label121;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method2529(var16, var20[var22], -1, var17, var15, var21[var22], var13);
                                                    var22++;
                                                    this.method2529(var16, var20[var22], -1, var17, var15, var21[var22], var13);
                                                    var22++;
                                                    this.method2529(var16, var20[var22], -1, var17, var15, var21[var22], var13);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method2529(var16, 0, -1, var17, var15, 0, var13);
                                        this.method2529(var16, arg1.field4346, -1, var17, var15, 0, var13);
                                        this.method2529(var16, 0, -1, var17, var15, arg1.field4346, var13);
                                    } else if (var18 == 2) {
                                        this.method2529(var16, arg1.field4346, -1, var17, var15, 0, var13);
                                        this.method2529(var16, arg1.field4346, -1, var17, var15, arg1.field4346, var13);
                                        this.method2529(var16, 0, -1, var17, var15, 0, var13);
                                    } else if (var18 == 5) {
                                        this.method2529(var16, arg1.field4346, -1, var17, var15, arg1.field4346, var13);
                                        this.method2529(var16, 0, -1, var17, var15, arg1.field4346, var13);
                                        this.method2529(var16, arg1.field4346, -1, var17, var15, 0, var13);
                                    } else if (var18 == 4) {
                                        this.method2529(var16, 0, -1, var17, var15, arg1.field4346, var13);
                                        this.method2529(var16, 0, -1, var17, var15, 0, var13);
                                        this.method2529(var16, arg1.field4346, -1, var17, var15, arg1.field4346, var13);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field5778 - this.field5783;
                    }
                    var13++;
                }
                this.field5779.method2551();
                if (this.field5792.method1400(false)) {
                    this.field5782.method2551();
                    this.field5784 = this.field5795.method638((byte) -103, false);
                    this.field5784.method1593(var11, 16, this.field5787 * 16, 1340);
                    break;
                }
                this.field5782.method2555(0);
                this.field5781.method1385((byte) -97);
            }
        }
        this.field5790 = this.field5799 = this.field5777 = null;
        this.field5782 = null;
        this.field5779 = null;
        this.field5781 = null;
    }
}
