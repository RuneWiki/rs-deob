import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class180 {

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    private int field3220 = 100;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public int field3230 = 0;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "[I")
    private int[] field3235 = new int[5];

    @OriginalMember(owner = "client!o", name = "o", descriptor = "[I")
    private int[] field3227 = new int[5];

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
    private int[] field3216 = new int[5];

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public int field3226 = 500;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    private int field3214 = 0;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "[I")
    private static int[] field3219 = new int[32768];

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[I")
    private static int[] field3225;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "[I")
    private static int[] field3224;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "[I")
    private static int[] field3231;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "[I")
    private static int[] field3232;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "[I")
    private static int[] field3237;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "[I")
    private static int[] field3233;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "[I")
    private static int[] field3236;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lsk;")
    private class108 field3213;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lsk;")
    private class108 field3215;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lsk;")
    private class108 field3217;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lsk;")
    private class108 field3218;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lsk;")
    private class108 field3221;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lsk;")
    private class108 field3222;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lsk;")
    private class108 field3228;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Lsk;")
    private class108 field3229;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Lsk;")
    private class108 field3234;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lag;")
    private class96 field3223;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
    public static void method1180() {
        field3224 = null;
        field3219 = null;
        field3225 = null;
        field3231 = null;
        field3237 = null;
        field3236 = null;
        field3232 = null;
        field3233 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[I")
    public final int[] method1181(int arg0, int arg1) {
        class275.method1809(field3224, 0, arg0);
        if (arg1 < 10) {
            return field3224;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3234.method652();
        this.field3213.method652();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3222 != null) {
            this.field3222.method652();
            this.field3218.method652();
            var5 = (int) ((double) (this.field3222.field1904 - this.field3222.field1900) * 32.768D / var3);
            var6 = (int) ((double) this.field3222.field1900 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3228 != null) {
            this.field3228.method652();
            this.field3229.method652();
            var8 = (int) ((double) (this.field3228.field1904 - this.field3228.field1900) * 32.768D / var3);
            var9 = (int) ((double) this.field3228.field1900 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3235[var11] != 0) {
                field3231[var11] = 0;
                field3237[var11] = (int) ((double) this.field3216[var11] * var3);
                field3236[var11] = (this.field3235[var11] << 14) / 100;
                field3232[var11] = (int) ((double) (this.field3234.field1904 - this.field3234.field1900) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3227[var11]) / var3);
                field3233[var11] = (int) ((double) this.field3234.field1900 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3234.method651(arg0);
            int var40 = this.field3213.method651(arg0);
            if (this.field3222 != null) {
                int var41 = this.field3222.method651(arg0);
                int var42 = this.field3218.method651(arg0);
                var39 += this.method1182(var7, var42, this.field3222.field1901) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3228 != null) {
                int var43 = this.field3228.method651(arg0);
                int var44 = this.field3229.method651(arg0);
                var40 = var40 * ((this.method1182(var10, var44, this.field3228.field1901) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3235[var45] != 0) {
                    int var46 = field3237[var45] + var12;
                    if (var46 < arg0) {
                        field3224[var46] += this.method1182(field3231[var45], field3236[var45] * var40 >> 15, this.field3234.field1901);
                        field3231[var45] += (field3232[var45] * var39 >> 16) + field3233[var45];
                    }
                }
            }
        }
        if (this.field3221 != null) {
            this.field3221.method652();
            this.field3215.method652();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3221.method651(arg0);
                int var18 = this.field3215.method651(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3221.field1904 - this.field3221.field1900) * var17 >> 8) + this.field3221.field1900;
                } else {
                    var19 = ((this.field3221.field1904 - this.field3221.field1900) * var18 >> 8) + this.field3221.field1900;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3224[var16] = 0;
                }
            }
        }
        if (this.field3214 > 0 && this.field3220 > 0) {
            int var20 = (int) ((double) this.field3214 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3224[var21] += field3224[var21 - var20] * this.field3220 / 100;
            }
        }
        if (this.field3223.field1764[0] > 0 || this.field3223.field1764[1] > 0) {
            this.field3217.method652();
            int var22 = this.field3217.method651(arg0 + 1);
            int var23 = this.field3223.method568(0, (float) var22 / 65536.0F);
            int var24 = this.field3223.method568(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3224[var23 + var25] * (long) class96.field1761 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3224[var23 + var25 - var36 - 1] * (long) class96.field1765[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3224[var25 - var37 - 1] * (long) class96.field1765[1][var37] >> 16);
                    }
                    field3224[var25] = var35;
                    var22 = this.field3217.method651(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3224[var23 + var25] * (long) class96.field1761 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3224[var23 + var25 - var33 - 1] * (long) class96.field1765[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3224[var25 - var34 - 1] * (long) class96.field1765[1][var34] >> 16);
                        }
                        field3224[var25] = var32;
                        var22 = this.field3217.method651(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3224[var23 + var25 - var29 - 1] * (long) class96.field1765[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3224[var25 - var30 - 1] * (long) class96.field1765[1][var30] >> 16);
                            }
                            field3224[var25] = var28;
                            this.field3217.method651(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3223.method568(0, (float) var22 / 65536.0F);
                    var24 = this.field3223.method568(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3224[var38] < -32768) {
                field3224[var38] = -32768;
            }
            if (field3224[var38] > 32767) {
                field3224[var38] = 32767;
            }
        }
        return field3224;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I")
    private final int method1182(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3225[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3219[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lh;)V")
    public final void method1183(class190 arg0) {
        this.field3234 = new class108();
        this.field3234.method650(arg0);
        this.field3213 = new class108();
        this.field3213.method650(arg0);
        int var2 = arg0.method1265(116);
        if (var2 != 0) {
            arg0.field3487--;
            this.field3222 = new class108();
            this.field3222.method650(arg0);
            this.field3218 = new class108();
            this.field3218.method650(arg0);
        }
        int var3 = arg0.method1265(121);
        if (var3 != 0) {
            arg0.field3487--;
            this.field3228 = new class108();
            this.field3228.method650(arg0);
            this.field3229 = new class108();
            this.field3229.method650(arg0);
        }
        int var4 = arg0.method1265(124);
        if (var4 != 0) {
            arg0.field3487--;
            this.field3221 = new class108();
            this.field3221.method650(arg0);
            this.field3215 = new class108();
            this.field3215.method650(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1257((byte) 99);
            if (var6 == 0) {
                break;
            }
            this.field3235[var5] = var6;
            this.field3227[var5] = arg0.method1285(-49152);
            this.field3216[var5] = arg0.method1257((byte) 52);
        }
        this.field3214 = arg0.method1257((byte) 52);
        this.field3220 = arg0.method1257((byte) 90);
        this.field3226 = arg0.method1275(128);
        this.field3230 = arg0.method1275(128);
        this.field3223 = new class96();
        this.field3217 = new class108();
        this.field3223.method566(arg0, this.field3217);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3219[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3225 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3225[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3224 = new int[220500];
        field3231 = new int[5];
        field3232 = new int[5];
        field3237 = new int[5];
        field3233 = new int[5];
        field3236 = new int[5];
    }
}
