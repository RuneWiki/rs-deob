import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class330 {

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    private int field4704 = 0;

    @OriginalMember(owner = "client!ofa", name = "i", descriptor = "[I")
    private int[] field4710 = new int[5];

    @OriginalMember(owner = "client!ofa", name = "m", descriptor = "I")
    private int field4714 = 100;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public int field4706 = 500;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "[I")
    private int[] field4716 = new int[5];

    @OriginalMember(owner = "client!ofa", name = "r", descriptor = "[I")
    private int[] field4719 = new int[5];

    @OriginalMember(owner = "client!ofa", name = "p", descriptor = "I")
    public int field4717 = 0;

    @OriginalMember(owner = "client!ofa", name = "l", descriptor = "[I")
    private static int[] field4713 = new int[32768];

    @OriginalMember(owner = "client!ofa", name = "q", descriptor = "[I")
    private static int[] field4718;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "[I")
    private static int[] field4709;

    @OriginalMember(owner = "client!ofa", name = "s", descriptor = "[I")
    private static int[] field4720;

    @OriginalMember(owner = "client!ofa", name = "v", descriptor = "[I")
    private static int[] field4723;

    @OriginalMember(owner = "client!ofa", name = "u", descriptor = "[I")
    private static int[] field4722;

    @OriginalMember(owner = "client!ofa", name = "w", descriptor = "[I")
    private static int[] field4724;

    @OriginalMember(owner = "client!ofa", name = "y", descriptor = "[I")
    private static int[] field4726;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "Lpo;")
    private class560 field4703;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "Loea;")
    private class599 field4702;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "Loea;")
    private class599 field4705;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "Loea;")
    private class599 field4707;

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "Loea;")
    private class599 field4708;

    @OriginalMember(owner = "client!ofa", name = "j", descriptor = "Loea;")
    private class599 field4711;

    @OriginalMember(owner = "client!ofa", name = "k", descriptor = "Loea;")
    private class599 field4712;

    @OriginalMember(owner = "client!ofa", name = "n", descriptor = "Loea;")
    private class599 field4715;

    @OriginalMember(owner = "client!ofa", name = "t", descriptor = "Loea;")
    private class599 field4721;

    @OriginalMember(owner = "client!ofa", name = "x", descriptor = "Loea;")
    private class599 field4725;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4713[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4718 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4718[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4709 = new int[220500];
        field4720 = new int[5];
        field4723 = new int[5];
        field4722 = new int[5];
        field4724 = new int[5];
        field4726 = new int[5];
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lrg;)V", line = 4)
    public final void method2089(class645 arg0) {
        this.field4705 = new class599();
        this.field4705.method3485(arg0);
        this.field4707 = new class599();
        this.field4707.method3485(arg0);
        int var2 = arg0.method3745(-6314);
        if (var2 != 0) {
            arg0.field9084--;
            this.field4721 = new class599();
            this.field4721.method3485(arg0);
            this.field4712 = new class599();
            this.field4712.method3485(arg0);
        }
        int var3 = arg0.method3745(-6314);
        if (var3 != 0) {
            arg0.field9084--;
            this.field4711 = new class599();
            this.field4711.method3485(arg0);
            this.field4715 = new class599();
            this.field4715.method3485(arg0);
        }
        int var4 = arg0.method3745(-6314);
        if (var4 != 0) {
            arg0.field9084--;
            this.field4702 = new class599();
            this.field4702.method3485(arg0);
            this.field4708 = new class599();
            this.field4708.method3485(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3728((byte) 88);
            if (var6 == 0) {
                break;
            }
            this.field4710[var5] = var6;
            this.field4719[var5] = arg0.method3741((byte) 93);
            this.field4716[var5] = arg0.method3728((byte) 88);
        }
        this.field4704 = arg0.method3728((byte) 88);
        this.field4714 = arg0.method3728((byte) 88);
        this.field4706 = arg0.method3712((byte) -10);
        this.field4717 = arg0.method3712((byte) 102);
        this.field4703 = new class560();
        this.field4725 = new class599();
        this.field4703.method3273(arg0, this.field4725);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)[I", line = 98)
    public final int[] method2090(int arg0, int arg1) {
        class319.method2019(field4709, 0, arg0);
        if (arg1 < 10) {
            return field4709;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4705.method3488();
        this.field4707.method3488();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4721 != null) {
            this.field4721.method3488();
            this.field4712.method3488();
            var5 = (int) ((double) (this.field4721.field8478 - this.field4721.field8479) * 32.768D / var3);
            var6 = (int) ((double) this.field4721.field8479 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4711 != null) {
            this.field4711.method3488();
            this.field4715.method3488();
            var8 = (int) ((double) (this.field4711.field8478 - this.field4711.field8479) * 32.768D / var3);
            var9 = (int) ((double) this.field4711.field8479 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4710[var11] != 0) {
                field4720[var11] = 0;
                field4724[var11] = (int) ((double) this.field4716[var11] * var3);
                field4722[var11] = (this.field4710[var11] << 14) / 100;
                field4723[var11] = (int) ((double) (this.field4705.field8478 - this.field4705.field8479) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4719[var11]) / var3);
                field4726[var11] = (int) ((double) this.field4705.field8479 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4705.method3486(arg0);
            int var40 = this.field4707.method3486(arg0);
            if (this.field4721 != null) {
                int var41 = this.field4721.method3486(arg0);
                int var42 = this.field4712.method3486(arg0);
                var39 += this.method2092(var7, var42, this.field4721.field8476) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4711 != null) {
                int var43 = this.field4711.method3486(arg0);
                int var44 = this.field4715.method3486(arg0);
                var40 = var40 * ((this.method2092(var10, var44, this.field4711.field8476) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4710[var45] != 0) {
                    int var46 = field4724[var45] + var12;
                    if (var46 < arg0) {
                        field4709[var46] += this.method2092(field4720[var45], field4722[var45] * var40 >> 15, this.field4705.field8476);
                        field4720[var45] += (field4723[var45] * var39 >> 16) + field4726[var45];
                    }
                }
            }
        }
        if (this.field4702 != null) {
            this.field4702.method3488();
            this.field4708.method3488();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4702.method3486(arg0);
                int var18 = this.field4708.method3486(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4702.field8478 - this.field4702.field8479) * var17 >> 8) + this.field4702.field8479;
                } else {
                    var19 = ((this.field4702.field8478 - this.field4702.field8479) * var18 >> 8) + this.field4702.field8479;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4709[var16] = 0;
                }
            }
        }
        if (this.field4704 > 0 && this.field4714 > 0) {
            int var20 = (int) ((double) this.field4704 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4709[var21] += field4709[var21 - var20] * this.field4714 / 100;
            }
        }
        if (this.field4703.field8005[0] > 0 || this.field4703.field8005[1] > 0) {
            this.field4725.method3488();
            int var22 = this.field4725.method3486(arg0 + 1);
            int var23 = this.field4703.method3274(0, (float) var22 / 65536.0F);
            int var24 = this.field4703.method3274(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4709[var23 + var25] * (long) class560.field8001 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4709[var23 + var25 - var36 - 1] * (long) class560.field8002[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4709[var25 - var37 - 1] * (long) class560.field8002[1][var37] >> 16);
                    }
                    field4709[var25] = var35;
                    var22 = this.field4725.method3486(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4709[var23 + var25] * (long) class560.field8001 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4709[var23 + var25 - var33 - 1] * (long) class560.field8002[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4709[var25 - var34 - 1] * (long) class560.field8002[1][var34] >> 16);
                        }
                        field4709[var25] = var32;
                        var22 = this.field4725.method3486(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4709[var23 + var25 - var29 - 1] * (long) class560.field8002[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4709[var25 - var30 - 1] * (long) class560.field8002[1][var30] >> 16);
                            }
                            field4709[var25] = var28;
                            this.field4725.method3486(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4703.method3274(0, (float) var22 / 65536.0F);
                    var24 = this.field4703.method3274(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4709[var38] < -32768) {
                field4709[var38] = -32768;
            }
            if (field4709[var38] > 32767) {
                field4709[var38] = 32767;
            }
        }
        return field4709;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "()V", line = 380)
    public static void method2091() {
        field4709 = null;
        field4713 = null;
        field4718 = null;
        field4720 = null;
        field4724 = null;
        field4722 = null;
        field4723 = null;
        field4726 = null;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)I", line = 415)
    private final int method2092(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4718[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4713[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
