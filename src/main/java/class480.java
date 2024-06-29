import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class480 extends class463 {

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "Lws;")
    public class333 field5968 = new class333();

    @OriginalMember(owner = "client!nga", name = "C", descriptor = "Lrh;")
    public class249 field5984 = new class249();

    @OriginalMember(owner = "client!nga", name = "s", descriptor = "Lhe;")
    private class345 field5974;

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "Lpd;")
    public static class241 field5969 = new class241();

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "[Lcb;")
    public static class486[] field5981 = new class486[16];

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!nga", name = "r", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!nga", name = "t", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!nga", name = "u", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!nga", name = "v", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!nga", name = "w", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!nga", name = "y", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!nga", name = "A", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!nga", name = "B", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!nga", name = "x", descriptor = "Ltl;")
    public static class580 field5979;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "([III)V")
    public final void method1493(int[] arg0, int arg1, int arg2) {
        field5980++;
        this.field5984.method1493(arg0, arg1, arg2);
        for (class149 var4 = (class149) this.field5968.method1909(true); var4 != null; var4 = (class149) this.field5968.method1916((byte) 90)) {
            if (!this.field5974.method1969(true, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field1777 >= var5) {
                        this.method2621((byte) -34, arg0, var5, var4, var6, var5 + var6);
                        var4.field1777 -= var5;
                        break;
                    }
                    this.method2621((byte) -34, arg0, var4.field1777, var4, var6, var5 + var6);
                    var6 += var4.field1777;
                    var5 -= var4.field1777;
                } while (!this.field5974.method1960(0, var6, var4, var5, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg2 && arg4 == arg6 && arg5 == arg7 && arg3 == arg8) {
            class183.method1089((byte) -87, arg3, arg0, arg1, arg5, arg4);
        } else {
            int var10 = arg1;
            int var11 = arg4;
            int var12 = arg1 * 3;
            int var13 = arg4 * 3;
            int var14 = arg2 * 3;
            int var15 = arg6 * 3;
            int var16 = arg7 * 3;
            int var17 = arg8 * 3;
            int var18 = arg5 + var14 - (var16 - -arg1);
            int var19 = arg3 + var15 - var17 - arg4;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = (var28 + var32 + var30 >> 12) + arg1;
                int var35 = (var29 + var31 + var33 >> 12) + arg4;
                class183.method1089((byte) -87, var35, arg0, var10, var34, var11);
                var10 = var34;
                var11 = var35;
            }
        }
        field5977++;
        int var25 = -67 / ((-arg9 - 48) / 33);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZLrr;I)V")
    public static final void method2620(boolean arg0, class337 arg1, int arg2) {
        field5966++;
        int var3 = ~arg1.field4181 == arg2 ? arg1.field4309 : arg1.field4181;
        int var4 = arg1.field4280 == 0 ? arg1.field4211 : arg1.field4280;
        class133.method866(var3, var4, arg0, -121, class325.field4062[arg1.field4172 >> 16], arg1.field4172);
        if (arg1.field4179 != null) {
            class133.method866(var3, var4, arg0, arg2 - 124, arg1.field4179, arg1.field4172);
        }
        class293 var5 = (class293) class216.field2530.method3828((long) arg1.field4172, (byte) -91);
        if (var5 != null) {
            client.method1695(var3, var5.field3727, -28691, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "()I")
    public final int method1495() {
        field5976++;
        return 0;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "()Lmi;")
    public final class463 method1487() {
        field5975++;
        class149 var1;
        do {
            var1 = (class149) this.field5968.method1916((byte) 123);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1786 == null);
        return var1.field1786;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B[IILjh;II)V")
    private final void method2621(byte arg0, int[] arg1, int arg2, class149 arg3, int arg4, int arg5) {
        field5967++;
        if ((this.field5974.field4441[arg3.field1793] & 0x4) != 0 && arg3.field1775 < 0) {
            int var7 = this.field5974.field4413[arg3.field1793] / class278.field3535;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field1784) / var7;
                if (arg2 < var8) {
                    arg3.field1784 += arg2 * var7;
                    break;
                }
                arg3.field1786.method1493(arg1, arg4, var8);
                arg2 -= var8;
                arg4 += var8;
                arg3.field1784 += var7 * var8 - 1048576;
                int var9 = class278.field3535 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class609 var11 = arg3.field1786;
                if (this.field5974.field4379[arg3.field1793] == 0) {
                    arg3.field1786 = class609.method3386(arg3.field1782, var11.method3415(), var11.method3398(), var11.method3388());
                } else {
                    arg3.field1786 = class609.method3386(arg3.field1782, var11.method3415(), 0, var11.method3388());
                    this.field5974.method1982((byte) 118, arg3.field1779.field982[arg3.field1792] < 0, arg3);
                    arg3.field1786.method3401(var9, var11.method3398());
                }
                if (arg3.field1779.field982[arg3.field1792] < 0) {
                    arg3.field1786.method3394(-1);
                }
                var11.method3408(var9);
                var11.method1493(arg1, arg4, arg5 - arg4);
                if (var11.method3397()) {
                    this.field5984.method1485(var11);
                }
            }
        }
        if (arg0 != -34) {
            this.field5984 = null;
        }
        arg3.field1786.method1493(arg1, arg4, arg2);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
    public final void method1486(int arg0) {
        field5982++;
        this.field5984.method1486(arg0);
        for (class149 var2 = (class149) this.field5968.method1909(true); var2 != null; var2 = (class149) this.field5968.method1916((byte) 114)) {
            if (!this.field5974.method1969(true, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1777 >= var3) {
                        this.method2622((byte) 67, var3, var2);
                        var2.field1777 -= var3;
                        break;
                    }
                    this.method2622((byte) 104, var2.field1777, var2);
                    var3 -= var2.field1777;
                } while (!this.field5974.method1960(0, 0, var2, var3, null));
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(BILjh;)V")
    private final void method2622(byte arg0, int arg1, class149 arg2) {
        if ((this.field5974.field4441[arg2.field1793] & 0x4) != 0 && arg2.field1775 < 0) {
            int var4 = this.field5974.field4413[arg2.field1793] / class278.field3535;
            int var5 = (var4 + 1048575 - arg2.field1784) / var4;
            arg2.field1784 = arg1 * var4 + arg2.field1784 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field5974.field4379[arg2.field1793] == 0) {
                    arg2.field1786 = class609.method3386(arg2.field1782, arg2.field1786.method3415(), arg2.field1786.method3398(), arg2.field1786.method3388());
                } else {
                    arg2.field1786 = class609.method3386(arg2.field1782, arg2.field1786.method3415(), 0, arg2.field1786.method3388());
                    this.field5974.method1982((byte) 122, arg2.field1779.field982[arg2.field1792] < 0, arg2);
                }
                if (arg2.field1779.field982[arg2.field1792] < 0) {
                    arg2.field1786.method3394(-1);
                }
                arg1 = arg2.field1784 / var4;
            }
        }
        field5983++;
        if (arg0 <= 52) {
            field5979 = null;
        }
        arg2.field1786.method1486(arg1);
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)V")
    public static void method2623(int arg0) {
        field5979 = null;
        field5969 = null;
        field5981 = null;
        if (arg0 != 128) {
            method2619(64, 5, 12, 87, -106, 74, -112, -126, 73, 67);
        }
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "()Lmi;")
    public final class463 method1496() {
        field5971++;
        class149 var1 = (class149) this.field5968.method1909(true);
        if (var1 == null) {
            return null;
        } else if (var1.field1786 == null) {
            return this.method1487();
        } else {
            return var1.field1786;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)V")
    public static final void method2624(int arg0, int arg1) {
        if (arg1 > -120) {
            return;
        }
        class80.field1043 = -1;
        field5973++;
        class537.field6759 = arg0;
        class80.field1043 = -1;
        class460.method2531((byte) 44);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method2625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class257.method1536(arg5, 2);
        if (!arg6) {
            method2624(-74, 104);
        }
        field5970++;
        int var7 = 0;
        int var8 = arg5 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class125.field1524 <= arg0 && class377.field4848 >= arg0) {
            int[] var14 = class30.field364[arg0];
            int var15 = class654.method3659(-7690, arg3 - arg5, class337.field4186, class292.field3700);
            int var16 = class654.method3659(-7690, arg3 + arg5, class337.field4186, class292.field3700);
            int var17 = class654.method3659(-7690, arg3 - var8, class337.field4186, class292.field3700);
            int var18 = class654.method3659(-7690, arg3 + var8, class337.field4186, class292.field3700);
            class390.method2223(var15, arg1, var14, (byte) -113, var17);
            class390.method2223(var17, arg2, var14, (byte) -121, var18);
            class390.method2223(var18, arg1, var14, (byte) -105, var16);
        }
        int var19 = -1;
        while (var7 < var9) {
            var19 += 2;
            var13 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class363.field4657[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (class125.field1524 <= var21 && class377.field4848 >= var20) {
                    if (var9 >= var8) {
                        int var22 = class654.method3659(-7690, arg3 + var7, class337.field4186, class292.field3700);
                        int var23 = class654.method3659(-7690, arg3 - var7, class337.field4186, class292.field3700);
                        if (var21 <= class377.field4848) {
                            class390.method2223(var23, arg1, class30.field364[var21], (byte) -107, var22);
                        }
                        if (var20 >= class125.field1524) {
                            class390.method2223(var23, arg1, class30.field364[var20], (byte) -90, var22);
                        }
                    } else {
                        int var24 = class363.field4657[var9];
                        int var25 = class654.method3659(-7690, arg3 + var7, class337.field4186, class292.field3700);
                        int var26 = class654.method3659(-7690, arg3 - var7, class337.field4186, class292.field3700);
                        int var27 = class654.method3659(-7690, arg3 + var24, class337.field4186, class292.field3700);
                        int var28 = class654.method3659(-7690, arg3 - var24, class337.field4186, class292.field3700);
                        if (var21 <= class377.field4848) {
                            int[] var29 = class30.field364[var21];
                            class390.method2223(var26, arg1, var29, (byte) -99, var28);
                            class390.method2223(var28, arg2, var29, (byte) -63, var27);
                            class390.method2223(var27, arg1, var29, (byte) -114, var25);
                        }
                        if (var20 >= class125.field1524) {
                            int[] var30 = class30.field364[var20];
                            class390.method2223(var26, arg1, var30, (byte) -102, var28);
                            class390.method2223(var28, arg2, var30, (byte) -100, var27);
                            class390.method2223(var27, arg1, var30, (byte) -65, var25);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (class125.field1524 <= var32 && class377.field4848 >= var31) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (class292.field3700 <= var33 && class337.field4186 >= var34) {
                    int var35 = class654.method3659(-7690, var33, class337.field4186, class292.field3700);
                    int var36 = class654.method3659(-7690, var34, class337.field4186, class292.field3700);
                    if (var8 <= var7) {
                        if (class377.field4848 >= var32) {
                            class390.method2223(var36, arg1, class30.field364[var32], (byte) -93, var35);
                        }
                        if (var31 >= class125.field1524) {
                            class390.method2223(var36, arg1, class30.field364[var31], (byte) -95, var35);
                        }
                    } else {
                        int var37 = var7 > var11 ? class363.field4657[var7] : var11;
                        int var38 = class654.method3659(-7690, arg3 + var37, class337.field4186, class292.field3700);
                        int var39 = class654.method3659(-7690, arg3 - var37, class337.field4186, class292.field3700);
                        if (var32 <= class377.field4848) {
                            int[] var40 = class30.field364[var32];
                            class390.method2223(var36, arg1, var40, (byte) -92, var39);
                            class390.method2223(var39, arg2, var40, (byte) -111, var38);
                            class390.method2223(var38, arg1, var40, (byte) -110, var35);
                        }
                        if (var31 >= class125.field1524) {
                            int[] var41 = class30.field364[var31];
                            class390.method2223(var36, arg1, var41, (byte) -126, var39);
                            class390.method2223(var39, arg2, var41, (byte) -86, var38);
                            class390.method2223(var38, arg1, var41, (byte) -96, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lhe;)V")
    public class480(class345 arg0) {
        this.field5974 = arg0;
    }
}
