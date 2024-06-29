import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class30 {

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    private int field295 = 0;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
    private int[] field301 = new int[5];

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    private int field304 = 100;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public int field309 = 0;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "[I")
    private int[] field308 = new int[5];

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "[I")
    private int[] field302 = new int[5];

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public int field306 = 500;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
    private static int[] field297 = new int[32768];

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
    private static int[] field305;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "[I")
    private static int[] field300;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "[I")
    private static int[] field313;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "[I")
    private static int[] field314;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "[I")
    private static int[] field315;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "[I")
    private static int[] field316;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "[I")
    private static int[] field317;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Ltg;")
    private class156 field293;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lmi;")
    private class344 field294;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Lmi;")
    private class344 field296;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lmi;")
    private class344 field298;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lmi;")
    private class344 field299;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lmi;")
    private class344 field303;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lmi;")
    private class344 field307;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lmi;")
    private class344 field310;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "Lmi;")
    private class344 field311;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Lmi;")
    private class344 field312;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field297[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field305 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field305[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field300 = new int[220500];
        field313 = new int[5];
        field314 = new int[5];
        field315 = new int[5];
        field316 = new int[5];
        field317 = new int[5];
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method172(int arg0, int arg1) {
        class438.method2691(field300, 0, arg0);
        if (arg1 < 10) {
            return field300;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field299.method2000();
        this.field298.method2000();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field303 != null) {
            this.field303.method2000();
            this.field311.method2000();
            var5 = (int) ((double) (this.field303.field4601 - this.field303.field4605) * 32.768D / var3);
            var6 = (int) ((double) this.field303.field4605 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field307 != null) {
            this.field307.method2000();
            this.field296.method2000();
            var8 = (int) ((double) (this.field307.field4601 - this.field307.field4605) * 32.768D / var3);
            var9 = (int) ((double) this.field307.field4605 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field302[var11] != 0) {
                field313[var11] = 0;
                field317[var11] = (int) ((double) this.field301[var11] * var3);
                field316[var11] = (this.field302[var11] << 14) / 100;
                field315[var11] = (int) ((double) (this.field299.field4601 - this.field299.field4605) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field308[var11]) / var3);
                field314[var11] = (int) ((double) this.field299.field4605 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field299.method2001(arg0);
            int var40 = this.field298.method2001(arg0);
            if (this.field303 != null) {
                int var41 = this.field303.method2001(arg0);
                int var42 = this.field311.method2001(arg0);
                var39 += this.method174(var7, var42, this.field303.field4602) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field307 != null) {
                int var43 = this.field307.method2001(arg0);
                int var44 = this.field296.method2001(arg0);
                var40 = var40 * ((this.method174(var10, var44, this.field307.field4602) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field302[var45] != 0) {
                    int var46 = field317[var45] + var12;
                    if (var46 < arg0) {
                        field300[var46] += this.method174(field313[var45], field316[var45] * var40 >> 15, this.field299.field4602);
                        field313[var45] += (field315[var45] * var39 >> 16) + field314[var45];
                    }
                }
            }
        }
        if (this.field310 != null) {
            this.field310.method2000();
            this.field312.method2000();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field310.method2001(arg0);
                int var18 = this.field312.method2001(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field310.field4601 - this.field310.field4605) * var17 >> 8) + this.field310.field4605;
                } else {
                    var19 = ((this.field310.field4601 - this.field310.field4605) * var18 >> 8) + this.field310.field4605;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field300[var16] = 0;
                }
            }
        }
        if (this.field295 > 0 && this.field304 > 0) {
            int var20 = (int) ((double) this.field295 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field300[var21] += field300[var21 - var20] * this.field304 / 100;
            }
        }
        if (this.field293.field2044[0] > 0 || this.field293.field2044[1] > 0) {
            this.field294.method2000();
            int var22 = this.field294.method2001(arg0 + 1);
            int var23 = this.field293.method931(0, (float) var22 / 65536.0F);
            int var24 = this.field293.method931(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field300[var23 + var25] * (long) class156.field2042 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field300[var23 + var25 - var36 - 1] * (long) class156.field2045[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field300[var25 - var37 - 1] * (long) class156.field2045[1][var37] >> 16);
                    }
                    field300[var25] = var35;
                    var22 = this.field294.method2001(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field300[var23 + var25] * (long) class156.field2042 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field300[var23 + var25 - var33 - 1] * (long) class156.field2045[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field300[var25 - var34 - 1] * (long) class156.field2045[1][var34] >> 16);
                        }
                        field300[var25] = var32;
                        var22 = this.field294.method2001(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field300[var23 + var25 - var29 - 1] * (long) class156.field2045[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field300[var25 - var30 - 1] * (long) class156.field2045[1][var30] >> 16);
                            }
                            field300[var25] = var28;
                            this.field294.method2001(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field293.method931(0, (float) var22 / 65536.0F);
                    var24 = this.field293.method931(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field300[var38] < -32768) {
                field300[var38] = -32768;
            }
            if (field300[var38] > 32767) {
                field300[var38] = 32767;
            }
        }
        return field300;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V", line = 286)
    public static void method173() {
        field300 = null;
        field297 = null;
        field305 = null;
        field313 = null;
        field317 = null;
        field316 = null;
        field315 = null;
        field314 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I", line = 309)
    private final int method174(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field305[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field297[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lug;)V", line = 339)
    public final void method175(class396 arg0) {
        this.field299 = new class344();
        this.field299.method1998(arg0);
        this.field298 = new class344();
        this.field298.method1998(arg0);
        int var2 = arg0.method2388((byte) -123);
        if (var2 != 0) {
            arg0.field5729--;
            this.field303 = new class344();
            this.field303.method1998(arg0);
            this.field311 = new class344();
            this.field311.method1998(arg0);
        }
        int var3 = arg0.method2388((byte) -116);
        if (var3 != 0) {
            arg0.field5729--;
            this.field307 = new class344();
            this.field307.method1998(arg0);
            this.field296 = new class344();
            this.field296.method1998(arg0);
        }
        int var4 = arg0.method2388((byte) -118);
        if (var4 != 0) {
            arg0.field5729--;
            this.field310 = new class344();
            this.field310.method1998(arg0);
            this.field312 = new class344();
            this.field312.method1998(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2443(-116);
            if (var6 == 0) {
                break;
            }
            this.field302[var5] = var6;
            this.field308[var5] = arg0.method2389(-49152);
            this.field301[var5] = arg0.method2443(-128);
        }
        this.field295 = arg0.method2443(-95);
        this.field304 = arg0.method2443(-99);
        this.field306 = arg0.method2386(-23648);
        this.field309 = arg0.method2386(-23648);
        this.field293 = new class156();
        this.field294 = new class344();
        this.field293.method932(arg0, this.field294);
    }
}
