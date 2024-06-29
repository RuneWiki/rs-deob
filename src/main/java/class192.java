import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class192 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public int field3498 = 500;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[I")
    private int[] field3501 = new int[5];

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "[I")
    private int[] field3511 = new int[5];

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    private int field3513 = 100;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public int field3510 = 0;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "[I")
    private int[] field3514 = new int[5];

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    private int field3504 = 0;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "[I")
    private static int[] field3515 = new int[32768];

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[I")
    private static int[] field3500;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "[I")
    private static int[] field3507;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "[I")
    private static int[] field3516;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "[I")
    private static int[] field3517;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "[I")
    private static int[] field3520;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "[I")
    private static int[] field3519;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "[I")
    private static int[] field3518;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lpk;")
    private class100 field3508;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lag;")
    private class184 field3499;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lag;")
    private class184 field3502;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lag;")
    private class184 field3503;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lag;")
    private class184 field3505;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lag;")
    private class184 field3506;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lag;")
    private class184 field3509;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Lag;")
    private class184 field3512;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "Lag;")
    private class184 field3521;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "Lag;")
    private class184 field3522;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[I")
    public final int[] method1377(int arg0, int arg1) {
        class107.method771(field3507, 0, arg0);
        if (arg1 < 10) {
            return field3507;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3502.method1347();
        this.field3521.method1347();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3506 != null) {
            this.field3506.method1347();
            this.field3512.method1347();
            var5 = (int) ((double) (this.field3506.field3393 - this.field3506.field3391) * 32.768D / var3);
            var6 = (int) ((double) this.field3506.field3391 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3499 != null) {
            this.field3499.method1347();
            this.field3509.method1347();
            var8 = (int) ((double) (this.field3499.field3393 - this.field3499.field3391) * 32.768D / var3);
            var9 = (int) ((double) this.field3499.field3391 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3511[var11] != 0) {
                field3518[var11] = 0;
                field3520[var11] = (int) ((double) this.field3501[var11] * var3);
                field3519[var11] = (this.field3511[var11] << 14) / 100;
                field3516[var11] = (int) ((double) (this.field3502.field3393 - this.field3502.field3391) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3514[var11]) / var3);
                field3517[var11] = (int) ((double) this.field3502.field3391 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3502.method1346(arg0);
            int var40 = this.field3521.method1346(arg0);
            if (this.field3506 != null) {
                int var41 = this.field3506.method1346(arg0);
                int var42 = this.field3512.method1346(arg0);
                var39 += this.method1378(var7, var42, this.field3506.field3388) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3499 != null) {
                int var43 = this.field3499.method1346(arg0);
                int var44 = this.field3509.method1346(arg0);
                var40 = var40 * ((this.method1378(var10, var44, this.field3499.field3388) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3511[var45] != 0) {
                    int var46 = field3520[var45] + var12;
                    if (var46 < arg0) {
                        field3507[var46] += this.method1378(field3518[var45], field3519[var45] * var40 >> 15, this.field3502.field3388);
                        field3518[var45] += (field3516[var45] * var39 >> 16) + field3517[var45];
                    }
                }
            }
        }
        if (this.field3505 != null) {
            this.field3505.method1347();
            this.field3522.method1347();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3505.method1346(arg0);
                int var18 = this.field3522.method1346(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3505.field3393 - this.field3505.field3391) * var17 >> 8) + this.field3505.field3391;
                } else {
                    var19 = ((this.field3505.field3393 - this.field3505.field3391) * var18 >> 8) + this.field3505.field3391;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3507[var16] = 0;
                }
            }
        }
        if (this.field3504 > 0 && this.field3513 > 0) {
            int var20 = (int) ((double) this.field3504 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3507[var21] += field3507[var21 - var20] * this.field3513 / 100;
            }
        }
        if (this.field3508.field1744[0] > 0 || this.field3508.field1744[1] > 0) {
            this.field3503.method1347();
            int var22 = this.field3503.method1346(arg0 + 1);
            int var23 = this.field3508.method721(0, (float) var22 / 65536.0F);
            int var24 = this.field3508.method721(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3507[var23 + var25] * (long) class100.field1743 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3507[var23 + var25 - var36 - 1] * (long) class100.field1742[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3507[var25 - var37 - 1] * (long) class100.field1742[1][var37] >> 16);
                    }
                    field3507[var25] = var35;
                    var22 = this.field3503.method1346(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3507[var23 + var25] * (long) class100.field1743 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3507[var23 + var25 - var33 - 1] * (long) class100.field1742[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3507[var25 - var34 - 1] * (long) class100.field1742[1][var34] >> 16);
                        }
                        field3507[var25] = var32;
                        var22 = this.field3503.method1346(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3507[var23 + var25 - var29 - 1] * (long) class100.field1742[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3507[var25 - var30 - 1] * (long) class100.field1742[1][var30] >> 16);
                            }
                            field3507[var25] = var28;
                            this.field3503.method1346(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3508.method721(0, (float) var22 / 65536.0F);
                    var24 = this.field3508.method721(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3507[var38] < -32768) {
                field3507[var38] = -32768;
            }
            if (field3507[var38] > 32767) {
                field3507[var38] = 32767;
            }
        }
        return field3507;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I")
    private final int method1378(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3500[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3515[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
    public static void method1379() {
        field3507 = null;
        field3515 = null;
        field3500 = null;
        field3518 = null;
        field3520 = null;
        field3519 = null;
        field3516 = null;
        field3517 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lee;)V")
    public final void method1380(class280 arg0) {
        this.field3502 = new class184();
        this.field3502.method1344(arg0);
        this.field3521 = new class184();
        this.field3521.method1344(arg0);
        int var2 = arg0.method1907(16832);
        if (var2 != 0) {
            arg0.field5027--;
            this.field3506 = new class184();
            this.field3506.method1344(arg0);
            this.field3512 = new class184();
            this.field3512.method1344(arg0);
        }
        int var3 = arg0.method1907(16832);
        if (var3 != 0) {
            arg0.field5027--;
            this.field3499 = new class184();
            this.field3499.method1344(arg0);
            this.field3509 = new class184();
            this.field3509.method1344(arg0);
        }
        int var4 = arg0.method1907(16832);
        if (var4 != 0) {
            arg0.field5027--;
            this.field3505 = new class184();
            this.field3505.method1344(arg0);
            this.field3522 = new class184();
            this.field3522.method1344(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1924(8100);
            if (var6 == 0) {
                break;
            }
            this.field3511[var5] = var6;
            this.field3514[var5] = arg0.method1880(41);
            this.field3501[var5] = arg0.method1924(8100);
        }
        this.field3504 = arg0.method1924(8100);
        this.field3513 = arg0.method1924(8100);
        this.field3498 = arg0.method1891(-125);
        this.field3510 = arg0.method1891(-112);
        this.field3508 = new class100();
        this.field3503 = new class184();
        this.field3508.method722(arg0, this.field3503);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3515[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3500 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3500[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3507 = new int[220500];
        field3516 = new int[5];
        field3517 = new int[5];
        field3520 = new int[5];
        field3519 = new int[5];
        field3518 = new int[5];
    }
}
