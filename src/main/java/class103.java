import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class103 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public int field2494 = 0;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[I")
    private int[] field2500 = new int[5];

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[I")
    private int[] field2496 = new int[5];

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
    private int[] field2495 = new int[5];

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    private int field2498 = 0;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    private int field2493 = 100;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public int field2507 = 500;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
    private static int[] field2505 = new int[32768];

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "[I")
    private static int[] field2506;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "[I")
    private static int[] field2512;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "[I")
    private static int[] field2514;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "[I")
    private static int[] field2513;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "[I")
    private static int[] field2515;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "[I")
    private static int[] field2516;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "[I")
    private static int[] field2517;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lwc;")
    private class147 field2497;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lwc;")
    private class147 field2499;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lwc;")
    private class147 field2502;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Lwc;")
    private class147 field2503;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Lwc;")
    private class147 field2504;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Lwc;")
    private class147 field2508;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lwc;")
    private class147 field2509;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lwc;")
    private class147 field2510;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lwc;")
    private class147 field2511;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lea;")
    private class29 field2501;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I")
    private final int method876(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2506[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2505[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lib;)V")
    public final void method877(class57 arg0) {
        this.field2497 = new class147();
        this.field2497.method1199(arg0);
        this.field2499 = new class147();
        this.field2499.method1199(arg0);
        int var2 = arg0.method510(-115);
        if (var2 != 0) {
            arg0.field1477--;
            this.field2503 = new class147();
            this.field2503.method1199(arg0);
            this.field2509 = new class147();
            this.field2509.method1199(arg0);
        }
        int var3 = arg0.method510(-115);
        if (var3 != 0) {
            arg0.field1477--;
            this.field2510 = new class147();
            this.field2510.method1199(arg0);
            this.field2508 = new class147();
            this.field2508.method1199(arg0);
        }
        int var4 = arg0.method510(-124);
        if (var4 != 0) {
            arg0.field1477--;
            this.field2511 = new class147();
            this.field2511.method1199(arg0);
            this.field2502 = new class147();
            this.field2502.method1199(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method470((byte) -88);
            if (var6 == 0) {
                break;
            }
            this.field2495[var5] = var6;
            this.field2496[var5] = arg0.method499(-11093);
            this.field2500[var5] = arg0.method470((byte) -104);
        }
        this.field2498 = arg0.method470((byte) -126);
        this.field2493 = arg0.method470((byte) -101);
        this.field2507 = arg0.method506(-1);
        this.field2494 = arg0.method506(-1);
        this.field2501 = new class29();
        this.field2504 = new class147();
        this.field2501.method260(arg0, this.field2504);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
    public static void method878() {
        field2512 = null;
        field2505 = null;
        field2506 = null;
        field2514 = null;
        field2513 = null;
        field2516 = null;
        field2517 = null;
        field2515 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[I")
    public final int[] method879(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field2512[var3] = 0;
        }
        if (arg1 < 10) {
            return field2512;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2497.method1196();
        this.field2499.method1196();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field2503 != null) {
            this.field2503.method1196();
            this.field2509.method1196();
            var6 = (int) ((double) (this.field2503.field3643 - this.field2503.field3641) * 32.768D / var4);
            var7 = (int) ((double) this.field2503.field3641 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field2510 != null) {
            this.field2510.method1196();
            this.field2508.method1196();
            var9 = (int) ((double) (this.field2510.field3643 - this.field2510.field3641) * 32.768D / var4);
            var10 = (int) ((double) this.field2510.field3641 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field2495[var12] != 0) {
                field2514[var12] = 0;
                field2513[var12] = (int) ((double) this.field2500[var12] * var4);
                field2516[var12] = (this.field2495[var12] << 14) / 100;
                field2517[var12] = (int) ((double) (this.field2497.field3643 - this.field2497.field3641) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2496[var12]) / var4);
                field2515[var12] = (int) ((double) this.field2497.field3641 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field2497.method1198(arg0);
            int var41 = this.field2499.method1198(arg0);
            if (this.field2503 != null) {
                int var42 = this.field2503.method1198(arg0);
                int var43 = this.field2509.method1198(arg0);
                var40 += this.method876(var8, var43, this.field2503.field3642) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field2510 != null) {
                int var44 = this.field2510.method1198(arg0);
                int var45 = this.field2508.method1198(arg0);
                var41 = var41 * ((this.method876(var11, var45, this.field2510.field3642) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field2495[var46] != 0) {
                    int var47 = field2513[var46] + var13;
                    if (var47 < arg0) {
                        field2512[var47] += this.method876(field2514[var46], field2516[var46] * var41 >> 15, this.field2497.field3642);
                        field2514[var46] += (field2517[var46] * var40 >> 16) + field2515[var46];
                    }
                }
            }
        }
        if (this.field2511 != null) {
            this.field2511.method1196();
            this.field2502.method1196();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field2511.method1198(arg0);
                int var19 = this.field2502.method1198(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field2511.field3643 - this.field2511.field3641) * var18 >> 8) + this.field2511.field3641;
                } else {
                    var20 = ((this.field2511.field3643 - this.field2511.field3641) * var19 >> 8) + this.field2511.field3641;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field2512[var17] = 0;
                }
            }
        }
        if (this.field2498 > 0 && this.field2493 > 0) {
            int var21 = (int) ((double) this.field2498 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field2512[var22] += field2512[var22 - var21] * this.field2493 / 100;
            }
        }
        if (this.field2501.field694[0] > 0 || this.field2501.field694[1] > 0) {
            this.field2504.method1196();
            int var23 = this.field2504.method1198(arg0 + 1);
            int var24 = this.field2501.method261(0, (float) var23 / 65536.0F);
            int var25 = this.field2501.method261(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field2512[var24 + var26] * (long) class29.field693 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field2512[var24 + var26 - var37 - 1] * (long) class29.field698[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field2512[var26 - var38 - 1] * (long) class29.field698[1][var38] >> 16);
                    }
                    field2512[var26] = var36;
                    var23 = this.field2504.method1198(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field2512[var24 + var26] * (long) class29.field693 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field2512[var24 + var26 - var34 - 1] * (long) class29.field698[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field2512[var26 - var35 - 1] * (long) class29.field698[1][var35] >> 16);
                        }
                        field2512[var26] = var33;
                        var23 = this.field2504.method1198(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field2512[var24 + var26 - var30 - 1] * (long) class29.field698[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field2512[var26 - var31 - 1] * (long) class29.field698[1][var31] >> 16);
                            }
                            field2512[var26] = var29;
                            this.field2504.method1198(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field2501.method261(0, (float) var23 / 65536.0F);
                    var25 = this.field2501.method261(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field2512[var39] < -32768) {
                field2512[var39] = -32768;
            }
            if (field2512[var39] > 32767) {
                field2512[var39] = 32767;
            }
        }
        return field2512;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2505[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2506 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2506[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2512 = new int[220500];
        field2514 = new int[5];
        field2513 = new int[5];
        field2515 = new int[5];
        field2516 = new int[5];
        field2517 = new int[5];
    }
}
