import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class264 extends class110 {

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    private int field4079 = 0;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    private int field4085 = -1;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Z")
    private boolean field4065 = false;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "Z")
    private boolean field4082 = true;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    private int field4088 = -32768;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    private int field4076 = 0;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "Lhk;")
    private class42 field4067 = null;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    private int field4069 = 0;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    private int field4083 = -1;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    private int field4089;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    private int field4070;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    private int field4099;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    private int field4063;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    private int field4071;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    private int field4091;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
    private int field4097;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    private int field4080;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    private int field4075;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "Lbd;")
    private class28 field4068;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    private int field4092;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[Lkk;")
    public static class76[] field4064 = new class76[32768];

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "Z")
    public static boolean field4093 = false;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
    public static int field4098 = 50;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
    public static int field4101 = -1;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "[I")
    public static int[] field4103 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Lnl;")
    private class249 field4078;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Ljd;")
    public static class95 field4087;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "[I")
    public static int[] field4074;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 14)
    public static final void method1849(int arg0) {
        if (arg0 != 0) {
            method1851((class161) null, 7, -85, -6, (class269) null, 4, -9);
        }
        field4072++;
        class91.field1321.method750((byte) 125);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIII)V", line = 33)
    public static final void method1850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4077++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = arg4 - arg1;
        int var11 = arg5 - arg1;
        int var12 = 0;
        int var13 = arg5 * arg5;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        if (arg2 != 8457) {
            method1850(-34, 93, 19, -99, 64, 99, 3, 2);
        }
        int var16 = var10 * var10;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg4 << 1;
        int var22 = (1 - var21) * var13 + var18;
        int var23 = var14 - (var21 - 1) * var17;
        int var24 = var10 << 1;
        int var25 = (1 - var24) * var15 + var20;
        int var26 = var13 << 2;
        int var27 = var16 - ((var24 - 1) * var19);
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var18 * 3;
        int var32 = (var21 - 3) * var17;
        int var33 = (var24 - 3) * var19;
        int var34 = var20 * 3;
        int var35 = (arg4 - 1) * var26;
        int var36 = (var10 - 1) * var29;
        int var37 = var28;
        if (arg6 >= class212.field3261 && arg6 <= class182.field2888) {
            int[] var38 = class79.field1178[arg6];
            int var39 = class335.method2343(-1, class234.field3569, arg3 - arg5, class322.field4965);
            int var40 = class335.method2343(-1, class234.field3569, arg3 + arg5, class322.field4965);
            int var41 = class335.method2343(-1, class234.field3569, arg3 - var11, class322.field4965);
            int var42 = class335.method2343(-1, class234.field3569, arg3 + var11, class322.field4965);
            class7.method72(var41, -7, var39, var38, arg7);
            class7.method72(var42, -7, var41, var38, arg0);
            class7.method72(var40, -7, var42, var38, arg7);
        }
        int var43 = var30;
        while (var9 > 0) {
            boolean var44 = var10 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var34;
                        var34 += var30;
                        var27 += var43;
                        var43 += var30;
                        var12++;
                    }
                }
                if (var27 < 0) {
                    var12++;
                    var27 += var43;
                    var25 += var34;
                    var43 += var30;
                    var34 += var30;
                }
                var27 += -var33;
                var33 -= var29;
                var25 += -var36;
                var36 -= var29;
            }
            if (var22 < 0) {
                while (var22 < 0) {
                    var22 += var31;
                    var23 += var37;
                    var31 += var28;
                    var8++;
                    var37 += var28;
                }
            }
            var9--;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (var23 < 0) {
                var8++;
                var23 += var37;
                var37 += var28;
                var22 += var31;
                var31 += var28;
            }
            if (var46 >= class212.field3261 && class182.field2888 >= var45) {
                int var47 = class335.method2343(arg2 - 8458, class234.field3569, arg3 + var8, class322.field4965);
                int var48 = class335.method2343(arg2 ^ 0xFFFFDEF6, class234.field3569, arg3 - var8, class322.field4965);
                if (var44) {
                    int var49 = class335.method2343(arg2 ^ 0xFFFFDEF6, class234.field3569, arg3 + var12, class322.field4965);
                    int var50 = class335.method2343(-1, class234.field3569, arg3 - var12, class322.field4965);
                    if (class212.field3261 <= var45) {
                        int[] var51 = class79.field1178[var45];
                        class7.method72(var50, -7, var48, var51, arg7);
                        class7.method72(var49, arg2 - 8464, var50, var51, arg0);
                        class7.method72(var47, -7, var49, var51, arg7);
                    }
                    if (class182.field2888 >= var46) {
                        int[] var52 = class79.field1178[var46];
                        class7.method72(var50, -7, var48, var52, arg7);
                        class7.method72(var49, -7, var50, var52, arg0);
                        class7.method72(var47, -7, var49, var52, arg7);
                    }
                } else {
                    if (class212.field3261 <= var45) {
                        class7.method72(var47, arg2 - 8464, var48, class79.field1178[var45], arg7);
                    }
                    if (var46 <= class182.field2888) {
                        class7.method72(var47, -7, var48, class79.field1178[var46], arg7);
                    }
                }
            }
            var23 += -var32;
            var32 -= var26;
            var22 += -var35;
            var35 -= var26;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lmn;IIILrj;II)V", line = 243)
    public static final void method1851(class161 arg0, int arg1, int arg2, int arg3, class269 arg4, int arg5, int arg6) {
        field4102++;
        if (arg4 == null) {
            return;
        }
        int var7 = (int) class243.field3695 + class63.field846 & 0x7FF;
        int var8 = Math.max(arg0.field2619 / 2, arg0.field2490 / 2) + 10;
        int var9 = arg2 * arg2 + arg6 * arg6;
        if (var8 * var8 < var9) {
            return;
        }
        if (arg5 != -29787) {
            method1854(22, (String) null, (String) null, (byte) -86);
        }
        int var10 = class164.field2664[var7];
        int var11 = var10 * 256 / (class94.field1332 + 256);
        int var12 = class164.field2650[var7];
        int var13 = var12 * 256 / (class94.field1332 + 256);
        int var14 = arg2 * var11 - (arg6 * var13) >> 16;
        int var15 = arg2 * var13 + arg6 * var11 >> 16;
        if (class73.field1058) {
            ((class44) arg4).method342(arg0.field2619 / 2 + arg1 + var15 - (arg4.field4188 / 2), arg0.field2490 / 2 + arg3 + -var14 - arg4.field4179 / 2, (class44) arg0.method1202(-74, false));
        } else {
            ((class195) arg4).method1432(arg1 - (-(arg0.field2619 / 2) - var15) - (arg4.field4188 / 2), arg3 - (-(arg0.field2490 / 2) - -var14) + -(arg4.field4179 / 2), arg0.field2478, arg0.field2556);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V", line = 281)
    public final void method572(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class73.field1058) {
            this.method1853(true, 101);
        } else {
            this.method1857(arg3, (byte) -96, arg4);
        }
        field4100++;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V", line = 301)
    public final void method1852(boolean arg0) {
        if (this.field4067 != null) {
            class125.method937(this.field4067, this.field4079, this.field4076, this.field4069);
            this.field4067 = null;
        }
        if (arg0) {
            field4096++;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)Lfc;", line = 320)
    private final class110 method1853(boolean arg0, int arg1) {
        boolean var3 = class79.field1151 != class203.field3111;
        field4090++;
        class32 var4 = class226.method1607(-124, this.field4063);
        if (var4.field450 != null) {
            var4 = var4.method247(-1);
        }
        if (var4 == null) {
            if (class73.field1058 && !var3) {
                this.method1852(true);
            }
            this.field4083 = this.field4080;
            this.field4085 = -1;
            return null;
        }
        if (!this.field4065 && this.field4085 != var4.field404) {
            this.method1859(-11171, -1);
        }
        int var5 = this.field4071 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field413;
            var7 = var4.field416;
        } else {
            var6 = var4.field416;
            var7 = var4.field413;
        }
        int var8 = (var6 >> 1) + this.field4091;
        int var9 = (var6 + 1 >> 1) + this.field4091;
        int var10 = this.field4070 + (var7 >> 1);
        int var11 = this.field4070 + (var7 + 1 >> 1);
        this.method1857(var8 * 128, (byte) -33, var10 * 128);
        boolean var12 = !var3 && var4.field402 && (this.field4085 != var4.field404 || (this.field4083 != this.field4080 || this.field4068 != null && (this.field4068.field338 || class231.field3527) && this.field4080 != this.field4075) && class165.field2674 >= 2);
        if (arg0 && !var12) {
            this.field4083 = this.field4080;
            this.field4085 = var4.field404;
            return null;
        }
        int[][] var13 = class203.field3111[this.field4089];
        int var14 = (this.field4091 << 7) + (var6 << 6);
        int var15 = (this.field4070 << 7) + (var7 << 6);
        int[][] var16 = (int[][]) null;
        int var17 = var13[var8][var10] + var13[var9][var11] + var13[var8][var11] + var13[var9][var10] >> 2;
        if (arg1 < 69) {
            method1851((class161) null, 10, 67, -7, (class269) null, -93, 12);
        }
        if (var3) {
            var16 = class79.field1151[0];
        } else if (this.field4089 < 3) {
            var16 = class203.field3111[this.field4089 + 1];
        }
        if (class73.field1058 && var12) {
            class125.method937(this.field4067, this.field4079, this.field4076, this.field4069);
        }
        boolean var18 = this.field4067 == null;
        class214 var19;
        if (this.field4068 == null) {
            var19 = var4.method257(var18 ? class96.field1381 : this.field4067, var16, this.field4099, var15, false, 82, var17, var12, this.field4071, var13, var14);
        } else {
            var19 = var4.method245(this.field4075, this.field4080, this.field4099, this.field4071, var17, this.field4092, var18 ? class96.field1381 : this.field4067, var12, this.field4068, 256, var15, var14, var13, var16);
        }
        if (var19 == null) {
            this.field4085 = var4.field404;
            this.field4083 = this.field4080;
            return null;
        }
        if (class73.field1058 && var12) {
            if (var18) {
                class96.field1381 = var19.field3289;
            }
            int var20 = 0;
            if (this.field4089 != 0) {
                int[][] var21 = class203.field3111[0];
                var20 = var17 - (var21[var8][var10] + var21[var9][var10] + var21[var9][var11] + var21[var8][var11] >> 2);
            }
            class42 var22 = var19.field3289;
            if (this.field4082 && class125.method931(var22, var14, var20, var15)) {
                this.field4082 = false;
            }
            if (!this.field4082) {
                class125.method938(var22, var14, var20, var15);
                if (var18) {
                    class96.field1381 = null;
                }
                this.field4069 = var15;
                this.field4076 = var20;
                this.field4067 = var22;
                this.field4079 = var14;
            }
        }
        this.field4085 = var4.field404;
        this.field4083 = this.field4080;
        return var19.field3287;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V", line = 467)
    public static final void method1854(int arg0, String arg1, String arg2, byte arg3) {
        class297.field4579 = arg0;
        field4095++;
        class320.field4956 = arg2;
        class160.field2432 = arg1;
        if (class160.field2432.equals("") || class320.field4956.equals("")) {
            class184.field2907 = 3;
        } else if (class224.field3424 == -1) {
            class184.field2907 = -3;
            class14.field194 = 0;
            class205.field3150 = 0;
            class300.field4622 = 1;
            class254 var4 = new class254(128);
            var4.method1752(10, -107);
            var4.method1773((int) (Math.random() * 9.9999999E7D), false);
            var4.method1738((byte) 120, class49.method374(class160.field2432, arg3 - 70));
            var4.method1773((int) (Math.random() * 9.9999999E7D), false);
            var4.method1766(arg3 ^ 0x45, class320.field4956);
            var4.method1773((int) (Math.random() * 9.9999999E7D), false);
            var4.method1781(class177.field2826, 0, class327.field5048);
            class85.field1236.field3866 = 0;
            class85.field1236.method1752(24, -119);
            class85.field1236.method1752(var4.field3866 + 2, -107);
            if (arg3 == 69) {
                class85.field1236.method1744(true, 543);
                class85.field1236.method1759(-91, var4.field3840, 0, var4.field3866);
            }
        } else {
            class142.method1086(-3);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIIIIZLfc;)V", line = 860)
    public class264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class110 arg8) {
        this.field4089 = arg3;
        this.field4070 = arg5;
        this.field4099 = arg1;
        this.field4063 = arg0;
        this.field4071 = arg2;
        this.field4091 = arg4;
        if (arg8 != null) {
            this.field4065 = true;
            if ((arg8 instanceof class264)) {
                class264 var11 = (class264) arg8;
                if (class73.field1058) {
                    var11.method1852(true);
                }
                this.field4097 = var11.field4097;
                this.field4080 = var11.field4080;
                this.field4075 = var11.field4075;
                this.field4068 = var11.field4068;
                this.field4092 = var11.field4092;
            } else if (class73.field1058) {
                class32 var10 = class226.method1607(118, this.field4063);
                if (var10.field450 != null) {
                    var10 = var10.method247(-1);
                }
                if (var10 != null) {
                    class21.method169((byte) 30, this.field4091, 0, this.field4089, this.field4099, var10, 0, this.field4071, this.field4070);
                }
            }
        }
        if (this.field4065) {
            this.method1859(-11171, arg6);
        }
        if (class73.field1058 && arg8 != null) {
            this.method1853(true, 83);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V", line = 520)
    public static final void method1855(int arg0, boolean arg1) {
        field4084++;
        class293.method2025((byte) 68);
        if (arg0 != 25 || class152.field2308 != 30 && class152.field2308 != 25) {
            return;
        }
        class83.field1220++;
        if (class83.field1220 < 50 && !arg1) {
            return;
        }
        class83.field1220 = 0;
        if (!class51.field682 && class1.field20 != null) {
            class163.field2635++;
            class85.field1236.method1141((byte) 86, 84);
            try {
                class1.field20.method1651(0, class85.field1236.field3866, class85.field1236.field3840, (byte) -34);
                class85.field1236.field3866 = 0;
            } catch (IOException var3) {
                class51.field682 = true;
            }
        }
        class293.method2025((byte) 88);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 558)
    public static void method1856(int arg0) {
        field4087 = null;
        field4074 = null;
        field4064 = null;
        if (arg0 != 2) {
            field4074 = (int[]) null;
        }
        field4103 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)V", line = 572)
    private final void method1857(int arg0, byte arg1, int arg2) {
        if (arg1 >= -24) {
            this.method576(-51, -110, 62, 21, 31, -38, 97, 102, -25L, 105, (class249) null);
        }
        field4086++;
        label96: while (true) {
            if (this.field4068 == null) {
                if (this.field4065) {
                    return;
                }
                this.method1859(-11171, -1);
                if (this.field4068 == null) {
                    return;
                }
            }
            int var4 = class233.field3542 - this.field4097;
            if (var4 > 100 && this.field4068.field339 > 0) {
                int var5 = this.field4068.field312.length - this.field4068.field339;
                while (this.field4080 < var5 && var4 > this.field4068.field328[this.field4080]) {
                    var4 -= this.field4068.field328[this.field4080];
                    this.field4080++;
                }
                if (var5 <= this.field4080) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4068.field312.length; var7++) {
                        var6 += this.field4068.field328[var7];
                    }
                    var4 %= var6;
                }
                this.field4075 = this.field4080 + 1;
                if (this.field4068.field312.length <= this.field4075) {
                    this.field4075 -= this.field4068.field339;
                    if (this.field4075 < 0 || this.field4068.field312.length <= this.field4075) {
                        this.field4075 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field4068.field328[this.field4080] >= var4) {
                            this.field4092 = var4;
                            this.field4097 = class233.field3542 - var4;
                            return;
                        }
                        class146.method1105(this.field4080, false, 6924, arg2, this.field4068, arg0);
                        var4 -= this.field4068.field328[this.field4080];
                        this.field4080++;
                        if (this.field4068.field312.length <= this.field4080) {
                            this.field4080 -= this.field4068.field339;
                            if (this.field4080 < 0 || this.field4068.field312.length <= this.field4080) {
                                this.field4068 = null;
                                continue label96;
                            }
                        }
                        this.field4075 = this.field4080 + 1;
                    } while (this.field4075 < this.field4068.field312.length);
                    this.field4075 -= this.field4068.field339;
                } while (this.field4075 >= 0 && this.field4068.field312.length > this.field4075);
                this.field4075 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)Lfc;", line = 669)
    public final class110 method1858(int arg0) {
        if (arg0 <= 42) {
            method1854(-55, (String) null, (String) null, (byte) 27);
        }
        field4066++;
        return this.method1853(false, 127);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()I", line = 683)
    public final int method565() {
        field4073++;
        return this.field4088;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V", line = 695)
    private final void method1859(int arg0, int arg1) {
        field4094++;
        if (arg0 != -11171) {
            return;
        }
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class32 var5 = class226.method1607(51, this.field4063);
            class32 var6 = var5;
            if (var5.field450 != null) {
                var5 = var5.method247(-1);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field446 != null) {
                if (this.field4068 != null && var5.method254(0, this.field4068.field323)) {
                    return;
                }
                var3 = var5.method252(arg0 ^ 0xFFFFD45D);
                if (this.field4085 != var5.field404) {
                    var4 = var5.field441;
                }
            } else if (var5.field475 == -1) {
                if (var6 != null && var6.field446 != null) {
                    if (this.field4068 != null && var6.method254(arg0 ^ 0xFFFFD45D, this.field4068.field323)) {
                        return;
                    }
                    var3 = var6.method252(0);
                    if (this.field4085 != var6.field404) {
                        var4 = var6.field441;
                    }
                } else if (var6 != null && var6.field475 != -1 && this.field4085 != var6.field404) {
                    var3 = var6.field475;
                    var4 = var6.field441;
                }
            } else if (this.field4085 != var5.field404) {
                var4 = var5.field441;
                var3 = var5.field475;
            }
        }
        if (var3 == -1) {
            this.field4068 = null;
            return;
        }
        if (this.field4068 == null || this.field4068.field323 != var3) {
            this.field4068 = client.method1010(var3, (byte) 104);
        } else if (this.field4068.field335 == 0) {
            return;
        }
        if (var4) {
            this.field4080 = (int) ((double) this.field4068.field312.length * Math.random());
        } else {
            this.field4080 = 0;
        }
        this.field4075 = this.field4080 + 1;
        if (this.field4075 < 0 || this.field4068.field312.length <= this.field4075) {
            this.field4075 = -1;
        }
        this.field4092 = ((int) (Math.random() * (double) this.field4068.field328[this.field4080])) + 1;
        this.field4097 = class233.field3542 - this.field4092;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIJILnl;)V", line = 820)
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10) {
        class110 var13 = this.method1858(123);
        field4104++;
        if (var13 != null) {
            var13.method576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4078);
        }
    }

    @OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V", line = 839)
    protected final void finalize() {
        field4081++;
    }
}
