import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class149 {

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "[I")
    private int[] field2954 = new int[5];

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "[I")
    private int[] field2952 = new int[5];

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
    private int[] field2946 = new int[5];

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    private int field2960 = 0;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    private int field2957 = 100;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public int field2962 = 500;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field2965 = 0;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
    private static int[] field2950 = new int[32768];

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "[I")
    private static int[] field2959;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
    private static int[] field2948;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "[I")
    private static int[] field2964;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
    private static int[] field2961;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "[I")
    private static int[] field2966;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "[I")
    private static int[] field2967;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "[I")
    private static int[] field2968;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lte;")
    private class184 field2944;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Ldf;")
    private class37 field2945;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Ldf;")
    private class37 field2947;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Ldf;")
    private class37 field2949;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Ldf;")
    private class37 field2951;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Ldf;")
    private class37 field2953;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Ldf;")
    private class37 field2955;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Ldf;")
    private class37 field2956;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Ldf;")
    private class37 field2958;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "Ldf;")
    private class37 field2963;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public static void method964() {
        field2948 = null;
        field2950 = null;
        field2959 = null;
        field2966 = null;
        field2968 = null;
        field2961 = null;
        field2967 = null;
        field2964 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
    public final int[] method965(int arg0, int arg1) {
        class11.method74(field2948, 0, arg0);
        if (arg1 < 10) {
            return field2948;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2958.method232();
        this.field2963.method232();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2951 != null) {
            this.field2951.method232();
            this.field2956.method232();
            var5 = (int) ((double) (this.field2951.field838 - this.field2951.field841) * 32.768D / var3);
            var6 = (int) ((double) this.field2951.field841 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2955 != null) {
            this.field2955.method232();
            this.field2947.method232();
            var8 = (int) ((double) (this.field2955.field838 - this.field2955.field841) * 32.768D / var3);
            var9 = (int) ((double) this.field2955.field841 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2954[var11] != 0) {
                field2966[var11] = 0;
                field2968[var11] = (int) ((double) this.field2946[var11] * var3);
                field2961[var11] = (this.field2954[var11] << 14) / 100;
                field2967[var11] = (int) ((double) (this.field2958.field838 - this.field2958.field841) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2952[var11]) / var3);
                field2964[var11] = (int) ((double) this.field2958.field841 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2958.method233(arg0);
            int var40 = this.field2963.method233(arg0);
            if (this.field2951 != null) {
                int var41 = this.field2951.method233(arg0);
                int var42 = this.field2956.method233(arg0);
                var39 += this.method967(var7, var42, this.field2951.field843) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2955 != null) {
                int var43 = this.field2955.method233(arg0);
                int var44 = this.field2947.method233(arg0);
                var40 = var40 * ((this.method967(var10, var44, this.field2955.field843) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2954[var45] != 0) {
                    int var46 = field2968[var45] + var12;
                    if (var46 < arg0) {
                        field2948[var46] += this.method967(field2966[var45], field2961[var45] * var40 >> 15, this.field2958.field843);
                        field2966[var45] += (field2967[var45] * var39 >> 16) + field2964[var45];
                    }
                }
            }
        }
        if (this.field2953 != null) {
            this.field2953.method232();
            this.field2949.method232();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2953.method233(arg0);
                int var18 = this.field2949.method233(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2953.field838 - this.field2953.field841) * var17 >> 8) + this.field2953.field841;
                } else {
                    var19 = ((this.field2953.field838 - this.field2953.field841) * var18 >> 8) + this.field2953.field841;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2948[var16] = 0;
                }
            }
        }
        if (this.field2960 > 0 && this.field2957 > 0) {
            int var20 = (int) ((double) this.field2960 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2948[var21] += field2948[var21 - var20] * this.field2957 / 100;
            }
        }
        if (this.field2944.field3482[0] > 0 || this.field2944.field3482[1] > 0) {
            this.field2945.method232();
            int var22 = this.field2945.method233(arg0 + 1);
            int var23 = this.field2944.method1197(0, (float) var22 / 65536.0F);
            int var24 = this.field2944.method1197(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2948[var23 + var25] * (long) class184.field3483 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2948[var23 + var25 - var36 - 1] * (long) class184.field3479[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2948[var25 - var37 - 1] * (long) class184.field3479[1][var37] >> 16);
                    }
                    field2948[var25] = var35;
                    var22 = this.field2945.method233(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2948[var23 + var25] * (long) class184.field3483 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2948[var23 + var25 - var33 - 1] * (long) class184.field3479[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2948[var25 - var34 - 1] * (long) class184.field3479[1][var34] >> 16);
                        }
                        field2948[var25] = var32;
                        var22 = this.field2945.method233(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2948[var23 + var25 - var29 - 1] * (long) class184.field3479[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2948[var25 - var30 - 1] * (long) class184.field3479[1][var30] >> 16);
                            }
                            field2948[var25] = var28;
                            this.field2945.method233(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2944.method1197(0, (float) var22 / 65536.0F);
                    var24 = this.field2944.method1197(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2948[var38] < -32768) {
                field2948[var38] = -32768;
            }
            if (field2948[var38] > 32767) {
                field2948[var38] = 32767;
            }
        }
        return field2948;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lh;)V")
    public final void method966(class70 arg0) {
        this.field2958 = new class37();
        this.field2958.method235(arg0);
        this.field2963 = new class37();
        this.field2963.method235(arg0);
        int var2 = arg0.method443(255);
        if (var2 != 0) {
            arg0.field1472--;
            this.field2951 = new class37();
            this.field2951.method235(arg0);
            this.field2956 = new class37();
            this.field2956.method235(arg0);
        }
        int var3 = arg0.method443(255);
        if (var3 != 0) {
            arg0.field1472--;
            this.field2955 = new class37();
            this.field2955.method235(arg0);
            this.field2947 = new class37();
            this.field2947.method235(arg0);
        }
        int var4 = arg0.method443(255);
        if (var4 != 0) {
            arg0.field1472--;
            this.field2953 = new class37();
            this.field2953.method235(arg0);
            this.field2949 = new class37();
            this.field2949.method235(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method430(true);
            if (var6 == 0) {
                break;
            }
            this.field2954[var5] = var6;
            this.field2952[var5] = arg0.method445((byte) 115);
            this.field2946[var5] = arg0.method430(true);
        }
        this.field2960 = arg0.method430(true);
        this.field2957 = arg0.method430(true);
        this.field2962 = arg0.method442(-21351);
        this.field2965 = arg0.method442(-21351);
        this.field2944 = new class184();
        this.field2945 = new class37();
        this.field2944.method1196(arg0, this.field2945);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
    private final int method967(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2959[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2950[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2950[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2959 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2959[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2948 = new int[220500];
        field2964 = new int[5];
        field2961 = new int[5];
        field2966 = new int[5];
        field2967 = new int[5];
        field2968 = new int[5];
    }
}
