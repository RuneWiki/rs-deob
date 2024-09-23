import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IRCSYKHE")
public class class22 {

    @OriginalMember(owner = "IRCSYKHE", name = "j", descriptor = "[I")
    private int[] field873 = new int[5];

    @OriginalMember(owner = "IRCSYKHE", name = "k", descriptor = "[I")
    private int[] field874 = new int[5];

    @OriginalMember(owner = "IRCSYKHE", name = "l", descriptor = "[I")
    private int[] field875 = new int[5];

    @OriginalMember(owner = "IRCSYKHE", name = "n", descriptor = "I")
    private int field877 = 100;

    @OriginalMember(owner = "IRCSYKHE", name = "q", descriptor = "I")
    public int field880 = 500;

    @OriginalMember(owner = "IRCSYKHE", name = "v", descriptor = "[I")
    private static int[] field885 = new int[5];

    @OriginalMember(owner = "IRCSYKHE", name = "w", descriptor = "[I")
    private static int[] field886 = new int[5];

    @OriginalMember(owner = "IRCSYKHE", name = "x", descriptor = "[I")
    private static int[] field887 = new int[5];

    @OriginalMember(owner = "IRCSYKHE", name = "y", descriptor = "[I")
    private static int[] field888 = new int[5];

    @OriginalMember(owner = "IRCSYKHE", name = "z", descriptor = "[I")
    private static int[] field889 = new int[5];

    @OriginalMember(owner = "IRCSYKHE", name = "m", descriptor = "I")
    private int field876;

    @OriginalMember(owner = "IRCSYKHE", name = "r", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "IRCSYKHE", name = "o", descriptor = "LOKKLRABS;")
    private class41 field878;

    @OriginalMember(owner = "IRCSYKHE", name = "b", descriptor = "LXJOITHUI;")
    private class65 field865;

    @OriginalMember(owner = "IRCSYKHE", name = "c", descriptor = "LXJOITHUI;")
    private class65 field866;

    @OriginalMember(owner = "IRCSYKHE", name = "d", descriptor = "LXJOITHUI;")
    private class65 field867;

    @OriginalMember(owner = "IRCSYKHE", name = "e", descriptor = "LXJOITHUI;")
    private class65 field868;

    @OriginalMember(owner = "IRCSYKHE", name = "f", descriptor = "LXJOITHUI;")
    private class65 field869;

    @OriginalMember(owner = "IRCSYKHE", name = "g", descriptor = "LXJOITHUI;")
    private class65 field870;

    @OriginalMember(owner = "IRCSYKHE", name = "h", descriptor = "LXJOITHUI;")
    private class65 field871;

    @OriginalMember(owner = "IRCSYKHE", name = "i", descriptor = "LXJOITHUI;")
    private class65 field872;

    @OriginalMember(owner = "IRCSYKHE", name = "p", descriptor = "LXJOITHUI;")
    private class65 field879;

    @OriginalMember(owner = "IRCSYKHE", name = "a", descriptor = "Z")
    private static boolean field864;

    @OriginalMember(owner = "IRCSYKHE", name = "s", descriptor = "[I")
    private static int[] field882;

    @OriginalMember(owner = "IRCSYKHE", name = "t", descriptor = "[I")
    private static int[] field883;

    @OriginalMember(owner = "IRCSYKHE", name = "u", descriptor = "[I")
    private static int[] field884;

    @OriginalMember(owner = "IRCSYKHE", name = "a", descriptor = "()V")
    public static final void method311() {
        field883 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field883[var0] = 1;
            } else {
                field883[var0] = -1;
            }
        }
        field884 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field884[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field882 = new int[220500];
    }

    @OriginalMember(owner = "IRCSYKHE", name = "a", descriptor = "(II)[I")
    public final int[] method312(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field882[var3] = 0;
        }
        if (arg1 < 10) {
            return field882;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field865.method540(2);
        this.field866.method540(2);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field867 != null) {
            this.field867.method540(2);
            this.field868.method540(2);
            var6 = (int) ((double) (this.field867.field1636 - this.field867.field1635) * 32.768D / var4);
            var7 = (int) ((double) this.field867.field1635 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field869 != null) {
            this.field869.method540(2);
            this.field870.method540(2);
            var9 = (int) ((double) (this.field869.field1636 - this.field869.field1635) * 32.768D / var4);
            var10 = (int) ((double) this.field869.field1635 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field873[var12] != 0) {
                field885[var12] = 0;
                field886[var12] = (int) ((double) this.field875[var12] * var4);
                field887[var12] = (this.field873[var12] << 14) / 100;
                field888[var12] = (int) ((double) (this.field865.field1636 - this.field865.field1635) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field874[var12]) / var4);
                field889[var12] = (int) ((double) this.field865.field1635 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field865.method541(field864, arg0);
            int var42 = this.field866.method541(field864, arg0);
            if (this.field867 != null) {
                int var43 = this.field867.method541(field864, arg0);
                int var44 = this.field868.method541(field864, arg0);
                var41 += this.method313(var8, this.field867.field1637, var44, 3) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field869 != null) {
                int var45 = this.field869.method541(field864, arg0);
                int var46 = this.field870.method541(field864, arg0);
                var42 = var42 * ((this.method313(var11, this.field869.field1637, var46, 3) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field873[var47] != 0) {
                    int var48 = field886[var47] + var13;
                    if (var48 < arg0) {
                        field882[var48] += this.method313(field885[var47], this.field865.field1637, field887[var47] * var42 >> 15, 3);
                        field885[var47] += (field888[var47] * var41 >> 16) + field889[var47];
                    }
                }
            }
        }
        if (this.field871 != null) {
            this.field871.method540(2);
            this.field872.method540(2);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field871.method541(field864, arg0);
                int var19 = this.field872.method541(field864, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field871.field1636 - this.field871.field1635) * var18 >> 8) + this.field871.field1635;
                } else {
                    var20 = ((this.field871.field1636 - this.field871.field1635) * var19 >> 8) + this.field871.field1635;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field882[var17] = 0;
                }
            }
        }
        if (this.field876 > 0 && this.field877 > 0) {
            int var21 = (int) ((double) this.field876 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field882[var22] += field882[var22 - var21] * this.field877 / 100;
            }
        }
        if (this.field878.field1304[0] > 0 || this.field878.field1304[1] > 0) {
            this.field879.method540(2);
            int var23 = this.field879.method541(field864, arg0 + 1);
            int var24 = this.field878.method454(false, (float) var23 / 65536.0F, 0);
            int var25 = this.field878.method454(false, (float) var23 / 65536.0F, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field882[var24 + var26] * (long) class41.field1311 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field882[var24 + var26 - var38 - 1] * (long) class41.field1309[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field882[var26 - var39 - 1] * (long) class41.field1309[1][var39] >> 16);
                    }
                    field882[var26] = var37;
                    var23 = this.field879.method541(field864, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field882[var24 + var26] * (long) class41.field1311 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field882[var24 + var26 - var35 - 1] * (long) class41.field1309[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field882[var26 - var36 - 1] * (long) class41.field1309[1][var36] >> 16);
                        }
                        field882[var26] = var34;
                        var23 = this.field879.method541(field864, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field882[var24 + var26 - var31 - 1] * (long) class41.field1309[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field882[var26 - var32 - 1] * (long) class41.field1309[1][var32] >> 16);
                            }
                            field882[var26] = var30;
                            this.field879.method541(field864, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field878.method454(false, (float) var23 / 65536.0F, 0);
                    var25 = this.field878.method454(false, (float) var23 / 65536.0F, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field882[var40] < -32768) {
                field882[var40] = -32768;
            }
            if (field882[var40] > 32767) {
                field882[var40] = 32767;
            }
        }
        return field882;
    }

    @OriginalMember(owner = "IRCSYKHE", name = "a", descriptor = "(IIII)I")
    private final int method313(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 3) {
            field864 = !field864;
        }
        if (arg1 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg1 == 2) {
            return field884[arg0 & 0x7FFF] * arg2 >> 14;
        } else if (arg1 == 3) {
            return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg1 == 4) {
            return field883[arg0 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "IRCSYKHE", name = "a", descriptor = "(ILBJPWOXRJ;)V")
    public final void method314(int arg0, class3 arg1) {
        this.field865 = new class65();
        this.field865.method538(674, arg1);
        this.field866 = new class65();
        this.field866.method538(674, arg1);
        int var3 = arg1.method15();
        if (var3 != 0) {
            arg1.field20--;
            this.field867 = new class65();
            this.field867.method538(674, arg1);
            this.field868 = new class65();
            this.field868.method538(674, arg1);
        }
        int var4 = arg1.method15();
        if (var4 != 0) {
            arg1.field20--;
            this.field869 = new class65();
            this.field869.method538(674, arg1);
            this.field870 = new class65();
            this.field870.method538(674, arg1);
        }
        int var5 = arg1.method15();
        if (var5 != 0) {
            arg1.field20--;
            this.field871 = new class65();
            this.field871.method538(674, arg1);
            this.field872 = new class65();
            this.field872.method538(674, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method29();
            if (var7 == 0) {
                break;
            }
            this.field873[var6] = var7;
            this.field874[var6] = arg1.method28();
            this.field875[var6] = arg1.method29();
        }
        this.field876 = arg1.method29();
        this.field877 = arg1.method29();
        this.field880 = arg1.method17();
        int var8 = 85 / arg0;
        this.field881 = arg1.method17();
        this.field878 = new class41();
        this.field879 = new class65();
        this.field878.method455(arg1, 0, this.field879);
    }
}
