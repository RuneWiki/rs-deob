import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class663 {

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public int field9097 = 500;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "[I")
    private int[] field9100 = new int[5];

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public int field9101 = 0;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "[I")
    private int[] field9104 = new int[5];

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    private int field9107 = 0;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    private int field9106 = 100;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "[I")
    private int[] field9094 = new int[5];

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "[I")
    private static int[] field9113 = new int[32768];

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "[I")
    private static int[] field9110;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
    private static int[] field9096;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "[I")
    private static int[] field9115;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "[I")
    private static int[] field9114;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "[I")
    private static int[] field9117;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "[I")
    private static int[] field9116;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "[I")
    private static int[] field9118;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Luf;")
    private class472 field9095;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Luf;")
    private class472 field9098;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "Luf;")
    private class472 field9099;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "Luf;")
    private class472 field9102;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "Luf;")
    private class472 field9103;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "Luf;")
    private class472 field9105;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "Luf;")
    private class472 field9108;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "Luf;")
    private class472 field9109;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "Luf;")
    private class472 field9111;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "Lpf;")
    private class609 field9112;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field9113[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field9110 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field9110[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field9096 = new int[220500];
        field9115 = new int[5];
        field9114 = new int[5];
        field9117 = new int[5];
        field9116 = new int[5];
        field9118 = new int[5];
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method3724(int arg0, int arg1) {
        class211.method1328(field9096, 0, arg0);
        if (arg1 < 10) {
            return field9096;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field9105.method2816();
        this.field9098.method2816();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field9102 != null) {
            this.field9102.method2816();
            this.field9111.method2816();
            var5 = (int) ((double) (this.field9102.field6580 - this.field9102.field6578) * 32.768D / var3);
            var6 = (int) ((double) this.field9102.field6578 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field9099 != null) {
            this.field9099.method2816();
            this.field9108.method2816();
            var8 = (int) ((double) (this.field9099.field6580 - this.field9099.field6578) * 32.768D / var3);
            var9 = (int) ((double) this.field9099.field6578 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field9100[var11] != 0) {
                field9118[var11] = 0;
                field9115[var11] = (int) ((double) this.field9094[var11] * var3);
                field9116[var11] = (this.field9100[var11] << 14) / 100;
                field9117[var11] = (int) ((double) (this.field9105.field6580 - this.field9105.field6578) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field9104[var11]) / var3);
                field9114[var11] = (int) ((double) this.field9105.field6578 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field9105.method2817(arg0);
            int var40 = this.field9098.method2817(arg0);
            if (this.field9102 != null) {
                int var41 = this.field9102.method2817(arg0);
                int var42 = this.field9111.method2817(arg0);
                var39 += this.method3725(var7, var42, this.field9102.field6577) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field9099 != null) {
                int var43 = this.field9099.method2817(arg0);
                int var44 = this.field9108.method2817(arg0);
                var40 = var40 * ((this.method3725(var10, var44, this.field9099.field6577) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field9100[var45] != 0) {
                    int var46 = field9115[var45] + var12;
                    if (var46 < arg0) {
                        field9096[var46] += this.method3725(field9118[var45], field9116[var45] * var40 >> 15, this.field9105.field6577);
                        field9118[var45] += (field9117[var45] * var39 >> 16) + field9114[var45];
                    }
                }
            }
        }
        if (this.field9095 != null) {
            this.field9095.method2816();
            this.field9109.method2816();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field9095.method2817(arg0);
                int var18 = this.field9109.method2817(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field9095.field6580 - this.field9095.field6578) * var17 >> 8) + this.field9095.field6578;
                } else {
                    var19 = ((this.field9095.field6580 - this.field9095.field6578) * var18 >> 8) + this.field9095.field6578;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field9096[var16] = 0;
                }
            }
        }
        if (this.field9107 > 0 && this.field9106 > 0) {
            int var20 = (int) ((double) this.field9107 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field9096[var21] += field9096[var21 - var20] * this.field9106 / 100;
            }
        }
        if (this.field9112.field8183[0] > 0 || this.field9112.field8183[1] > 0) {
            this.field9103.method2816();
            int var22 = this.field9103.method2817(arg0 + 1);
            int var23 = this.field9112.method3455(0, (float) var22 / 65536.0F);
            int var24 = this.field9112.method3455(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field9096[var23 + var25] * (long) class609.field8180 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field9096[var23 + var25 - var36 - 1] * (long) class609.field8182[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field9096[var25 - var37 - 1] * (long) class609.field8182[1][var37] >> 16);
                    }
                    field9096[var25] = var35;
                    var22 = this.field9103.method2817(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field9096[var23 + var25] * (long) class609.field8180 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field9096[var23 + var25 - var33 - 1] * (long) class609.field8182[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field9096[var25 - var34 - 1] * (long) class609.field8182[1][var34] >> 16);
                        }
                        field9096[var25] = var32;
                        var22 = this.field9103.method2817(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field9096[var23 + var25 - var29 - 1] * (long) class609.field8182[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field9096[var25 - var30 - 1] * (long) class609.field8182[1][var30] >> 16);
                            }
                            field9096[var25] = var28;
                            this.field9103.method2817(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field9112.method3455(0, (float) var22 / 65536.0F);
                    var24 = this.field9112.method3455(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field9096[var38] < -32768) {
                field9096[var38] = -32768;
            }
            if (field9096[var38] > 32767) {
                field9096[var38] = 32767;
            }
        }
        return field9096;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)I", line = 296)
    private final int method3725(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field9110[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field9113[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Les;)V", line = 328)
    public final void method3726(class403 arg0) {
        this.field9105 = new class472();
        this.field9105.method2818(arg0);
        this.field9098 = new class472();
        this.field9098.method2818(arg0);
        int var2 = arg0.method2396((byte) 59);
        if (var2 != 0) {
            arg0.field5262--;
            this.field9102 = new class472();
            this.field9102.method2818(arg0);
            this.field9111 = new class472();
            this.field9111.method2818(arg0);
        }
        int var3 = arg0.method2396((byte) -124);
        if (var3 != 0) {
            arg0.field5262--;
            this.field9099 = new class472();
            this.field9099.method2818(arg0);
            this.field9108 = new class472();
            this.field9108.method2818(arg0);
        }
        int var4 = arg0.method2396((byte) 42);
        if (var4 != 0) {
            arg0.field5262--;
            this.field9095 = new class472();
            this.field9095.method2818(arg0);
            this.field9109 = new class472();
            this.field9109.method2818(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2354((byte) -116);
            if (var6 == 0) {
                break;
            }
            this.field9100[var5] = var6;
            this.field9104[var5] = arg0.method2373(0);
            this.field9094[var5] = arg0.method2354((byte) -119);
        }
        this.field9107 = arg0.method2354((byte) 44);
        this.field9106 = arg0.method2354((byte) 54);
        this.field9097 = arg0.method2390((byte) 119);
        this.field9101 = arg0.method2390((byte) 35);
        this.field9112 = new class609();
        this.field9103 = new class472();
        this.field9112.method3454(arg0, this.field9103);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "()V", line = 446)
    public static void method3727() {
        field9096 = null;
        field9113 = null;
        field9110 = null;
        field9118 = null;
        field9115 = null;
        field9116 = null;
        field9117 = null;
        field9114 = null;
    }
}
