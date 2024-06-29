import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class124 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public int field3002 = 0;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
    private int[] field3004 = new int[5];

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public int field3012 = 500;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "[I")
    private int[] field3013 = new int[5];

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    private int field3009 = 0;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    private int field3017 = 100;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "[I")
    private int[] field3025 = new int[5];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
    private static int[] field3003 = new int[32768];

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "[I")
    private static int[] field3008;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "[I")
    private static int[] field3011;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "[I")
    private static int[] field3019;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "[I")
    private static int[] field3021;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "[I")
    private static int[] field3022;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "[I")
    private static int[] field3024;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "[I")
    private static int[] field3020;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lce;")
    private class18 field3001;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lce;")
    private class18 field3006;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lce;")
    private class18 field3007;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lce;")
    private class18 field3010;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lce;")
    private class18 field3014;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lce;")
    private class18 field3015;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lce;")
    private class18 field3016;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lce;")
    private class18 field3018;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Lce;")
    private class18 field3023;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lab;")
    private class2 field3005;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3003[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3008 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3008[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3011 = new int[220500];
        field3019 = new int[5];
        field3021 = new int[5];
        field3022 = new int[5];
        field3024 = new int[5];
        field3020 = new int[5];
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V", line = 9)
    public static void method979() {
        field3011 = null;
        field3003 = null;
        field3008 = null;
        field3024 = null;
        field3019 = null;
        field3021 = null;
        field3022 = null;
        field3020 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I", line = 23)
    public final int[] method980(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field3011[var3] = 0;
        }
        if (arg1 < 10) {
            return field3011;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3015.method136();
        this.field3018.method136();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field3010 != null) {
            this.field3010.method136();
            this.field3007.method136();
            var6 = (int) ((double) (this.field3010.field367 - this.field3010.field371) * 32.768D / var4);
            var7 = (int) ((double) this.field3010.field371 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field3006 != null) {
            this.field3006.method136();
            this.field3014.method136();
            var9 = (int) ((double) (this.field3006.field367 - this.field3006.field371) * 32.768D / var4);
            var10 = (int) ((double) this.field3006.field371 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field3025[var12] != 0) {
                field3024[var12] = 0;
                field3019[var12] = (int) ((double) this.field3004[var12] * var4);
                field3021[var12] = (this.field3025[var12] << 14) / 100;
                field3022[var12] = (int) ((double) (this.field3015.field367 - this.field3015.field371) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3013[var12]) / var4);
                field3020[var12] = (int) ((double) this.field3015.field371 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field3015.method135(arg0);
            int var41 = this.field3018.method135(arg0);
            if (this.field3010 != null) {
                int var42 = this.field3010.method135(arg0);
                int var43 = this.field3007.method135(arg0);
                var40 += this.method982(var8, var43, this.field3010.field370) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field3006 != null) {
                int var44 = this.field3006.method135(arg0);
                int var45 = this.field3014.method135(arg0);
                var41 = var41 * ((this.method982(var11, var45, this.field3006.field370) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field3025[var46] != 0) {
                    int var47 = field3019[var46] + var13;
                    if (var47 < arg0) {
                        field3011[var47] += this.method982(field3024[var46], field3021[var46] * var41 >> 15, this.field3015.field370);
                        field3024[var46] += (field3022[var46] * var40 >> 16) + field3020[var46];
                    }
                }
            }
        }
        if (this.field3016 != null) {
            this.field3016.method136();
            this.field3001.method136();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field3016.method135(arg0);
                int var19 = this.field3001.method135(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field3016.field367 - this.field3016.field371) * var18 >> 8) + this.field3016.field371;
                } else {
                    var20 = ((this.field3016.field367 - this.field3016.field371) * var19 >> 8) + this.field3016.field371;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field3011[var17] = 0;
                }
            }
        }
        if (this.field3009 > 0 && this.field3017 > 0) {
            int var21 = (int) ((double) this.field3009 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field3011[var22] += field3011[var22 - var21] * this.field3017 / 100;
            }
        }
        if (this.field3005.field48[0] > 0 || this.field3005.field48[1] > 0) {
            this.field3023.method136();
            int var23 = this.field3023.method135(arg0 + 1);
            int var24 = this.field3005.method19(0, (float) var23 / 65536.0F);
            int var25 = this.field3005.method19(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field3011[var24 + var26] * (long) class2.field45 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field3011[var24 + var26 - var37 - 1] * (long) class2.field46[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field3011[var26 - var38 - 1] * (long) class2.field46[1][var38] >> 16);
                    }
                    field3011[var26] = var36;
                    var23 = this.field3023.method135(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field3011[var24 + var26] * (long) class2.field45 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field3011[var24 + var26 - var34 - 1] * (long) class2.field46[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field3011[var26 - var35 - 1] * (long) class2.field46[1][var35] >> 16);
                        }
                        field3011[var26] = var33;
                        var23 = this.field3023.method135(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field3011[var24 + var26 - var30 - 1] * (long) class2.field46[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field3011[var26 - var31 - 1] * (long) class2.field46[1][var31] >> 16);
                            }
                            field3011[var26] = var29;
                            this.field3023.method135(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field3005.method19(0, (float) var23 / 65536.0F);
                    var25 = this.field3005.method19(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field3011[var39] < -32768) {
                field3011[var39] = -32768;
            }
            if (field3011[var39] > 32767) {
                field3011[var39] = 32767;
            }
        }
        return field3011;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lg;)V", line = 314)
    public final void method981(class39 arg0) {
        this.field3015 = new class18();
        this.field3015.method138(arg0);
        this.field3018 = new class18();
        this.field3018.method138(arg0);
        int var2 = arg0.method334(107);
        if (var2 != 0) {
            arg0.field998--;
            this.field3010 = new class18();
            this.field3010.method138(arg0);
            this.field3007 = new class18();
            this.field3007.method138(arg0);
        }
        int var3 = arg0.method334(117);
        if (var3 != 0) {
            arg0.field998--;
            this.field3006 = new class18();
            this.field3006.method138(arg0);
            this.field3014 = new class18();
            this.field3014.method138(arg0);
        }
        int var4 = arg0.method334(115);
        if (var4 != 0) {
            arg0.field998--;
            this.field3016 = new class18();
            this.field3016.method138(arg0);
            this.field3001 = new class18();
            this.field3001.method138(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method311((byte) -83);
            if (var6 == 0) {
                break;
            }
            this.field3025[var5] = var6;
            this.field3013[var5] = arg0.method304(106);
            this.field3004[var5] = arg0.method311((byte) -78);
        }
        this.field3009 = arg0.method311((byte) -123);
        this.field3017 = arg0.method311((byte) -88);
        this.field3012 = arg0.method326(255);
        this.field3002 = arg0.method326(255);
        this.field3005 = new class2();
        this.field3023 = new class18();
        this.field3005.method20(arg0, this.field3023);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I", line = 381)
    private final int method982(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3008[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3003[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
