import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class160 extends class126 {

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    private int field2510 = 0;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "Z")
    private boolean field2526 = false;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    private int field2516 = -32768;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    private int field2534 = 0;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    private int field2499;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    private int field2502;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    private int field2509;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    private int field2511;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    private int field2512;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "Lrk;")
    private class205 field2523;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "Lok;")
    public static class41 field2529 = class137.method956("(R", 45);

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "Lok;")
    private static class41 field2524 = class137.method956("Loaded world list data", 45);

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Lok;")
    public static class41 field2507 = field2524;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "Lda;")
    public static class212 field2508 = new class212();

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "Lok;")
    public static class41 field2539 = class137.method956("<col=40ff00>", 45);

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "D")
    public double field2501;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "D")
    public double field2504;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "D")
    public double field2517;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "D")
    private double field2519;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "D")
    private double field2522;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "D")
    private double field2528;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "D")
    private double field2530;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "D")
    private double field2533;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "I")
    private int field2536;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "[I")
    public static int[] field2538;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "[Lqa;")
    public static class79[] field2537;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1126(int arg0, int arg1) {
        if (arg0 <= 7) {
            return;
        }
        if (class199.field3199 == 0) {
            class210.field3379.method1061(arg1, (byte) 119);
        } else {
            class298.field4829 = arg1;
        }
        field2520++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 33)
    public static void method1127(byte arg0) {
        field2524 = null;
        if (arg0 != -35) {
            method1130();
        }
        field2508 = null;
        field2538 = null;
        field2537 = null;
        field2539 = null;
        field2529 = null;
        field2507 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIJ)V", line = 53)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2500++;
        class287 var11 = this.method1129(-56);
        if (var11 != null) {
            var11.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2516 = var11.method125();
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V", line = 67)
    public final void method1128(int arg0, int arg1) {
        field2535++;
        this.field2526 = true;
        this.field2501 += (double) arg1 * this.field2522;
        this.field2504 += (double) arg1 * this.field2533;
        if (arg0 != 0) {
            return;
        }
        this.field2517 += this.field2530 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2519;
        this.field2519 += (double) arg1 * this.field2530;
        this.field2532 = (int) (Math.atan2(this.field2533, this.field2522) * 325.949D) + 1024 & 0x7FF;
        this.field2536 = (int) (Math.atan2(this.field2519, this.field2528) * 325.949D) & 0x7FF;
        if (this.field2523 == null) {
            return;
        }
        this.field2534 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2523.field3331[this.field2510] >= this.field2534) {
                        return;
                    }
                    this.field2534 -= this.field2523.field3331[this.field2510];
                    this.field2510++;
                } while (this.field2510 < this.field2523.field3323.length);
                this.field2510 -= this.field2523.field3306;
            } while (this.field2510 >= 0 && this.field2510 < this.field2523.field3323.length);
            this.field2510 = 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Ljc;", line = 114)
    private final class287 method1129(int arg0) {
        if (arg0 > -32) {
            return (class287) null;
        }
        class222 var2 = class5.method15(this.field2531, false);
        field2527++;
        class287 var3 = var2.method1589(-108, this.field2510);
        if (var3 == null) {
            return null;
        } else {
            var3.method97(this.field2536);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()V", line = 140)
    public static final void method1130() {
        class284.field4610 = 0;
        label194: for (int var0 = 0; var0 < class236.field3793; var0++) {
            class234 var1 = class62.field920[var0];
            if (class202.field3242 != null) {
                for (int var2 = 0; var2 < class202.field3242.length; var2++) {
                    if (class202.field3242[var2] != -1000000 && (var1.field3751 <= class202.field3242[var2] || var1.field3735 <= class202.field3242[var2]) && (var1.field3753 <= class95.field1418[var2] || var1.field3743 <= class95.field1418[var2]) && (var1.field3753 >= class59.field859[var2] || var1.field3743 >= class59.field859[var2]) && (var1.field3726 <= class119.field1749[var2] || var1.field3757 <= class119.field1749[var2]) && (var1.field3726 >= class122.field1815[var2] || var1.field3757 >= class122.field1815[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field3758 == 1) {
                int var3 = var1.field3752 + class122.field1816 - class86.field1259;
                if (var3 >= 0 && var3 <= class122.field1816 + class122.field1816) {
                    int var4 = var1.field3741 + class122.field1816 - class30.field429;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3728 + class122.field1816 - class30.field429;
                    if (var5 > class122.field1816 + class122.field1816) {
                        var5 = class122.field1816 + class122.field1816;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class113.field1668[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class140.field2155 - var1.field3753;
                        if (var7 > 32) {
                            var1.field3738 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3738 = 2;
                            var7 = -var7;
                        }
                        var1.field3754 = (var1.field3726 - class302.field5027 << 8) / var7;
                        var1.field3755 = (var1.field3757 - class302.field5027 << 8) / var7;
                        var1.field3734 = (var1.field3751 - class299.field4843 << 8) / var7;
                        var1.field3756 = (var1.field3735 - class299.field4843 << 8) / var7;
                        class150.field2337[class284.field4610++] = var1;
                    }
                }
            } else if (var1.field3758 == 2) {
                int var8 = var1.field3741 + class122.field1816 - class30.field429;
                if (var8 >= 0 && var8 <= class122.field1816 + class122.field1816) {
                    int var9 = var1.field3752 + class122.field1816 - class86.field1259;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3740 + class122.field1816 - class86.field1259;
                    if (var10 > class122.field1816 + class122.field1816) {
                        var10 = class122.field1816 + class122.field1816;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class113.field1668[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class302.field5027 - var1.field3726;
                        if (var12 > 32) {
                            var1.field3738 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3738 = 4;
                            var12 = -var12;
                        }
                        var1.field3729 = (var1.field3753 - class140.field2155 << 8) / var12;
                        var1.field3749 = (var1.field3743 - class140.field2155 << 8) / var12;
                        var1.field3734 = (var1.field3751 - class299.field4843 << 8) / var12;
                        var1.field3756 = (var1.field3735 - class299.field4843 << 8) / var12;
                        class150.field2337[class284.field4610++] = var1;
                    }
                }
            } else if (var1.field3758 == 4) {
                int var13 = var1.field3751 - class299.field4843;
                if (var13 > 128) {
                    int var14 = var1.field3741 + class122.field1816 - class30.field429;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3728 + class122.field1816 - class30.field429;
                    if (var15 > class122.field1816 + class122.field1816) {
                        var15 = class122.field1816 + class122.field1816;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3752 + class122.field1816 - class86.field1259;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3740 + class122.field1816 - class86.field1259;
                        if (var17 > class122.field1816 + class122.field1816) {
                            var17 = class122.field1816 + class122.field1816;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class113.field1668[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3738 = 5;
                            var1.field3729 = (var1.field3753 - class140.field2155 << 8) / var13;
                            var1.field3749 = (var1.field3743 - class140.field2155 << 8) / var13;
                            var1.field3754 = (var1.field3726 - class302.field5027 << 8) / var13;
                            var1.field3755 = (var1.field3757 - class302.field5027 << 8) / var13;
                            class150.field2337[class284.field4610++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()I", line = 364)
    public final int method125() {
        field2497++;
        return this.field2516;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 657)
    public class160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2506 = arg1;
        this.field2498 = arg10;
        this.field2513 = arg9;
        this.field2499 = arg7;
        this.field2502 = arg2;
        this.field2521 = arg5;
        this.field2509 = arg3;
        this.field2503 = arg6;
        this.field2526 = false;
        this.field2511 = arg8;
        this.field2512 = arg4;
        this.field2531 = arg0;
        int var12 = class5.method15(this.field2531, false).field3545;
        if (var12 == -1) {
            this.field2523 = null;
        } else {
            this.field2523 = class285.method2000(var12, 4442);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V", line = 385)
    public final void method1131(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2526) {
            double var6 = (double) (arg4 - this.field2502);
            double var8 = (double) (arg1 - this.field2509);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2504 = (double) this.field2511 * var6 / var10 + (double) this.field2502;
            this.field2501 = (double) this.field2511 * var8 / var10 + (double) this.field2509;
            this.field2517 = (double) this.field2512;
        }
        field2505++;
        double var12 = (double) (this.field2503 + arg2 - arg0);
        this.field2522 = ((double) arg1 - this.field2501) / var12;
        this.field2533 = ((double) arg4 - this.field2504) / var12;
        this.field2528 = Math.sqrt(this.field2533 * this.field2533 + this.field2522 * this.field2522);
        if (!this.field2526) {
            this.field2519 = -this.field2528 * Math.tan((double) this.field2499 * 0.02454369D);
        }
        this.field2530 = ((double) arg3 - this.field2517 - (this.field2519 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILbc;I)V", line = 419)
    public static final void method1132(int arg0, int arg1, int arg2, class302 arg3, int arg4) {
        if (arg4 <= 5) {
            method1130();
        }
        if (class166.field2625) {
            class190.method1369(arg1, arg2, arg1 + arg3.field4936, arg3.field4949 + arg2);
        }
        if (class5.field49 < 3) {
            if (class166.field2625) {
                ((class17) class18.field238).method82(arg1, arg2, arg3.field4936, arg3.field4949, class18.field238.field3200 / 2, class18.field238.field3189 / 2, class8.field101, 256, (class17) arg3.method2086(true, false));
            } else {
                ((class72) class18.field238).method526(arg1, arg2, arg3.field4936, arg3.field4949, class18.field238.field3200 / 2, class18.field238.field3189 / 2, class8.field101, 256, arg3.field4960, arg3.field5038);
            }
        } else if (class166.field2625) {
            class199 var5 = arg3.method2086(true, false);
            if (var5 != null) {
                var5.method83(arg1, arg2);
            }
        } else {
            class54.method385(arg1, arg2, 0, arg3.field4960, arg3.field5038);
        }
        class165.field2615[arg0] = true;
        field2525++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lui;IIIIIIIZ)V", line = 459)
    public static final void method1133(class289 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class140.field2155;
        int var11;
        int var12 = var11 = (arg7 << 7) - class302.field5027;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class278.field4548[arg1][arg6][arg7] - class299.field4843;
        int var18 = class278.field4548[arg1][arg6 + 1][arg7] - class299.field4843;
        int var19 = class278.field4548[arg1][arg6 + 1][arg7 + 1] - class299.field4843;
        int var20 = class278.field4548[arg1][arg6][arg7 + 1] - class299.field4843;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class31.field452;
        int var46 = (var24 << 9) / var25 + class31.field446;
        int var47 = (var27 << 9) / var31 + class31.field452;
        int var48 = (var30 << 9) / var31 + class31.field446;
        int var49 = (var33 << 9) / var37 + class31.field452;
        int var50 = (var36 << 9) / var37 + class31.field446;
        int var51 = (var39 << 9) / var43 + class31.field452;
        int var52 = (var42 << 9) / var43 + class31.field446;
        class31.field454 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class272.field4429 && class143.method994(class48.field750 + class31.field452, class95.field1407 + class31.field446, var50, var52, var48, var49, var51, var47)) {
                class159.field2493 = arg6;
                class307.field5181 = arg7;
            }
            if (!class166.field2625 && !arg8) {
                class31.field456 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class31.field453 || var51 > class31.field453 || var47 > class31.field453) {
                    class31.field456 = true;
                }
                if (arg0.field4683 == -1) {
                    if (arg0.field4687 != 12345678) {
                        class31.method199(var50, var52, var48, var49, var51, var47, arg0.field4687, arg0.field4694, arg0.field4685);
                    }
                } else if (!class241.field3863) {
                    int var53 = class31.field461.method693(2, arg0.field4683);
                    class31.method199(var50, var52, var48, var49, var51, var47, class52.method357(var53, arg0.field4687), class52.method357(var53, arg0.field4694), class52.method357(var53, arg0.field4685));
                } else if (arg0.field4690) {
                    class31.method210(var50, var52, var48, var49, var51, var47, arg0.field4687, arg0.field4694, arg0.field4685, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4683);
                } else {
                    class31.method210(var50, var52, var48, var49, var51, var47, arg0.field4687, arg0.field4694, arg0.field4685, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4683);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class272.field4429 && class143.method994(class48.field750 + class31.field452, class95.field1407 + class31.field446, var46, var48, var52, var45, var47, var51)) {
            class159.field2493 = arg6;
            class307.field5181 = arg7;
        }
        if (class166.field2625 || arg8) {
            return;
        }
        class31.field456 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class31.field453 || var47 > class31.field453 || var51 > class31.field453) {
            class31.field456 = true;
        }
        if (arg0.field4683 == -1) {
            if (arg0.field4688 != 12345678) {
                class31.method199(var46, var48, var52, var45, var47, var51, arg0.field4688, arg0.field4685, arg0.field4694);
            }
        } else if (class241.field3863) {
            class31.method210(var46, var48, var52, var45, var47, var51, arg0.field4688, arg0.field4685, arg0.field4694, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4683);
        } else {
            int var54 = class31.field461.method693(2, arg0.field4683);
            class31.method199(var46, var48, var52, var45, var47, var51, class52.method357(var54, arg0.field4688), class52.method357(var54, arg0.field4685), class52.method357(var54, arg0.field4694));
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 624)
    public static final void method1134(byte arg0) {
        if (arg0 != -94) {
            field2524 = (class41) null;
        }
        class285.field4632.method131(arg0 ^ 0x5C);
        class111.field1576.method131(arg0 ^ 0x5C);
        field2518++;
        class217.field3480.method131(-2);
        class158.field2484.method131(arg0 ^ 0x5C);
    }
}
