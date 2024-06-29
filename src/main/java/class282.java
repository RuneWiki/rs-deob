import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class282 {

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    private int field4004 = 100;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    private int field4010 = 0;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public int field4007 = 0;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public int field4005 = 500;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "[I")
    private int[] field4018 = new int[5];

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "[I")
    private int[] field4014 = new int[5];

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "[I")
    private int[] field4019 = new int[5];

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "[I")
    private static int[] field4009 = new int[32768];

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "[I")
    private static int[] field4015;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "[I")
    private static int[] field4017;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "[I")
    private static int[] field4022;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "[I")
    private static int[] field4023;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "[I")
    private static int[] field4024;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "[I")
    private static int[] field4025;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "[I")
    private static int[] field4026;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "Lvba;")
    private class40 field4016;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Ljga;")
    private class715 field4002;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Ljga;")
    private class715 field4003;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Ljga;")
    private class715 field4006;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Ljga;")
    private class715 field4008;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Ljga;")
    private class715 field4011;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Ljga;")
    private class715 field4012;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Ljga;")
    private class715 field4013;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "Ljga;")
    private class715 field4020;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Ljga;")
    private class715 field4021;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4009[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4015 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4015[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4017 = new int[220500];
        field4022 = new int[5];
        field4023 = new int[5];
        field4024 = new int[5];
        field4025 = new int[5];
        field4026 = new int[5];
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)I", line = 11)
    private final int method1851(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4015[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4009[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[I", line = 38)
    public final int[] method1852(int arg0, int arg1) {
        class255.method1694(field4017, 0, arg0);
        if (arg1 < 10) {
            return field4017;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4020.method4029();
        this.field4012.method4029();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4021 != null) {
            this.field4021.method4029();
            this.field4006.method4029();
            var5 = (int) ((double) (this.field4021.field9938 - this.field4021.field9936) * 32.768D / var3);
            var6 = (int) ((double) this.field4021.field9936 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4002 != null) {
            this.field4002.method4029();
            this.field4003.method4029();
            var8 = (int) ((double) (this.field4002.field9938 - this.field4002.field9936) * 32.768D / var3);
            var9 = (int) ((double) this.field4002.field9936 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4019[var11] != 0) {
                field4023[var11] = 0;
                field4026[var11] = (int) ((double) this.field4018[var11] * var3);
                field4025[var11] = (this.field4019[var11] << 14) / 100;
                field4022[var11] = (int) ((double) (this.field4020.field9938 - this.field4020.field9936) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4014[var11]) / var3);
                field4024[var11] = (int) ((double) this.field4020.field9936 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4020.method4031(arg0);
            int var40 = this.field4012.method4031(arg0);
            if (this.field4021 != null) {
                int var41 = this.field4021.method4031(arg0);
                int var42 = this.field4006.method4031(arg0);
                var39 += this.method1851(var7, var42, this.field4021.field9935) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4002 != null) {
                int var43 = this.field4002.method4031(arg0);
                int var44 = this.field4003.method4031(arg0);
                var40 = var40 * ((this.method1851(var10, var44, this.field4002.field9935) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4019[var45] != 0) {
                    int var46 = field4026[var45] + var12;
                    if (var46 < arg0) {
                        field4017[var46] += this.method1851(field4023[var45], field4025[var45] * var40 >> 15, this.field4020.field9935);
                        field4023[var45] += (field4022[var45] * var39 >> 16) + field4024[var45];
                    }
                }
            }
        }
        if (this.field4011 != null) {
            this.field4011.method4029();
            this.field4013.method4029();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4011.method4031(arg0);
                int var18 = this.field4013.method4031(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4011.field9938 - this.field4011.field9936) * var17 >> 8) + this.field4011.field9936;
                } else {
                    var19 = ((this.field4011.field9938 - this.field4011.field9936) * var18 >> 8) + this.field4011.field9936;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4017[var16] = 0;
                }
            }
        }
        if (this.field4010 > 0 && this.field4004 > 0) {
            int var20 = (int) ((double) this.field4010 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4017[var21] += field4017[var21 - var20] * this.field4004 / 100;
            }
        }
        if (this.field4016.field489[0] > 0 || this.field4016.field489[1] > 0) {
            this.field4008.method4029();
            int var22 = this.field4008.method4031(arg0 + 1);
            int var23 = this.field4016.method269(0, (float) var22 / 65536.0F);
            int var24 = this.field4016.method269(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4017[var23 + var25] * (long) class40.field488 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4017[var23 + var25 - var36 - 1] * (long) class40.field493[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4017[var25 - var37 - 1] * (long) class40.field493[1][var37] >> 16);
                    }
                    field4017[var25] = var35;
                    var22 = this.field4008.method4031(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4017[var23 + var25] * (long) class40.field488 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4017[var23 + var25 - var33 - 1] * (long) class40.field493[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4017[var25 - var34 - 1] * (long) class40.field493[1][var34] >> 16);
                        }
                        field4017[var25] = var32;
                        var22 = this.field4008.method4031(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4017[var23 + var25 - var29 - 1] * (long) class40.field493[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4017[var25 - var30 - 1] * (long) class40.field493[1][var30] >> 16);
                            }
                            field4017[var25] = var28;
                            this.field4008.method4031(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4016.method269(0, (float) var22 / 65536.0F);
                    var24 = this.field4016.method269(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4017[var38] < -32768) {
                field4017[var38] = -32768;
            }
            if (field4017[var38] > 32767) {
                field4017[var38] = 32767;
            }
        }
        return field4017;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()V", line = 326)
    public static void method1853() {
        field4017 = null;
        field4009 = null;
        field4015 = null;
        field4023 = null;
        field4026 = null;
        field4025 = null;
        field4022 = null;
        field4024 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lee;)V", line = 342)
    public final void method1854(class675 arg0) {
        this.field4020 = new class715();
        this.field4020.method4030(arg0);
        this.field4012 = new class715();
        this.field4012.method4030(arg0);
        int var2 = arg0.method3750((byte) 35);
        if (var2 != 0) {
            arg0.field9146--;
            this.field4021 = new class715();
            this.field4021.method4030(arg0);
            this.field4006 = new class715();
            this.field4006.method4030(arg0);
        }
        int var3 = arg0.method3750((byte) 35);
        if (var3 != 0) {
            arg0.field9146--;
            this.field4002 = new class715();
            this.field4002.method4030(arg0);
            this.field4003 = new class715();
            this.field4003.method4030(arg0);
        }
        int var4 = arg0.method3750((byte) 35);
        if (var4 != 0) {
            arg0.field9146--;
            this.field4011 = new class715();
            this.field4011.method4030(arg0);
            this.field4013 = new class715();
            this.field4013.method4030(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3693(-51);
            if (var6 == 0) {
                break;
            }
            this.field4019[var5] = var6;
            this.field4014[var5] = arg0.method3730(-5929);
            this.field4018[var5] = arg0.method3693(15);
        }
        this.field4010 = arg0.method3693(-122);
        this.field4004 = arg0.method3693(-46);
        this.field4005 = arg0.method3757((byte) -65);
        this.field4007 = arg0.method3757((byte) -65);
        this.field4016 = new class40();
        this.field4008 = new class715();
        this.field4016.method272(arg0, this.field4008);
    }
}
