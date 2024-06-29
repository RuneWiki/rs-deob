import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class198 extends class179 {

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    private int field3525 = -32768;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    private int field3524 = 0;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    private int field3529 = 0;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "Z")
    public boolean field3538 = false;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    private int field3522;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public int field3523;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "Lt;")
    private class216 field3527;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "Lvf;")
    private static class265 field3526 = class87.method582(-46, "cyan:");

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "Lvf;")
    public static class265 field3537 = field3526;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "[I")
    public static int[] field3534 = new int[256];

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "Lvf;")
    public static class265 field3539 = field3526;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "[Lvf;")
    public static class265[] field3530 = new class265[200];

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "Lvf;")
    public static class265 field3546;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "Lfl;")
    public static class192 field3533;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "Lbe;")
    private class255 field3540;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "[Lvd;")
    public static class113[] field3547;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIIIIJILbe;)V")
    public final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class255 arg10) {
        field3536++;
        class235 var13 = this.method1365(-1);
        if (var13 != null) {
            var13.method164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3540);
            this.field3525 = var13.method141();
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()I")
    public final int method141() {
        field3532++;
        return this.field3525;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1364(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3542++;
        if (class282.field4969 == 0) {
            int var7 = class277.field4904;
            int var8 = class96.field1690;
            int var9 = class2.field28;
            int var10 = class73.field1399;
            int var11 = (var10 - var7) * (arg6 - arg3) / arg2 + var7;
            int var12 = (var8 - var9) * (arg4 - arg0) / arg5 + var9;
            if (class25.field695 && (class38.field874 & 0x40) == 64) {
                class6 var13 = class12.method98(class192.field3457, class26.field703, (byte) -124);
                if (var13 == null) {
                    class118.method796(-25946);
                } else {
                    class182.method1213(false, class239.field4170, (short) 7, class64.field1247, -1, var12, 0L, var11);
                }
            } else {
                class166.field2997++;
                if (class229.field4051 == 1) {
                    class182.method1213(false, class265.field4611, (short) 46, class4.field66, -1, var12, 0L, var11);
                }
                class182.method1213(false, class193.field3479, (short) 6, class4.field66, -1, var12, 0L, var11);
            }
        }
        if (arg1 != 106) {
            return;
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class102.field1806; var16++) {
            long var17 = class111.field1943[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FB8) >> 7;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class253.method1672(class216.field3902, var19, var20, var17)) {
                    class130 var23 = class84.method574(arg1 ^ 0x46, var22);
                    if (var23.field2365 != null) {
                        var23 = var23.method861(-25233);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class282.field4969 == 1) {
                        class97.field1704++;
                        class182.method1213(false, class205.field3694, (short) 23, class148.method1022(10, new class265[] { class9.field305, class135.field2486, var23.field2338 }), class104.field1846, var20, var17, var19);
                    } else if (!class25.field695) {
                        class123.field2219++;
                        class265[] var24 = var23.field2294;
                        if (class225.field3998) {
                            var24 = class172.method1134(var24, -54);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    short var26 = 0;
                                    int var27 = -1;
                                    class153.field2841++;
                                    if (var25 == 0) {
                                        var26 = 31;
                                    }
                                    if (var25 == 1) {
                                        var26 = 19;
                                    }
                                    if (var25 == 2) {
                                        var26 = 45;
                                    }
                                    if (var23.field2306 == var25) {
                                        var27 = var23.field2296;
                                    }
                                    if (var23.field2353 == var25) {
                                        var27 = var23.field2297;
                                    }
                                    if (var25 == 3) {
                                        var26 = 20;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1005;
                                    }
                                    class182.method1213(false, var24[var25], var26, class148.method1022(10, new class265[] { class49.field1046, var23.field2338 }), var27, var20, var17, var19);
                                }
                            }
                        }
                        class182.method1213(false, class72.field1379, (short) 1004, class148.method1022(10, new class265[] { class49.field1046, var23.field2338 }), class277.field4885, var20, (long) var23.field2357, var19);
                    } else if ((class38.field874 & 0x4) == 4) {
                        class67.field1286++;
                        class182.method1213(false, class239.field4170, (short) 40, class148.method1022(10, new class265[] { class130.field2286, class135.field2486, var23.field2338 }), -1, var20, var17, var19);
                    }
                }
                if (var21 == 1) {
                    class23 var28 = class4.field67[var22];
                    if (var28.field681.field4713 == 1 && (var28.field2600 & 0x7F) == 64 && (var28.field2564 & 0x7F) == 64) {
                        for (int var29 = 0; var29 < class48.field1027; var29++) {
                            class23 var32 = class4.field67[class93.field1646[var29]];
                            if (var32 != null && var28 != var32 && var32.field681.field4713 == 1 && var28.field2600 == var32.field2600 && var28.field2564 == var32.field2564) {
                                class40.method340(var20, var32.field681, 4, class93.field1646[var29], var19);
                            }
                        }
                        for (int var30 = 0; var30 < class19.field520; var30++) {
                            class122 var31 = class209.field3766[class93.field1652[var30]];
                            if (var31 != null && var28.field2600 == var31.field2600 && var28.field2564 == var31.field2564) {
                                class71.method504(class93.field1652[var30], var20, 19645, var19, var31);
                            }
                        }
                    }
                    class40.method340(var20, var28.field681, arg1 ^ 0x6E, var22, var19);
                }
                if (var21 == 0) {
                    class122 var33 = class209.field3766[var22];
                    if ((var33.field2600 & 0x7F) == 64 && (var33.field2564 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < class48.field1027; var34++) {
                            class23 var37 = class4.field67[class93.field1646[var34]];
                            if (var37 != null && var37.field681.field4713 == 1 && var33.field2600 == var37.field2600 && var33.field2564 == var37.field2564) {
                                class40.method340(var20, var37.field681, 4, class93.field1646[var34], var19);
                            }
                        }
                        for (int var35 = 0; var35 < class19.field520; var35++) {
                            class122 var36 = class209.field3766[class93.field1652[var35]];
                            if (var36 != null && var33 != var36 && var33.field2600 == var36.field2600 && var33.field2564 == var36.field2564) {
                                class71.method504(class93.field1652[var35], var20, 19645, var19, var36);
                            }
                        }
                    }
                    class71.method504(var22, var20, 19645, var19, var33);
                }
                if (var21 == 3) {
                    class117 var38 = class210.field3768[class216.field3902][var19][var20];
                    if (var38 != null) {
                        for (class139 var39 = (class139) var38.method784((byte) 103); var39 != null; var39 = (class139) var38.method788(false)) {
                            int var40 = var39.field2532.field939;
                            class261 var41 = class54.method418(var40, 0);
                            if (class282.field4969 == 1) {
                                class119.field2102++;
                                class182.method1213(false, class205.field3694, (short) 2, class148.method1022(10, new class265[] { class9.field305, class273.field4840, var41.field4548 }), class104.field1846, var20, (long) var40, var19);
                            } else if (!class25.field695) {
                                class265[] var42 = var41.field4551;
                                class45.field989++;
                                if (class225.field3998) {
                                    var42 = class172.method1134(var42, -93);
                                }
                                for (int var43 = 4; var43 >= 0; var43--) {
                                    if (var42 != null && var42[var43] != null) {
                                        class225.field4002++;
                                        byte var44 = 0;
                                        int var45 = -1;
                                        if (var43 == 0) {
                                            var44 = 8;
                                        }
                                        if (var43 == 1) {
                                            var44 = 44;
                                        }
                                        if (var41.field4532 == var43) {
                                            var45 = var41.field4502;
                                        }
                                        if (var41.field4534 == var43) {
                                            var45 = var41.field4535;
                                        }
                                        if (var43 == 2) {
                                            var44 = 36;
                                        }
                                        if (var43 == 3) {
                                            var44 = 38;
                                        }
                                        if (var43 == 4) {
                                            var44 = 58;
                                        }
                                        class182.method1213(false, var42[var43], var44, class148.method1022(10, new class265[] { class111.field1933, var41.field4548 }), var45, var20, (long) var40, var19);
                                    }
                                }
                                class182.method1213(false, class72.field1379, (short) 1002, class148.method1022(10, new class265[] { class111.field1933, var41.field4548 }), class277.field4885, var20, (long) var40, var19);
                            } else if ((class38.field874 & 0x1) == 1) {
                                class182.method1213(false, class239.field4170, (short) 9, class148.method1022(10, new class265[] { class130.field2286, class273.field4840, var41.field4548 }), -1, var20, (long) var40, var19);
                                class183.field3275++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Luh;")
    private final class235 method1365(int arg0) {
        field3548++;
        class206 var2 = class210.method1441(this.field3522, -1999596368);
        if (arg0 != -1) {
            this.field3527 = null;
        }
        class235 var3;
        if (this.field3538) {
            var3 = var2.method1413((byte) -127, -1);
        } else {
            var3 = var2.method1413((byte) 118, this.field3529);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lfl;IIB)[Lka;")
    public static final class160[] method1366(class192 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 88) {
            method1368(false);
        }
        field3544++;
        return class28.method239(50, arg0, arg2, arg1) ? class269.method1848((byte) -95) : null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
    public static final void method1367(boolean arg0) {
        if (arg0) {
            class200.field3577 = class183.field3255;
            class279.field4936 = class141.field2619;
        } else {
            class200.field3577 = class211.field3800;
            class279.field4936 = class83.field1557;
        }
        class64.field1244 = class200.field3577.length;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIII)V")
    public final void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3521++;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIII)V")
    public class198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3535 = arg3;
        this.field3528 = arg1;
        this.field3522 = arg0;
        this.field3543 = arg4;
        this.field3523 = arg2;
        this.field3531 = arg5 + arg6;
        int var8 = class210.method1441(this.field3522, -1999596368).field3720;
        if (var8 == -1) {
            this.field3538 = true;
        } else {
            this.field3538 = false;
            this.field3527 = class174.method1142(var8, false);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)V")
    public static void method1368(boolean arg0) {
        field3537 = null;
        field3534 = null;
        field3546 = null;
        field3539 = null;
        field3533 = null;
        field3547 = null;
        field3526 = null;
        field3530 = null;
        if (!arg0) {
            field3533 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
    public final void method1369(int arg0, int arg1) {
        field3541++;
        if (arg0 != -12029) {
            this.method173(93, 110, -10, -123, 16);
        }
        if (this.field3538) {
            return;
        }
        this.field3524 += arg1;
        while (this.field3527.field3894[this.field3529] < this.field3524) {
            this.field3524 -= this.field3527.field3894[this.field3529];
            this.field3529++;
            if (this.field3527.field3890.length <= this.field3529) {
                this.field3538 = true;
                return;
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3534[var0] = var1;
        }
        field3545 = 0;
        field3546 = class87.method582(-46, "<br>");
    }
}
