import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class255 {

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    private int field4247 = 0;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public int field4248 = 500;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
    private int[] field4245 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "[I")
    private int[] field4255 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    private int field4257 = 100;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
    private int[] field4243 = new int[] { 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public int field4252 = 0;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "[I")
    private static int[] field4244 = new int[32768];

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "[I")
    private static int[] field4246;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "[I")
    private static int[] field4254;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "[I")
    private static int[] field4256;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "[I")
    private static int[] field4260;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "[I")
    private static int[] field4263;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "[I")
    private static int[] field4261;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "[I")
    private static int[] field4264;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Ljd;")
    private class136 field4262;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Lfl;")
    private class219 field4240;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lfl;")
    private class219 field4241;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lfl;")
    private class219 field4242;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Lfl;")
    private class219 field4249;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Lfl;")
    private class219 field4250;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "Lfl;")
    private class219 field4251;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Lfl;")
    private class219 field4253;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Lfl;")
    private class219 field4258;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "Lfl;")
    private class219 field4259;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lwe;)V", line = 8)
    public final void method1851(class47 arg0) {
        this.field4241 = new class219();
        this.field4241.method1614(arg0);
        this.field4249 = new class219();
        this.field4249.method1614(arg0);
        int var2 = arg0.method368(91);
        if (var2 != 0) {
            arg0.field857--;
            this.field4250 = new class219();
            this.field4250.method1614(arg0);
            this.field4253 = new class219();
            this.field4253.method1614(arg0);
        }
        int var3 = arg0.method368(-118);
        if (var3 != 0) {
            arg0.field857--;
            this.field4258 = new class219();
            this.field4258.method1614(arg0);
            this.field4251 = new class219();
            this.field4251.method1614(arg0);
        }
        int var4 = arg0.method368(-113);
        if (var4 != 0) {
            arg0.field857--;
            this.field4240 = new class219();
            this.field4240.method1614(arg0);
            this.field4242 = new class219();
            this.field4242.method1614(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method350(-32768);
            if (var6 == 0) {
                break;
            }
            this.field4255[var5] = var6;
            this.field4245[var5] = arg0.method369((byte) -118);
            this.field4243[var5] = arg0.method350(-32768);
        }
        this.field4247 = arg0.method350(-32768);
        this.field4257 = arg0.method350(-32768);
        this.field4248 = arg0.method379(-2);
        this.field4252 = arg0.method379(-2);
        this.field4262 = new class136();
        this.field4259 = new class219();
        this.field4262.method1006(arg0, this.field4259);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)I", line = 77)
    private final int method1852(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4246[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4244[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I", line = 104)
    public final int[] method1853(int arg0, int arg1) {
        class244.method1770(field4254, 0, arg0);
        if (arg1 < 10) {
            return field4254;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4241.method1616();
        this.field4249.method1616();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4250 != null) {
            this.field4250.method1616();
            this.field4253.method1616();
            var5 = (int) ((double) (this.field4250.field3614 - this.field4250.field3618) * 32.768D / var3);
            var6 = (int) ((double) this.field4250.field3618 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4258 != null) {
            this.field4258.method1616();
            this.field4251.method1616();
            var8 = (int) ((double) (this.field4258.field3614 - this.field4258.field3618) * 32.768D / var3);
            var9 = (int) ((double) this.field4258.field3618 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4255[var11] != 0) {
                field4264[var11] = 0;
                field4261[var11] = (int) ((double) this.field4243[var11] * var3);
                field4260[var11] = (this.field4255[var11] << 14) / 100;
                field4256[var11] = (int) ((double) (this.field4241.field3614 - this.field4241.field3618) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4245[var11]) / var3);
                field4263[var11] = (int) ((double) this.field4241.field3618 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field4241.method1615(arg0);
            int var14 = this.field4249.method1615(arg0);
            if (this.field4250 != null) {
                int var15 = this.field4250.method1615(arg0);
                int var16 = this.field4253.method1615(arg0);
                var13 += this.method1852(var7, var16, this.field4250.field3615) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field4258 != null) {
                int var17 = this.field4258.method1615(arg0);
                int var18 = this.field4251.method1615(arg0);
                var14 = var14 * ((this.method1852(var10, var18, this.field4258.field3615) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field4255[var19] != 0) {
                    int var20 = field4261[var19] + var12;
                    if (var20 < arg0) {
                        field4254[var20] += this.method1852(field4264[var19], field4260[var19] * var14 >> 15, this.field4241.field3615);
                        field4264[var19] += (field4256[var19] * var13 >> 16) + field4263[var19];
                    }
                }
            }
        }
        if (this.field4240 != null) {
            this.field4240.method1616();
            this.field4242.method1616();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field4240.method1615(arg0);
                int var26 = this.field4242.method1615(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field4240.field3614 - this.field4240.field3618) * var25 >> 8) + this.field4240.field3618;
                } else {
                    var27 = ((this.field4240.field3614 - this.field4240.field3618) * var26 >> 8) + this.field4240.field3618;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field4254[var24] = 0;
                }
            }
        }
        if (this.field4247 > 0 && this.field4257 > 0) {
            int var28 = (int) ((double) this.field4247 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field4254[var29] += field4254[var29 - var28] * this.field4257 / 100;
            }
        }
        if (this.field4262.field2278[0] > 0 || this.field4262.field2278[1] > 0) {
            this.field4259.method1616();
            int var30 = this.field4259.method1615(arg0 + 1);
            int var31 = this.field4262.method1007(0, (float) var30 / 65536.0F);
            int var32 = this.field4262.method1007(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field4254[var31 + var33] * (long) class136.field2273 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field4254[var31 + var33 - var36 - 1] * (long) class136.field2272[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field4254[var33 - var37 - 1] * (long) class136.field2272[1][var37] >> 16);
                    }
                    field4254[var33] = var35;
                    var30 = this.field4259.method1615(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field4254[var31 + var33] * (long) class136.field2273 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field4254[var31 + var33 - var40 - 1] * (long) class136.field2272[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field4254[var33 - var41 - 1] * (long) class136.field2272[1][var41] >> 16);
                        }
                        field4254[var33] = var39;
                        var30 = this.field4259.method1615(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field4254[var31 + var33 - var43 - 1] * (long) class136.field2272[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field4254[var33 - var44 - 1] * (long) class136.field2272[1][var44] >> 16);
                            }
                            field4254[var33] = var42;
                            this.field4259.method1615(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field4262.method1007(0, (float) var30 / 65536.0F);
                    var32 = this.field4262.method1007(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field4254[var46] < -32768) {
                field4254[var46] = -32768;
            }
            if (field4254[var46] > 32767) {
                field4254[var46] = 32767;
            }
        }
        return field4254;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V", line = 391)
    public static void method1854() {
        field4254 = null;
        field4244 = null;
        field4246 = null;
        field4264 = null;
        field4261 = null;
        field4260 = null;
        field4256 = null;
        field4263 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4244[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4246 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4246[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4254 = new int[220500];
        field4256 = new int[5];
        field4260 = new int[5];
        field4263 = new int[5];
        field4261 = new int[5];
        field4264 = new int[5];
    }
}
