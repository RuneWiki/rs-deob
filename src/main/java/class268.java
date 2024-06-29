import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class268 {

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public int field4210 = 500;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    private int field4218 = 100;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "[I")
    private int[] field4215 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    private int field4214 = 0;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[I")
    private int[] field4217 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!to", name = "d", descriptor = "[I")
    private int[] field4209 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public int field4228 = 0;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "[I")
    private static int[] field4219 = new int[32768];

    @OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
    private static int[] field4211;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "[I")
    private static int[] field4206;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "[I")
    private static int[] field4222;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "[I")
    private static int[] field4226;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "[I")
    private static int[] field4225;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "[I")
    private static int[] field4224;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "[I")
    private static int[] field4229;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Lsh;")
    private class319 field4207;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Lsh;")
    private class319 field4208;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "Lsh;")
    private class319 field4212;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "Lsh;")
    private class319 field4213;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Lsh;")
    private class319 field4216;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Lsh;")
    private class319 field4220;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "Lsh;")
    private class319 field4221;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "Lsh;")
    private class319 field4223;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "Lsh;")
    private class319 field4227;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "Lgd;")
    private class341 field4230;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)I", line = 3)
    private final int method1879(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4211[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4219[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Llf;)V", line = 25)
    public final void method1880(class143 arg0) {
        this.field4208 = new class319();
        this.field4208.method2235(arg0);
        this.field4212 = new class319();
        this.field4212.method2235(arg0);
        int var2 = arg0.method1043(true);
        if (var2 != 0) {
            arg0.field2295--;
            this.field4221 = new class319();
            this.field4221.method2235(arg0);
            this.field4223 = new class319();
            this.field4223.method2235(arg0);
        }
        int var3 = arg0.method1043(true);
        if (var3 != 0) {
            arg0.field2295--;
            this.field4216 = new class319();
            this.field4216.method2235(arg0);
            this.field4207 = new class319();
            this.field4207.method2235(arg0);
        }
        int var4 = arg0.method1043(true);
        if (var4 != 0) {
            arg0.field2295--;
            this.field4227 = new class319();
            this.field4227.method2235(arg0);
            this.field4220 = new class319();
            this.field4220.method2235(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1027(false);
            if (var6 == 0) {
                break;
            }
            this.field4215[var5] = var6;
            this.field4209[var5] = arg0.method1023(-10690);
            this.field4217[var5] = arg0.method1027(false);
        }
        this.field4214 = arg0.method1027(false);
        this.field4218 = arg0.method1027(false);
        this.field4210 = arg0.method1051(1);
        this.field4228 = arg0.method1051(1);
        this.field4230 = new class341();
        this.field4213 = new class319();
        this.field4230.method2343(arg0, this.field4213);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()V", line = 89)
    public static void method1881() {
        field4206 = null;
        field4219 = null;
        field4211 = null;
        field4222 = null;
        field4225 = null;
        field4224 = null;
        field4229 = null;
        field4226 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)[I", line = 110)
    public final int[] method1882(int arg0, int arg1) {
        class8.method54(field4206, 0, arg0);
        if (arg1 < 10) {
            return field4206;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4208.method2233();
        this.field4212.method2233();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4221 != null) {
            this.field4221.method2233();
            this.field4223.method2233();
            var5 = (int) ((double) (this.field4221.field4976 - this.field4221.field4974) * 32.768D / var3);
            var6 = (int) ((double) this.field4221.field4974 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4216 != null) {
            this.field4216.method2233();
            this.field4207.method2233();
            var8 = (int) ((double) (this.field4216.field4976 - this.field4216.field4974) * 32.768D / var3);
            var9 = (int) ((double) this.field4216.field4974 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4215[var11] != 0) {
                field4222[var11] = 0;
                field4225[var11] = (int) ((double) this.field4217[var11] * var3);
                field4224[var11] = (this.field4215[var11] << 14) / 100;
                field4229[var11] = (int) ((double) (this.field4208.field4976 - this.field4208.field4974) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4209[var11]) / var3);
                field4226[var11] = (int) ((double) this.field4208.field4974 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4208.method2232(arg0);
            int var14 = this.field4212.method2232(arg0);
            if (this.field4221 != null) {
                int var15 = this.field4221.method2232(arg0);
                int var16 = this.field4223.method2232(arg0);
                var13 += this.method1879(var7, var16, this.field4221.field4978) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4216 != null) {
                int var17 = this.field4216.method2232(arg0);
                int var18 = this.field4207.method2232(arg0);
                var14 = var14 * ((this.method1879(var10, var18, this.field4216.field4978) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4215[var19] != 0) {
                    int var20 = field4225[var19] + var12;
                    if (var20 < arg0) {
                        field4206[var20] += this.method1879(field4222[var19], field4224[var19] * var14 >> 15, this.field4208.field4978);
                        field4222[var19] += (field4229[var19] * var13 >> 16) + field4226[var19];
                    }
                }
            }
        }
        if (this.field4227 != null) {
            this.field4227.method2233();
            this.field4220.method2233();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4227.method2232(arg0);
                int var26 = this.field4220.method2232(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4227.field4976 - this.field4227.field4974) * var25 >> 8) + this.field4227.field4974;
                } else {
                    var27 = ((this.field4227.field4976 - this.field4227.field4974) * var26 >> 8) + this.field4227.field4974;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4206[var24] = 0;
                }
            }
        }
        if (this.field4214 > 0 && this.field4218 > 0) {
            int var28 = (int) ((double) this.field4214 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4206[var29] += field4206[var29 - var28] * this.field4218 / 100;
            }
        }
        if (this.field4230.field5418[0] > 0 || this.field4230.field5418[1] > 0) {
            this.field4213.method2233();
            int var30 = this.field4213.method2232(arg0 + 1);
            int var31 = this.field4230.method2341(0, (float) var30 / 65536.0F);
            int var32 = this.field4230.method2341(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4206[var31 + var33] * (long) class341.field5415 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4206[var31 + var33 - var36 - 1] * (long) class341.field5414[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4206[var33 - var37 - 1] * (long) class341.field5414[1][var37] >> 16);
                    }
                    field4206[var33] = var35;
                    var30 = this.field4213.method2232(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4206[var31 + var33] * (long) class341.field5415 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4206[var31 + var33 - var40 - 1] * (long) class341.field5414[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4206[var33 - var41 - 1] * (long) class341.field5414[1][var41] >> 16);
                        }
                        field4206[var33] = var39;
                        var30 = this.field4213.method2232(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4206[var31 + var33 - var43 - 1] * (long) class341.field5414[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4206[var33 - var44 - 1] * (long) class341.field5414[1][var44] >> 16);
                            }
                            field4206[var33] = var42;
                            this.field4213.method2232(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4230.method2341(0, (float) var30 / 65536.0F);
                    var32 = this.field4230.method2341(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4206[var46] < -32768) {
                field4206[var46] = -32768;
            }
            if (field4206[var46] > 32767) {
                field4206[var46] = 32767;
            }
        }
        return field4206;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4219[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4211 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4211[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4206 = new int[220500];
        field4222 = new int[5];
        field4226 = new int[5];
        field4225 = new int[5];
        field4224 = new int[5];
        field4229 = new int[5];
    }
}
