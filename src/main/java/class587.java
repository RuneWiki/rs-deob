import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class587 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field8272 = 500;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public int field8273 = 0;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    private int field8285 = 100;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[I")
    private int[] field8278 = new int[5];

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
    private int[] field8284 = new int[5];

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    private int field8290 = 0;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[I")
    private int[] field8281 = new int[5];

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
    private static int[] field8280 = new int[32768];

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    private static int[] field8274;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    private static int[] field8279;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[I")
    private static int[] field8286;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "[I")
    private static int[] field8289;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[I")
    private static int[] field8292;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "[I")
    private static int[] field8291;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
    private static int[] field8293;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lwda;")
    private class636 field8271;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lwda;")
    private class636 field8275;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lwda;")
    private class636 field8276;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lwda;")
    private class636 field8277;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lwda;")
    private class636 field8282;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Lwda;")
    private class636 field8287;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lwda;")
    private class636 field8288;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "Lwda;")
    private class636 field8294;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "Lwda;")
    private class636 field8295;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lvfa;")
    private class669 field8283;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field8280[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field8274 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field8274[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field8279 = new int[220500];
        field8286 = new int[5];
        field8289 = new int[5];
        field8292 = new int[5];
        field8291 = new int[5];
        field8293 = new int[5];
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I", line = 4)
    private final int method3365(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field8274[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field8280[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lig;)V", line = 47)
    public final void method3366(class244 arg0) {
        this.field8282 = new class636();
        this.field8282.method3647(arg0);
        this.field8294 = new class636();
        this.field8294.method3647(arg0);
        int var2 = arg0.method1423(-32);
        if (var2 != 0) {
            arg0.field2903--;
            this.field8275 = new class636();
            this.field8275.method3647(arg0);
            this.field8277 = new class636();
            this.field8277.method3647(arg0);
        }
        int var3 = arg0.method1423(-40);
        if (var3 != 0) {
            arg0.field2903--;
            this.field8295 = new class636();
            this.field8295.method3647(arg0);
            this.field8287 = new class636();
            this.field8287.method3647(arg0);
        }
        int var4 = arg0.method1423(-8);
        if (var4 != 0) {
            arg0.field2903--;
            this.field8271 = new class636();
            this.field8271.method3647(arg0);
            this.field8276 = new class636();
            this.field8276.method3647(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1463(3010);
            if (var6 == 0) {
                break;
            }
            this.field8284[var5] = var6;
            this.field8281[var5] = arg0.method1427(-103);
            this.field8278[var5] = arg0.method1463(3010);
        }
        this.field8290 = arg0.method1463(3010);
        this.field8285 = arg0.method1463(3010);
        this.field8272 = arg0.method1476(55);
        this.field8273 = arg0.method1476(68);
        this.field8283 = new class669();
        this.field8288 = new class636();
        this.field8283.method3799(arg0, this.field8288);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[I", line = 143)
    public final int[] method3367(int arg0, int arg1) {
        class143.method893(field8279, 0, arg0);
        if (arg1 < 10) {
            return field8279;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field8282.method3645();
        this.field8294.method3645();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field8275 != null) {
            this.field8275.method3645();
            this.field8277.method3645();
            var5 = (int) ((double) (this.field8275.field9141 - this.field8275.field9145) * 32.768D / var3);
            var6 = (int) ((double) this.field8275.field9145 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field8295 != null) {
            this.field8295.method3645();
            this.field8287.method3645();
            var8 = (int) ((double) (this.field8295.field9141 - this.field8295.field9145) * 32.768D / var3);
            var9 = (int) ((double) this.field8295.field9145 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field8284[var11] != 0) {
                field8291[var11] = 0;
                field8292[var11] = (int) ((double) this.field8278[var11] * var3);
                field8289[var11] = (this.field8284[var11] << 14) / 100;
                field8286[var11] = (int) ((double) (this.field8282.field9141 - this.field8282.field9145) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field8281[var11]) / var3);
                field8293[var11] = (int) ((double) this.field8282.field9145 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field8282.method3646(arg0);
            int var40 = this.field8294.method3646(arg0);
            if (this.field8275 != null) {
                int var41 = this.field8275.method3646(arg0);
                int var42 = this.field8277.method3646(arg0);
                var39 += this.method3365(var7, var42, this.field8275.field9140) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field8295 != null) {
                int var43 = this.field8295.method3646(arg0);
                int var44 = this.field8287.method3646(arg0);
                var40 = var40 * ((this.method3365(var10, var44, this.field8295.field9140) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field8284[var45] != 0) {
                    int var46 = field8292[var45] + var12;
                    if (var46 < arg0) {
                        field8279[var46] += this.method3365(field8291[var45], field8289[var45] * var40 >> 15, this.field8282.field9140);
                        field8291[var45] += (field8286[var45] * var39 >> 16) + field8293[var45];
                    }
                }
            }
        }
        if (this.field8271 != null) {
            this.field8271.method3645();
            this.field8276.method3645();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field8271.method3646(arg0);
                int var18 = this.field8276.method3646(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field8271.field9141 - this.field8271.field9145) * var17 >> 8) + this.field8271.field9145;
                } else {
                    var19 = ((this.field8271.field9141 - this.field8271.field9145) * var18 >> 8) + this.field8271.field9145;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field8279[var16] = 0;
                }
            }
        }
        if (this.field8290 > 0 && this.field8285 > 0) {
            int var20 = (int) ((double) this.field8290 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field8279[var21] += field8279[var21 - var20] * this.field8285 / 100;
            }
        }
        if (this.field8283.field9508[0] > 0 || this.field8283.field9508[1] > 0) {
            this.field8288.method3645();
            int var22 = this.field8288.method3646(arg0 + 1);
            int var23 = this.field8283.method3802(0, (float) var22 / 65536.0F);
            int var24 = this.field8283.method3802(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field8279[var23 + var25] * (long) class669.field9512 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field8279[var23 + var25 - var36 - 1] * (long) class669.field9511[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field8279[var25 - var37 - 1] * (long) class669.field9511[1][var37] >> 16);
                    }
                    field8279[var25] = var35;
                    var22 = this.field8288.method3646(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field8279[var23 + var25] * (long) class669.field9512 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field8279[var23 + var25 - var33 - 1] * (long) class669.field9511[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field8279[var25 - var34 - 1] * (long) class669.field9511[1][var34] >> 16);
                        }
                        field8279[var25] = var32;
                        var22 = this.field8288.method3646(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field8279[var23 + var25 - var29 - 1] * (long) class669.field9511[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field8279[var25 - var30 - 1] * (long) class669.field9511[1][var30] >> 16);
                            }
                            field8279[var25] = var28;
                            this.field8288.method3646(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field8283.method3802(0, (float) var22 / 65536.0F);
                    var24 = this.field8283.method3802(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field8279[var38] < -32768) {
                field8279[var38] = -32768;
            }
            if (field8279[var38] > 32767) {
                field8279[var38] = 32767;
            }
        }
        return field8279;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V", line = 442)
    public static void method3368() {
        field8279 = null;
        field8280 = null;
        field8274 = null;
        field8291 = null;
        field8292 = null;
        field8289 = null;
        field8286 = null;
        field8293 = null;
    }
}
