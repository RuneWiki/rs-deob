import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class308 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "[I")
    private int[] field4171 = new int[5];

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    private int field4178 = 0;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field4180 = 0;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    private int field4183 = 100;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "[I")
    private int[] field4182 = new int[5];

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "[I")
    private int[] field4185 = new int[5];

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public int field4175 = 500;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[I")
    private static int[] field4184 = new int[32768];

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "[I")
    private static int[] field4189;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[I")
    private static int[] field4170;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "[I")
    private static int[] field4190;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "[I")
    private static int[] field4191;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
    private static int[] field4192;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "[I")
    private static int[] field4193;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "[I")
    private static int[] field4194;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lql;")
    private class347 field4172;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lvh;")
    private class432 field4173;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lvh;")
    private class432 field4174;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lvh;")
    private class432 field4176;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lvh;")
    private class432 field4177;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lvh;")
    private class432 field4179;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lvh;")
    private class432 field4181;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Lvh;")
    private class432 field4186;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Lvh;")
    private class432 field4187;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Lvh;")
    private class432 field4188;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)[I")
    public final int[] method1980(int arg0, int arg1) {
        class152.method1173(field4170, 0, arg0);
        if (arg1 < 10) {
            return field4170;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4187.method2679();
        this.field4188.method2679();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4186 != null) {
            this.field4186.method2679();
            this.field4181.method2679();
            var5 = (int) ((double) (this.field4186.field6136 - this.field4186.field6135) * 32.768D / var3);
            var6 = (int) ((double) this.field4186.field6135 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4174 != null) {
            this.field4174.method2679();
            this.field4173.method2679();
            var8 = (int) ((double) (this.field4174.field6136 - this.field4174.field6135) * 32.768D / var3);
            var9 = (int) ((double) this.field4174.field6135 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4185[var11] != 0) {
                field4194[var11] = 0;
                field4191[var11] = (int) ((double) this.field4182[var11] * var3);
                field4190[var11] = (this.field4185[var11] << 14) / 100;
                field4192[var11] = (int) ((double) (this.field4187.field6136 - this.field4187.field6135) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4171[var11]) / var3);
                field4193[var11] = (int) ((double) this.field4187.field6135 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4187.method2682(arg0);
            int var40 = this.field4188.method2682(arg0);
            if (this.field4186 != null) {
                int var41 = this.field4186.method2682(arg0);
                int var42 = this.field4181.method2682(arg0);
                var39 += this.method1981(var7, var42, this.field4186.field6132) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4174 != null) {
                int var43 = this.field4174.method2682(arg0);
                int var44 = this.field4173.method2682(arg0);
                var40 = var40 * ((this.method1981(var10, var44, this.field4174.field6132) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4185[var45] != 0) {
                    int var46 = field4191[var45] + var12;
                    if (var46 < arg0) {
                        field4170[var46] += this.method1981(field4194[var45], field4190[var45] * var40 >> 15, this.field4187.field6132);
                        field4194[var45] += (field4192[var45] * var39 >> 16) + field4193[var45];
                    }
                }
            }
        }
        if (this.field4179 != null) {
            this.field4179.method2679();
            this.field4177.method2679();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4179.method2682(arg0);
                int var18 = this.field4177.method2682(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4179.field6136 - this.field4179.field6135) * var17 >> 8) + this.field4179.field6135;
                } else {
                    var19 = ((this.field4179.field6136 - this.field4179.field6135) * var18 >> 8) + this.field4179.field6135;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4170[var16] = 0;
                }
            }
        }
        if (this.field4178 > 0 && this.field4183 > 0) {
            int var20 = (int) ((double) this.field4178 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4170[var21] += field4170[var21 - var20] * this.field4183 / 100;
            }
        }
        if (this.field4172.field4692[0] > 0 || this.field4172.field4692[1] > 0) {
            this.field4176.method2679();
            int var22 = this.field4176.method2682(arg0 + 1);
            int var23 = this.field4172.method2195(0, (float) var22 / 65536.0F);
            int var24 = this.field4172.method2195(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4170[var23 + var25] * (long) class347.field4695 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4170[var23 + var25 - var36 - 1] * (long) class347.field4691[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4170[var25 - var37 - 1] * (long) class347.field4691[1][var37] >> 16);
                    }
                    field4170[var25] = var35;
                    var22 = this.field4176.method2682(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4170[var23 + var25] * (long) class347.field4695 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4170[var23 + var25 - var33 - 1] * (long) class347.field4691[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4170[var25 - var34 - 1] * (long) class347.field4691[1][var34] >> 16);
                        }
                        field4170[var25] = var32;
                        var22 = this.field4176.method2682(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4170[var23 + var25 - var29 - 1] * (long) class347.field4691[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4170[var25 - var30 - 1] * (long) class347.field4691[1][var30] >> 16);
                            }
                            field4170[var25] = var28;
                            this.field4176.method2682(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4172.method2195(0, (float) var22 / 65536.0F);
                    var24 = this.field4172.method2195(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4170[var38] < -32768) {
                field4170[var38] = -32768;
            }
            if (field4170[var38] > 32767) {
                field4170[var38] = 32767;
            }
        }
        return field4170;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
    private final int method1981(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4189[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4184[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
    public static void method1982() {
        field4170 = null;
        field4184 = null;
        field4189 = null;
        field4194 = null;
        field4191 = null;
        field4190 = null;
        field4192 = null;
        field4193 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lap;)V")
    public final void method1983(class289 arg0) {
        this.field4187 = new class432();
        this.field4187.method2680(arg0);
        this.field4188 = new class432();
        this.field4188.method2680(arg0);
        int var2 = arg0.method1861((byte) -72);
        if (var2 != 0) {
            arg0.field3938--;
            this.field4186 = new class432();
            this.field4186.method2680(arg0);
            this.field4181 = new class432();
            this.field4181.method2680(arg0);
        }
        int var3 = arg0.method1861((byte) -72);
        if (var3 != 0) {
            arg0.field3938--;
            this.field4174 = new class432();
            this.field4174.method2680(arg0);
            this.field4173 = new class432();
            this.field4173.method2680(arg0);
        }
        int var4 = arg0.method1861((byte) -72);
        if (var4 != 0) {
            arg0.field3938--;
            this.field4179 = new class432();
            this.field4179.method2680(arg0);
            this.field4177 = new class432();
            this.field4177.method2680(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1821(-20);
            if (var6 == 0) {
                break;
            }
            this.field4185[var5] = var6;
            this.field4171[var5] = arg0.method1841(true);
            this.field4182[var5] = arg0.method1821(-113);
        }
        this.field4178 = arg0.method1821(-111);
        this.field4183 = arg0.method1821(-64);
        this.field4175 = arg0.method1853(-49);
        this.field4180 = arg0.method1853(97);
        this.field4172 = new class347();
        this.field4176 = new class432();
        this.field4172.method2194(arg0, this.field4176);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4184[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4189 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4189[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4170 = new int[220500];
        field4190 = new int[5];
        field4191 = new int[5];
        field4192 = new int[5];
        field4193 = new int[5];
        field4194 = new int[5];
    }
}
