import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class429 extends class228 {

    @OriginalMember(owner = "client!et", name = "Lc", descriptor = "I")
    public int field6049 = -1;

    @OriginalMember(owner = "client!et", name = "Tc", descriptor = "I")
    public int field6057 = -1;

    @OriginalMember(owner = "client!et", name = "wc", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!et", name = "xc", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!et", name = "yc", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!et", name = "zc", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!et", name = "Ac", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!et", name = "Bc", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!et", name = "Cc", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!et", name = "Dc", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!et", name = "Ec", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!et", name = "Fc", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!et", name = "Gc", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!et", name = "Ic", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!et", name = "Jc", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!et", name = "Mc", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!et", name = "Nc", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!et", name = "Oc", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!et", name = "Pc", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!et", name = "Qc", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!et", name = "Sc", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!et", name = "Rc", descriptor = "Lwr;")
    public class322 field6055;

    @OriginalMember(owner = "client!et", name = "Hc", descriptor = "[Ltj;")
    public static class135[] field6045;

    @OriginalMember(owner = "client!et", name = "Kc", descriptor = "[[I")
    public static int[][] field6048;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field6042;
        if (arg0 > -65) {
            this.method135(18);
        }
        if (this.field6055.field4693 != null) {
            class322 var2 = this.field6055.method1939(15964, class163.field2413);
            if (var2 != null && var2.field4637 != -1) {
                return var2.field4637;
            }
        }
        return this.field6055.field4637;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILza;I)Z")
    private final boolean method2535(int arg0, class290 arg1, int arg2) {
        ++field6038;
        int var4 = arg0;
        class98 var5 = this.method1406((byte) 120);
        class449 var6 = super.field3320 != -1 && super.field3361 == 0 ? class62.field784.method2566(super.field3320, arg2 + -19) : null;
        class449 var7 = ~super.field3337 == 0 || super.field3302 && var6 != null ? null : class62.field784.method2566(super.field3337, arg2 ^ -19);
        int var8 = var5.field1286;
        int var9 = var5.field1311;
        if (var8 != 0 || var9 != 0 || var5.field1281 != 0 || var5.field1327 != 0) {
            arg0 |= 7;
        }
        boolean var10 = ~super.field3347 != -1 && ~class390.field5481 <= ~super.field3348 && ~super.field3341 < ~class390.field5481;
        if (var10) {
            arg0 |= 524288;
        }
        class377 var11 = super.field3374[0] = this.field6055.method1947(class509.method3039(arg2, -55), arg0, class163.field2413, super.field3290, super.field3312, arg1, super.field3277, super.field3325, var6, super.field3314, super.field3284, var7, super.field3295, class498.field7049, class62.field784);
        if (var11 == null) {
            return false;
        } else {
            super.field3339 = var11.method1568();
            this.method1409(var11, -2865);
            int var12 = super.field3328.method1110(0);
            if (~var8 == -1 && ~var9 == -1) {
                this.method1403(this.method125((byte) -105) << 7, var12, 0, (byte) -73, this.method125((byte) -88) << 7, 0);
            } else {
                this.method1403(var8, var12, var5.field1329, (byte) -73, var9, var5.field1303);
                if (super.field3303 != 0) {
                    super.field3374[0].method1599(super.field3303);
                }
                if (~super.field3353 != -1) {
                    super.field3374[0].method1594(super.field3353);
                }
                if (~super.field3297 != -1) {
                    super.field3374[0].method1580(0, super.field3297, 0);
                }
            }
            if (var10) {
                var11.method1578(super.field3343, super.field3310, super.field3309, 255 & super.field3347);
            }
            if (super.field3275 != -1 && super.field3362 != -1) {
                class508 var13 = class125.field1688.method2457(super.field3275, (byte) 87);
                boolean var14 = ~var13.field7513 == -4 && (~var8 != -1 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (super.field3280 != 0) {
                        var15 = var4 | 5;
                    }
                    if (super.field3346 != 0) {
                        var15 |= 2;
                    }
                }
                class377 var16 = super.field3374[1] = var13.method3033(super.field3276, (byte) -10, arg1, super.field3362, var15, super.field3318, class62.field784);
                if (var16 != null) {
                    if (~super.field3346 != -1) {
                        var16.method1580(0, -super.field3346 << 0, 0);
                    }
                    if (~super.field3280 != -1) {
                        var16.method1612(super.field3280 * 2048);
                    }
                    if (var14) {
                        if (super.field3303 != 0) {
                            var16.method1599(super.field3303);
                        }
                        if (~super.field3353 != -1) {
                            var16.method1594(super.field3353);
                        }
                        if (~super.field3297 != -1) {
                            var16.method1580(0, super.field3297, 0);
                        }
                    }
                }
            } else {
                super.field3374[1] = null;
            }
            if (~super.field3350 != arg2 && super.field3322 != -1) {
                class508 var17 = class125.field1688.method2457(super.field3350, (byte) 87);
                boolean var18 = var17.field7513 == 3 && (~var8 != -1 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (~super.field3364 != -1) {
                        var19 = var4 | 5;
                    }
                    if (~super.field3279 != -1) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class377 var20 = super.field3374[3] = var17.method3036(super.field3321, super.field3344, -92, super.field3322, arg1, class62.field784, var19);
                if (var20 != null) {
                    if (~super.field3279 != -1) {
                        var20.method1580(0, -super.field3279 << 0, 0);
                    }
                    if (super.field3364 != 0) {
                        var20.method1612(super.field3364 * 2048);
                    }
                    if (var18) {
                        if (~super.field3303 != -1) {
                            var20.method1599(super.field3303);
                        }
                        if (super.field3353 != 0) {
                            var20.method1594(super.field3353);
                        }
                        if (~super.field3297 != -1) {
                            var20.method1580(0, super.field3297, 0);
                        }
                    }
                }
            } else {
                super.field3374[3] = null;
            }
            super.field3374[2] = null;
            if (super.field3371 != null) {
                if (class390.field5481 < super.field3371.field3226) {
                    if (class390.field5481 >= super.field3371.field3225) {
                        class377 var21 = super.field3371.method1383(7 | var4, arg1, -8365);
                        if (var21 != null) {
                            var21.method1580(-super.field1896 + super.field3371.field3224, super.field3371.field3223 - super.field1912, -super.field1899 + super.field3371.field3230);
                            if (~var12 != -1) {
                                var21.method1612(var12);
                            }
                            super.field3374[2] = var21;
                        }
                    }
                } else {
                    super.field3371 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(B)V")
    public static void method2536(byte arg0) {
        field6048 = null;
        field6045 = null;
        if (arg0 != -105) {
            field6048 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(Z)I")
    public final int method1405(boolean arg0) {
        ++field6041;
        if (arg0) {
            field6048 = null;
        }
        if (this.field6055.field4693 != null) {
            class322 var2 = this.field6055.method1939(15964, class163.field2413);
            if (var2 != null && ~var2.field4710 != 0) {
                return var2.field4710;
            }
        }
        return this.field6055.field4710 != -1 ? this.field6055.field4710 : super.method1405(false);
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(B)I")
    public final int method127(byte arg0) {
        if (arg0 != 86) {
            this.method130((class290) null, 94);
        }
        ++field6035;
        return super.field3339;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILza;I)Z")
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        ++field6054;
        if (this.field6055 != null && this.method2535(131072, arg2, arg0 ^ 3)) {
            class125 var5 = arg2.method368();
            int var6 = super.field3328.method1110(0);
            var5.method830(var6);
            var5.method824(super.field1896, super.field1912, super.field1899);
            boolean var7 = false;
            for (int var8 = 0; super.field3374.length > var8; ++var8) {
                if (super.field3374[var8] != null && super.field3374[var8].method1586(arg1, arg3, var5, this.field6055.field4711 == 1)) {
                    var7 = true;
                    break;
                }
            }
            super.field3374[0] = super.field3374[1] = super.field3374[2] = super.field3374[arg0] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIZIII)V")
    public final void method2537(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -7917) {
            this.method128(52, (class290) null, 68, (class510) null, -42, false, 71);
        }
        super.field1904 = (byte) arg3;
        ++field6036;
        if (super.field3320 != -1 && ~class62.field784.method2566(super.field3320, -19).field6262 == -2) {
            super.field3320 = -1;
        }
        if (super.field3275 != -1) {
            class508 var7 = class125.field1688.method2457(super.field3275, (byte) 87);
            if (var7.field7520 && ~var7.field7504 != 0 && class62.field784.method2566(var7.field7504, -19).field6262 == 1) {
                super.field3275 = -1;
            }
        }
        if (super.field3350 != -1) {
            class508 var8 = class125.field1688.method2457(super.field3350, (byte) 87);
            if (var8.field7520 && ~var8.field7504 != 0 && ~class62.field784.method2566(var8.field7504, -19).field6262 == -2) {
                super.field3350 = -1;
            }
        }
        if (!arg2) {
            int var9 = -super.field3368[0] + arg5;
            int var10 = -super.field3378[0] + arg1;
            if (~var9 <= 7 && var9 <= 8 && ~var10 <= 7 && ~var10 >= -9) {
                if (~super.field3369 > -10) {
                    ++super.field3369;
                }
                for (int var11 = super.field3369; var11 > 0; --var11) {
                    super.field3368[var11] = super.field3368[var11 + -1];
                    super.field3378[var11] = super.field3378[var11 + -1];
                    super.field3372[var11] = super.field3372[var11 - 1];
                }
                super.field3368[0] = arg5;
                super.field3372[0] = 1;
                super.field3378[0] = arg1;
                return;
            }
        }
        super.field3376 = 0;
        super.field3368[0] = arg5;
        super.field3369 = 0;
        super.field3377 = 0;
        super.field3378[0] = arg1;
        super.field1899 = (super.field3378[0] << 7) + (arg4 << 6);
        super.field1896 = (super.field3368[0] << 7) + (arg4 << 6);
        if (super.field3370 != null) {
            super.field3370.method2080();
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Lza;B)Lkf;")
    public final class170 method126(class290 arg0, byte arg1) {
        ++field6046;
        if (this.field6055 != null && this.method2535(2048, arg0, 0)) {
            class125 var3 = arg0.method368();
            if (arg1 > -86) {
                field6045 = null;
            }
            int var4 = super.field3328.method1110(0);
            var3.method830(var4);
            var3.method824(super.field1896, super.field1912, super.field1899);
            class98 var5 = this.method1406((byte) 104);
            class322 var6 = this.field6055.field4693 == null ? this.field6055 : this.field6055.method1939(15964, class163.field2413);
            if (class4.field81.field1434 && var6.field4667 && var5.field1285) {
                class449 var7 = ~super.field3320 != 0 && super.field3361 == 0 ? class62.field784.method2566(super.field3320, -19) : null;
                class449 var8 = super.field3337 == -1 || super.field3302 && var7 != null ? null : class62.field784.method2566(super.field3337, -19);
                int var9 = 0;
                if (~super.field3332 != -1) {
                    var9 = this.method1397(-117);
                }
                class377 var10 = class342.method2041(255 & this.field6055.field4707, var4, super.field3303, var8 != null ? var8 : var7, this.field6055.field4709 & 255, 65535 & this.field6055.field4682, 65535, arg0, var9, super.field3353, var8 != null ? super.field3314 : super.field3312, super.field3297, super.field3374[0], this.field6055.field4711, this.field6055.field4676 & 65535);
                if (var10 != null) {
                    float var11 = arg0.method386();
                    float var12 = arg0.method388();
                    arg0.method297(false);
                    arg0.method365(var11, var12 - 150.0F);
                    var10.method1566(var3, (class122) null, 0);
                    arg0.method365(var11, var12);
                    arg0.method297(true);
                }
            }
            class170 var13 = null;
            if (this.method2542(-105)) {
                var13 = class423.method2509(0, super.field3374.length);
            }
            if (super.field3370 != null) {
                class324 var14 = super.field3370.method2084();
                arg0.method310(super.field3374, var14, var3, var13 != null ? var13.field2475 : null, 0);
            } else {
                arg0.method298(super.field3374, var3, var13 == null ? null : var13.field2475, 0);
            }
            this.method1398(super.field3374, arg0, -3849, false);
            if (super.field3374[2] != null) {
                if (~var4 != -1) {
                    super.field3374[2].method1612(var4);
                }
                super.field3374[2].method1580(super.field1896 - super.field3371.field3224, super.field1912 - super.field3371.field3223, -super.field3371.field3230 + super.field1899);
            }
            super.field3374[0] = super.field3374[1] = super.field3374[2] = super.field3374[3] = null;
            super.field3286 = class402.field5649;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Z")
    public final boolean method2538(int arg0) {
        if (arg0 != -1) {
            this.method2544(69, 64, (byte) 90);
        }
        ++field6053;
        return this.field6055 != null;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
    public static final void method2539(int arg0) {
        ++field6052;
        class3.field65.method266(-9282);
        if (arg0 != 32) {
            method2536((byte) -67);
        }
        for (int var1 = 0; var1 < 32; ++var1) {
            class497.field7043[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class493.field6971[var2] = 0L;
        }
        client.field2867 = 0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIII)V")
    public static final void method2540(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6047;
        if (class392.field5514 <= -arg4 + arg1 && arg1 - -arg4 <= class518.field7624 && ~(-arg4 + arg0) <= ~class303.field4422 && class353.field5062 >= arg0 + arg4) {
            class511.method3051(arg0, -97, arg3, arg1, arg4);
        } else {
            class137.method857(arg3, arg1, 10502, arg0, arg4);
        }
        if (arg2 != 2048) {
            method2536((byte) -87);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lwr;Z)V")
    public final void method2541(class322 arg0, boolean arg1) {
        ++field6051;
        if (arg1) {
            this.method135(98);
        }
        this.field6055 = arg0;
        if (super.field3370 != null) {
            super.field3370.method2080();
        }
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)Z")
    private final boolean method2542(int arg0) {
        ++field6037;
        if (arg0 > -33) {
            this.field6057 = 9;
        }
        return this.field6055.field4701;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lza;I)V")
    public final void method130(class290 arg0, int arg1) {
        ++field6043;
        if (this.field6055 != null) {
            if (super.field3375 || this.method2535(0, arg0, 0)) {
                this.method1398(super.field3374, arg0, -3849, super.field3375);
                super.field3374[arg1] = super.field3374[1] = super.field3374[2] = super.field3374[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I[BIIII)Z")
    public static final boolean method2543(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6056;
        if (arg2 != 0) {
            method2540(-63, -1, 59, -122, 105);
        }
        boolean var6 = true;
        class403 var7 = new class403(arg1);
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method2339((byte) 16);
            if (~var9 == -1) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2325(true);
                    if (var13 == 0) {
                        continue label58;
                    }
                    var10 += var13 + -1;
                    int var14 = var10 & 63;
                    int var15 = var10 >> 6 & 63;
                    int var16 = var7.method2357((byte) 105) >> 2;
                    int var17 = arg0 + var15;
                    int var18 = arg5 + var14;
                    if (var17 > 0 && ~var18 < -1 && ~var17 > ~(arg3 - 1) && arg4 + -1 > var18) {
                        class270 var19 = class377.field5338.method1901(50, var8);
                        if (~var16 != -23 || class4.field81.field1444 || var19.field3957 != 0 || ~var19.field3989 == -2 || var19.field3966) {
                            var11 = true;
                            if (!var19.method1709((byte) -87)) {
                                var6 = false;
                                ++class284.field4163;
                            }
                        }
                    }
                }
                int var12 = var7.method2325(true);
                if (~var12 == -1) {
                    break;
                }
                var7.method2357((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(B)I")
    public final int method121(byte arg0) {
        ++field6034;
        if (arg0 <= 70) {
            this.method2544(-3, 56, (byte) 66);
        }
        if (this.field6055.field4693 != null) {
            class322 var2 = this.field6055.method1939(15964, class163.field2413);
            if (var2 != null && ~var2.field4641 != 0) {
                return var2.field4641;
            }
        }
        return this.field6055.field4641;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILza;ILge;IZI)V")
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        ++field6050;
        if (arg0 > -71) {
            this.method118((byte) -56);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIB)V")
    public final void method2544(int arg0, int arg1, byte arg2) {
        ++field6044;
        int var4 = super.field3368[0];
        int var5 = super.field3378[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (~arg0 == -2) {
            ++var4;
            ++var5;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (arg0 == 3) {
            --var5;
            ++var4;
        }
        if (arg0 == 4) {
            --var5;
        }
        if (arg0 == 5) {
            --var4;
            --var5;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (~super.field3320 != 0 && ~class62.field784.method2566(super.field3320, -19).field6262 == -2) {
            super.field3320 = -1;
        }
        if (arg0 == 7) {
            ++var5;
            --var4;
        }
        if (~super.field3275 != 0) {
            class508 var6 = class125.field1688.method2457(super.field3275, (byte) 87);
            if (var6.field7520 && var6.field7504 != -1 && ~class62.field784.method2566(var6.field7504, -19).field6262 == -2) {
                super.field3275 = -1;
            }
        }
        if (arg2 >= 56) {
            if (~super.field3350 != 0) {
                class508 var7 = class125.field1688.method2457(super.field3350, (byte) 87);
                if (var7.field7520 && ~var7.field7504 != 0 && class62.field784.method2566(var7.field7504, -19).field6262 == 1) {
                    super.field3350 = -1;
                }
            }
            if (~super.field3369 > -10) {
                ++super.field3369;
            }
            for (int var8 = super.field3369; var8 > 0; --var8) {
                super.field3368[var8] = super.field3368[var8 + -1];
                super.field3378[var8] = super.field3378[var8 + -1];
                super.field3372[var8] = super.field3372[var8 - 1];
            }
            super.field3368[0] = var4;
            super.field3378[0] = var5;
            super.field3372[0] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
    public final void method120(int arg0) {
        ++field6039;
        if (arg0 != 0) {
            this.field6057 = -127;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        ++field6040;
        return arg0 != 102 ? false : false;
    }
}
