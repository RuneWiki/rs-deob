import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class270 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
    private int[] field4321 = new int[5];

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
    private int[] field4319 = new int[5];

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field4331 = 500;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    private int field4320 = 0;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[I")
    private int[] field4336 = new int[5];

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field4333 = 0;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    private int field4334 = 100;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "[I")
    private static int[] field4330 = new int[32768];

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[I")
    private static int[] field4323;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "[I")
    private static int[] field4324;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "[I")
    private static int[] field4337;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "[I")
    private static int[] field4338;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
    private static int[] field4339;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "[I")
    private static int[] field4341;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "[I")
    private static int[] field4340;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lqa;")
    private class153 field4322;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lag;")
    private class188 field4317;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lag;")
    private class188 field4318;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lag;")
    private class188 field4325;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lag;")
    private class188 field4326;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lag;")
    private class188 field4327;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lag;")
    private class188 field4328;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lag;")
    private class188 field4329;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lag;")
    private class188 field4332;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lag;")
    private class188 field4335;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
    public static void method1818() {
        field4324 = null;
        field4330 = null;
        field4323 = null;
        field4338 = null;
        field4337 = null;
        field4340 = null;
        field4339 = null;
        field4341 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)I")
    private final int method1819(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4323[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4330[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
    public final int[] method1820(int arg0, int arg1) {
        class175.method1186(field4324, 0, arg0);
        if (arg1 < 10) {
            return field4324;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4325.method1270();
        this.field4327.method1270();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4329 != null) {
            this.field4329.method1270();
            this.field4317.method1270();
            var5 = (int) ((double) (this.field4329.field2912 - this.field4329.field2909) * 32.768D / var3);
            var6 = (int) ((double) this.field4329.field2909 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4328 != null) {
            this.field4328.method1270();
            this.field4326.method1270();
            var8 = (int) ((double) (this.field4328.field2912 - this.field4328.field2909) * 32.768D / var3);
            var9 = (int) ((double) this.field4328.field2909 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4321[var11] != 0) {
                field4338[var11] = 0;
                field4337[var11] = (int) ((double) this.field4336[var11] * var3);
                field4340[var11] = (this.field4321[var11] << 14) / 100;
                field4339[var11] = (int) ((double) (this.field4325.field2912 - this.field4325.field2909) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4319[var11]) / var3);
                field4341[var11] = (int) ((double) this.field4325.field2909 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4325.method1269(arg0);
            int var40 = this.field4327.method1269(arg0);
            if (this.field4329 != null) {
                int var41 = this.field4329.method1269(arg0);
                int var42 = this.field4317.method1269(arg0);
                var39 += this.method1819(var7, var42, this.field4329.field2908) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4328 != null) {
                int var43 = this.field4328.method1269(arg0);
                int var44 = this.field4326.method1269(arg0);
                var40 = var40 * ((this.method1819(var10, var44, this.field4328.field2908) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4321[var45] != 0) {
                    int var46 = field4337[var45] + var12;
                    if (var46 < arg0) {
                        field4324[var46] += this.method1819(field4338[var45], field4340[var45] * var40 >> 15, this.field4325.field2908);
                        field4338[var45] += (field4339[var45] * var39 >> 16) + field4341[var45];
                    }
                }
            }
        }
        if (this.field4335 != null) {
            this.field4335.method1270();
            this.field4332.method1270();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4335.method1269(arg0);
                int var18 = this.field4332.method1269(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4335.field2912 - this.field4335.field2909) * var17 >> 8) + this.field4335.field2909;
                } else {
                    var19 = ((this.field4335.field2912 - this.field4335.field2909) * var18 >> 8) + this.field4335.field2909;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4324[var16] = 0;
                }
            }
        }
        if (this.field4320 > 0 && this.field4334 > 0) {
            int var20 = (int) ((double) this.field4320 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4324[var21] += field4324[var21 - var20] * this.field4334 / 100;
            }
        }
        if (this.field4322.field2394[0] > 0 || this.field4322.field2394[1] > 0) {
            this.field4318.method1270();
            int var22 = this.field4318.method1269(arg0 + 1);
            int var23 = this.field4322.method1030(0, (float) var22 / 65536.0F);
            int var24 = this.field4322.method1030(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4324[var23 + var25] * (long) class153.field2396 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4324[var23 + var25 - var36 - 1] * (long) class153.field2399[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4324[var25 - var37 - 1] * (long) class153.field2399[1][var37] >> 16);
                    }
                    field4324[var25] = var35;
                    var22 = this.field4318.method1269(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4324[var23 + var25] * (long) class153.field2396 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4324[var23 + var25 - var33 - 1] * (long) class153.field2399[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4324[var25 - var34 - 1] * (long) class153.field2399[1][var34] >> 16);
                        }
                        field4324[var25] = var32;
                        var22 = this.field4318.method1269(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4324[var23 + var25 - var29 - 1] * (long) class153.field2399[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4324[var25 - var30 - 1] * (long) class153.field2399[1][var30] >> 16);
                            }
                            field4324[var25] = var28;
                            this.field4318.method1269(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4322.method1030(0, (float) var22 / 65536.0F);
                    var24 = this.field4322.method1030(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4324[var38] < -32768) {
                field4324[var38] = -32768;
            }
            if (field4324[var38] > 32767) {
                field4324[var38] = 32767;
            }
        }
        return field4324;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lai;)V")
    public final void method1821(class88 arg0) {
        this.field4325 = new class188();
        this.field4325.method1268(arg0);
        this.field4327 = new class188();
        this.field4327.method1268(arg0);
        int var2 = arg0.method633(119);
        if (var2 != 0) {
            arg0.field1535--;
            this.field4329 = new class188();
            this.field4329.method1268(arg0);
            this.field4317 = new class188();
            this.field4317.method1268(arg0);
        }
        int var3 = arg0.method633(71);
        if (var3 != 0) {
            arg0.field1535--;
            this.field4328 = new class188();
            this.field4328.method1268(arg0);
            this.field4326 = new class188();
            this.field4326.method1268(arg0);
        }
        int var4 = arg0.method633(100);
        if (var4 != 0) {
            arg0.field1535--;
            this.field4335 = new class188();
            this.field4335.method1268(arg0);
            this.field4332 = new class188();
            this.field4332.method1268(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method666(false);
            if (var6 == 0) {
                break;
            }
            this.field4321[var5] = var6;
            this.field4319[var5] = arg0.method667(1210551352);
            this.field4336[var5] = arg0.method666(false);
        }
        this.field4320 = arg0.method666(false);
        this.field4334 = arg0.method666(false);
        this.field4331 = arg0.method645(11596);
        this.field4333 = arg0.method645(11596);
        this.field4322 = new class153();
        this.field4318 = new class188();
        this.field4322.method1029(arg0, this.field4318);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4330[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4323 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4323[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4324 = new int[220500];
        field4337 = new int[5];
        field4338 = new int[5];
        field4339 = new int[5];
        field4341 = new int[5];
        field4340 = new int[5];
    }
}
