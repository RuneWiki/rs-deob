import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class301 {

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "[I")
    private int[] field4223 = new int[5];

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "[I")
    private int[] field4228 = new int[5];

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    private int field4227 = 100;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public int field4218 = 500;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "[I")
    private int[] field4232 = new int[5];

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public int field4236 = 0;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    private int field4241 = 0;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "[I")
    private static int[] field4231 = new int[32768];

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "[I")
    private static int[] field4217;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "[I")
    private static int[] field4220;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "[I")
    private static int[] field4234;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "[I")
    private static int[] field4237;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "[I")
    private static int[] field4239;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "[I")
    private static int[] field4233;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "[I")
    private static int[] field4240;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Lio;")
    private class251 field4224;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lbd;")
    private class37 field4219;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Lbd;")
    private class37 field4221;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Lbd;")
    private class37 field4222;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "Lbd;")
    private class37 field4225;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Lbd;")
    private class37 field4226;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Lbd;")
    private class37 field4229;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Lbd;")
    private class37 field4230;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "Lbd;")
    private class37 field4235;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "Lbd;")
    private class37 field4238;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)I")
    private final int method1984(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4217[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4231[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ldg;)V")
    public final void method1985(class236 arg0) {
        this.field4230 = new class37();
        this.field4230.method223(arg0);
        this.field4235 = new class37();
        this.field4235.method223(arg0);
        int var2 = arg0.method1574(-73);
        if (var2 != 0) {
            arg0.field3320--;
            this.field4229 = new class37();
            this.field4229.method223(arg0);
            this.field4238 = new class37();
            this.field4238.method223(arg0);
        }
        int var3 = arg0.method1574(-91);
        if (var3 != 0) {
            arg0.field3320--;
            this.field4225 = new class37();
            this.field4225.method223(arg0);
            this.field4221 = new class37();
            this.field4221.method223(arg0);
        }
        int var4 = arg0.method1574(-103);
        if (var4 != 0) {
            arg0.field3320--;
            this.field4226 = new class37();
            this.field4226.method223(arg0);
            this.field4222 = new class37();
            this.field4222.method223(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1594(-110);
            if (var6 == 0) {
                break;
            }
            this.field4232[var5] = var6;
            this.field4228[var5] = arg0.method1577(-1640531527);
            this.field4223[var5] = arg0.method1594(-15);
        }
        this.field4241 = arg0.method1594(-80);
        this.field4227 = arg0.method1594(-127);
        this.field4218 = arg0.method1617((byte) 48);
        this.field4236 = arg0.method1617((byte) 48);
        this.field4224 = new class251();
        this.field4219 = new class37();
        this.field4224.method1706(arg0, this.field4219);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "()V")
    public static void method1986() {
        field4220 = null;
        field4231 = null;
        field4217 = null;
        field4239 = null;
        field4234 = null;
        field4237 = null;
        field4233 = null;
        field4240 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[I")
    public final int[] method1987(int arg0, int arg1) {
        class316.method2077(field4220, 0, arg0);
        if (arg1 < 10) {
            return field4220;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4230.method224();
        this.field4235.method224();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4229 != null) {
            this.field4229.method224();
            this.field4238.method224();
            var5 = (int) ((double) (this.field4229.field427 - this.field4229.field429) * 32.768D / var3);
            var6 = (int) ((double) this.field4229.field429 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4225 != null) {
            this.field4225.method224();
            this.field4221.method224();
            var8 = (int) ((double) (this.field4225.field427 - this.field4225.field429) * 32.768D / var3);
            var9 = (int) ((double) this.field4225.field429 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4232[var11] != 0) {
                field4239[var11] = 0;
                field4234[var11] = (int) ((double) this.field4223[var11] * var3);
                field4237[var11] = (this.field4232[var11] << 14) / 100;
                field4233[var11] = (int) ((double) (this.field4230.field427 - this.field4230.field429) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4228[var11]) / var3);
                field4240[var11] = (int) ((double) this.field4230.field429 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4230.method222(arg0);
            int var40 = this.field4235.method222(arg0);
            if (this.field4229 != null) {
                int var41 = this.field4229.method222(arg0);
                int var42 = this.field4238.method222(arg0);
                var39 += this.method1984(var7, var42, this.field4229.field430) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4225 != null) {
                int var43 = this.field4225.method222(arg0);
                int var44 = this.field4221.method222(arg0);
                var40 = var40 * ((this.method1984(var10, var44, this.field4225.field430) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4232[var45] != 0) {
                    int var46 = field4234[var45] + var12;
                    if (var46 < arg0) {
                        field4220[var46] += this.method1984(field4239[var45], field4237[var45] * var40 >> 15, this.field4230.field430);
                        field4239[var45] += (field4233[var45] * var39 >> 16) + field4240[var45];
                    }
                }
            }
        }
        if (this.field4226 != null) {
            this.field4226.method224();
            this.field4222.method224();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4226.method222(arg0);
                int var18 = this.field4222.method222(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4226.field427 - this.field4226.field429) * var17 >> 8) + this.field4226.field429;
                } else {
                    var19 = ((this.field4226.field427 - this.field4226.field429) * var18 >> 8) + this.field4226.field429;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4220[var16] = 0;
                }
            }
        }
        if (this.field4241 > 0 && this.field4227 > 0) {
            int var20 = (int) ((double) this.field4241 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4220[var21] += field4220[var21 - var20] * this.field4227 / 100;
            }
        }
        if (this.field4224.field3576[0] > 0 || this.field4224.field3576[1] > 0) {
            this.field4219.method224();
            int var22 = this.field4219.method222(arg0 + 1);
            int var23 = this.field4224.method1705(0, (float) var22 / 65536.0F);
            int var24 = this.field4224.method1705(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4220[var23 + var25] * (long) class251.field3578 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4220[var23 + var25 - var36 - 1] * (long) class251.field3573[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4220[var25 - var37 - 1] * (long) class251.field3573[1][var37] >> 16);
                    }
                    field4220[var25] = var35;
                    var22 = this.field4219.method222(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4220[var23 + var25] * (long) class251.field3578 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4220[var23 + var25 - var33 - 1] * (long) class251.field3573[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4220[var25 - var34 - 1] * (long) class251.field3573[1][var34] >> 16);
                        }
                        field4220[var25] = var32;
                        var22 = this.field4219.method222(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4220[var23 + var25 - var29 - 1] * (long) class251.field3573[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4220[var25 - var30 - 1] * (long) class251.field3573[1][var30] >> 16);
                            }
                            field4220[var25] = var28;
                            this.field4219.method222(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4224.method1705(0, (float) var22 / 65536.0F);
                    var24 = this.field4224.method1705(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4220[var38] < -32768) {
                field4220[var38] = -32768;
            }
            if (field4220[var38] > 32767) {
                field4220[var38] = 32767;
            }
        }
        return field4220;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4231[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4217 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4217[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4220 = new int[220500];
        field4234 = new int[5];
        field4237 = new int[5];
        field4239 = new int[5];
        field4233 = new int[5];
        field4240 = new int[5];
    }
}
