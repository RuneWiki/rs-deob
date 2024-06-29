import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class627 {

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    private int field8997 = 100;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "[I")
    private int[] field9000 = new int[5];

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    public int field9005 = 500;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "[I")
    private int[] field8999 = new int[5];

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    private int field9006 = 0;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "[I")
    private int[] field9003 = new int[5];

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
    public int field9009 = 0;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "[I")
    private static int[] field9001 = new int[32768];

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "[I")
    private static int[] field9002;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "[I")
    private static int[] field9008;

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "[I")
    private static int[] field9018;

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "[I")
    private static int[] field9017;

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "[I")
    private static int[] field9016;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "[I")
    private static int[] field9015;

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "[I")
    private static int[] field9020;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "Ldf;")
    private class398 field8996;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "Ldf;")
    private class398 field9004;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "Ldf;")
    private class398 field9007;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "Ldf;")
    private class398 field9010;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "Ldf;")
    private class398 field9011;

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "Ldf;")
    private class398 field9012;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "Ldf;")
    private class398 field9013;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "Ldf;")
    private class398 field9014;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "Ldf;")
    private class398 field9019;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "Lrda;")
    private class659 field8998;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field9001[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field9002 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field9002[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field9008 = new int[220500];
        field9018 = new int[5];
        field9017 = new int[5];
        field9016 = new int[5];
        field9015 = new int[5];
        field9020 = new int[5];
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)I", line = 16)
    private final int method3620(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field9002[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field9001[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lud;)V", line = 46)
    public final void method3621(class35 arg0) {
        this.field9012 = new class398();
        this.field9012.method2468(arg0);
        this.field9011 = new class398();
        this.field9011.method2468(arg0);
        int var2 = arg0.method273(255);
        if (var2 != 0) {
            arg0.field469--;
            this.field9019 = new class398();
            this.field9019.method2468(arg0);
            this.field9010 = new class398();
            this.field9010.method2468(arg0);
        }
        int var3 = arg0.method273(255);
        if (var3 != 0) {
            arg0.field469--;
            this.field9014 = new class398();
            this.field9014.method2468(arg0);
            this.field9013 = new class398();
            this.field9013.method2468(arg0);
        }
        int var4 = arg0.method273(255);
        if (var4 != 0) {
            arg0.field469--;
            this.field9004 = new class398();
            this.field9004.method2468(arg0);
            this.field9007 = new class398();
            this.field9007.method2468(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method232((byte) 39);
            if (var6 == 0) {
                break;
            }
            this.field8999[var5] = var6;
            this.field9003[var5] = arg0.method270(true);
            this.field9000[var5] = arg0.method232((byte) -37);
        }
        this.field9006 = arg0.method232((byte) -128);
        this.field8997 = arg0.method232((byte) 87);
        this.field9005 = arg0.method253(-13900);
        this.field9009 = arg0.method253(-13900);
        this.field8998 = new class659();
        this.field8996 = new class398();
        this.field8998.method3707(arg0, this.field8996);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "()V", line = 118)
    public static void method3622() {
        field9008 = null;
        field9001 = null;
        field9002 = null;
        field9020 = null;
        field9016 = null;
        field9017 = null;
        field9015 = null;
        field9018 = null;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)[I", line = 139)
    public final int[] method3623(int arg0, int arg1) {
        class622.method3598(field9008, 0, arg0);
        if (arg1 < 10) {
            return field9008;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field9012.method2469();
        this.field9011.method2469();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field9019 != null) {
            this.field9019.method2469();
            this.field9010.method2469();
            var5 = (int) ((double) (this.field9019.field5569 - this.field9019.field5570) * 32.768D / var3);
            var6 = (int) ((double) this.field9019.field5570 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field9014 != null) {
            this.field9014.method2469();
            this.field9013.method2469();
            var8 = (int) ((double) (this.field9014.field5569 - this.field9014.field5570) * 32.768D / var3);
            var9 = (int) ((double) this.field9014.field5570 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field8999[var11] != 0) {
                field9020[var11] = 0;
                field9016[var11] = (int) ((double) this.field9000[var11] * var3);
                field9017[var11] = (this.field8999[var11] << 14) / 100;
                field9015[var11] = (int) ((double) (this.field9012.field5569 - this.field9012.field5570) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field9003[var11]) / var3);
                field9018[var11] = (int) ((double) this.field9012.field5570 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field9012.method2470(arg0);
            int var40 = this.field9011.method2470(arg0);
            if (this.field9019 != null) {
                int var41 = this.field9019.method2470(arg0);
                int var42 = this.field9010.method2470(arg0);
                var39 += this.method3620(var7, var42, this.field9019.field5567) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field9014 != null) {
                int var43 = this.field9014.method2470(arg0);
                int var44 = this.field9013.method2470(arg0);
                var40 = var40 * ((this.method3620(var10, var44, this.field9014.field5567) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field8999[var45] != 0) {
                    int var46 = field9016[var45] + var12;
                    if (var46 < arg0) {
                        field9008[var46] += this.method3620(field9020[var45], field9017[var45] * var40 >> 15, this.field9012.field5567);
                        field9020[var45] += (field9015[var45] * var39 >> 16) + field9018[var45];
                    }
                }
            }
        }
        if (this.field9004 != null) {
            this.field9004.method2469();
            this.field9007.method2469();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field9004.method2470(arg0);
                int var18 = this.field9007.method2470(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field9004.field5569 - this.field9004.field5570) * var17 >> 8) + this.field9004.field5570;
                } else {
                    var19 = ((this.field9004.field5569 - this.field9004.field5570) * var18 >> 8) + this.field9004.field5570;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field9008[var16] = 0;
                }
            }
        }
        if (this.field9006 > 0 && this.field8997 > 0) {
            int var20 = (int) ((double) this.field9006 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field9008[var21] += field9008[var21 - var20] * this.field8997 / 100;
            }
        }
        if (this.field8998.field9288[0] > 0 || this.field8998.field9288[1] > 0) {
            this.field8996.method2469();
            int var22 = this.field8996.method2470(arg0 + 1);
            int var23 = this.field8998.method3711(0, (float) var22 / 65536.0F);
            int var24 = this.field8998.method3711(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field9008[var23 + var25] * (long) class659.field9290 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field9008[var23 + var25 - var36 - 1] * (long) class659.field9284[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field9008[var25 - var37 - 1] * (long) class659.field9284[1][var37] >> 16);
                    }
                    field9008[var25] = var35;
                    var22 = this.field8996.method2470(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field9008[var23 + var25] * (long) class659.field9290 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field9008[var23 + var25 - var33 - 1] * (long) class659.field9284[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field9008[var25 - var34 - 1] * (long) class659.field9284[1][var34] >> 16);
                        }
                        field9008[var25] = var32;
                        var22 = this.field8996.method2470(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field9008[var23 + var25 - var29 - 1] * (long) class659.field9284[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field9008[var25 - var30 - 1] * (long) class659.field9284[1][var30] >> 16);
                            }
                            field9008[var25] = var28;
                            this.field8996.method2470(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field8998.method3711(0, (float) var22 / 65536.0F);
                    var24 = this.field8998.method3711(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field9008[var38] < -32768) {
                field9008[var38] = -32768;
            }
            if (field9008[var38] > 32767) {
                field9008[var38] = 32767;
            }
        }
        return field9008;
    }
}
