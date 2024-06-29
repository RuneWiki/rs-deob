import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class76 {

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    private int field821 = 0;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public int field818 = 500;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "[I")
    private int[] field830 = new int[5];

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "[I")
    private int[] field820 = new int[5];

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public int field828 = 0;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "[I")
    private int[] field831 = new int[5];

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    private int field816 = 100;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
    private static int[] field824 = new int[32768];

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "[I")
    private static int[] field815;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "[I")
    private static int[] field826;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "[I")
    private static int[] field834;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "[I")
    private static int[] field837;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "[I")
    private static int[] field836;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "[I")
    private static int[] field835;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "[I")
    private static int[] field838;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "Lan;")
    private class21 field833;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Lke;")
    private class520 field817;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Lke;")
    private class520 field819;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "Lke;")
    private class520 field822;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Lke;")
    private class520 field823;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Lke;")
    private class520 field825;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "Lke;")
    private class520 field827;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "Lke;")
    private class520 field829;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Lke;")
    private class520 field832;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "Lke;")
    private class520 field839;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)I")
    private final int method495(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field815[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field824[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lrt;)V")
    public final void method496(class194 arg0) {
        this.field839 = new class520();
        this.field839.method3079(arg0);
        this.field822 = new class520();
        this.field822.method3079(arg0);
        int var2 = arg0.method1177(255);
        if (var2 != 0) {
            arg0.field2610--;
            this.field825 = new class520();
            this.field825.method3079(arg0);
            this.field827 = new class520();
            this.field827.method3079(arg0);
        }
        int var3 = arg0.method1177(255);
        if (var3 != 0) {
            arg0.field2610--;
            this.field832 = new class520();
            this.field832.method3079(arg0);
            this.field819 = new class520();
            this.field819.method3079(arg0);
        }
        int var4 = arg0.method1177(255);
        if (var4 != 0) {
            arg0.field2610--;
            this.field817 = new class520();
            this.field817.method3079(arg0);
            this.field829 = new class520();
            this.field829.method3079(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1176((byte) -123);
            if (var6 == 0) {
                break;
            }
            this.field830[var5] = var6;
            this.field831[var5] = arg0.method1193(-1);
            this.field820[var5] = arg0.method1176((byte) -40);
        }
        this.field821 = arg0.method1176((byte) 125);
        this.field816 = arg0.method1176((byte) -6);
        this.field818 = arg0.method1220(-41);
        this.field828 = arg0.method1220(116);
        this.field833 = new class21();
        this.field823 = new class520();
        this.field833.method133(arg0, this.field823);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
    public static void method497() {
        field826 = null;
        field824 = null;
        field815 = null;
        field838 = null;
        field834 = null;
        field835 = null;
        field836 = null;
        field837 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
    public final int[] method498(int arg0, int arg1) {
        class210.method1326(field826, 0, arg0);
        if (arg1 < 10) {
            return field826;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field839.method3078();
        this.field822.method3078();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field825 != null) {
            this.field825.method3078();
            this.field827.method3078();
            var5 = (int) ((double) (this.field825.field7558 - this.field825.field7557) * 32.768D / var3);
            var6 = (int) ((double) this.field825.field7557 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field832 != null) {
            this.field832.method3078();
            this.field819.method3078();
            var8 = (int) ((double) (this.field832.field7558 - this.field832.field7557) * 32.768D / var3);
            var9 = (int) ((double) this.field832.field7557 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field830[var11] != 0) {
                field838[var11] = 0;
                field834[var11] = (int) ((double) this.field820[var11] * var3);
                field835[var11] = (this.field830[var11] << 14) / 100;
                field836[var11] = (int) ((double) (this.field839.field7558 - this.field839.field7557) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field831[var11]) / var3);
                field837[var11] = (int) ((double) this.field839.field7557 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field839.method3076(arg0);
            int var40 = this.field822.method3076(arg0);
            if (this.field825 != null) {
                int var41 = this.field825.method3076(arg0);
                int var42 = this.field827.method3076(arg0);
                var39 += this.method495(var7, var42, this.field825.field7562) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field832 != null) {
                int var43 = this.field832.method3076(arg0);
                int var44 = this.field819.method3076(arg0);
                var40 = var40 * ((this.method495(var10, var44, this.field832.field7562) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field830[var45] != 0) {
                    int var46 = field834[var45] + var12;
                    if (var46 < arg0) {
                        field826[var46] += this.method495(field838[var45], field835[var45] * var40 >> 15, this.field839.field7562);
                        field838[var45] += (field836[var45] * var39 >> 16) + field837[var45];
                    }
                }
            }
        }
        if (this.field817 != null) {
            this.field817.method3078();
            this.field829.method3078();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field817.method3076(arg0);
                int var18 = this.field829.method3076(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field817.field7558 - this.field817.field7557) * var17 >> 8) + this.field817.field7557;
                } else {
                    var19 = ((this.field817.field7558 - this.field817.field7557) * var18 >> 8) + this.field817.field7557;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field826[var16] = 0;
                }
            }
        }
        if (this.field821 > 0 && this.field816 > 0) {
            int var20 = (int) ((double) this.field821 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field826[var21] += field826[var21 - var20] * this.field816 / 100;
            }
        }
        if (this.field833.field205[0] > 0 || this.field833.field205[1] > 0) {
            this.field823.method3078();
            int var22 = this.field823.method3076(arg0 + 1);
            int var23 = this.field833.method128(0, (float) var22 / 65536.0F);
            int var24 = this.field833.method128(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field826[var23 + var25] * (long) class21.field210 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field826[var23 + var25 - var36 - 1] * (long) class21.field211[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field826[var25 - var37 - 1] * (long) class21.field211[1][var37] >> 16);
                    }
                    field826[var25] = var35;
                    var22 = this.field823.method3076(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field826[var23 + var25] * (long) class21.field210 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field826[var23 + var25 - var33 - 1] * (long) class21.field211[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field826[var25 - var34 - 1] * (long) class21.field211[1][var34] >> 16);
                        }
                        field826[var25] = var32;
                        var22 = this.field823.method3076(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field826[var23 + var25 - var29 - 1] * (long) class21.field211[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field826[var25 - var30 - 1] * (long) class21.field211[1][var30] >> 16);
                            }
                            field826[var25] = var28;
                            this.field823.method3076(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field833.method128(0, (float) var22 / 65536.0F);
                    var24 = this.field833.method128(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field826[var38] < -32768) {
                field826[var38] = -32768;
            }
            if (field826[var38] > 32767) {
                field826[var38] = 32767;
            }
        }
        return field826;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field824[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field815 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field815[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field826 = new int[220500];
        field834 = new int[5];
        field837 = new int[5];
        field836 = new int[5];
        field835 = new int[5];
        field838 = new int[5];
    }
}
