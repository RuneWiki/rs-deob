import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AQBPXQWT")
public class class2 {

    @OriginalMember(owner = "AQBPXQWT", name = "i", descriptor = "[I")
    private int[] field14 = new int[5];

    @OriginalMember(owner = "AQBPXQWT", name = "j", descriptor = "[I")
    private int[] field15 = new int[5];

    @OriginalMember(owner = "AQBPXQWT", name = "k", descriptor = "[I")
    private int[] field16 = new int[5];

    @OriginalMember(owner = "AQBPXQWT", name = "m", descriptor = "I")
    private int field18 = 100;

    @OriginalMember(owner = "AQBPXQWT", name = "p", descriptor = "I")
    public int field21 = 500;

    @OriginalMember(owner = "AQBPXQWT", name = "u", descriptor = "[I")
    private static int[] field26 = new int[5];

    @OriginalMember(owner = "AQBPXQWT", name = "v", descriptor = "[I")
    private static int[] field27 = new int[5];

    @OriginalMember(owner = "AQBPXQWT", name = "w", descriptor = "[I")
    private static int[] field28 = new int[5];

    @OriginalMember(owner = "AQBPXQWT", name = "x", descriptor = "[I")
    private static int[] field29 = new int[5];

    @OriginalMember(owner = "AQBPXQWT", name = "y", descriptor = "[I")
    private static int[] field30 = new int[5];

    @OriginalMember(owner = "AQBPXQWT", name = "l", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "AQBPXQWT", name = "q", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "AQBPXQWT", name = "e", descriptor = "LQOBPOZUC;")
    private class46 field10;

    @OriginalMember(owner = "AQBPXQWT", name = "f", descriptor = "LQOBPOZUC;")
    private class46 field11;

    @OriginalMember(owner = "AQBPXQWT", name = "g", descriptor = "LQOBPOZUC;")
    private class46 field12;

    @OriginalMember(owner = "AQBPXQWT", name = "h", descriptor = "LQOBPOZUC;")
    private class46 field13;

    @OriginalMember(owner = "AQBPXQWT", name = "o", descriptor = "LQOBPOZUC;")
    private class46 field20;

    @OriginalMember(owner = "AQBPXQWT", name = "a", descriptor = "LQOBPOZUC;")
    private class46 field6;

    @OriginalMember(owner = "AQBPXQWT", name = "b", descriptor = "LQOBPOZUC;")
    private class46 field7;

    @OriginalMember(owner = "AQBPXQWT", name = "c", descriptor = "LQOBPOZUC;")
    private class46 field8;

    @OriginalMember(owner = "AQBPXQWT", name = "d", descriptor = "LQOBPOZUC;")
    private class46 field9;

    @OriginalMember(owner = "AQBPXQWT", name = "n", descriptor = "LCGCAZMIE;")
    private class7 field19;

    @OriginalMember(owner = "AQBPXQWT", name = "r", descriptor = "[I")
    private static int[] field23;

    @OriginalMember(owner = "AQBPXQWT", name = "s", descriptor = "[I")
    private static int[] field24;

    @OriginalMember(owner = "AQBPXQWT", name = "t", descriptor = "[I")
    private static int[] field25;

    @OriginalMember(owner = "AQBPXQWT", name = "a", descriptor = "()V")
    public static final void method4() {
        field24 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field24[var0] = 1;
            } else {
                field24[var0] = -1;
            }
        }
        field25 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field25[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field23 = new int[220500];
    }

    @OriginalMember(owner = "AQBPXQWT", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field23[var3] = 0;
        }
        if (arg1 < 10) {
            return field23;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6.method392(8);
        this.field7.method392(8);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field8 != null) {
            this.field8.method392(8);
            this.field9.method392(8);
            var6 = (int) ((double) (this.field8.field1207 - this.field8.field1206) * 32.768D / var4);
            var7 = (int) ((double) this.field8.field1206 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field10 != null) {
            this.field10.method392(8);
            this.field11.method392(8);
            var9 = (int) ((double) (this.field10.field1207 - this.field10.field1206) * 32.768D / var4);
            var10 = (int) ((double) this.field10.field1206 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field14[var12] != 0) {
                field26[var12] = 0;
                field27[var12] = (int) ((double) this.field16[var12] * var4);
                field28[var12] = (this.field14[var12] << 14) / 100;
                field29[var12] = (int) ((double) (this.field6.field1207 - this.field6.field1206) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field15[var12]) / var4);
                field30[var12] = (int) ((double) this.field6.field1206 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field6.method393(true, arg0);
            int var42 = this.field7.method393(true, arg0);
            if (this.field8 != null) {
                int var43 = this.field8.method393(true, arg0);
                int var44 = this.field9.method393(true, arg0);
                var41 += this.method6(0, this.field8.field1208, var8, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field10 != null) {
                int var45 = this.field10.method393(true, arg0);
                int var46 = this.field11.method393(true, arg0);
                var42 = var42 * ((this.method6(0, this.field10.field1208, var11, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field14[var47] != 0) {
                    int var48 = field27[var47] + var13;
                    if (var48 < arg0) {
                        field23[var48] += this.method6(0, this.field6.field1208, field26[var47], field28[var47] * var42 >> 15);
                        field26[var47] += (field29[var47] * var41 >> 16) + field30[var47];
                    }
                }
            }
        }
        if (this.field12 != null) {
            this.field12.method392(8);
            this.field13.method392(8);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field12.method393(true, arg0);
                int var19 = this.field13.method393(true, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field12.field1207 - this.field12.field1206) * var18 >> 8) + this.field12.field1206;
                } else {
                    var20 = ((this.field12.field1207 - this.field12.field1206) * var19 >> 8) + this.field12.field1206;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field23[var17] = 0;
                }
            }
        }
        if (this.field17 > 0 && this.field18 > 0) {
            int var21 = (int) ((double) this.field17 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field23[var22] += field23[var22 - var21] * this.field18 / 100;
            }
        }
        if (this.field19.field72[0] > 0 || this.field19.field72[1] > 0) {
            this.field20.method392(8);
            int var23 = this.field20.method393(true, arg0 + 1);
            int var24 = this.field19.method30((float) var23 / 65536.0F, 4827, 0);
            int var25 = this.field19.method30((float) var23 / 65536.0F, 4827, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field23[var24 + var26] * (long) class7.field79 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field23[var24 + var26 - var38 - 1] * (long) class7.field77[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field23[var26 - var39 - 1] * (long) class7.field77[1][var39] >> 16);
                    }
                    field23[var26] = var37;
                    var23 = this.field20.method393(true, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field23[var24 + var26] * (long) class7.field79 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field23[var24 + var26 - var35 - 1] * (long) class7.field77[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field23[var26 - var36 - 1] * (long) class7.field77[1][var36] >> 16);
                        }
                        field23[var26] = var34;
                        var23 = this.field20.method393(true, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field23[var24 + var26 - var31 - 1] * (long) class7.field77[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field23[var26 - var32 - 1] * (long) class7.field77[1][var32] >> 16);
                            }
                            field23[var26] = var30;
                            this.field20.method393(true, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field19.method30((float) var23 / 65536.0F, 4827, 0);
                    var25 = this.field19.method30((float) var23 / 65536.0F, 4827, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field23[var40] < -32768) {
                field23[var40] = -32768;
            }
            if (field23[var40] > 32767) {
                field23[var40] = 32767;
            }
        }
        return field23;
    }

    @OriginalMember(owner = "AQBPXQWT", name = "a", descriptor = "(IIII)I")
    private final int method6(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            return 4;
        } else if (arg1 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg1 == 2) {
            return field25[arg2 & 0x7FFF] * arg3 >> 14;
        } else if (arg1 == 3) {
            return ((arg2 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg1 == 4) {
            return field24[arg2 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "AQBPXQWT", name = "a", descriptor = "(LXQPFGONL;I)V")
    public final void method7(class62 arg0, int arg1) {
        this.field6 = new class46();
        this.field6.method390(arg0, 168);
        this.field7 = new class46();
        this.field7.method390(arg0, 168);
        int var3 = arg0.method478();
        if (var3 != 0) {
            arg0.field1542--;
            this.field8 = new class46();
            this.field8.method390(arg0, 168);
            this.field9 = new class46();
            this.field9.method390(arg0, 168);
        }
        int var4 = arg0.method478();
        if (var4 != 0) {
            arg0.field1542--;
            this.field10 = new class46();
            this.field10.method390(arg0, 168);
            this.field11 = new class46();
            this.field11.method390(arg0, 168);
        }
        int var5 = arg0.method478();
        if (var5 != 0) {
            arg0.field1542--;
            this.field12 = new class46();
            this.field12.method390(arg0, 168);
            this.field13 = new class46();
            this.field13.method390(arg0, 168);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method492();
            if (var7 == 0) {
                break;
            }
            this.field14[var6] = var7;
            this.field15[var6] = arg0.method491();
            this.field16[var6] = arg0.method492();
        }
        this.field17 = arg0.method492();
        this.field18 = arg0.method492();
        this.field21 = arg0.method480();
        this.field22 = arg0.method480();
        this.field19 = new class7();
        this.field20 = new class46();
        int var8 = 39 / arg1;
        this.field19.method31(true, arg0, this.field20);
    }
}
