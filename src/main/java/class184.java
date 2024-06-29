import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class184 extends class423 {

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "[B")
    public byte[] field2491;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "Lla;")
    public static class319 field2496 = new class319(5, 2);

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field2502 = 0;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public int field2490;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "Lnj;")
    public static class164 field2501;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
    public static void method1243(int arg0) {
        field2501 = null;
        field2496 = null;
        if (arg0 != 1195) {
            field2502 = 90;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIB)V")
    public final void method1244(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field2493 = arg3 - arg1;
        this.field2499 = arg0;
        int var6 = -29 / ((arg4 + 30) / 45);
        this.field2490 = arg2 - arg0;
        this.field2498 = arg1;
        field2492++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z")
    public final boolean method1245(int arg0, int arg1, int arg2) {
        field2494++;
        if (arg2 < 64) {
            field2501 = null;
        }
        return this.field2491.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
    public static final void method1246(byte arg0) {
        field2489++;
        class54 var1 = (class54) class131.field1769.method445(33);
        int var2 = -120 % ((arg0 - 29) / 56);
        while (var1 != null) {
            if (class303.method1914(-104, var1.field764)) {
                class121.method737(var1, -9789);
            }
            var1 = (class54) class131.field1769.method451(false);
        }
        if (class367.field5621 == 1) {
            class276.method1782(-107);
            return;
        }
        class431.method2635(class428.field6504, (byte) 72, class194.field2594, class392.field5988, class54.field756);
        int var3 = class175.field2338.method564(-87, class251.field3498.method2705((byte) 69, class257.field3556));
        for (class54 var4 = (class54) class131.field1769.method445(33); var4 != null; var4 = (class54) class131.field1769.method451(false)) {
            int var5 = class91.method610(true, var4);
            if (var3 < var5) {
                var3 = var5;
            }
        }
        class428.field6504 = var3 + 8;
        class392.field5988 = (class232.field3307 ? 26 : 22) + class367.field5621 * 16;
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
    public final void method1247(int arg0) {
        field2495++;
        int var2 = arg0;
        int var3 = this.field2491.length - 8;
        while (var2 < var3) {
            var2++;
            this.field2491[var2] = 0;
            var2++;
            this.field2491[var2] = 0;
            var2++;
            this.field2491[var2] = 0;
            var2++;
            this.field2491[var2] = 0;
            var2++;
            this.field2491[var2] = 0;
            var2++;
            this.field2491[var2] = 0;
            var2++;
            this.field2491[var2] = 0;
            var2++;
            this.field2491[var2] = 0;
        }
        while (this.field2491.length - 1 > var2) {
            var2++;
            this.field2491[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIBIII)V")
    public final void method1248(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2497++;
        int var8 = 0;
        if (arg1 != arg5) {
            var8 = (arg0 - arg4 << 16) / (arg5 - arg1);
        }
        int var9 = 0;
        if (arg3 >= -34) {
            method1243(-100);
        }
        if (arg2 != arg5) {
            var9 = (arg6 - arg0 << 16) / (arg2 - arg5);
        }
        int var10 = 0;
        if (arg1 != arg2) {
            var10 = (arg4 - arg6 << 16) / (arg1 - arg2);
        }
        if (arg5 >= arg1 && arg1 <= arg2) {
            if (arg5 >= arg2) {
                int var11;
                int var12 = var11 = arg4 << 16;
                int var13 = arg6 << 16;
                if (arg1 < 0) {
                    var12 -= arg1 * var10;
                    var11 -= arg1 * var8;
                    arg1 = 0;
                }
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg1 != arg2 && var8 > var10 || arg1 == arg2 && var8 < var9) {
                    int var14 = arg5 - arg2;
                    int var15 = arg2 - arg1;
                    int var16 = this.field2490 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class113.method702(var11 >> 16, (byte) -113, this.field2491, 0, var13 >> 16, var16);
                                var16 += this.field2490;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class113.method702(var11 >> 16, (byte) -113, this.field2491, 0, var12 >> 16, var16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field2490;
                    }
                } else {
                    int var17 = arg5 - arg2;
                    int var18 = arg2 - arg1;
                    int var19 = this.field2490 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class113.method702(var13 >> 16, (byte) -113, this.field2491, 0, var11 >> 16, var19);
                                var11 += var8;
                                var13 += var9;
                                var19 += this.field2490;
                            }
                        }
                        class113.method702(var12 >> 16, (byte) -113, this.field2491, 0, var11 >> 16, var19);
                        var19 += this.field2490;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg1 < 0) {
                    var20 -= arg1 * var8;
                    var21 -= arg1 * var10;
                    arg1 = 0;
                }
                int var22 = arg0 << 16;
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg1 != arg5 && var8 > var10 || arg1 == arg5 && var10 > var9) {
                    int var23 = arg2 - arg5;
                    int var24 = arg5 - arg1;
                    int var25 = this.field2490 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class113.method702(var22 >> 16, (byte) -113, this.field2491, 0, var21 >> 16, var25);
                                var22 += var9;
                                var25 += this.field2490;
                                var21 += var10;
                            }
                        }
                        class113.method702(var20 >> 16, (byte) -113, this.field2491, 0, var21 >> 16, var25);
                        var25 += this.field2490;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg2 - arg5;
                    int var27 = arg5 - arg1;
                    int var28 = this.field2490 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class113.method702(var21 >> 16, (byte) -113, this.field2491, 0, var22 >> 16, var28);
                                var28 += this.field2490;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class113.method702(var21 >> 16, (byte) -113, this.field2491, 0, var20 >> 16, var28);
                        var21 += var10;
                        var28 += this.field2490;
                        var20 += var8;
                    }
                }
            }
        } else if (arg5 > arg2) {
            if (arg5 <= arg1) {
                int var29;
                int var30 = var29 = arg6 << 16;
                int var31 = arg0 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var9;
                    var29 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg5 < 0) {
                    var31 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var9 >= var10) {
                    int var32 = arg1 - arg5;
                    int var33 = arg5 - arg2;
                    int var34 = this.field2490 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class113.method702(var31 >> 16, (byte) -113, this.field2491, 0, var29 >> 16, var34);
                                var29 += var10;
                                var31 += var8;
                                var34 += this.field2490;
                            }
                        }
                        class113.method702(var30 >> 16, (byte) -113, this.field2491, 0, var29 >> 16, var34);
                        var34 += this.field2490;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg1 - arg5;
                    int var36 = arg5 - arg2;
                    int var37 = this.field2490 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class113.method702(var29 >> 16, (byte) -113, this.field2491, 0, var31 >> 16, var37);
                                var29 += var10;
                                var37 += this.field2490;
                                var31 += var8;
                            }
                        }
                        class113.method702(var29 >> 16, (byte) -113, this.field2491, 0, var30 >> 16, var37);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field2490;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                if (arg2 < 0) {
                    var38 -= arg2 * var10;
                    var39 -= arg2 * var9;
                    arg2 = 0;
                }
                int var40 = arg4 << 16;
                if (arg1 < 0) {
                    var40 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg5 - arg1;
                    int var42 = arg1 - arg2;
                    int var43 = this.field2490 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class113.method702(var40 >> 16, (byte) -113, this.field2491, 0, var39 >> 16, var43);
                                var40 += var8;
                                var43 += this.field2490;
                                var39 += var9;
                            }
                        }
                        class113.method702(var38 >> 16, (byte) -113, this.field2491, 0, var39 >> 16, var43);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field2490;
                    }
                } else {
                    int var44 = arg5 - arg1;
                    int var45 = arg1 - arg2;
                    int var46 = this.field2490 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class113.method702(var39 >> 16, (byte) -113, this.field2491, 0, var40 >> 16, var46);
                                var40 += var8;
                                var39 += var9;
                                var46 += this.field2490;
                            }
                        }
                        class113.method702(var39 >> 16, (byte) -113, this.field2491, 0, var38 >> 16, var46);
                        var38 += var10;
                        var46 += this.field2490;
                        var39 += var9;
                    }
                }
            }
        } else if (arg1 > arg2) {
            int var47;
            int var48 = var47 = arg0 << 16;
            if (arg5 < 0) {
                var48 -= arg5 * var8;
                var47 -= arg5 * var9;
                arg5 = 0;
            }
            int var49 = arg6 << 16;
            if (arg2 < 0) {
                var49 -= arg2 * var10;
                arg2 = 0;
            }
            if (arg2 != arg5 && var8 < var9 || arg2 == arg5 && var10 < var8) {
                int var50 = arg1 - arg2;
                int var51 = arg2 - arg5;
                int var52 = this.field2490 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class113.method702(var49 >> 16, (byte) -113, this.field2491, 0, var48 >> 16, var52);
                            var48 += var8;
                            var52 += this.field2490;
                            var49 += var10;
                        }
                    }
                    class113.method702(var47 >> 16, (byte) -113, this.field2491, 0, var48 >> 16, var52);
                    var52 += this.field2490;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var53 = arg1 - arg2;
                int var54 = arg2 - arg5;
                int var55 = this.field2490 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class113.method702(var48 >> 16, (byte) -113, this.field2491, 0, var49 >> 16, var55);
                            var48 += var8;
                            var49 += var10;
                            var55 += this.field2490;
                        }
                    }
                    class113.method702(var48 >> 16, (byte) -113, this.field2491, 0, var47 >> 16, var55);
                    var47 += var9;
                    var55 += this.field2490;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            int var58 = arg4 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var8;
                var56 -= arg5 * var9;
                arg5 = 0;
            }
            if (arg1 < 0) {
                var58 -= arg1 * var10;
                arg1 = 0;
            }
            if (var9 > var8) {
                int var59 = arg2 - arg1;
                int var60 = arg1 - arg5;
                int var61 = this.field2490 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class113.method702(var56 >> 16, (byte) -113, this.field2491, 0, var58 >> 16, var61);
                            var56 += var9;
                            var58 += var10;
                            var61 += this.field2490;
                        }
                    }
                    class113.method702(var56 >> 16, (byte) -113, this.field2491, 0, var57 >> 16, var61);
                    var57 += var8;
                    var56 += var9;
                    var61 += this.field2490;
                }
            } else {
                int var62 = arg2 - arg1;
                int var63 = arg1 - arg5;
                int var64 = this.field2490 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class113.method702(var58 >> 16, (byte) -113, this.field2491, 0, var56 >> 16, var64);
                            var56 += var9;
                            var64 += this.field2490;
                            var58 += var10;
                        }
                    }
                    class113.method702(var57 >> 16, (byte) -113, this.field2491, 0, var56 >> 16, var64);
                    var57 += var8;
                    var64 += this.field2490;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lnq;II)V")
    public class184(class325 arg0, int arg1, int arg2) {
        this.field2491 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lwj;B)V")
    public static final void method1249(class275 arg0, byte arg1) {
        field2488++;
        if (arg1 != 79) {
            return;
        }
        arg0.field3890 = 0;
        if (arg0.field3839 != -1) {
            class91 var2 = class201.field2707.method489(arg1 ^ 0x67, arg0.field3839);
            if (var2 == null || var2.field1315 == null) {
                arg0.field3829 = false;
                arg0.field3839 = -1;
            } else {
                label401: {
                    arg0.field3827++;
                    if (arg0.field3818 < var2.field1315.length && arg0.field3827 > var2.field1313[arg0.field3818]) {
                        arg0.field3834++;
                        arg0.field3827 = 1;
                        arg0.field3818++;
                        class441.method2669(false, var2, arg0.field1866, arg0.field3818, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                    }
                    if (arg0.field3818 >= var2.field1315.length) {
                        arg0.field3827 = 0;
                        arg0.field3818 = 0;
                        if (arg0.field3829) {
                            arg0.field3839 = arg0.method1759(63).method2906((byte) 112);
                            if (arg0.field3839 == -1) {
                                arg0.field3829 = false;
                                break label401;
                            }
                            var2 = class201.field2707.method489(49, arg0.field3839);
                        }
                        class441.method2669(false, var2, arg0.field1866, arg0.field3818, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                    }
                    arg0.field3834 = arg0.field3818 + 1;
                    if (arg0.field3834 >= var2.field1315.length) {
                        arg0.field3834 = 0;
                    }
                }
            }
        }
        if (arg0.field3850 != -1 && arg0.field3844 <= class393.field6017) {
            class11 var3 = class239.field3360.method2836((byte) 20, arg0.field3850);
            int var4 = var3.field192;
            if (var4 == -1) {
                arg0.field3850 = -1;
            } else {
                label403: {
                    class91 var5 = class201.field2707.method489(arg1 + 46, var4);
                    if (var3.field201) {
                        if (var5.field1334 == 3) {
                            if (arg0.field3910 > 0 && class393.field6017 >= arg0.field3817 && arg0.field3870 < class393.field6017) {
                                arg0.field3850 = -1;
                                break label403;
                            }
                        } else if (var5.field1334 == 1 && arg0.field3910 > 0 && class393.field6017 >= arg0.field3817 && class393.field6017 > arg0.field3870) {
                            arg0.field3844 = class393.field6017 + 1;
                            break label403;
                        }
                    }
                    if (var5 == null || var5.field1315 == null) {
                        arg0.field3850 = -1;
                    } else {
                        if (arg0.field3821 < 0) {
                            arg0.field3821 = 0;
                            class441.method2669(false, var5, arg0.field1866, 0, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                        }
                        arg0.field3861++;
                        if (arg0.field3821 < var5.field1315.length && var5.field1313[arg0.field3821] < arg0.field3861) {
                            arg0.field3821++;
                            arg0.field3861 = 1;
                            class441.method2669(false, var5, arg0.field1866, arg0.field3821, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                        }
                        if (arg0.field3821 >= var5.field1315.length) {
                            if (var3.field201) {
                                arg0.field3855++;
                                arg0.field3821 -= var5.field1325;
                                if (arg0.field3855 >= var5.field1344) {
                                    arg0.field3850 = -1;
                                } else if (arg0.field3821 >= 0 && var5.field1315.length > arg0.field3821) {
                                    class441.method2669(false, var5, arg0.field1866, arg0.field3821, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                                } else {
                                    arg0.field3850 = -1;
                                }
                            } else {
                                arg0.field3850 = -1;
                            }
                        }
                        arg0.field3874 = arg0.field3821 + 1;
                        if (var5.field1315.length <= arg0.field3874) {
                            if (var3.field201) {
                                arg0.field3874 -= var5.field1325;
                                if ((arg0.field3855 + 1) >= var5.field1344) {
                                    arg0.field3874 = -1;
                                } else if (arg0.field3874 < 0 || arg0.field3874 >= var5.field1315.length) {
                                    arg0.field3874 = -1;
                                }
                            } else {
                                arg0.field3874 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field3863 != -1 && class393.field6017 >= arg0.field3849) {
            class11 var6 = class239.field3360.method2836((byte) 20, arg0.field3863);
            int var7 = var6.field192;
            if (var7 == -1) {
                arg0.field3863 = -1;
            } else {
                label406: {
                    class91 var8 = class201.field2707.method489(59, var7);
                    if (var6.field201) {
                        if (var8.field1334 == 3) {
                            if (arg0.field3910 > 0 && arg0.field3817 <= class393.field6017 && arg0.field3870 < class393.field6017) {
                                arg0.field3863 = -1;
                                break label406;
                            }
                        } else if (var8.field1334 == 1 && arg0.field3910 > 0 && arg0.field3817 <= class393.field6017 && class393.field6017 > arg0.field3870) {
                            arg0.field3849 = class393.field6017 + 1;
                            break label406;
                        }
                    }
                    if (var8 == null || var8.field1315 == null) {
                        arg0.field3863 = -1;
                    } else {
                        if (arg0.field3892 < 0) {
                            arg0.field3892 = 0;
                            class441.method2669(false, var8, arg0.field1866, 0, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                        }
                        arg0.field3846++;
                        if (var8.field1315.length > arg0.field3892 && arg0.field3846 > var8.field1313[arg0.field3892]) {
                            arg0.field3892++;
                            arg0.field3846 = 1;
                            class441.method2669(false, var8, arg0.field1866, arg0.field3892, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                        }
                        if (arg0.field3892 >= var8.field1315.length) {
                            if (var6.field201) {
                                arg0.field3892 -= var8.field1325;
                                arg0.field3885++;
                                if (arg0.field3885 >= var8.field1344) {
                                    arg0.field3863 = -1;
                                } else if (arg0.field3892 >= 0 && var8.field1315.length > arg0.field3892) {
                                    class441.method2669(false, var8, arg0.field1866, arg0.field3892, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                                } else {
                                    arg0.field3863 = -1;
                                }
                            } else {
                                arg0.field3863 = -1;
                            }
                        }
                        arg0.field3847 = arg0.field3892 + 1;
                        if (var8.field1315.length <= arg0.field3847) {
                            if (var6.field201) {
                                arg0.field3847 -= var8.field1325;
                                if (arg0.field3885 + 1 >= var8.field1344) {
                                    arg0.field3847 = -1;
                                } else if (arg0.field3847 < 0 || arg0.field3847 >= var8.field1315.length) {
                                    arg0.field3847 = -1;
                                }
                            } else {
                                arg0.field3847 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field3871 != -1 && arg0.field3886 <= 1) {
            class91 var9 = class201.field2707.method489(40, arg0.field3871);
            if (var9.field1334 == 3) {
                if (arg0.field3910 > 0 && class393.field6017 >= arg0.field3817 && arg0.field3870 < class393.field6017) {
                    arg0.field3871 = -1;
                }
            } else if (var9.field1334 == 1 && arg0.field3910 > 0 && class393.field6017 >= arg0.field3817 && class393.field6017 > arg0.field3870) {
                arg0.field3886 = 2;
            }
        }
        if (arg0.field3871 != -1 && arg0.field3886 == 0) {
            class91 var10 = class201.field2707.method489(78, arg0.field3871);
            if (var10 == null || var10.field1315 == null) {
                arg0.field3871 = -1;
            } else {
                arg0.field3880++;
                if (arg0.field3842 < var10.field1315.length && var10.field1313[arg0.field3842] < arg0.field3880) {
                    arg0.field3880 = 1;
                    arg0.field3842++;
                    class441.method2669(false, var10, arg0.field1866, arg0.field3842, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                }
                if (arg0.field3842 >= var10.field1315.length) {
                    arg0.field3842 -= var10.field1325;
                    arg0.field3851++;
                    if (var10.field1344 <= arg0.field3851) {
                        arg0.field3871 = -1;
                    } else if (arg0.field3842 >= 0 && arg0.field3842 < var10.field1315.length) {
                        class441.method2669(false, var10, arg0.field1866, arg0.field3842, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                    } else {
                        arg0.field3871 = -1;
                    }
                }
                arg0.field3877 = arg0.field3842 + 1;
                if (arg0.field3877 >= var10.field1315.length) {
                    arg0.field3877 -= var10.field1325;
                    if (var10.field1344 <= arg0.field3851 + 1) {
                        arg0.field3877 = -1;
                    } else if (arg0.field3877 < 0 || arg0.field3877 >= var10.field1315.length) {
                        arg0.field3877 = -1;
                    }
                }
                arg0.field3890 = var10.field1341;
            }
        }
        if (arg0.field3886 > 0) {
            arg0.field3886--;
        }
        for (int var11 = 0; var11 < arg0.field3901.length; var11++) {
            class389 var12 = arg0.field3901[var11];
            if (var12 != null) {
                if (var12.field5938 > 0) {
                    var12.field5938--;
                } else {
                    class91 var13 = class201.field2707.method489(124, var12.field5937);
                    if (var13 == null || var13.field1315 == null) {
                        arg0.field3901[var11] = null;
                    } else {
                        var12.field5946++;
                        if (var12.field5940 < var13.field1315.length && var12.field5946 > var13.field1313[var12.field5940]) {
                            var12.field5946 = 1;
                            var12.field5940++;
                            class441.method2669(false, var13, arg0.field1866, var12.field5940, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                        }
                        if (var13.field1315.length <= var12.field5940) {
                            var12.field5940 -= var13.field1325;
                            var12.field5939++;
                            if (var12.field5939 >= var13.field1344) {
                                arg0.field3901[var11] = null;
                            } else if (var12.field5940 >= 0 && var12.field5940 < var13.field1315.length) {
                                class441.method2669(false, var13, arg0.field1866, var12.field5940, arg0.field1867, arg0.field1862, class56.field800 == arg0);
                            } else {
                                arg0.field3901[var11] = null;
                            }
                        }
                        var12.field5941 = var12.field5940 + 1;
                        if (var12.field5941 >= var13.field1315.length) {
                            var12.field5941 -= var13.field1325;
                            if (var13.field1344 <= (var12.field5939 + 1)) {
                                var12.field5941 = -1;
                            } else if (var12.field5941 < 0 || var12.field5941 >= var13.field1315.length) {
                                var12.field5941 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
