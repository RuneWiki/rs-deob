import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JRZPSMWR")
public class class25 {

    @OriginalMember(owner = "client!JRZPSMWR", name = "a", descriptor = "Z")
    private boolean field896 = false;

    @OriginalMember(owner = "client!JRZPSMWR", name = "j", descriptor = "[I")
    private int[] field905 = new int[5];

    @OriginalMember(owner = "client!JRZPSMWR", name = "k", descriptor = "[I")
    private int[] field906 = new int[5];

    @OriginalMember(owner = "client!JRZPSMWR", name = "l", descriptor = "[I")
    private int[] field907 = new int[5];

    @OriginalMember(owner = "client!JRZPSMWR", name = "n", descriptor = "I")
    private int field909 = 100;

    @OriginalMember(owner = "client!JRZPSMWR", name = "q", descriptor = "I")
    public int field912 = 500;

    @OriginalMember(owner = "client!JRZPSMWR", name = "v", descriptor = "[I")
    private static int[] field917 = new int[5];

    @OriginalMember(owner = "client!JRZPSMWR", name = "w", descriptor = "[I")
    private static int[] field918 = new int[5];

    @OriginalMember(owner = "client!JRZPSMWR", name = "x", descriptor = "[I")
    private static int[] field919 = new int[5];

    @OriginalMember(owner = "client!JRZPSMWR", name = "y", descriptor = "[I")
    private static int[] field920 = new int[5];

    @OriginalMember(owner = "client!JRZPSMWR", name = "z", descriptor = "[I")
    private static int[] field921 = new int[5];

    @OriginalMember(owner = "client!JRZPSMWR", name = "m", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "client!JRZPSMWR", name = "r", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!JRZPSMWR", name = "b", descriptor = "LISLGIOFS;")
    private class21 field897;

    @OriginalMember(owner = "client!JRZPSMWR", name = "c", descriptor = "LISLGIOFS;")
    private class21 field898;

    @OriginalMember(owner = "client!JRZPSMWR", name = "d", descriptor = "LISLGIOFS;")
    private class21 field899;

    @OriginalMember(owner = "client!JRZPSMWR", name = "e", descriptor = "LISLGIOFS;")
    private class21 field900;

    @OriginalMember(owner = "client!JRZPSMWR", name = "f", descriptor = "LISLGIOFS;")
    private class21 field901;

    @OriginalMember(owner = "client!JRZPSMWR", name = "g", descriptor = "LISLGIOFS;")
    private class21 field902;

    @OriginalMember(owner = "client!JRZPSMWR", name = "h", descriptor = "LISLGIOFS;")
    private class21 field903;

    @OriginalMember(owner = "client!JRZPSMWR", name = "i", descriptor = "LISLGIOFS;")
    private class21 field904;

    @OriginalMember(owner = "client!JRZPSMWR", name = "p", descriptor = "LISLGIOFS;")
    private class21 field911;

    @OriginalMember(owner = "client!JRZPSMWR", name = "o", descriptor = "LQMCMKVTF;")
    private class42 field910;

    @OriginalMember(owner = "client!JRZPSMWR", name = "s", descriptor = "[I")
    private static int[] field914;

    @OriginalMember(owner = "client!JRZPSMWR", name = "t", descriptor = "[I")
    private static int[] field915;

    @OriginalMember(owner = "client!JRZPSMWR", name = "u", descriptor = "[I")
    private static int[] field916;

    @OriginalMember(owner = "client!JRZPSMWR", name = "a", descriptor = "()V")
    public static final void method300() {
        field915 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field915[var0] = 1;
            } else {
                field915[var0] = -1;
            }
        }
        field916 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field916[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field914 = new int[220500];
    }

    @OriginalMember(owner = "client!JRZPSMWR", name = "a", descriptor = "(II)[I")
    public final int[] method301(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field914[var3] = 0;
        }
        if (arg1 < 10) {
            return field914;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field897.method297(0);
        this.field898.method297(0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field899 != null) {
            this.field899.method297(0);
            this.field900.method297(0);
            var6 = (int) ((double) (this.field899.field859 - this.field899.field858) * 32.768D / var4);
            var7 = (int) ((double) this.field899.field858 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field901 != null) {
            this.field901.method297(0);
            this.field902.method297(0);
            var9 = (int) ((double) (this.field901.field859 - this.field901.field858) * 32.768D / var4);
            var10 = (int) ((double) this.field901.field858 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field905[var12] != 0) {
                field917[var12] = 0;
                field918[var12] = (int) ((double) this.field907[var12] * var4);
                field919[var12] = (this.field905[var12] << 14) / 100;
                field920[var12] = (int) ((double) (this.field897.field859 - this.field897.field858) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field906[var12]) / var4);
                field921[var12] = (int) ((double) this.field897.field858 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field897.method298(510, arg0);
            int var42 = this.field898.method298(510, arg0);
            if (this.field899 != null) {
                int var43 = this.field899.method298(510, arg0);
                int var44 = this.field900.method298(510, arg0);
                var41 += this.method302(var44, this.field899.field860, var8, true) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field901 != null) {
                int var45 = this.field901.method298(510, arg0);
                int var46 = this.field902.method298(510, arg0);
                var42 = var42 * ((this.method302(var46, this.field901.field860, var11, true) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field905[var47] != 0) {
                    int var48 = field918[var47] + var13;
                    if (var48 < arg0) {
                        field914[var48] += this.method302(field919[var47] * var42 >> 15, this.field897.field860, field917[var47], true);
                        field917[var47] += (field920[var47] * var41 >> 16) + field921[var47];
                    }
                }
            }
        }
        if (this.field903 != null) {
            this.field903.method297(0);
            this.field904.method297(0);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field903.method298(510, arg0);
                int var19 = this.field904.method298(510, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field903.field859 - this.field903.field858) * var18 >> 8) + this.field903.field858;
                } else {
                    var20 = ((this.field903.field859 - this.field903.field858) * var19 >> 8) + this.field903.field858;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field914[var17] = 0;
                }
            }
        }
        if (this.field908 > 0 && this.field909 > 0) {
            int var21 = (int) ((double) this.field908 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field914[var22] += field914[var22 - var21] * this.field909 / 100;
            }
        }
        if (this.field910.field1159[0] > 0 || this.field910.field1159[1] > 0) {
            this.field911.method297(0);
            int var23 = this.field911.method298(510, arg0 + 1);
            int var24 = this.field910.method371(0, true, (float) var23 / 65536.0F);
            int var25 = this.field910.method371(1, true, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field914[var24 + var26] * (long) class42.field1166 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field914[var24 + var26 - var38 - 1] * (long) class42.field1164[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field914[var26 - var39 - 1] * (long) class42.field1164[1][var39] >> 16);
                    }
                    field914[var26] = var37;
                    var23 = this.field911.method298(510, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field914[var24 + var26] * (long) class42.field1166 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field914[var24 + var26 - var35 - 1] * (long) class42.field1164[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field914[var26 - var36 - 1] * (long) class42.field1164[1][var36] >> 16);
                        }
                        field914[var26] = var34;
                        var23 = this.field911.method298(510, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field914[var24 + var26 - var31 - 1] * (long) class42.field1164[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field914[var26 - var32 - 1] * (long) class42.field1164[1][var32] >> 16);
                            }
                            field914[var26] = var30;
                            this.field911.method298(510, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field910.method371(0, true, (float) var23 / 65536.0F);
                    var25 = this.field910.method371(1, true, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field914[var40] < -32768) {
                field914[var40] = -32768;
            }
            if (field914[var40] > 32767) {
                field914[var40] = 32767;
            }
        }
        return field914;
    }

    @OriginalMember(owner = "client!JRZPSMWR", name = "a", descriptor = "(IIIZ)I")
    private final int method302(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.field896 = !this.field896;
        }
        if (arg1 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg1 == 2) {
            return field916[arg2 & 0x7FFF] * arg0 >> 14;
        } else if (arg1 == 3) {
            return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg1 == 4) {
            return field915[arg2 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!JRZPSMWR", name = "a", descriptor = "(ILEMWAMCXW;)V")
    public final void method303(int arg0, class14 arg1) {
        this.field897 = new class21();
        this.field897.method295(1016, arg1);
        this.field898 = new class21();
        this.field898.method295(1016, arg1);
        int var3 = arg1.method217();
        if (var3 != 0) {
            arg1.field707--;
            this.field899 = new class21();
            this.field899.method295(1016, arg1);
            this.field900 = new class21();
            this.field900.method295(1016, arg1);
        }
        int var4 = arg1.method217();
        if (arg0 != 1016) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var4 != 0) {
            arg1.field707--;
            this.field901 = new class21();
            this.field901.method295(1016, arg1);
            this.field902 = new class21();
            this.field902.method295(1016, arg1);
        }
        int var6 = arg1.method217();
        if (var6 != 0) {
            arg1.field707--;
            this.field903 = new class21();
            this.field903.method295(1016, arg1);
            this.field904 = new class21();
            this.field904.method295(1016, arg1);
        }
        for (int var7 = 0; var7 < 10; var7++) {
            int var8 = arg1.method231();
            if (var8 == 0) {
                break;
            }
            this.field905[var7] = var8;
            this.field906[var7] = arg1.method230();
            this.field907[var7] = arg1.method231();
        }
        this.field908 = arg1.method231();
        this.field909 = arg1.method231();
        this.field912 = arg1.method219();
        this.field913 = arg1.method219();
        this.field910 = new class42();
        this.field911 = new class21();
        this.field910.method372(false, arg1, this.field911);
    }
}
