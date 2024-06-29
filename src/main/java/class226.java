import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class226 extends class139 {

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    private int field3946 = 0;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Z")
    public boolean field3957 = false;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    private int field3965 = -32768;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    private int field3964 = 0;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public int field3967;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public int field3956;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    private int field3952;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Lwk;")
    private class170 field3959;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Lha;")
    private static class46 field3947 = class271.method1828("", -46);

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Lha;")
    public static class46 field3961 = class271.method1828("null", -46);

    @OriginalMember(owner = "client!r", name = "P", descriptor = "Z")
    public static boolean field3970 = false;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Lha;")
    public static class46 field3960 = class271.method1828("headicons_prayer", -46);

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Lha;")
    public static class46 field3971 = field3947;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class36 var11 = this.method1550(false);
        field3962++;
        if (var11 != null) {
            var11.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3965 = var11.method183();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field3969++;
        int var9 = arg1 - arg7;
        int var10 = 0;
        int var11 = arg5 - arg7;
        int var12 = arg5;
        int var13 = arg1 * arg1;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var14 << 1;
        int var17 = var9 * var9;
        int var18 = var15 << 1;
        int var19 = var13 << 1;
        int var20 = -40 % ((arg2 + 47) / 62);
        int var21 = arg5 << 1;
        int var22 = var17 << 1;
        int var23 = var11 << 1;
        int var24 = (1 - var21) * var13 + var16;
        int var25 = var14 - ((var21 - 1) * var19);
        int var26 = var13 << 2;
        int var27 = var14 << 2;
        int var28 = (1 - var23) * var17 + var18;
        int var29 = var17 << 2;
        int var30 = var15 << 2;
        int var31 = var15 - ((var23 - 1) * var22);
        int var32 = var16 * 3;
        int var33 = var18 * 3;
        int var34 = (var21 - 3) * var19;
        int var35 = var27;
        int var36 = (arg5 - 1) * var26;
        int var37 = (var23 - 3) * var22;
        int var38 = var30;
        int var39 = (var11 - 1) * var29;
        if (class4.field70 <= arg6 && arg6 <= class70.field1205) {
            int[] var40 = class6.field100[arg6];
            int var41 = class15.method77(arg4 - arg1, class135.field2445, class73.field1309, -47);
            int var42 = class15.method77(arg1 + arg4, class135.field2445, class73.field1309, -93);
            int var43 = class15.method77(arg4 - var9, class135.field2445, class73.field1309, -125);
            int var44 = class15.method77(arg4 + var9, class135.field2445, class73.field1309, -102);
            class24.method170((byte) 33, var41, var40, var43, arg3);
            class24.method170((byte) 33, var43, var40, var44, arg0);
            class24.method170((byte) 33, var44, var40, var42, arg3);
        }
        while (var12 > 0) {
            boolean var45 = var11 >= var12;
            if (var45) {
                if (var28 < 0) {
                    while (var28 < 0) {
                        var28 += var33;
                        var33 += var30;
                        var10++;
                        var31 += var38;
                        var38 += var30;
                    }
                }
                if (var31 < 0) {
                    var31 += var38;
                    var38 += var30;
                    var28 += var33;
                    var33 += var30;
                    var10++;
                }
                var31 += -var37;
                var28 += -var39;
                var39 -= var29;
                var37 -= var29;
            }
            if (var24 < 0) {
                while (var24 < 0) {
                    var24 += var32;
                    var8++;
                    var32 += var27;
                    var25 += var35;
                    var35 += var27;
                }
            }
            var12--;
            if (var25 < 0) {
                var24 += var32;
                var32 += var27;
                var25 += var35;
                var35 += var27;
                var8++;
            }
            var25 += -var34;
            var34 -= var26;
            int var46 = arg6 + var12;
            var24 += -var36;
            var36 -= var26;
            int var47 = arg6 - var12;
            if (class4.field70 <= var46 && class70.field1205 >= var47) {
                int var48 = class15.method77(arg4 + var8, class135.field2445, class73.field1309, -36);
                int var49 = class15.method77(arg4 - var8, class135.field2445, class73.field1309, -37);
                if (var45) {
                    int var50 = class15.method77(arg4 + var10, class135.field2445, class73.field1309, -50);
                    int var51 = class15.method77(arg4 - var10, class135.field2445, class73.field1309, -127);
                    if (class4.field70 <= var47) {
                        int[] var52 = class6.field100[var47];
                        class24.method170((byte) 33, var49, var52, var51, arg3);
                        class24.method170((byte) 33, var51, var52, var50, arg0);
                        class24.method170((byte) 33, var50, var52, var48, arg3);
                    }
                    if (var46 <= class70.field1205) {
                        int[] var53 = class6.field100[var46];
                        class24.method170((byte) 33, var49, var53, var51, arg3);
                        class24.method170((byte) 33, var51, var53, var50, arg0);
                        class24.method170((byte) 33, var50, var53, var48, arg3);
                    }
                } else {
                    if (class4.field70 <= var47) {
                        class24.method170((byte) 33, var49, class6.field100[var47], var48, arg3);
                    }
                    if (class70.field1205 >= var46) {
                        class24.method170((byte) 33, var49, class6.field100[var46], var48, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method1542(int arg0) {
        class175.field3149 = 0;
        class111.field2082 = 0;
        if (arg0 != -16609) {
            field3947 = null;
        }
        field3963++;
        class230.method1563(false);
        class244.method1677(13802);
        class56.method390(1);
        class251.method1703(arg0 ^ 0x4DB);
        for (int var1 = 0; var1 < class175.field3149; var1++) {
            int var3 = class60.field1012[var1];
            if (class157.field2803 != class1.field6[var3].field2557) {
                if (class1.field6[var3].field1547 > 0) {
                    class185.method1335(class1.field6[var3], (byte) -127);
                }
                class1.field6[var3] = null;
            }
        }
        if (class219.field3861 != class147.field2651.field1380) {
            throw new RuntimeException("gpp1 pos:" + class147.field2651.field1380 + " psize:" + class219.field3861);
        }
        for (int var2 = 0; var2 < class156.field2783; var2++) {
            if (class1.field6[class129.field2373[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class156.field2783);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static final void method1543(int arg0) {
        field3944++;
        class2.field19.method84(arg0 - 46984);
        if (arg0 != 14607) {
            method1545(-122, 2, 27, 30, 104, -48, -59);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public static void method1544(int arg0) {
        field3971 = null;
        field3960 = null;
        field3961 = null;
        if (arg0 != 1409004646) {
            method1541(-53, 7, -22, 56, 69, 113, 68, -43);
        }
        field3947 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 >= -93) {
            return;
        }
        field3948++;
        if (class135.field2445 <= arg1 && arg2 <= class73.field1309 && class4.field70 <= arg5 && arg0 <= class70.field1205) {
            if (arg6 == 1) {
                class210.method1478(arg1, (byte) 97, arg5, arg2, arg0, arg3);
            } else {
                class140.method1061(arg5, (byte) -112, arg1, arg3, arg6, arg0, arg2);
            }
        } else if (arg6 == 1) {
            class1.method1(arg5, arg1, (byte) 79, arg2, arg3, arg0);
        } else {
            class210.method1479(arg1, arg5, arg0, (byte) -22, arg3, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()I")
    public final int method183() {
        field3945++;
        return this.field3965;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V")
    public final void method1546(boolean arg0, int arg1) {
        field3966++;
        if (this.field3957) {
            return;
        }
        this.field3946 += arg1;
        while (this.field3946 > this.field3959.field3040[this.field3964]) {
            this.field3946 -= this.field3959.field3040[this.field3964];
            this.field3964++;
            if (this.field3964 >= this.field3959.field3020.length) {
                this.field3957 = true;
                break;
            }
        }
        if (!arg0) {
            this.field3956 = -14;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public static final void method1547(int arg0, int arg1) {
        field3968++;
        if (arg0 == 6466) {
            class251.field4434 = arg1;
            class70.field1203 = 50;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lwe;I)V")
    public static final void method1548(class75 arg0, int arg1) {
        field3955++;
        int var2 = class66.field1119 >> 2 << 10;
        int var3 = class194.field3489 >> 1;
        byte[][] var4 = new byte[class137.field2474][class49.field836];
        while (arg0.field1368.length > arg0.field1380) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method558(1) == 1) {
                var33 = true;
                var34 = arg0.method558(arg1 - 63);
                var35 = arg0.method558(arg1 ^ 0x41);
            }
            int var36 = arg0.method558(1);
            int var37 = arg0.method558(1);
            int var38 = class49.field836 - (1 - class232.field4039) - var37 * 64;
            int var39 = var36 * 64 - class194.field3493;
            if (var39 >= 0 && (var38 - 63) >= 0 && class137.field2474 > var39 + 63 && class49.field836 > var38) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var34 * 8 <= var40 && var34 * 8 + 8 > var40 && (var35 * 8) <= var42 && (var35 * 8 + 8) > var42) {
                            var41[var38 - var42] = arg0.method569((byte) -110);
                        }
                    }
                }
            } else if (var33) {
                arg0.field1380 += 64;
            } else {
                arg0.field1380 += 4096;
            }
        }
        if (arg1 != 64) {
            method1544(-64);
        }
        int var5 = class137.field2474;
        int var6 = class49.field836;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class156 var29 = class134.method1039(true, var28 - 1);
                        var8[var13] += var29.field2784;
                        var7[var13] += var29.field2792;
                        var11[var13] += var29.field2786;
                        var9[var13] += var29.field2788;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class156 var32 = class134.method1039(true, var31 - 1);
                        var8[var13] -= var32.field2784;
                        var7[var13] -= var32.field2792;
                        var11[var13] -= var32.field2786;
                        var9[var13] -= var32.field2788;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class10.field175[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var6 > var21) {
                        var18 += var11[var21];
                        var17 += var9[var21];
                        var15 += var8[var21];
                        var19 += var10[var21];
                        var16 += var7[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var15 -= var8[var22];
                        var17 -= var9[var22];
                        var18 -= var11[var22];
                        var19 -= var10[var22];
                        var16 -= var7[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var17 == 0 ? 0 : class168.method1194(var15 * 256 / var17, var16 / var19, var18 / var19, (byte) -67);
                        if (var4[var12][var20] != 0) {
                            int var25 = (var24 & 0x7F) + var3;
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 & 0x380) + (var2 + var24 & 0xFC00) + var25;
                            var23[class50.method369(63, var12) + (class50.method369(63, var20) << 6)] = class62.field1041[class245.method1678((byte) 127, 96, var26)];
                        } else if (var23 != null) {
                            var23[(class50.method369(var20, 63) << 6) + class50.method369(63, var12)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLhi;)V")
    public static final void method1549(boolean arg0, class24 arg1) {
        if (arg0) {
            field3961 = null;
        }
        if (class206.field3695 == arg1.field361) {
            class31.field592[arg1.field448] = true;
        }
        field3958++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Lme;")
    private final class36 method1550(boolean arg0) {
        field3949++;
        class272 var2 = class138.method1054(-22225, this.field3952);
        class36 var3;
        if (this.field3957) {
            var3 = var2.method1831((byte) 124, -1);
        } else {
            var3 = var2.method1831((byte) -125, this.field3964);
        }
        if (arg0) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIIII)V")
    public class226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3954 = arg3;
        this.field3967 = arg1;
        this.field3956 = arg4;
        this.field3952 = arg0;
        this.field3953 = arg6 + arg5;
        this.field3943 = arg2;
        int var8 = class138.method1054(-22225, this.field3952).field4745;
        if (var8 == -1) {
            this.field3957 = true;
        } else {
            this.field3957 = false;
            this.field3959 = class119.method951(0, var8);
        }
    }
}
