import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class41 {

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    private int field804 = 0;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public int field807 = 0;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[I")
    private int[] field805 = new int[5];

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "[I")
    private int[] field815 = new int[5];

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    private int field813 = 100;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public int field812 = 500;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "[I")
    private int[] field817 = new int[5];

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[I")
    private static int[] field809 = new int[32768];

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
    private static int[] field800;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
    private static int[] field803;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "[I")
    private static int[] field816;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "[I")
    private static int[] field818;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "[I")
    private static int[] field819;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "[I")
    private static int[] field821;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "[I")
    private static int[] field820;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Ls;")
    private class105 field798;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Ls;")
    private class105 field799;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Ls;")
    private class105 field801;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Ls;")
    private class105 field802;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Ls;")
    private class105 field806;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Ls;")
    private class105 field808;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Ls;")
    private class105 field810;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Ls;")
    private class105 field811;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Ls;")
    private class105 field814;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Ltc;")
    private class113 field797;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
    private final int method243(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field800[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field809[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[I")
    public final int[] method244(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field803[var3] = 0;
        }
        if (arg1 < 10) {
            return field803;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field798.method785();
        this.field810.method785();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field806 != null) {
            this.field806.method785();
            this.field802.method785();
            var6 = (int) ((double) (this.field806.field2291 - this.field806.field2287) * 32.768D / var4);
            var7 = (int) ((double) this.field806.field2287 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field801 != null) {
            this.field801.method785();
            this.field811.method785();
            var9 = (int) ((double) (this.field801.field2291 - this.field801.field2287) * 32.768D / var4);
            var10 = (int) ((double) this.field801.field2287 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field805[var12] != 0) {
                field816[var12] = 0;
                field821[var12] = (int) ((double) this.field817[var12] * var4);
                field820[var12] = (this.field805[var12] << 14) / 100;
                field819[var12] = (int) ((double) (this.field798.field2291 - this.field798.field2287) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field815[var12]) / var4);
                field818[var12] = (int) ((double) this.field798.field2287 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field798.method787(arg0);
            int var41 = this.field810.method787(arg0);
            if (this.field806 != null) {
                int var42 = this.field806.method787(arg0);
                int var43 = this.field802.method787(arg0);
                var40 += this.method243(var8, var43, this.field806.field2288) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field801 != null) {
                int var44 = this.field801.method787(arg0);
                int var45 = this.field811.method787(arg0);
                var41 = var41 * ((this.method243(var11, var45, this.field801.field2288) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field805[var46] != 0) {
                    int var47 = field821[var46] + var13;
                    if (var47 < arg0) {
                        field803[var47] += this.method243(field816[var46], field820[var46] * var41 >> 15, this.field798.field2288);
                        field816[var46] += (field819[var46] * var40 >> 16) + field818[var46];
                    }
                }
            }
        }
        if (this.field808 != null) {
            this.field808.method785();
            this.field814.method785();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field808.method787(arg0);
                int var19 = this.field814.method787(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field808.field2291 - this.field808.field2287) * var18 >> 8) + this.field808.field2287;
                } else {
                    var20 = ((this.field808.field2291 - this.field808.field2287) * var19 >> 8) + this.field808.field2287;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field803[var17] = 0;
                }
            }
        }
        if (this.field804 > 0 && this.field813 > 0) {
            int var21 = (int) ((double) this.field804 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field803[var22] += field803[var22 - var21] * this.field813 / 100;
            }
        }
        if (this.field797.field2452[0] > 0 || this.field797.field2452[1] > 0) {
            this.field799.method785();
            int var23 = this.field799.method787(arg0 + 1);
            int var24 = this.field797.method828(0, (float) var23 / 65536.0F);
            int var25 = this.field797.method828(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field803[var24 + var26] * (long) class113.field2453 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field803[var24 + var26 - var37 - 1] * (long) class113.field2458[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field803[var26 - var38 - 1] * (long) class113.field2458[1][var38] >> 16);
                    }
                    field803[var26] = var36;
                    var23 = this.field799.method787(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field803[var24 + var26] * (long) class113.field2453 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field803[var24 + var26 - var34 - 1] * (long) class113.field2458[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field803[var26 - var35 - 1] * (long) class113.field2458[1][var35] >> 16);
                        }
                        field803[var26] = var33;
                        var23 = this.field799.method787(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field803[var24 + var26 - var30 - 1] * (long) class113.field2458[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field803[var26 - var31 - 1] * (long) class113.field2458[1][var31] >> 16);
                            }
                            field803[var26] = var29;
                            this.field799.method787(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field797.method828(0, (float) var23 / 65536.0F);
                    var25 = this.field797.method828(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field803[var39] < -32768) {
                field803[var39] = -32768;
            }
            if (field803[var39] > 32767) {
                field803[var39] = 32767;
            }
        }
        return field803;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lpd;)V")
    public final void method245(class94 arg0) {
        this.field798 = new class105();
        this.field798.method784(arg0);
        this.field810 = new class105();
        this.field810.method784(arg0);
        int var2 = arg0.method703((byte) -97);
        if (var2 != 0) {
            arg0.field2061--;
            this.field806 = new class105();
            this.field806.method784(arg0);
            this.field802 = new class105();
            this.field802.method784(arg0);
        }
        int var3 = arg0.method703((byte) -118);
        if (var3 != 0) {
            arg0.field2061--;
            this.field801 = new class105();
            this.field801.method784(arg0);
            this.field811 = new class105();
            this.field811.method784(arg0);
        }
        int var4 = arg0.method703((byte) -75);
        if (var4 != 0) {
            arg0.field2061--;
            this.field808 = new class105();
            this.field808.method784(arg0);
            this.field814 = new class105();
            this.field814.method784(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method684(false);
            if (var6 == 0) {
                break;
            }
            this.field805[var5] = var6;
            this.field815[var5] = arg0.method702((byte) -102);
            this.field817[var5] = arg0.method684(false);
        }
        this.field804 = arg0.method684(false);
        this.field813 = arg0.method684(false);
        this.field812 = arg0.method665(8666);
        this.field807 = arg0.method665(8666);
        this.field797 = new class113();
        this.field799 = new class105();
        this.field797.method832(arg0, this.field799);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
    public static void method246() {
        field803 = null;
        field809 = null;
        field800 = null;
        field816 = null;
        field821 = null;
        field820 = null;
        field819 = null;
        field818 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field809[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field800 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field800[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field803 = new int[220500];
        field816 = new int[5];
        field818 = new int[5];
        field819 = new int[5];
        field821 = new int[5];
        field820 = new int[5];
    }
}
