import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class434 {

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
    private int[] field6319 = new int[5];

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "[I")
    private int[] field6321 = new int[5];

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    private int field6325 = 100;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public int field6326 = 500;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public int field6323 = 0;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "[I")
    private int[] field6333 = new int[5];

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    private int field6328 = 0;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[I")
    private static int[] field6317 = new int[32768];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "[I")
    private static int[] field6315;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[I")
    private static int[] field6320;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "[I")
    private static int[] field6329;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "[I")
    private static int[] field6330;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "[I")
    private static int[] field6336;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "[I")
    private static int[] field6337;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "[I")
    private static int[] field6335;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lbv;")
    private class199 field6314;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lbv;")
    private class199 field6316;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lbv;")
    private class199 field6322;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lbv;")
    private class199 field6324;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Lbv;")
    private class199 field6327;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Lbv;")
    private class199 field6331;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "Lbv;")
    private class199 field6332;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Lbv;")
    private class199 field6334;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "Lbv;")
    private class199 field6338;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lkm;")
    private class235 field6318;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[I")
    public final int[] method2589(int arg0, int arg1) {
        class416.method2490(field6320, 0, arg0);
        if (arg1 < 10) {
            return field6320;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6316.method1231();
        this.field6324.method1231();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6334 != null) {
            this.field6334.method1231();
            this.field6314.method1231();
            var5 = (int) ((double) (this.field6334.field2846 - this.field6334.field2844) * 32.768D / var3);
            var6 = (int) ((double) this.field6334.field2844 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6332 != null) {
            this.field6332.method1231();
            this.field6322.method1231();
            var8 = (int) ((double) (this.field6332.field2846 - this.field6332.field2844) * 32.768D / var3);
            var9 = (int) ((double) this.field6332.field2844 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6319[var11] != 0) {
                field6330[var11] = 0;
                field6329[var11] = (int) ((double) this.field6321[var11] * var3);
                field6336[var11] = (this.field6319[var11] << 14) / 100;
                field6335[var11] = (int) ((double) (this.field6316.field2846 - this.field6316.field2844) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6333[var11]) / var3);
                field6337[var11] = (int) ((double) this.field6316.field2844 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6316.method1229(arg0);
            int var40 = this.field6324.method1229(arg0);
            if (this.field6334 != null) {
                int var41 = this.field6334.method1229(arg0);
                int var42 = this.field6314.method1229(arg0);
                var39 += this.method2592(var7, var42, this.field6334.field2848) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6332 != null) {
                int var43 = this.field6332.method1229(arg0);
                int var44 = this.field6322.method1229(arg0);
                var40 = var40 * ((this.method2592(var10, var44, this.field6332.field2848) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6319[var45] != 0) {
                    int var46 = field6329[var45] + var12;
                    if (var46 < arg0) {
                        field6320[var46] += this.method2592(field6330[var45], field6336[var45] * var40 >> 15, this.field6316.field2848);
                        field6330[var45] += (field6335[var45] * var39 >> 16) + field6337[var45];
                    }
                }
            }
        }
        if (this.field6327 != null) {
            this.field6327.method1231();
            this.field6331.method1231();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6327.method1229(arg0);
                int var18 = this.field6331.method1229(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6327.field2846 - this.field6327.field2844) * var17 >> 8) + this.field6327.field2844;
                } else {
                    var19 = ((this.field6327.field2846 - this.field6327.field2844) * var18 >> 8) + this.field6327.field2844;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6320[var16] = 0;
                }
            }
        }
        if (this.field6328 > 0 && this.field6325 > 0) {
            int var20 = (int) ((double) this.field6328 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6320[var21] += field6320[var21 - var20] * this.field6325 / 100;
            }
        }
        if (this.field6318.field3257[0] > 0 || this.field6318.field3257[1] > 0) {
            this.field6338.method1231();
            int var22 = this.field6338.method1229(arg0 + 1);
            int var23 = this.field6318.method1370(0, (float) var22 / 65536.0F);
            int var24 = this.field6318.method1370(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6320[var23 + var25] * (long) class235.field3251 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6320[var23 + var25 - var36 - 1] * (long) class235.field3256[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6320[var25 - var37 - 1] * (long) class235.field3256[1][var37] >> 16);
                    }
                    field6320[var25] = var35;
                    var22 = this.field6338.method1229(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6320[var23 + var25] * (long) class235.field3251 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6320[var23 + var25 - var33 - 1] * (long) class235.field3256[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6320[var25 - var34 - 1] * (long) class235.field3256[1][var34] >> 16);
                        }
                        field6320[var25] = var32;
                        var22 = this.field6338.method1229(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6320[var23 + var25 - var29 - 1] * (long) class235.field3256[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6320[var25 - var30 - 1] * (long) class235.field3256[1][var30] >> 16);
                            }
                            field6320[var25] = var28;
                            this.field6338.method1229(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6318.method1370(0, (float) var22 / 65536.0F);
                    var24 = this.field6318.method1370(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6320[var38] < -32768) {
                field6320[var38] = -32768;
            }
            if (field6320[var38] > 32767) {
                field6320[var38] = 32767;
            }
        }
        return field6320;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
    public static void method2590() {
        field6320 = null;
        field6317 = null;
        field6315 = null;
        field6330 = null;
        field6329 = null;
        field6336 = null;
        field6335 = null;
        field6337 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Llh;)V")
    public final void method2591(class365 arg0) {
        this.field6316 = new class199();
        this.field6316.method1232(arg0);
        this.field6324 = new class199();
        this.field6324.method1232(arg0);
        int var2 = arg0.method2099(255);
        if (var2 != 0) {
            arg0.field5069--;
            this.field6334 = new class199();
            this.field6334.method1232(arg0);
            this.field6314 = new class199();
            this.field6314.method1232(arg0);
        }
        int var3 = arg0.method2099(255);
        if (var3 != 0) {
            arg0.field5069--;
            this.field6332 = new class199();
            this.field6332.method1232(arg0);
            this.field6322 = new class199();
            this.field6322.method1232(arg0);
        }
        int var4 = arg0.method2099(255);
        if (var4 != 0) {
            arg0.field5069--;
            this.field6327 = new class199();
            this.field6327.method1232(arg0);
            this.field6331 = new class199();
            this.field6331.method1232(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2065(false);
            if (var6 == 0) {
                break;
            }
            this.field6319[var5] = var6;
            this.field6333[var5] = arg0.method2100(117);
            this.field6321[var5] = arg0.method2065(false);
        }
        this.field6328 = arg0.method2065(false);
        this.field6325 = arg0.method2065(false);
        this.field6326 = arg0.method2062((byte) 14);
        this.field6323 = arg0.method2062((byte) 14);
        this.field6318 = new class235();
        this.field6338 = new class199();
        this.field6318.method1369(arg0, this.field6338);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
    private final int method2592(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6315[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6317[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6317[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6315 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6315[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6320 = new int[220500];
        field6329 = new int[5];
        field6330 = new int[5];
        field6336 = new int[5];
        field6337 = new int[5];
        field6335 = new int[5];
    }
}
