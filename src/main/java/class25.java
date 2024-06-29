import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    private int field431 = 0;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "[I")
    private int[] field436 = new int[5];

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public int field424 = 500;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "[I")
    private int[] field437 = new int[5];

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "[I")
    private int[] field434 = new int[5];

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public int field445 = 0;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    private int field432 = 100;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
    private static int[] field428 = new int[32768];

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[I")
    private static int[] field429;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "[I")
    private static int[] field440;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "[I")
    private static int[] field442;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "[I")
    private static int[] field443;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "[I")
    private static int[] field444;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
    private static int[] field441;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "[I")
    private static int[] field446;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Lao;")
    private class188 field422;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lao;")
    private class188 field423;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Lao;")
    private class188 field425;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Lao;")
    private class188 field426;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lao;")
    private class188 field427;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Lao;")
    private class188 field430;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Lao;")
    private class188 field433;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lao;")
    private class188 field435;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Lao;")
    private class188 field439;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Lju;")
    private class81 field438;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field428[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field429 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field429[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field440 = new int[220500];
        field442 = new int[5];
        field443 = new int[5];
        field444 = new int[5];
        field441 = new int[5];
        field446 = new int[5];
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[I", line = 12)
    public final int[] method219(int arg0, int arg1) {
        class254.method1531(field440, 0, arg0);
        if (arg1 < 10) {
            return field440;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field425.method1211();
        this.field426.method1211();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field427 != null) {
            this.field427.method1211();
            this.field423.method1211();
            var5 = (int) ((double) (this.field427.field2643 - this.field427.field2644) * 32.768D / var3);
            var6 = (int) ((double) this.field427.field2644 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field433 != null) {
            this.field433.method1211();
            this.field430.method1211();
            var8 = (int) ((double) (this.field433.field2643 - this.field433.field2644) * 32.768D / var3);
            var9 = (int) ((double) this.field433.field2644 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field434[var11] != 0) {
                field442[var11] = 0;
                field444[var11] = (int) ((double) this.field437[var11] * var3);
                field446[var11] = (this.field434[var11] << 14) / 100;
                field441[var11] = (int) ((double) (this.field425.field2643 - this.field425.field2644) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field436[var11]) / var3);
                field443[var11] = (int) ((double) this.field425.field2644 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field425.method1209(arg0);
            int var40 = this.field426.method1209(arg0);
            if (this.field427 != null) {
                int var41 = this.field427.method1209(arg0);
                int var42 = this.field423.method1209(arg0);
                var39 += this.method221(var7, var42, this.field427.field2642) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field433 != null) {
                int var43 = this.field433.method1209(arg0);
                int var44 = this.field430.method1209(arg0);
                var40 = var40 * ((this.method221(var10, var44, this.field433.field2642) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field434[var45] != 0) {
                    int var46 = field444[var45] + var12;
                    if (var46 < arg0) {
                        field440[var46] += this.method221(field442[var45], field446[var45] * var40 >> 15, this.field425.field2642);
                        field442[var45] += (field441[var45] * var39 >> 16) + field443[var45];
                    }
                }
            }
        }
        if (this.field422 != null) {
            this.field422.method1211();
            this.field435.method1211();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field422.method1209(arg0);
                int var18 = this.field435.method1209(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field422.field2643 - this.field422.field2644) * var17 >> 8) + this.field422.field2644;
                } else {
                    var19 = ((this.field422.field2643 - this.field422.field2644) * var18 >> 8) + this.field422.field2644;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field440[var16] = 0;
                }
            }
        }
        if (this.field431 > 0 && this.field432 > 0) {
            int var20 = (int) ((double) this.field431 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field440[var21] += field440[var21 - var20] * this.field432 / 100;
            }
        }
        if (this.field438.field1196[0] > 0 || this.field438.field1196[1] > 0) {
            this.field439.method1211();
            int var22 = this.field439.method1209(arg0 + 1);
            int var23 = this.field438.method501(0, (float) var22 / 65536.0F);
            int var24 = this.field438.method501(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field440[var23 + var25] * (long) class81.field1199 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field440[var23 + var25 - var36 - 1] * (long) class81.field1197[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field440[var25 - var37 - 1] * (long) class81.field1197[1][var37] >> 16);
                    }
                    field440[var25] = var35;
                    var22 = this.field439.method1209(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field440[var23 + var25] * (long) class81.field1199 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field440[var23 + var25 - var33 - 1] * (long) class81.field1197[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field440[var25 - var34 - 1] * (long) class81.field1197[1][var34] >> 16);
                        }
                        field440[var25] = var32;
                        var22 = this.field439.method1209(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field440[var23 + var25 - var29 - 1] * (long) class81.field1197[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field440[var25 - var30 - 1] * (long) class81.field1197[1][var30] >> 16);
                            }
                            field440[var25] = var28;
                            this.field439.method1209(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field438.method501(0, (float) var22 / 65536.0F);
                    var24 = this.field438.method501(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field440[var38] < -32768) {
                field440[var38] = -32768;
            }
            if (field440[var38] > 32767) {
                field440[var38] = 32767;
            }
        }
        return field440;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()V", line = 295)
    public static void method220() {
        field440 = null;
        field428 = null;
        field429 = null;
        field442 = null;
        field444 = null;
        field446 = null;
        field441 = null;
        field443 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)I", line = 307)
    private final int method221(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field429[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field428[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lmd;)V", line = 340)
    public final void method222(class379 arg0) {
        this.field425 = new class188();
        this.field425.method1210(arg0);
        this.field426 = new class188();
        this.field426.method1210(arg0);
        int var2 = arg0.method2238(255);
        if (var2 != 0) {
            arg0.field5173--;
            this.field427 = new class188();
            this.field427.method1210(arg0);
            this.field423 = new class188();
            this.field423.method1210(arg0);
        }
        int var3 = arg0.method2238(255);
        if (var3 != 0) {
            arg0.field5173--;
            this.field433 = new class188();
            this.field433.method1210(arg0);
            this.field430 = new class188();
            this.field430.method1210(arg0);
        }
        int var4 = arg0.method2238(255);
        if (var4 != 0) {
            arg0.field5173--;
            this.field422 = new class188();
            this.field422.method1210(arg0);
            this.field435 = new class188();
            this.field435.method1210(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2199((byte) 67);
            if (var6 == 0) {
                break;
            }
            this.field434[var5] = var6;
            this.field436[var5] = arg0.method2184((byte) -128);
            this.field437[var5] = arg0.method2199((byte) 121);
        }
        this.field431 = arg0.method2199((byte) 99);
        this.field432 = arg0.method2199((byte) 117);
        this.field424 = arg0.method2212((byte) 83);
        this.field445 = arg0.method2212((byte) 83);
        this.field438 = new class81();
        this.field439 = new class188();
        this.field438.method503(arg0, this.field439);
    }
}
