import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class119 {

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public int field2827 = 0;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    private int field2829 = 0;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "[I")
    private int[] field2836 = new int[5];

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    private int field2828 = 100;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public int field2823 = 500;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "[I")
    private int[] field2832 = new int[5];

    @OriginalMember(owner = "client!t", name = "r", descriptor = "[I")
    private int[] field2838 = new int[5];

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[I")
    private static int[] field2825 = new int[32768];

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
    private static int[] field2831;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "[I")
    private static int[] field2837;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "[I")
    private static int[] field2841;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "[I")
    private static int[] field2843;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "[I")
    private static int[] field2842;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "[I")
    private static int[] field2844;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "[I")
    private static int[] field2845;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lse;")
    private class115 field2830;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lhb;")
    private class45 field2821;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lhb;")
    private class45 field2822;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lhb;")
    private class45 field2824;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lhb;")
    private class45 field2826;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lhb;")
    private class45 field2833;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lhb;")
    private class45 field2834;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Lhb;")
    private class45 field2835;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Lhb;")
    private class45 field2839;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lhb;")
    private class45 field2840;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2825[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2831 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2831[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2837 = new int[220500];
        field2841 = new int[5];
        field2843 = new int[5];
        field2842 = new int[5];
        field2844 = new int[5];
        field2845 = new int[5];
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lm;)V", line = 9)
    public final void method972(class77 arg0) {
        this.field2821 = new class45();
        this.field2821.method366(arg0);
        this.field2824 = new class45();
        this.field2824.method366(arg0);
        int var2 = arg0.method620((byte) -8);
        if (var2 != 0) {
            arg0.field1821--;
            this.field2834 = new class45();
            this.field2834.method366(arg0);
            this.field2822 = new class45();
            this.field2822.method366(arg0);
        }
        int var3 = arg0.method620((byte) -8);
        if (var3 != 0) {
            arg0.field1821--;
            this.field2833 = new class45();
            this.field2833.method366(arg0);
            this.field2835 = new class45();
            this.field2835.method366(arg0);
        }
        int var4 = arg0.method620((byte) -8);
        if (var4 != 0) {
            arg0.field1821--;
            this.field2839 = new class45();
            this.field2839.method366(arg0);
            this.field2826 = new class45();
            this.field2826.method366(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method662((byte) 110);
            if (var6 == 0) {
                break;
            }
            this.field2838[var5] = var6;
            this.field2836[var5] = arg0.method653((byte) -87);
            this.field2832[var5] = arg0.method662((byte) 113);
        }
        this.field2829 = arg0.method662((byte) 123);
        this.field2828 = arg0.method662((byte) 127);
        this.field2823 = arg0.method636(111);
        this.field2827 = arg0.method636(-25);
        this.field2830 = new class115();
        this.field2840 = new class45();
        this.field2830.method947(arg0, this.field2840);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V", line = 72)
    public static void method973() {
        field2837 = null;
        field2825 = null;
        field2831 = null;
        field2843 = null;
        field2844 = null;
        field2841 = null;
        field2845 = null;
        field2842 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)I", line = 88)
    private final int method974(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2831[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2825[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[I", line = 138)
    public final int[] method975(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field2837[var3] = 0;
        }
        if (arg1 < 10) {
            return field2837;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2821.method367();
        this.field2824.method367();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field2834 != null) {
            this.field2834.method367();
            this.field2822.method367();
            var6 = (int) ((double) (this.field2834.field1010 - this.field2834.field1007) * 32.768D / var4);
            var7 = (int) ((double) this.field2834.field1007 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field2833 != null) {
            this.field2833.method367();
            this.field2835.method367();
            var9 = (int) ((double) (this.field2833.field1010 - this.field2833.field1007) * 32.768D / var4);
            var10 = (int) ((double) this.field2833.field1007 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field2838[var12] != 0) {
                field2843[var12] = 0;
                field2844[var12] = (int) ((double) this.field2832[var12] * var4);
                field2841[var12] = (this.field2838[var12] << 14) / 100;
                field2845[var12] = (int) ((double) (this.field2821.field1010 - this.field2821.field1007) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2836[var12]) / var4);
                field2842[var12] = (int) ((double) this.field2821.field1007 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field2821.method369(arg0);
            int var41 = this.field2824.method369(arg0);
            if (this.field2834 != null) {
                int var42 = this.field2834.method369(arg0);
                int var43 = this.field2822.method369(arg0);
                var40 += this.method974(var8, var43, this.field2834.field1009) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field2833 != null) {
                int var44 = this.field2833.method369(arg0);
                int var45 = this.field2835.method369(arg0);
                var41 = var41 * ((this.method974(var11, var45, this.field2833.field1009) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field2838[var46] != 0) {
                    int var47 = field2844[var46] + var13;
                    if (var47 < arg0) {
                        field2837[var47] += this.method974(field2843[var46], field2841[var46] * var41 >> 15, this.field2821.field1009);
                        field2843[var46] += (field2845[var46] * var40 >> 16) + field2842[var46];
                    }
                }
            }
        }
        if (this.field2839 != null) {
            this.field2839.method367();
            this.field2826.method367();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field2839.method369(arg0);
                int var19 = this.field2826.method369(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field2839.field1010 - this.field2839.field1007) * var18 >> 8) + this.field2839.field1007;
                } else {
                    var20 = ((this.field2839.field1010 - this.field2839.field1007) * var19 >> 8) + this.field2839.field1007;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field2837[var17] = 0;
                }
            }
        }
        if (this.field2829 > 0 && this.field2828 > 0) {
            int var21 = (int) ((double) this.field2829 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field2837[var22] += field2837[var22 - var21] * this.field2828 / 100;
            }
        }
        if (this.field2830.field2705[0] > 0 || this.field2830.field2705[1] > 0) {
            this.field2840.method367();
            int var23 = this.field2840.method369(arg0 + 1);
            int var24 = this.field2830.method950(0, (float) var23 / 65536.0F);
            int var25 = this.field2830.method950(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field2837[var24 + var26] * (long) class115.field2707 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field2837[var24 + var26 - var37 - 1] * (long) class115.field2708[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field2837[var26 - var38 - 1] * (long) class115.field2708[1][var38] >> 16);
                    }
                    field2837[var26] = var36;
                    var23 = this.field2840.method369(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field2837[var24 + var26] * (long) class115.field2707 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field2837[var24 + var26 - var34 - 1] * (long) class115.field2708[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field2837[var26 - var35 - 1] * (long) class115.field2708[1][var35] >> 16);
                        }
                        field2837[var26] = var33;
                        var23 = this.field2840.method369(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field2837[var24 + var26 - var30 - 1] * (long) class115.field2708[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field2837[var26 - var31 - 1] * (long) class115.field2708[1][var31] >> 16);
                            }
                            field2837[var26] = var29;
                            this.field2840.method369(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field2830.method950(0, (float) var23 / 65536.0F);
                    var25 = this.field2830.method950(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field2837[var39] < -32768) {
                field2837[var39] = -32768;
            }
            if (field2837[var39] > 32767) {
                field2837[var39] = 32767;
            }
        }
        return field2837;
    }
}
