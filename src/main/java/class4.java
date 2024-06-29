import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    private int field48 = 0;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public int field54 = 500;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    private int field55 = 100;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public int field57 = 0;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
    private int[] field52 = new int[5];

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
    private int[] field60 = new int[5];

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
    private int[] field62 = new int[5];

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
    private static int[] field64 = new int[32768];

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "[I")
    private static int[] field65;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "[I")
    private static int[] field58;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[I")
    private static int[] field68;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "[I")
    private static int[] field70;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "[I")
    private static int[] field69;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "[I")
    private static int[] field71;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "[I")
    private static int[] field72;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lai;")
    private class10 field50;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lai;")
    private class10 field51;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lai;")
    private class10 field53;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lai;")
    private class10 field56;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lai;")
    private class10 field59;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Lai;")
    private class10 field61;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lai;")
    private class10 field63;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lai;")
    private class10 field66;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Lai;")
    private class10 field67;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lef;")
    private class45 field49;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
    public static void method19() {
        field58 = null;
        field64 = null;
        field65 = null;
        field69 = null;
        field71 = null;
        field68 = null;
        field70 = null;
        field72 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lhd;)V")
    public final void method20(class68 arg0) {
        this.field51 = new class10();
        this.field51.method82(arg0);
        this.field67 = new class10();
        this.field67.method82(arg0);
        int var2 = arg0.method604((byte) -27);
        if (var2 != 0) {
            arg0.field1454--;
            this.field50 = new class10();
            this.field50.method82(arg0);
            this.field59 = new class10();
            this.field59.method82(arg0);
        }
        int var3 = arg0.method604((byte) 95);
        if (var3 != 0) {
            arg0.field1454--;
            this.field66 = new class10();
            this.field66.method82(arg0);
            this.field61 = new class10();
            this.field61.method82(arg0);
        }
        int var4 = arg0.method604((byte) 39);
        if (var4 != 0) {
            arg0.field1454--;
            this.field53 = new class10();
            this.field53.method82(arg0);
            this.field63 = new class10();
            this.field63.method82(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method603((byte) -118);
            if (var6 == 0) {
                break;
            }
            this.field52[var5] = var6;
            this.field62[var5] = arg0.method591(25006);
            this.field60[var5] = arg0.method603((byte) -113);
        }
        this.field48 = arg0.method603((byte) -115);
        this.field55 = arg0.method603((byte) -126);
        this.field54 = arg0.method569(26496);
        this.field57 = arg0.method569(26496);
        this.field49 = new class45();
        this.field56 = new class10();
        this.field49.method374(arg0, this.field56);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
    public final int[] method21(int arg0, int arg1) {
        class128.method957(field58, 0, arg0);
        if (arg1 < 10) {
            return field58;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field51.method83();
        this.field67.method83();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field50 != null) {
            this.field50.method83();
            this.field59.method83();
            var5 = (int) ((double) (this.field50.field213 - this.field50.field218) * 32.768D / var3);
            var6 = (int) ((double) this.field50.field218 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field66 != null) {
            this.field66.method83();
            this.field61.method83();
            var8 = (int) ((double) (this.field66.field213 - this.field66.field218) * 32.768D / var3);
            var9 = (int) ((double) this.field66.field218 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field52[var11] != 0) {
                field69[var11] = 0;
                field71[var11] = (int) ((double) this.field60[var11] * var3);
                field68[var11] = (this.field52[var11] << 14) / 100;
                field70[var11] = (int) ((double) (this.field51.field213 - this.field51.field218) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field62[var11]) / var3);
                field72[var11] = (int) ((double) this.field51.field218 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field51.method84(arg0);
            int var40 = this.field67.method84(arg0);
            if (this.field50 != null) {
                int var41 = this.field50.method84(arg0);
                int var42 = this.field59.method84(arg0);
                var39 += this.method22(var7, var42, this.field50.field217) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field66 != null) {
                int var43 = this.field66.method84(arg0);
                int var44 = this.field61.method84(arg0);
                var40 = var40 * ((this.method22(var10, var44, this.field66.field217) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field52[var45] != 0) {
                    int var46 = field71[var45] + var12;
                    if (var46 < arg0) {
                        field58[var46] += this.method22(field69[var45], field68[var45] * var40 >> 15, this.field51.field217);
                        field69[var45] += (field70[var45] * var39 >> 16) + field72[var45];
                    }
                }
            }
        }
        if (this.field53 != null) {
            this.field53.method83();
            this.field63.method83();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field53.method84(arg0);
                int var18 = this.field63.method84(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field53.field213 - this.field53.field218) * var17 >> 8) + this.field53.field218;
                } else {
                    var19 = ((this.field53.field213 - this.field53.field218) * var18 >> 8) + this.field53.field218;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field58[var16] = 0;
                }
            }
        }
        if (this.field48 > 0 && this.field55 > 0) {
            int var20 = (int) ((double) this.field48 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field58[var21] += field58[var21 - var20] * this.field55 / 100;
            }
        }
        if (this.field49.field895[0] > 0 || this.field49.field895[1] > 0) {
            this.field56.method83();
            int var22 = this.field56.method84(arg0 + 1);
            int var23 = this.field49.method369(0, (float) var22 / 65536.0F);
            int var24 = this.field49.method369(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field58[var23 + var25] * (long) class45.field894 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field58[var23 + var25 - var36 - 1] * (long) class45.field901[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field58[var25 - var37 - 1] * (long) class45.field901[1][var37] >> 16);
                    }
                    field58[var25] = var35;
                    var22 = this.field56.method84(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field58[var23 + var25] * (long) class45.field894 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field58[var23 + var25 - var33 - 1] * (long) class45.field901[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field58[var25 - var34 - 1] * (long) class45.field901[1][var34] >> 16);
                        }
                        field58[var25] = var32;
                        var22 = this.field56.method84(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field58[var23 + var25 - var29 - 1] * (long) class45.field901[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field58[var25 - var30 - 1] * (long) class45.field901[1][var30] >> 16);
                            }
                            field58[var25] = var28;
                            this.field56.method84(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field49.method369(0, (float) var22 / 65536.0F);
                    var24 = this.field49.method369(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field58[var38] < -32768) {
                field58[var38] = -32768;
            }
            if (field58[var38] > 32767) {
                field58[var38] = 32767;
            }
        }
        return field58;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
    private final int method22(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field65[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field64[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field64[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field65 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field65[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field58 = new int[220500];
        field68 = new int[5];
        field70 = new int[5];
        field69 = new int[5];
        field71 = new int[5];
        field72 = new int[5];
    }
}
