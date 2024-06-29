import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class196 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    private int field2945 = 100;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
    private int[] field2947 = new int[5];

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field2950 = 500;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    private int field2959 = 0;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[I")
    private int[] field2946 = new int[5];

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public int field2952 = 0;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "[I")
    private int[] field2965 = new int[5];

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
    private static int[] field2948 = new int[32768];

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[I")
    private static int[] field2955;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "[I")
    private static int[] field2956;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "[I")
    private static int[] field2963;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "[I")
    private static int[] field2966;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "[I")
    private static int[] field2967;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "[I")
    private static int[] field2968;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "[I")
    private static int[] field2969;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lqq;")
    private class479 field2949;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lqq;")
    private class479 field2951;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lqq;")
    private class479 field2953;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lqq;")
    private class479 field2954;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lqq;")
    private class479 field2957;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lqq;")
    private class479 field2958;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Lqq;")
    private class479 field2960;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Lqq;")
    private class479 field2961;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Lqq;")
    private class479 field2962;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Lwba;")
    private class49 field2964;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2948[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2955 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2955[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2956 = new int[220500];
        field2963 = new int[5];
        field2966 = new int[5];
        field2967 = new int[5];
        field2968 = new int[5];
        field2969 = new int[5];
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lee;)V", line = 4)
    public final void method1334(class677 arg0) {
        this.field2960 = new class479();
        this.field2960.method2697(arg0);
        this.field2958 = new class479();
        this.field2958.method2697(arg0);
        int var2 = arg0.method3821((byte) -29);
        if (var2 != 0) {
            arg0.field9419--;
            this.field2962 = new class479();
            this.field2962.method2697(arg0);
            this.field2951 = new class479();
            this.field2951.method2697(arg0);
        }
        int var3 = arg0.method3821((byte) -95);
        if (var3 != 0) {
            arg0.field9419--;
            this.field2954 = new class479();
            this.field2954.method2697(arg0);
            this.field2961 = new class479();
            this.field2961.method2697(arg0);
        }
        int var4 = arg0.method3821((byte) 105);
        if (var4 != 0) {
            arg0.field9419--;
            this.field2957 = new class479();
            this.field2957.method2697(arg0);
            this.field2953 = new class479();
            this.field2953.method2697(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3790((byte) 22);
            if (var6 == 0) {
                break;
            }
            this.field2965[var5] = var6;
            this.field2946[var5] = arg0.method3822((byte) 98);
            this.field2947[var5] = arg0.method3790((byte) 22);
        }
        this.field2959 = arg0.method3790((byte) 22);
        this.field2945 = arg0.method3790((byte) 22);
        this.field2950 = arg0.method3807(-1);
        this.field2952 = arg0.method3807(-1);
        this.field2964 = new class49();
        this.field2949 = new class479();
        this.field2964.method353(arg0, this.field2949);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I", line = 66)
    public final int[] method1335(int arg0, int arg1) {
        class335.method2019(field2956, 0, arg0);
        if (arg1 < 10) {
            return field2956;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2960.method2698();
        this.field2958.method2698();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2962 != null) {
            this.field2962.method2698();
            this.field2951.method2698();
            var5 = (int) ((double) (this.field2962.field6566 - this.field2962.field6565) * 32.768D / var3);
            var6 = (int) ((double) this.field2962.field6565 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2954 != null) {
            this.field2954.method2698();
            this.field2961.method2698();
            var8 = (int) ((double) (this.field2954.field6566 - this.field2954.field6565) * 32.768D / var3);
            var9 = (int) ((double) this.field2954.field6565 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2965[var11] != 0) {
                field2963[var11] = 0;
                field2969[var11] = (int) ((double) this.field2947[var11] * var3);
                field2968[var11] = (this.field2965[var11] << 14) / 100;
                field2966[var11] = (int) ((double) (this.field2960.field6566 - this.field2960.field6565) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2946[var11]) / var3);
                field2967[var11] = (int) ((double) this.field2960.field6565 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2960.method2699(arg0);
            int var40 = this.field2958.method2699(arg0);
            if (this.field2962 != null) {
                int var41 = this.field2962.method2699(arg0);
                int var42 = this.field2951.method2699(arg0);
                var39 += this.method1336(var7, var42, this.field2962.field6563) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2954 != null) {
                int var43 = this.field2954.method2699(arg0);
                int var44 = this.field2961.method2699(arg0);
                var40 = var40 * ((this.method1336(var10, var44, this.field2954.field6563) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2965[var45] != 0) {
                    int var46 = field2969[var45] + var12;
                    if (var46 < arg0) {
                        field2956[var46] += this.method1336(field2963[var45], field2968[var45] * var40 >> 15, this.field2960.field6563);
                        field2963[var45] += (field2966[var45] * var39 >> 16) + field2967[var45];
                    }
                }
            }
        }
        if (this.field2957 != null) {
            this.field2957.method2698();
            this.field2953.method2698();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2957.method2699(arg0);
                int var18 = this.field2953.method2699(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2957.field6566 - this.field2957.field6565) * var17 >> 8) + this.field2957.field6565;
                } else {
                    var19 = ((this.field2957.field6566 - this.field2957.field6565) * var18 >> 8) + this.field2957.field6565;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2956[var16] = 0;
                }
            }
        }
        if (this.field2959 > 0 && this.field2945 > 0) {
            int var20 = (int) ((double) this.field2959 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2956[var21] += field2956[var21 - var20] * this.field2945 / 100;
            }
        }
        if (this.field2964.field630[0] > 0 || this.field2964.field630[1] > 0) {
            this.field2949.method2698();
            int var22 = this.field2949.method2699(arg0 + 1);
            int var23 = this.field2964.method351(0, (float) var22 / 65536.0F);
            int var24 = this.field2964.method351(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2956[var23 + var25] * (long) class49.field635 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2956[var23 + var25 - var36 - 1] * (long) class49.field632[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2956[var25 - var37 - 1] * (long) class49.field632[1][var37] >> 16);
                    }
                    field2956[var25] = var35;
                    var22 = this.field2949.method2699(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2956[var23 + var25] * (long) class49.field635 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2956[var23 + var25 - var33 - 1] * (long) class49.field632[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2956[var25 - var34 - 1] * (long) class49.field632[1][var34] >> 16);
                        }
                        field2956[var25] = var32;
                        var22 = this.field2949.method2699(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2956[var23 + var25 - var29 - 1] * (long) class49.field632[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2956[var25 - var30 - 1] * (long) class49.field632[1][var30] >> 16);
                            }
                            field2956[var25] = var28;
                            this.field2949.method2699(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2964.method351(0, (float) var22 / 65536.0F);
                    var24 = this.field2964.method351(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2956[var38] < -32768) {
                field2956[var38] = -32768;
            }
            if (field2956[var38] > 32767) {
                field2956[var38] = 32767;
            }
        }
        return field2956;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)I", line = 348)
    private final int method1336(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2955[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2948[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()V", line = 377)
    public static void method1337() {
        field2956 = null;
        field2948 = null;
        field2955 = null;
        field2963 = null;
        field2969 = null;
        field2968 = null;
        field2966 = null;
        field2967 = null;
    }
}
