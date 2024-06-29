import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
    private int[] field426 = new int[5];

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[I")
    private int[] field427 = new int[5];

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public int field434 = 0;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    private int field440 = 100;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[I")
    private int[] field439 = new int[5];

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    private int field444 = 0;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public int field447 = 500;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[I")
    private static int[] field441 = new int[32768];

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
    private static int[] field431;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[I")
    private static int[] field432;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[I")
    private static int[] field443;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[I")
    private static int[] field445;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "[I")
    private static int[] field446;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "[I")
    private static int[] field448;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[I")
    private static int[] field449;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lhf;")
    private class55 field428;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lk;")
    private class69 field425;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lk;")
    private class69 field429;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lk;")
    private class69 field430;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lk;")
    private class69 field433;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Lk;")
    private class69 field435;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Lk;")
    private class69 field436;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lk;")
    private class69 field437;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lk;")
    private class69 field438;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Lk;")
    private class69 field442;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljd;)V")
    public final void method169(class66 arg0) {
        this.field425 = new class69();
        this.field425.method574(arg0);
        this.field435 = new class69();
        this.field435.method574(arg0);
        int var2 = arg0.method533(255);
        if (var2 != 0) {
            arg0.field1569--;
            this.field430 = new class69();
            this.field430.method574(arg0);
            this.field433 = new class69();
            this.field433.method574(arg0);
        }
        int var3 = arg0.method533(255);
        if (var3 != 0) {
            arg0.field1569--;
            this.field429 = new class69();
            this.field429.method574(arg0);
            this.field442 = new class69();
            this.field442.method574(arg0);
        }
        int var4 = arg0.method533(255);
        if (var4 != 0) {
            arg0.field1569--;
            this.field438 = new class69();
            this.field438.method574(arg0);
            this.field437 = new class69();
            this.field437.method574(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method506(true);
            if (var6 == 0) {
                break;
            }
            this.field426[var5] = var6;
            this.field439[var5] = arg0.method517(-49152);
            this.field427[var5] = arg0.method506(true);
        }
        this.field444 = arg0.method506(true);
        this.field440 = arg0.method506(true);
        this.field447 = arg0.method532(0);
        this.field434 = arg0.method532(0);
        this.field428 = new class55();
        this.field436 = new class69();
        this.field428.method431(arg0, this.field436);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[I")
    public final int[] method170(int arg0, int arg1) {
        class60.method459(field432, 0, arg0);
        if (arg1 < 10) {
            return field432;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field425.method575();
        this.field435.method575();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field430 != null) {
            this.field430.method575();
            this.field433.method575();
            var5 = (int) ((double) (this.field430.field1615 - this.field430.field1617) * 32.768D / var3);
            var6 = (int) ((double) this.field430.field1617 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field429 != null) {
            this.field429.method575();
            this.field442.method575();
            var8 = (int) ((double) (this.field429.field1615 - this.field429.field1617) * 32.768D / var3);
            var9 = (int) ((double) this.field429.field1617 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field426[var11] != 0) {
                field446[var11] = 0;
                field445[var11] = (int) ((double) this.field427[var11] * var3);
                field443[var11] = (this.field426[var11] << 14) / 100;
                field449[var11] = (int) ((double) (this.field425.field1615 - this.field425.field1617) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field439[var11]) / var3);
                field448[var11] = (int) ((double) this.field425.field1617 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field425.method573(arg0);
            int var40 = this.field435.method573(arg0);
            if (this.field430 != null) {
                int var41 = this.field430.method573(arg0);
                int var42 = this.field433.method573(arg0);
                var39 += this.method172(var7, var42, this.field430.field1620) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field429 != null) {
                int var43 = this.field429.method573(arg0);
                int var44 = this.field442.method573(arg0);
                var40 = var40 * ((this.method172(var10, var44, this.field429.field1620) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field426[var45] != 0) {
                    int var46 = field445[var45] + var12;
                    if (var46 < arg0) {
                        field432[var46] += this.method172(field446[var45], field443[var45] * var40 >> 15, this.field425.field1620);
                        field446[var45] += (field449[var45] * var39 >> 16) + field448[var45];
                    }
                }
            }
        }
        if (this.field438 != null) {
            this.field438.method575();
            this.field437.method575();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field438.method573(arg0);
                int var18 = this.field437.method573(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field438.field1615 - this.field438.field1617) * var17 >> 8) + this.field438.field1617;
                } else {
                    var19 = ((this.field438.field1615 - this.field438.field1617) * var18 >> 8) + this.field438.field1617;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field432[var16] = 0;
                }
            }
        }
        if (this.field444 > 0 && this.field440 > 0) {
            int var20 = (int) ((double) this.field444 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field432[var21] += field432[var21 - var20] * this.field440 / 100;
            }
        }
        if (this.field428.field1286[0] > 0 || this.field428.field1286[1] > 0) {
            this.field436.method575();
            int var22 = this.field436.method573(arg0 + 1);
            int var23 = this.field428.method433(0, (float) var22 / 65536.0F);
            int var24 = this.field428.method433(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field432[var23 + var25] * (long) class55.field1289 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field432[var23 + var25 - var36 - 1] * (long) class55.field1285[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field432[var25 - var37 - 1] * (long) class55.field1285[1][var37] >> 16);
                    }
                    field432[var25] = var35;
                    var22 = this.field436.method573(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field432[var23 + var25] * (long) class55.field1289 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field432[var23 + var25 - var33 - 1] * (long) class55.field1285[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field432[var25 - var34 - 1] * (long) class55.field1285[1][var34] >> 16);
                        }
                        field432[var25] = var32;
                        var22 = this.field436.method573(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field432[var23 + var25 - var29 - 1] * (long) class55.field1285[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field432[var25 - var30 - 1] * (long) class55.field1285[1][var30] >> 16);
                            }
                            field432[var25] = var28;
                            this.field436.method573(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field428.method433(0, (float) var22 / 65536.0F);
                    var24 = this.field428.method433(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field432[var38] < -32768) {
                field432[var38] = -32768;
            }
            if (field432[var38] > 32767) {
                field432[var38] = 32767;
            }
        }
        return field432;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
    public static void method171() {
        field432 = null;
        field441 = null;
        field431 = null;
        field446 = null;
        field445 = null;
        field443 = null;
        field449 = null;
        field448 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)I")
    private final int method172(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field431[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field441[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field441[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field431 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field431[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field432 = new int[220500];
        field443 = new int[5];
        field445 = new int[5];
        field446 = new int[5];
        field448 = new int[5];
        field449 = new int[5];
    }
}
