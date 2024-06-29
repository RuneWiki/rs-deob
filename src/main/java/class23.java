import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class23 extends class140 {

    @OriginalMember(owner = "client!sd", name = "Qb", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!sd", name = "Xb", descriptor = "[I")
    public static int[] field682 = new int[] { 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 20, 0, 0, 0, 0, 12, 0, 0, 0, 9, 4, -1, 0, 0, 0, 0, 10, -1, 0, 0, 0, 15, 0, 8, 0, 7, 2, 0, 1, 0, 0, 0, 0, -1, 4, 5, 0, 0, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 8, 0, 24, 10, 0, -2, 0, 6, 0, 5, 0, 2, 0, 0, 6, 0, 0, 14, 0, 0, 0, -2, 0, 0, 0, 0, 0, 15, 0, 0, 3, 0, 5, -2, 2, -1, 0, 6, 0, -2, 0, 0, 14, 9, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, -2, 0, 0, 0, 10, -2, 7, 0, 0, 0, 0, 7, 0, 0, 4, 4, -1, -2, 3, 0, 5, 0, 0, 0, 8, 0, -1, 12, 0, 0, -2, 0, 0, 0, 0, 8, 6, 0, 6, 8, -2, 0, 1, 0, 7, 0, 10, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 6, 6, 0, 2, -1, 0, 3, 0, 0, 0, 0, -1, 0, -2, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, 0, 5, 0, 0, 0, -2, 8, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -1, 0, 3, 0, 0, 0, 0, 1, 6, -2, 0, 3, 0, 5, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0 };

    @OriginalMember(owner = "client!sd", name = "Ub", descriptor = "Ldg;")
    public static class276 field679 = new class276(32);

    @OriginalMember(owner = "client!sd", name = "ac", descriptor = "Lvf;")
    public static class265 field685 = class87.method582(-46, ":duelstake:");

    @OriginalMember(owner = "client!sd", name = "bc", descriptor = "Lvf;")
    public static class265 field686 = class87.method582(-46, "Objet d(Wabonn-Bs");

    @OriginalMember(owner = "client!sd", name = "dc", descriptor = "Z")
    public static boolean field688 = true;

    @OriginalMember(owner = "client!sd", name = "Nb", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!sd", name = "Ob", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!sd", name = "Pb", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!sd", name = "Rb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!sd", name = "Sb", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!sd", name = "Tb", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!sd", name = "Vb", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!sd", name = "Yb", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!sd", name = "Zb", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!sd", name = "cc", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!sd", name = "ec", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!sd", name = "Wb", descriptor = "Lbl;")
    public class268 field681;

    @OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field687;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)J")
    public static final long method221(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        return var3 != null && var3.field2501 != null ? var3.field2501.field266 : 0L;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)I")
    public static final int method222(int arg0, boolean arg1) {
        ++field683;
        if (arg1) {
            method221(86, -73, 31);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLbl;)V")
    public final void method223(byte arg0, class268 arg1) {
        ++field672;
        this.field681 = arg1;
        if (super.field2565 != null) {
            super.field2565.method1678();
        }
        if (arg0 != -101) {
            this.field681 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLng;ILve;)V")
    public static final void method224(byte arg0, class135 arg1, int arg2, class226 arg3) {
        ++field678;
        class254 var4 = new class254();
        var4.field4376 = arg1.method920((byte) 94);
        var4.field4363 = arg1.method949(3933);
        var4.field4367 = new int[var4.field4376];
        var4.field4374 = new class114[var4.field4376];
        var4.field4375 = new int[var4.field4376];
        var4.field4371 = new int[var4.field4376];
        var4.field4360 = new class114[var4.field4376];
        var4.field4362 = new byte[var4.field4376][][];
        if (arg0 > -112) {
            method224((byte) 25, (class135) null, -56, (class226) null);
        }
        for (int var5 = 0; ~var5 > ~var4.field4376; ++var5) {
            try {
                int var6 = arg1.method920((byte) 105);
                if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                    if (var6 == 3 || ~var6 == -5) {
                        String var7 = new String(arg1.method942(false).method1787(0));
                        String var8 = new String(arg1.method942(false).method1787(0));
                        int var9 = arg1.method920((byte) 50);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var9 > var11; ++var11) {
                            var10[var11] = new String(arg1.method942(false).method1787(0));
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; ~var9 < ~var13; ++var13) {
                                int var14 = arg1.method949(3933);
                                var12[var13] = new byte[var14];
                                arg1.method917(var12[var13], var14, -20730, 0);
                            }
                        }
                        var4.field4371[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var9 > var16; ++var16) {
                            var15[var16] = class190.method1296(var10[var16], -9985);
                        }
                        var4.field4360[var5] = arg3.method1526(106, var15, class190.method1296(var7, -9985), var8);
                        var4.field4362[var5] = var12;
                    }
                } else {
                    String var17 = new String(arg1.method942(false).method1787(0));
                    String var18 = new String(arg1.method942(false).method1787(0));
                    int var19 = 0;
                    if (~var6 == -2) {
                        var19 = arg1.method949(3933);
                    }
                    var4.field4371[var5] = var6;
                    var4.field4367[var5] = var19;
                    var4.field4374[var5] = arg3.method1528(var18, class190.method1296(var17, -9985), false);
                }
            } catch (ClassNotFoundException var20) {
                var4.field4375[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4375[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4375[var5] = -3;
            } catch (Exception var23) {
                var4.field4375[var5] = -4;
            } catch (Throwable var24) {
                var4.field4375[var5] = -5;
            }
        }
        class67.field1275.method785(var4, -29);
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(III)V")
    public static final void method225(int arg0, int arg1, int arg2) {
        ++field684;
        class48 var3 = class122.method817((byte) -74, arg0);
        int var4 = var3.field1024;
        int var5 = var3.field1030;
        int var6 = var3.field1028;
        int var7 = class230.field4061[-var4 + var6];
        if (~arg1 > -1 || arg1 > var7) {
            arg1 = 0;
        }
        if (arg2 == 17371) {
            int var8 = var7 << var4;
            class230.method1555(var8 & arg1 << var4 | class256.field4385[var5] & ~var8, var5, -16358);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIJILbe;)V")
    public final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class255 arg10) {
        ++field677;
        if (this.field681 != null) {
            class216 var13 = super.field2570 != -1 && ~super.field2591 == -1 ? class174.method1142(super.field2570, false) : null;
            class216 var14 = ~super.field2582 == 0 || super.field2601 == super.field2582 && var13 != null ? null : class174.method1142(super.field2582, false);
            class235 var15 = this.field681.method1828(super.field2552, var14, var13, super.field2547, (byte) 124);
            if (var15 != null) {
                super.field2571 = var15.method141();
                class268 var16 = this.field681;
                if (var16.field4755 != null) {
                    var16 = var16.method1825(20656);
                }
                if (class214.field3830 && var16.field4756) {
                    class235 var17 = class130.method852(super.field2544, this.field681.field4750, (byte) 127, var14 == null ? super.field2552 : super.field2547, super.field2600, this.field681.field4779, super.field2564, this.field681.field4725, this.field681.field4718, var14 != null ? var14 : var13, arg0, var15, super.field2560, this.field681.field4713);
                    var17.method164(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field2565);
                }
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                if (~this.field681.field4778 != -1 || this.field681.field4759 != 0) {
                    int var21 = class247.field4289[arg0];
                    int var22 = class247.field4298[arg0];
                    short var23 = this.field681.field4778;
                    short var24 = this.field681.field4759;
                    int var25 = -var23 / 2;
                    int var26 = -var24 / 2;
                    int var27 = var22 * var26 + -(var21 * var25) >> 16;
                    int var28 = var21 * var26 + var22 * var25 >> 16;
                    int var29 = class67.method483(super.field2564 + var27, -119, super.field2600 + var28, class216.field3902);
                    int var30 = var23 / 2;
                    int var31 = -var24 / 2;
                    int var32 = var22 * var31 + -(var21 * var30) >> 16;
                    int var33 = -var23 / 2;
                    int var34 = var24 / 2;
                    int var35 = var21 * var31 - -(var22 * var30) >> 16;
                    int var36 = class67.method483(super.field2564 - -var32, -123, super.field2600 + var35, class216.field3902);
                    int var37 = var21 * var34 + var22 * var33 >> 16;
                    int var38 = var22 * var34 + -(var21 * var33) >> 16;
                    int var39 = var23 / 2;
                    int var40 = class67.method483(super.field2564 + var38, -116, super.field2600 - -var37, class216.field3902);
                    int var41 = var24 / 2;
                    int var42 = var21 * var41 + var22 * var39 >> 16;
                    int var43 = var22 * var41 + -(var21 * var39) >> 16;
                    int var44 = ~var29 <= ~var36 ? var36 : var29;
                    int var45 = class67.method483(super.field2564 + var43, -119, super.field2600 + var42, class216.field3902);
                    int var46 = var45 <= var40 ? var45 : var40;
                    int var47 = ~var45 < ~var36 ? var36 : var45;
                    int var48 = var29 + var45;
                    if (var24 != 0) {
                        var19 = 2047 & (int) (Math.atan2((double) (-var46 + var44), (double) var24) * 325.95D);
                        if (var19 != 0) {
                            var15.method1245(var19);
                        }
                    }
                    if (var36 + var40 < var48) {
                        var48 = var36 + var40;
                    }
                    int var49 = ~var40 >= ~var29 ? var40 : var29;
                    if (~var23 != -1) {
                        var18 = 2047 & (int) (325.95D * Math.atan2((double) (-var47 + var49), (double) var23));
                        if (var18 != 0) {
                            var15.method1267(var18);
                        }
                    }
                    var20 = (var48 >> 1) + -super.field2560;
                    if (~var20 != -1) {
                        var15.method1266(0, var20, 0);
                    }
                }
                class235 var50 = null;
                if (~super.field2585 != 0 && super.field2602 != -1) {
                    class206 var51 = class210.method1441(super.field2585, -1999596368);
                    var50 = var51.method1413((byte) -124, super.field2602);
                    if (var50 != null) {
                        var50.method1266(0, -super.field2583, 0);
                        if (var51.field3698) {
                            if (var19 != 0) {
                                var50.method1245(var19);
                            }
                            if (var18 != 0) {
                                var50.method1267(var18);
                            }
                            if (var20 != 0) {
                                var50.method1266(0, var20, 0);
                            }
                        }
                    }
                }
                if (var50 != null) {
                    var15 = ((class185) var15).method1264(var50);
                }
                if (~this.field681.field4713 == -2) {
                    var15.field4113 = true;
                }
                var15.method164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field2565);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
    public final void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field680;
        if (this.field681 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
    public static void method226(byte arg0) {
        if (arg0 != -120) {
            field679 = null;
        }
        field685 = null;
        field682 = null;
        field686 = null;
        field679 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()I")
    public final int method141() {
        ++field676;
        return super.field2571;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)Z")
    public final boolean method227(byte arg0) {
        if (arg0 <= 103) {
            method226((byte) -10);
        }
        ++field674;
        return this.field681 != null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lvf;I)I")
    public static final int method228(class265 arg0, int arg1) {
        if (arg1 != 19332) {
            field679 = null;
        }
        ++field673;
        if (class126.field2260 != null && ~arg0.method1808((byte) -15) != -1) {
            for (int var2 = 0; var2 < class126.field2260.field2713; ++var2) {
                if (class126.field2260.field2702[var2].method1763(class147.field2752, 255, class31.field799).method1776((byte) -117, arg0)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }
}
