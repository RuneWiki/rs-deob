import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JUIUBOIF")
public class class27 {

    @OriginalMember(owner = "JUIUBOIF", name = "a", descriptor = "B")
    private byte field891 = -27;

    @OriginalMember(owner = "JUIUBOIF", name = "b", descriptor = "Z")
    private boolean field892 = false;

    @OriginalMember(owner = "JUIUBOIF", name = "c", descriptor = "B")
    private byte field893 = 102;

    @OriginalMember(owner = "JUIUBOIF", name = "l", descriptor = "[I")
    private int[] field902 = new int[5];

    @OriginalMember(owner = "JUIUBOIF", name = "m", descriptor = "[I")
    private int[] field903 = new int[5];

    @OriginalMember(owner = "JUIUBOIF", name = "n", descriptor = "[I")
    private int[] field904 = new int[5];

    @OriginalMember(owner = "JUIUBOIF", name = "p", descriptor = "I")
    private int field906 = 100;

    @OriginalMember(owner = "JUIUBOIF", name = "s", descriptor = "I")
    public int field909 = 500;

    @OriginalMember(owner = "JUIUBOIF", name = "x", descriptor = "[I")
    private static int[] field914 = new int[5];

    @OriginalMember(owner = "JUIUBOIF", name = "y", descriptor = "[I")
    private static int[] field915 = new int[5];

    @OriginalMember(owner = "JUIUBOIF", name = "z", descriptor = "[I")
    private static int[] field916 = new int[5];

    @OriginalMember(owner = "JUIUBOIF", name = "A", descriptor = "[I")
    private static int[] field917 = new int[5];

    @OriginalMember(owner = "JUIUBOIF", name = "B", descriptor = "[I")
    private static int[] field918 = new int[5];

    @OriginalMember(owner = "JUIUBOIF", name = "o", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "JUIUBOIF", name = "t", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "JUIUBOIF", name = "q", descriptor = "LEQHIVIBA;")
    private class13 field907;

    @OriginalMember(owner = "JUIUBOIF", name = "d", descriptor = "LVMVYFNTB;")
    private class65 field894;

    @OriginalMember(owner = "JUIUBOIF", name = "e", descriptor = "LVMVYFNTB;")
    private class65 field895;

    @OriginalMember(owner = "JUIUBOIF", name = "f", descriptor = "LVMVYFNTB;")
    private class65 field896;

    @OriginalMember(owner = "JUIUBOIF", name = "g", descriptor = "LVMVYFNTB;")
    private class65 field897;

    @OriginalMember(owner = "JUIUBOIF", name = "h", descriptor = "LVMVYFNTB;")
    private class65 field898;

    @OriginalMember(owner = "JUIUBOIF", name = "i", descriptor = "LVMVYFNTB;")
    private class65 field899;

    @OriginalMember(owner = "JUIUBOIF", name = "j", descriptor = "LVMVYFNTB;")
    private class65 field900;

    @OriginalMember(owner = "JUIUBOIF", name = "k", descriptor = "LVMVYFNTB;")
    private class65 field901;

    @OriginalMember(owner = "JUIUBOIF", name = "r", descriptor = "LVMVYFNTB;")
    private class65 field908;

    @OriginalMember(owner = "JUIUBOIF", name = "u", descriptor = "[I")
    private static int[] field911;

    @OriginalMember(owner = "JUIUBOIF", name = "v", descriptor = "[I")
    private static int[] field912;

    @OriginalMember(owner = "JUIUBOIF", name = "w", descriptor = "[I")
    private static int[] field913;

    @OriginalMember(owner = "JUIUBOIF", name = "a", descriptor = "()V")
    public static final void method301() {
        field912 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field912[var0] = 1;
            } else {
                field912[var0] = -1;
            }
        }
        field913 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field913[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field911 = new int[220500];
    }

    @OriginalMember(owner = "JUIUBOIF", name = "a", descriptor = "(II)[I")
    public final int[] method302(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field911[var3] = 0;
        }
        if (arg1 < 10) {
            return field911;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field894.method515((byte) 114);
        this.field895.method515((byte) 114);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field896 != null) {
            this.field896.method515((byte) 114);
            this.field897.method515((byte) 114);
            var6 = (int) ((double) (this.field896.field1594 - this.field896.field1593) * 32.768D / var4);
            var7 = (int) ((double) this.field896.field1593 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field898 != null) {
            this.field898.method515((byte) 114);
            this.field899.method515((byte) 114);
            var9 = (int) ((double) (this.field898.field1594 - this.field898.field1593) * 32.768D / var4);
            var10 = (int) ((double) this.field898.field1593 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field902[var12] != 0) {
                field914[var12] = 0;
                field915[var12] = (int) ((double) this.field904[var12] * var4);
                field916[var12] = (this.field902[var12] << 14) / 100;
                field917[var12] = (int) ((double) (this.field894.field1594 - this.field894.field1593) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field903[var12]) / var4);
                field918[var12] = (int) ((double) this.field894.field1593 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field894.method516(arg0, 6);
            int var42 = this.field895.method516(arg0, 6);
            if (this.field896 != null) {
                int var43 = this.field896.method516(arg0, 6);
                int var44 = this.field897.method516(arg0, 6);
                var41 += this.method303(var8, (byte) 102, this.field896.field1595, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field898 != null) {
                int var45 = this.field898.method516(arg0, 6);
                int var46 = this.field899.method516(arg0, 6);
                var42 = var42 * ((this.method303(var11, (byte) 102, this.field898.field1595, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field902[var47] != 0) {
                    int var48 = field915[var47] + var13;
                    if (var48 < arg0) {
                        field911[var48] += this.method303(field914[var47], (byte) 102, this.field894.field1595, field916[var47] * var42 >> 15);
                        field914[var47] += (field917[var47] * var41 >> 16) + field918[var47];
                    }
                }
            }
        }
        if (this.field900 != null) {
            this.field900.method515((byte) 114);
            this.field901.method515((byte) 114);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field900.method516(arg0, 6);
                int var19 = this.field901.method516(arg0, 6);
                int var20;
                if (var16) {
                    var20 = ((this.field900.field1594 - this.field900.field1593) * var18 >> 8) + this.field900.field1593;
                } else {
                    var20 = ((this.field900.field1594 - this.field900.field1593) * var19 >> 8) + this.field900.field1593;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field911[var17] = 0;
                }
            }
        }
        if (this.field905 > 0 && this.field906 > 0) {
            int var21 = (int) ((double) this.field905 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field911[var22] += field911[var22 - var21] * this.field906 / 100;
            }
        }
        if (this.field907.field655[0] > 0 || this.field907.field655[1] > 0) {
            this.field908.method515((byte) 114);
            int var23 = this.field908.method516(arg0 + 1, 6);
            int var24 = this.field907.method190(-23989, (float) var23 / 65536.0F, 0);
            int var25 = this.field907.method190(-23989, (float) var23 / 65536.0F, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field911[var24 + var26] * (long) class13.field662 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field911[var24 + var26 - var38 - 1] * (long) class13.field660[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field911[var26 - var39 - 1] * (long) class13.field660[1][var39] >> 16);
                    }
                    field911[var26] = var37;
                    var23 = this.field908.method516(arg0 + 1, 6);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field911[var24 + var26] * (long) class13.field662 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field911[var24 + var26 - var35 - 1] * (long) class13.field660[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field911[var26 - var36 - 1] * (long) class13.field660[1][var36] >> 16);
                        }
                        field911[var26] = var34;
                        var23 = this.field908.method516(arg0 + 1, 6);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field911[var24 + var26 - var31 - 1] * (long) class13.field660[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field911[var26 - var32 - 1] * (long) class13.field660[1][var32] >> 16);
                            }
                            field911[var26] = var30;
                            this.field908.method516(arg0 + 1, 6);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field907.method190(-23989, (float) var23 / 65536.0F, 0);
                    var25 = this.field907.method190(-23989, (float) var23 / 65536.0F, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field911[var40] < -32768) {
                field911[var40] = -32768;
            }
            if (field911[var40] > 32767) {
                field911[var40] = 32767;
            }
        }
        return field911;
    }

    @OriginalMember(owner = "JUIUBOIF", name = "a", descriptor = "(IBII)I")
    private final int method303(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field893 != arg1) {
            this.field892 = !this.field892;
        }
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg2 == 2) {
            return field913[arg0 & 0x7FFF] * arg3 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg2 == 4) {
            return field912[arg0 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "JUIUBOIF", name = "a", descriptor = "(BLXJCNBMKS;)V")
    public final void method304(byte arg0, class68 arg1) {
        this.field894 = new class65();
        this.field894.method513(this.field891, arg1);
        this.field895 = new class65();
        this.field895.method513(this.field891, arg1);
        int var3 = arg1.method534();
        if (var3 != 0) {
            arg1.field1643--;
            this.field896 = new class65();
            this.field896.method513(this.field891, arg1);
            this.field897 = new class65();
            this.field897.method513(this.field891, arg1);
        }
        int var4 = arg1.method534();
        if (var4 != 0) {
            arg1.field1643--;
            this.field898 = new class65();
            this.field898.method513(this.field891, arg1);
            this.field899 = new class65();
            this.field899.method513(this.field891, arg1);
        }
        int var5 = arg1.method534();
        if (var5 != 0) {
            arg1.field1643--;
            this.field900 = new class65();
            this.field900.method513(this.field891, arg1);
            this.field901 = new class65();
            this.field901.method513(this.field891, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method548();
            if (var7 == 0) {
                break;
            }
            this.field902[var6] = var7;
            this.field903[var6] = arg1.method547();
            this.field904[var6] = arg1.method548();
        }
        this.field905 = arg1.method548();
        this.field906 = arg1.method548();
        this.field909 = arg1.method536();
        this.field910 = arg1.method536();
        if (this.field891 != arg0) {
            this.field892 = !this.field892;
        }
        this.field907 = new class13();
        this.field908 = new class65();
        this.field907.method191(arg1, this.field908, 857);
    }
}
