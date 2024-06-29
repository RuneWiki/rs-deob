import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class118 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field2072 = 500;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field2073 = 0;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[I")
    private int[] field2076 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
    private int[] field2075 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!s", name = "n", descriptor = "[I")
    private int[] field2083 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    private int field2089 = 0;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    private int field2090 = 100;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[I")
    private static int[] field2079 = new int[32768];

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
    private static int[] field2080;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[I")
    private static int[] field2081;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "[I")
    private static int[] field2093;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "[I")
    private static int[] field2094;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "[I")
    private static int[] field2091;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
    private static int[] field2084;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "[I")
    private static int[] field2087;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lub;")
    private class11 field2070;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lub;")
    private class11 field2071;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lub;")
    private class11 field2074;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lub;")
    private class11 field2077;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lub;")
    private class11 field2078;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lub;")
    private class11 field2082;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lub;")
    private class11 field2085;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Lub;")
    private class11 field2088;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "Lub;")
    private class11 field2092;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Lkh;")
    private class7 field2086;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lbc;)V", line = 7)
    public final void method804(class153 arg0) {
        this.field2082 = new class11();
        this.field2082.method70(arg0);
        this.field2085 = new class11();
        this.field2085.method70(arg0);
        int var2 = arg0.method1082(-29);
        if (var2 != 0) {
            arg0.field2611--;
            this.field2070 = new class11();
            this.field2070.method70(arg0);
            this.field2088 = new class11();
            this.field2088.method70(arg0);
        }
        int var3 = arg0.method1082(-77);
        if (var3 != 0) {
            arg0.field2611--;
            this.field2071 = new class11();
            this.field2071.method70(arg0);
            this.field2074 = new class11();
            this.field2074.method70(arg0);
        }
        int var4 = arg0.method1082(-52);
        if (var4 != 0) {
            arg0.field2611--;
            this.field2092 = new class11();
            this.field2092.method70(arg0);
            this.field2078 = new class11();
            this.field2078.method70(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1050(-32768);
            if (var6 == 0) {
                break;
            }
            this.field2075[var5] = var6;
            this.field2083[var5] = arg0.method1060(true);
            this.field2076[var5] = arg0.method1050(-32768);
        }
        this.field2089 = arg0.method1050(-32768);
        this.field2090 = arg0.method1050(-32768);
        this.field2072 = arg0.method1090(false);
        this.field2073 = arg0.method1090(false);
        this.field2086 = new class7();
        this.field2077 = new class11();
        this.field2086.method42(arg0, this.field2077);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2079[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2080 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2080[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2081 = new int[220500];
        field2093 = new int[5];
        field2094 = new int[5];
        field2091 = new int[5];
        field2084 = new int[5];
        field2087 = new int[5];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 123)
    private final int method805(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2080[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2079[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[I", line = 146)
    public final int[] method806(int arg0, int arg1) {
        class190.method1320(field2081, 0, arg0);
        if (arg1 < 10) {
            return field2081;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2082.method69();
        this.field2085.method69();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2070 != null) {
            this.field2070.method69();
            this.field2088.method69();
            var5 = (int) ((double) (this.field2070.field83 - this.field2070.field87) * 32.768D / var3);
            var6 = (int) ((double) this.field2070.field87 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2071 != null) {
            this.field2071.method69();
            this.field2074.method69();
            var8 = (int) ((double) (this.field2071.field83 - this.field2071.field87) * 32.768D / var3);
            var9 = (int) ((double) this.field2071.field87 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2075[var11] != 0) {
                field2091[var11] = 0;
                field2094[var11] = (int) ((double) this.field2076[var11] * var3);
                field2093[var11] = (this.field2075[var11] << 14) / 100;
                field2084[var11] = (int) ((double) (this.field2082.field83 - this.field2082.field87) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2083[var11]) / var3);
                field2087[var11] = (int) ((double) this.field2082.field87 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field2082.method68(arg0);
            int var14 = this.field2085.method68(arg0);
            if (this.field2070 != null) {
                int var15 = this.field2070.method68(arg0);
                int var16 = this.field2088.method68(arg0);
                var13 += this.method805(var7, var16, this.field2070.field85) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field2071 != null) {
                int var17 = this.field2071.method68(arg0);
                int var18 = this.field2074.method68(arg0);
                var14 = var14 * ((this.method805(var10, var18, this.field2071.field85) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field2075[var19] != 0) {
                    int var20 = field2094[var19] + var12;
                    if (var20 < arg0) {
                        field2081[var20] += this.method805(field2091[var19], field2093[var19] * var14 >> 15, this.field2082.field85);
                        field2091[var19] += (field2084[var19] * var13 >> 16) + field2087[var19];
                    }
                }
            }
        }
        if (this.field2092 != null) {
            this.field2092.method69();
            this.field2078.method69();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field2092.method68(arg0);
                int var26 = this.field2078.method68(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field2092.field83 - this.field2092.field87) * var25 >> 8) + this.field2092.field87;
                } else {
                    var27 = ((this.field2092.field83 - this.field2092.field87) * var26 >> 8) + this.field2092.field87;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field2081[var24] = 0;
                }
            }
        }
        if (this.field2089 > 0 && this.field2090 > 0) {
            int var28 = (int) ((double) this.field2089 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field2081[var29] += field2081[var29 - var28] * this.field2090 / 100;
            }
        }
        if (this.field2086.field60[0] > 0 || this.field2086.field60[1] > 0) {
            this.field2077.method69();
            int var30 = this.field2077.method68(arg0 + 1);
            int var31 = this.field2086.method43(0, (float) var30 / 65536.0F);
            int var32 = this.field2086.method43(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field2081[var31 + var33] * (long) class7.field61 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field2081[var31 + var33 - var36 - 1] * (long) class7.field56[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field2081[var33 - var37 - 1] * (long) class7.field56[1][var37] >> 16);
                    }
                    field2081[var33] = var35;
                    var30 = this.field2077.method68(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field2081[var31 + var33] * (long) class7.field61 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field2081[var31 + var33 - var40 - 1] * (long) class7.field56[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field2081[var33 - var41 - 1] * (long) class7.field56[1][var41] >> 16);
                        }
                        field2081[var33] = var39;
                        var30 = this.field2077.method68(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field2081[var31 + var33 - var43 - 1] * (long) class7.field56[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field2081[var33 - var44 - 1] * (long) class7.field56[1][var44] >> 16);
                            }
                            field2081[var33] = var42;
                            this.field2077.method68(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field2086.method43(0, (float) var30 / 65536.0F);
                    var32 = this.field2086.method43(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field2081[var46] < -32768) {
                field2081[var46] = -32768;
            }
            if (field2081[var46] > 32767) {
                field2081[var46] = 32767;
            }
        }
        return field2081;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V", line = 454)
    public static void method807() {
        field2081 = null;
        field2079 = null;
        field2080 = null;
        field2091 = null;
        field2094 = null;
        field2093 = null;
        field2084 = null;
        field2087 = null;
    }
}
