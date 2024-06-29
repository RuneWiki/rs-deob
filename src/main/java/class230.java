import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class230 extends class405 implements class106 {

    @OriginalMember(owner = "client!om", name = "C", descriptor = "Lnt;")
    public class134 field3476;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "Z")
    private boolean field3472;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field3474 = -1;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field3490 = 50;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "[I")
    public static int[] field3463 = new int[field3490];

    @OriginalMember(owner = "client!om", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3464 = new String[field3490];

    @OriginalMember(owner = "client!om", name = "D", descriptor = "[I")
    public static int[] field3477 = new int[field3490];

    @OriginalMember(owner = "client!om", name = "n", descriptor = "[I")
    public static int[] field3461 = new int[field3490];

    @OriginalMember(owner = "client!om", name = "z", descriptor = "[I")
    public static int[] field3473 = new int[field3490];

    @OriginalMember(owner = "client!om", name = "F", descriptor = "[I")
    public static int[] field3478 = new int[field3490];

    @OriginalMember(owner = "client!om", name = "t", descriptor = "[I")
    public static int[] field3467 = new int[field3490];

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "Ltb;")
    public static class251 field3481;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        if (arg1 <= 70) {
            return null;
        } else {
            ++field3480;
            return this.field3476.method848(0, false, arg0, 10, false, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lnp;Z)V")
    public static final void method1465(class313 arg0, boolean arg1) {
        ++field3485;
        int var2 = class142.field1888;
        int var3 = class151.field2246;
        int var4 = class104.field1324;
        int var5 = class467.field6587 + -3;
        byte var6 = 20;
        if (class208.field3176 == null || class260.field3809 == null) {
            if (class407.field5716.method1230(-113, class255.field3738) && class407.field5716.method1230(-25, class81.field987)) {
                class208.field3176 = arg0.method644(class72.method423(class407.field5716, class255.field3738, 0), true);
                class72 var7 = class72.method423(class407.field5716, class81.field987, 0);
                class260.field3809 = arg0.method644(var7, true);
                var7.method425();
                class87.field1062 = arg0.method644(var7, true);
            } else {
                arg0.method650(var2, var3, var4, var6, class203.field3013 | 255 - class324.field4675 << 24, 1);
            }
        }
        if (class208.field3176 != null && class260.field3809 != null) {
            int var8 = (var4 - class260.field3809.method518() * 2) / class208.field3176.method518();
            for (int var9 = 0; ~var8 < ~var9; ++var9) {
                class208.field3176.method1079(class260.field3809.method518() + (var2 - -(var9 * class208.field3176.method518())), var3);
            }
            class260.field3809.method1079(var2, var3);
            class87.field1062.method1079(var4 + (var2 - class87.field1062.method518()), var3);
        }
        class491.field6928.method1590(class20.field272.method2065(-126, class326.field4711), class241.field3614 | -16777216, -1, var2 + 3, (byte) -109, var3 + 14);
        arg0.method650(var2, var3 - -var6, var4, -var6 + var5, -class324.field4675 + 255 << 24 | class203.field3013, 1);
        int var10 = class262.field3832.method175(-89);
        if (!arg1) {
            field3490 = -111;
        }
        int var11 = class262.field3832.method177(-115);
        int var12 = 0;
        for (class451 var13 = (class451) class160.field2365.method2843(1123227612); var13 != null; var13 = (class451) class160.field2365.method2842(1673506446)) {
            int var30 = (-1 - var12 + class476.field6690) * 16 + var6 + var3 + 13;
            if (~var10 < ~var2 && var2 + var4 > var10 && var11 > var30 + -13 && var11 < var30 + 4 && var13.field6231) {
                arg0.method650(var2, var30 - 12, var4, 16, -class225.field3406 + 255 << 24 | class339.field4953, 1);
            }
            ++var12;
        }
        if ((class284.field4161 == null || class138.field1824 == null || class451.field6240 == null) && class407.field5716.method1230(-74, class364.field5238) && class407.field5716.method1230(-24, class216.field3250) && class407.field5716.method1230(123, class392.field5562)) {
            class72 var14 = class72.method423(class407.field5716, class216.field3250, 0);
            class138.field1824 = arg0.method644(var14, true);
            var14.method425();
            class449.field6202 = arg0.method644(var14, true);
            class284.field4161 = arg0.method644(class72.method423(class407.field5716, class364.field5238, 0), true);
            class72 var15 = class72.method423(class407.field5716, class392.field5562, 0);
            class451.field6240 = arg0.method644(var15, true);
            var15.method425();
            class140.field1860 = arg0.method644(var15, true);
        }
        int var16 = 0;
        if (class284.field4161 != null && class138.field1824 != null && class451.field6240 != null) {
            int var17 = (-(2 * class451.field6240.method518()) + var4) / class284.field4161.method518();
            for (int var18 = 0; ~var18 > ~var17; ++var18) {
                class284.field4161.method1079(class451.field6240.method518() + var2 - -(class284.field4161.method518() * var18), -class284.field4161.method521() + var3 + var5);
            }
            int var19 = (var5 + -var6 + -class451.field6240.method521()) / class138.field1824.method521();
            for (int var20 = 0; var19 > var20; ++var20) {
                class138.field1824.method1079(var2, var20 * class138.field1824.method521() + var3 - -var6);
                class449.field6202.method1079(var2 + var4 + -class449.field6202.method518(), class138.field1824.method521() * var20 + var3 + var6);
            }
            class451.field6240.method1079(var2, var5 + (var3 - class451.field6240.method521()));
            class140.field1860.method1079(-class451.field6240.method518() + var2 - -var4, -class451.field6240.method521() + var5 + var3);
        }
        for (class451 var21 = (class451) class160.field2365.method2843(1123227612); var21 != null; var21 = (class451) class160.field2365.method2842(1673506446)) {
            int var22 = (class476.field6690 + -1 + -var16) * 16 + var3 - (-var6 + -13);
            int var23 = -16777216 | class241.field3614;
            if (var10 > var2 && ~(var2 + var4) < ~var10 && ~var11 < ~(var22 + -13) && ~(var22 + 4) < ~var11 && var21.field6231) {
                var23 = -16777216 | class208.field3174;
            }
            int[] var24 = null;
            if (!class242.method1532((byte) -103, var21.field6245)) {
                if (var21.field6247 == -1) {
                    if (class128.method804(var21.field6245, true)) {
                        class216 var25 = class139.field1851[(int) var21.field6235];
                        if (var25 != null) {
                            class466 var26 = var25.field3232;
                            if (var26.field6526 != null) {
                                var26 = var26.method2742(-100, class140.field1859);
                            }
                            if (var26 != null) {
                                var24 = var26.field6546;
                            }
                        }
                    } else if (class424.method2490(var21.field6245, -90)) {
                        Object var27 = null;
                        class453 var28;
                        if (var21.field6245 != 1007) {
                            var28 = class156.field2325.method808((int) (var21.field6235 >>> 32 & 2147483647L), 0);
                        } else {
                            var28 = class156.field2325.method808((int) var21.field6235, 0);
                        }
                        if (var28.field6306 != null) {
                            var28 = var28.method2655(86, class140.field1859);
                        }
                        if (var28 != null) {
                            var24 = var28.field6315;
                        }
                    }
                } else {
                    var24 = class64.field834.method2129(var21.field6247, false).field537;
                }
            } else {
                var24 = class64.field834.method2129((int) var21.field6235, false).field537;
            }
            String var29 = class179.method1093((byte) 21, var21);
            if (var24 != null) {
                var29 = var29 + class229.method1462(var24, (byte) -118);
            }
            class491.field6928.method1594(0, var23, class11.field120, var29, 66, class466.field6525, var2 - -3, var22);
            ++var16;
            if (var21.field6233) {
                class190.field2816.method1079(class37.field488.method860(-46, var29) + var2 - -5, var22 + -12);
            }
        }
        class267.method1640(class142.field1888, class467.field6587, class151.field2246, class104.field1324, (byte) -119);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field3468;
        class491 var3 = this.field3476.method848(super.field5705, false, arg1, 10, true, super.field5704, 1024);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 0) {
                field3467 = null;
            }
            class282 var4 = arg1.method601();
            var4.method1019(super.field5705, super.field5703, super.field5704);
            class477 var5 = null;
            if (this.field3472) {
                var5 = class96.method543(1, (byte) 71);
            }
            if (this.field3476.field1774 != null) {
                class207 var6 = this.field3476.field1774.method552();
                arg1.method646(var3, var6, var4, var5 == null ? null : var5.field6696[0], 0);
            } else {
                var3.method1323(var4, var5 == null ? null : var5.field6696[0], 0);
            }
            this.field3476.method845(true, super.field5705 >> 7, super.field5704 >> 7, arg1, super.field5705 >> 7, -125, var3, super.field5704 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = 76 % ((arg4 - 20) / 38);
        ++field3483;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        if (arg0 < 13) {
            field3479 = -69;
        }
        ++field3489;
        return this.field3476.field1763;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        if (arg0 > -126) {
            field3461 = null;
        }
        this.field3476.method847((byte) -106, arg1);
        ++field3484;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lnp;Ldq;IIIIIZII)V")
    public class230(class313 arg0, class453 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field6364, arg1.field6321);
        this.field3476 = new class134(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field3472 = ~arg1.field6366 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLnp;)V")
    public static final void method1466(byte arg0, class313 arg1) {
        ++field3487;
        int var2 = class142.field1888;
        if (arg0 != -126) {
            method1465((class313) null, true);
        }
        int var3 = class151.field2246;
        int var4 = class104.field1324;
        int var5 = class467.field6587;
        int var6 = -10660793;
        arg1.method1941(var5, var3, 1, var4, var2, var6);
        arg1.method1941(16, var3 + 1, 1, var4 + -2, var2 + 1, -16777216);
        arg1.method1933(var5 - 19, -16777216, var4 + -2, var3 + 18, (byte) -114, var2 - -1);
        class491.field6928.method1590(class20.field272.method2065(125, class326.field4711), var6, -1, var2 + 3, (byte) -44, var3 - -14);
        int var7 = class262.field3832.method175(-117);
        int var8 = class262.field3832.method177(92);
        int var9 = 0;
        for (class451 var10 = (class451) class160.field2365.method2843(1123227612); var10 != null; var10 = (class451) class160.field2365.method2842(arg0 ^ -1673506548)) {
            int var11 = (class476.field6690 + -1 - var9) * 16 + (var3 - -31);
            short var12 = -1;
            if (var7 > var2 && ~(var2 + var4) < ~var7 && ~(var11 + -13) > ~var8 && var8 < var11 + 3 && var10.field6231) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class242.method1532((byte) -102, var10.field6245)) {
                var13 = class64.field834.method2129((int) var10.field6235, false).field537;
            } else if (var10.field6247 == -1) {
                if (!class128.method804(var10.field6245, true)) {
                    if (class424.method2490(var10.field6245, -96)) {
                        Object var14 = null;
                        class453 var15;
                        if (var10.field6245 != 1007) {
                            var15 = class156.field2325.method808((int) (2147483647L & var10.field6235 >>> 32), 0);
                        } else {
                            var15 = class156.field2325.method808((int) var10.field6235, arg0 ^ -126);
                        }
                        if (var15.field6306 != null) {
                            var15 = var15.method2655(arg0 ^ -61, class140.field1859);
                        }
                        if (var15 != null) {
                            var13 = var15.field6315;
                        }
                    }
                } else {
                    class216 var16 = class139.field1851[(int) var10.field6235];
                    if (var16 != null) {
                        class466 var17 = var16.field3232;
                        if (var17.field6526 != null) {
                            var17 = var17.method2742(arg0 + 105, class140.field1859);
                        }
                        if (var17 != null) {
                            var13 = var17.field6546;
                        }
                    }
                }
            } else {
                var13 = class64.field834.method2129(var10.field6247, false).field537;
            }
            String var18 = class179.method1093((byte) -83, var10);
            if (var13 != null) {
                var18 = var18 + class229.method1462(var13, (byte) -128);
            }
            class491.field6928.method1594(0, var12, class11.field120, var18, 112, class466.field6525, var2 + 3, var11);
            if (var10.field6233) {
                class190.field2816.method1079(class37.field488.method860(-46, var18) + var2 + 5, var11 + -12);
            }
            ++var9;
        }
        class267.method1640(class142.field1888, class467.field6587, class151.field2246, class104.field1324, (byte) -119);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        if (arg0 != 31249) {
            return -60;
        } else {
            ++field3462;
            return this.field3476.field1755;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        ++field3469;
        if (arg1 < 16) {
            field3467 = null;
        }
        class491 var5 = this.field3476.method848(super.field5705, false, arg3, 10, false, super.field5704, 65536);
        if (var5 == null) {
            return false;
        } else {
            class282 var6 = arg3.method601();
            var6.method1019(super.field5705, super.field5703, super.field5704);
            return var5.method1339(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        if (arg1 >= -95) {
            field3467 = null;
        }
        ++field3475;
        class491 var3 = this.field3476.method848(super.field5705, true, arg0, 10, true, super.field5704, 131072);
        if (var3 != null) {
            this.field3476.method845(false, super.field5705 >> 7, super.field5704 >> 7, arg0, super.field5705 >> 7, -125, var3, super.field5704 >> 7);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (arg0 <= 56) {
            field3474 = -103;
        }
        ++field3471;
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        ++field3465;
        if (arg0 >= -105) {
            this.method246(-106);
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        ++field3486;
        if (arg0 != -1) {
            this.method114((class313) null, 35);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        ++field3488;
        if (arg1 != -26920) {
            this.method249(-109);
        }
        this.field3476.method846(arg0, arg1 + 26829);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        ++field3482;
        if (arg0 > -40) {
            field3461 = null;
        }
        return this.field3476.method843((byte) 80);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        ++field3466;
        return arg0 != 12181 ? 16 : this.field3476.field1770;
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V")
    public static void method1467(int arg0) {
        field3464 = null;
        field3481 = null;
        int var1 = -9 % ((3 - arg0) / 60);
        field3478 = null;
        field3477 = null;
        field3473 = null;
        field3461 = null;
        field3467 = null;
        field3463 = null;
    }
}
