import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class242 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
    private int[] field4368 = new int[5];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public int field4366 = 500;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    private int field4380 = 100;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
    private int[] field4372 = new int[5];

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "[I")
    private int[] field4382 = new int[5];

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    private int field4387 = 0;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public int field4378 = 0;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[I")
    private static int[] field4381 = new int[32768];

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[I")
    private static int[] field4379;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    private static int[] field4371;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "[I")
    private static int[] field4385;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[I")
    private static int[] field4384;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[I")
    private static int[] field4386;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "[I")
    private static int[] field4389;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "[I")
    private static int[] field4388;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lkd;")
    private class113 field4369;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Lkd;")
    private class113 field4370;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lkd;")
    private class113 field4373;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lkd;")
    private class113 field4374;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lkd;")
    private class113 field4375;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lkd;")
    private class113 field4376;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lkd;")
    private class113 field4377;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lkd;")
    private class113 field4383;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Lkd;")
    private class113 field4390;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lla;")
    private class121 field4367;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
    public static void method1533() {
        field4371 = null;
        field4381 = null;
        field4379 = null;
        field4384 = null;
        field4386 = null;
        field4388 = null;
        field4389 = null;
        field4385 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lnc;)V")
    public final void method1534(class145 arg0) {
        this.field4390 = new class113();
        this.field4390.method760(arg0);
        this.field4383 = new class113();
        this.field4383.method760(arg0);
        int var2 = arg0.method998(116);
        if (var2 != 0) {
            arg0.field2643--;
            this.field4373 = new class113();
            this.field4373.method760(arg0);
            this.field4374 = new class113();
            this.field4374.method760(arg0);
        }
        int var3 = arg0.method998(124);
        if (var3 != 0) {
            arg0.field2643--;
            this.field4376 = new class113();
            this.field4376.method760(arg0);
            this.field4375 = new class113();
            this.field4375.method760(arg0);
        }
        int var4 = arg0.method998(71);
        if (var4 != 0) {
            arg0.field2643--;
            this.field4369 = new class113();
            this.field4369.method760(arg0);
            this.field4370 = new class113();
            this.field4370.method760(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1003(-128);
            if (var6 == 0) {
                break;
            }
            this.field4368[var5] = var6;
            this.field4372[var5] = arg0.method1029((byte) -83);
            this.field4382[var5] = arg0.method1003(105);
        }
        this.field4387 = arg0.method1003(68);
        this.field4380 = arg0.method1003(116);
        this.field4366 = arg0.method1049((byte) 111);
        this.field4378 = arg0.method1049((byte) 119);
        this.field4367 = new class121();
        this.field4377 = new class113();
        this.field4367.method852(arg0, this.field4377);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I")
    private final int method1535(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4379[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4381[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I")
    public final int[] method1536(int arg0, int arg1) {
        class2.method7(field4371, 0, arg0);
        if (arg1 < 10) {
            return field4371;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4390.method761();
        this.field4383.method761();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4373 != null) {
            this.field4373.method761();
            this.field4374.method761();
            var5 = (int) ((double) (this.field4373.field2116 - this.field4373.field2111) * 32.768D / var3);
            var6 = (int) ((double) this.field4373.field2111 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4376 != null) {
            this.field4376.method761();
            this.field4375.method761();
            var8 = (int) ((double) (this.field4376.field2116 - this.field4376.field2111) * 32.768D / var3);
            var9 = (int) ((double) this.field4376.field2111 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4368[var11] != 0) {
                field4384[var11] = 0;
                field4386[var11] = (int) ((double) this.field4382[var11] * var3);
                field4388[var11] = (this.field4368[var11] << 14) / 100;
                field4389[var11] = (int) ((double) (this.field4390.field2116 - this.field4390.field2111) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4372[var11]) / var3);
                field4385[var11] = (int) ((double) this.field4390.field2111 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4390.method758(arg0);
            int var40 = this.field4383.method758(arg0);
            if (this.field4373 != null) {
                int var41 = this.field4373.method758(arg0);
                int var42 = this.field4374.method758(arg0);
                var39 += this.method1535(var7, var42, this.field4373.field2113) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4376 != null) {
                int var43 = this.field4376.method758(arg0);
                int var44 = this.field4375.method758(arg0);
                var40 = var40 * ((this.method1535(var10, var44, this.field4376.field2113) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4368[var45] != 0) {
                    int var46 = field4386[var45] + var12;
                    if (var46 < arg0) {
                        field4371[var46] += this.method1535(field4384[var45], field4388[var45] * var40 >> 15, this.field4390.field2113);
                        field4384[var45] += (field4389[var45] * var39 >> 16) + field4385[var45];
                    }
                }
            }
        }
        if (this.field4369 != null) {
            this.field4369.method761();
            this.field4370.method761();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4369.method758(arg0);
                int var18 = this.field4370.method758(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4369.field2116 - this.field4369.field2111) * var17 >> 8) + this.field4369.field2111;
                } else {
                    var19 = ((this.field4369.field2116 - this.field4369.field2111) * var18 >> 8) + this.field4369.field2111;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4371[var16] = 0;
                }
            }
        }
        if (this.field4387 > 0 && this.field4380 > 0) {
            int var20 = (int) ((double) this.field4387 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4371[var21] += field4371[var21 - var20] * this.field4380 / 100;
            }
        }
        if (this.field4367.field2279[0] > 0 || this.field4367.field2279[1] > 0) {
            this.field4377.method761();
            int var22 = this.field4377.method758(arg0 + 1);
            int var23 = this.field4367.method847(0, (float) var22 / 65536.0F);
            int var24 = this.field4367.method847(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4371[var23 + var25] * (long) class121.field2285 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4371[var23 + var25 - var36 - 1] * (long) class121.field2281[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4371[var25 - var37 - 1] * (long) class121.field2281[1][var37] >> 16);
                    }
                    field4371[var25] = var35;
                    var22 = this.field4377.method758(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4371[var23 + var25] * (long) class121.field2285 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4371[var23 + var25 - var33 - 1] * (long) class121.field2281[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4371[var25 - var34 - 1] * (long) class121.field2281[1][var34] >> 16);
                        }
                        field4371[var25] = var32;
                        var22 = this.field4377.method758(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4371[var23 + var25 - var29 - 1] * (long) class121.field2281[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4371[var25 - var30 - 1] * (long) class121.field2281[1][var30] >> 16);
                            }
                            field4371[var25] = var28;
                            this.field4377.method758(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4367.method847(0, (float) var22 / 65536.0F);
                    var24 = this.field4367.method847(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4371[var38] < -32768) {
                field4371[var38] = -32768;
            }
            if (field4371[var38] > 32767) {
                field4371[var38] = 32767;
            }
        }
        return field4371;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4381[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4379 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4379[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4371 = new int[220500];
        field4385 = new int[5];
        field4384 = new int[5];
        field4386 = new int[5];
        field4389 = new int[5];
        field4388 = new int[5];
    }
}
