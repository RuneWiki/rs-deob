import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class171 {

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    private int field3467 = 0;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    private int field3476 = 100;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[I")
    private int[] field3471 = new int[5];

    @OriginalMember(owner = "client!se", name = "l", descriptor = "[I")
    private int[] field3473 = new int[5];

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public int field3477 = 0;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public int field3478 = 500;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "[I")
    private int[] field3469 = new int[5];

    @OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
    private static int[] field3481 = new int[32768];

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[I")
    private static int[] field3480;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "[I")
    private static int[] field3468;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[I")
    private static int[] field3482;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "[I")
    private static int[] field3484;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
    private static int[] field3485;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "[I")
    private static int[] field3483;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "[I")
    private static int[] field3486;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lsc;")
    private class169 field3462;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lsc;")
    private class169 field3463;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lsc;")
    private class169 field3464;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lsc;")
    private class169 field3465;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lsc;")
    private class169 field3466;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lsc;")
    private class169 field3470;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lsc;")
    private class169 field3474;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lsc;")
    private class169 field3475;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lsc;")
    private class169 field3479;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Ljh;")
    private class94 field3472;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
    public static void method1150() {
        field3468 = null;
        field3481 = null;
        field3480 = null;
        field3484 = null;
        field3482 = null;
        field3485 = null;
        field3483 = null;
        field3486 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lfa;)V")
    public final void method1151(class52 arg0) {
        this.field3465 = new class169();
        this.field3465.method1143(arg0);
        this.field3470 = new class169();
        this.field3470.method1143(arg0);
        int var2 = arg0.method344(255);
        if (var2 != 0) {
            arg0.field1033--;
            this.field3464 = new class169();
            this.field3464.method1143(arg0);
            this.field3462 = new class169();
            this.field3462.method1143(arg0);
        }
        int var3 = arg0.method344(255);
        if (var3 != 0) {
            arg0.field1033--;
            this.field3479 = new class169();
            this.field3479.method1143(arg0);
            this.field3466 = new class169();
            this.field3466.method1143(arg0);
        }
        int var4 = arg0.method344(255);
        if (var4 != 0) {
            arg0.field1033--;
            this.field3475 = new class169();
            this.field3475.method1143(arg0);
            this.field3474 = new class169();
            this.field3474.method1143(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method354((byte) -99);
            if (var6 == 0) {
                break;
            }
            this.field3473[var5] = var6;
            this.field3469[var5] = arg0.method357(-129);
            this.field3471[var5] = arg0.method354((byte) -114);
        }
        this.field3467 = arg0.method354((byte) 49);
        this.field3476 = arg0.method354((byte) 119);
        this.field3478 = arg0.method390((byte) 91);
        this.field3477 = arg0.method390((byte) 101);
        this.field3472 = new class94();
        this.field3463 = new class169();
        this.field3472.method659(arg0, this.field3463);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)I")
    private final int method1152(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3480[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3481[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I")
    public final int[] method1153(int arg0, int arg1) {
        class123.method829(field3468, 0, arg0);
        if (arg1 < 10) {
            return field3468;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3465.method1145();
        this.field3470.method1145();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3464 != null) {
            this.field3464.method1145();
            this.field3462.method1145();
            var5 = (int) ((double) (this.field3464.field3438 - this.field3464.field3436) * 32.768D / var3);
            var6 = (int) ((double) this.field3464.field3436 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3479 != null) {
            this.field3479.method1145();
            this.field3466.method1145();
            var8 = (int) ((double) (this.field3479.field3438 - this.field3479.field3436) * 32.768D / var3);
            var9 = (int) ((double) this.field3479.field3436 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3473[var11] != 0) {
                field3484[var11] = 0;
                field3482[var11] = (int) ((double) this.field3471[var11] * var3);
                field3485[var11] = (this.field3473[var11] << 14) / 100;
                field3483[var11] = (int) ((double) (this.field3465.field3438 - this.field3465.field3436) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3469[var11]) / var3);
                field3486[var11] = (int) ((double) this.field3465.field3436 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3465.method1142(arg0);
            int var40 = this.field3470.method1142(arg0);
            if (this.field3464 != null) {
                int var41 = this.field3464.method1142(arg0);
                int var42 = this.field3462.method1142(arg0);
                var39 += this.method1152(var7, var42, this.field3464.field3437) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3479 != null) {
                int var43 = this.field3479.method1142(arg0);
                int var44 = this.field3466.method1142(arg0);
                var40 = var40 * ((this.method1152(var10, var44, this.field3479.field3437) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3473[var45] != 0) {
                    int var46 = field3482[var45] + var12;
                    if (var46 < arg0) {
                        field3468[var46] += this.method1152(field3484[var45], field3485[var45] * var40 >> 15, this.field3465.field3437);
                        field3484[var45] += (field3483[var45] * var39 >> 16) + field3486[var45];
                    }
                }
            }
        }
        if (this.field3475 != null) {
            this.field3475.method1145();
            this.field3474.method1145();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3475.method1142(arg0);
                int var18 = this.field3474.method1142(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3475.field3438 - this.field3475.field3436) * var17 >> 8) + this.field3475.field3436;
                } else {
                    var19 = ((this.field3475.field3438 - this.field3475.field3436) * var18 >> 8) + this.field3475.field3436;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3468[var16] = 0;
                }
            }
        }
        if (this.field3467 > 0 && this.field3476 > 0) {
            int var20 = (int) ((double) this.field3467 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3468[var21] += field3468[var21 - var20] * this.field3476 / 100;
            }
        }
        if (this.field3472.field2027[0] > 0 || this.field3472.field2027[1] > 0) {
            this.field3463.method1145();
            int var22 = this.field3463.method1142(arg0 + 1);
            int var23 = this.field3472.method658(0, (float) var22 / 65536.0F);
            int var24 = this.field3472.method658(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3468[var23 + var25] * (long) class94.field2030 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3468[var23 + var25 - var36 - 1] * (long) class94.field2025[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3468[var25 - var37 - 1] * (long) class94.field2025[1][var37] >> 16);
                    }
                    field3468[var25] = var35;
                    var22 = this.field3463.method1142(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3468[var23 + var25] * (long) class94.field2030 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3468[var23 + var25 - var33 - 1] * (long) class94.field2025[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3468[var25 - var34 - 1] * (long) class94.field2025[1][var34] >> 16);
                        }
                        field3468[var25] = var32;
                        var22 = this.field3463.method1142(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3468[var23 + var25 - var29 - 1] * (long) class94.field2025[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3468[var25 - var30 - 1] * (long) class94.field2025[1][var30] >> 16);
                            }
                            field3468[var25] = var28;
                            this.field3463.method1142(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3472.method658(0, (float) var22 / 65536.0F);
                    var24 = this.field3472.method658(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3468[var38] < -32768) {
                field3468[var38] = -32768;
            }
            if (field3468[var38] > 32767) {
                field3468[var38] = 32767;
            }
        }
        return field3468;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3481[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3480 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3480[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3468 = new int[220500];
        field3482 = new int[5];
        field3484 = new int[5];
        field3485 = new int[5];
        field3483 = new int[5];
        field3486 = new int[5];
    }
}
