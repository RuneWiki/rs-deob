import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class229 extends class72 {

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "J")
    public static long field3268 = 0L;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lqe;")
    public static class465 field3266 = new class465(55, -1);

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field3272 = 0;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Lqe;")
    public static class465 field3275 = new class465(111, 1);

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 6)
    public final void method55(int arg0) {
        if (arg0 >= 30) {
            if (super.field1286.field6684.method1844(13) && !class283.method1849(super.field1286.field6684.method1843(27669), (byte) -37)) {
                super.field1282 = 0;
            }
            ++field3267;
            if (~super.field1282 > -1 || super.field1282 > 1) {
                super.field1282 = this.method60(-3271);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I", line = 22)
    public final int method60(int arg0) {
        ++field3269;
        return arg0 != -3271 ? -9 : 0;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)I", line = 35)
    public final int method1572(int arg0) {
        if (arg0 != 27669) {
            field3272 = 9;
        }
        ++field3276;
        return super.field1282;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V", line = 48)
    public static final void method1573(int arg0, int arg1, int arg2) {
        ++field3265;
        if (class542.field7623 < class542.field7628) {
            class542.field7623 = (float) ((double) class542.field7623 / 30.0D + (double) class542.field7623);
            if (class542.field7623 > class542.field7628) {
                class542.field7623 = class542.field7628;
            }
            class63.method682((byte) 123);
            class542.field7621 = (int) class542.field7623 >> 1;
            class542.field7622 = class422.method2581(class542.field7621, (byte) -124);
        } else if (class542.field7623 > class542.field7628) {
            class542.field7623 = (float) ((double) class542.field7623 - (double) class542.field7623 / 30.0D);
            if (class542.field7623 < class542.field7628) {
                class542.field7623 = class542.field7628;
            }
            class63.method682((byte) 125);
            class542.field7621 = (int) class542.field7623 >> 1;
            class542.field7622 = class422.method2581(class542.field7621, (byte) -113);
        }
        if (class358.field5026 != -1 && ~class320.field4554 != 0) {
            int var3 = -class587.field8271 + class358.field5026;
            if (var3 < 2 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class590.field8288 + class320.field4554;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class587.field8271 -= -var3;
            class590.field8288 += var4;
            if (~var3 == -1 && var4 == 0) {
                class320.field4554 = -1;
                class358.field5026 = -1;
            }
            class63.method682((byte) -125);
        }
        if (class613.field8875 <= 0) {
            class617.field8922 = -1;
            class495.field7063 = -1;
        } else {
            --class170.field2485;
            if (class170.field2485 == 0) {
                --class613.field8875;
                class170.field2485 = 100;
            }
        }
        if (class668.field9365 && class353.field4969 != null) {
            for (class371 var5 = (class371) class353.field4969.method1522(true); var5 != null; var5 = (class371) class353.field4969.method1527((byte) 117)) {
                class524 var6 = class542.field7614.method2641(var5.field5199.field7608, 119);
                if (!var5.method2329(arg1, arg0, 0)) {
                    if (var5.field5199.field7598) {
                        var5.field5199.field7598 = false;
                        class357.method2232(class613.field8868, var5.field5199.field7608, var6.field7414);
                    }
                } else {
                    if (var6.field7412 != null) {
                        if (var6.field7412[4] != null) {
                            class673.method3807((long) var5.field5199.field7608, var6.field7448, var6.field7414, (byte) -100, (long) var5.field5199.field7608, true, var6.field7412[4], 1010, false, 0, false, -1, -1);
                        }
                        if (var6.field7412[3] != null) {
                            class673.method3807((long) var5.field5199.field7608, var6.field7448, var6.field7414, (byte) -103, (long) var5.field5199.field7608, true, var6.field7412[3], 1007, false, 0, false, -1, -1);
                        }
                        if (var6.field7412[2] != null) {
                            class673.method3807((long) var5.field5199.field7608, var6.field7448, var6.field7414, (byte) -45, (long) var5.field5199.field7608, true, var6.field7412[2], 1003, false, 0, false, -1, -1);
                        }
                        if (var6.field7412[1] != null) {
                            class673.method3807((long) var5.field5199.field7608, var6.field7448, var6.field7414, (byte) -44, (long) var5.field5199.field7608, true, var6.field7412[1], 1004, false, 0, false, -1, -1);
                        }
                        if (var6.field7412[0] != null) {
                            class673.method3807((long) var5.field5199.field7608, var6.field7448, var6.field7414, (byte) -59, (long) var5.field5199.field7608, true, var6.field7412[0], 1009, false, 0, false, -1, -1);
                        }
                    }
                    if (!var5.field5199.field7598) {
                        var5.field5199.field7598 = true;
                        class357.method2232(class526.field7468, var5.field5199.field7608, var6.field7414);
                    }
                    if (var5.field5199.field7598) {
                        class357.method2232(class628.field9025, var5.field5199.field7608, var6.field7414);
                    }
                }
            }
        }
        if (arg2 != 26276) {
            method1574(108, -24, false);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZ)I", line = 187)
    public static final int method1574(int arg0, int arg1, boolean arg2) {
        ++field3270;
        if (arg2) {
            return 0;
        } else {
            class380 var3 = class105.method908(0, arg2, arg1);
            if (var3 == null) {
                return class434.field6077.method1075((byte) -70, arg1).field2845;
            } else {
                int var4 = 0;
                if (arg0 != 29652) {
                    return -120;
                } else {
                    for (int var5 = 0; ~var5 > ~var3.field5295.length; ++var5) {
                        if (var3.field5295[var5] == -1) {
                            ++var4;
                        }
                    }
                    return var4 + class434.field6077.method1075((byte) -70, arg1).field2845 + -var3.field5295.length;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 226)
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        ++field3264;
        if (arg1 != 3) {
            this.method58(73, -106);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILfca;Luw;Lak;IIII)V", line = 241)
    public static final void method1575(int arg0, class84 arg1, class414 arg2, class349 arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3273;
        if (arg5 == -1) {
            class235 var8 = new class235();
            var8.field3324 = arg0;
            var8.field3326 = arg6 << 9;
            var8.field3323 = arg7 << 9;
            if (arg2 == null) {
                if (arg1 == null) {
                    if (arg3 != null) {
                        var8.field3333 = arg3;
                        var8.field3313 = arg3.method482(false) + arg7 << 9;
                        var8.field3322 = arg6 - -arg3.method482(false) << 9;
                        var8.field3329 = class700.method3937(arg3, 0);
                        var8.field3320 = 256;
                        var8.field3325 = arg3.field4902;
                        var8.field3312 = arg3.field4915 << 9;
                        var8.field3330 = arg3.field4935;
                        var8.field3314 = 256;
                        class720.field10084.method4211(var8, (byte) 111, (long) arg3.field931);
                        return;
                    }
                } else {
                    var8.field3328 = arg1;
                    class488 var11 = arg1.field1523;
                    if (var11.field6923 != null) {
                        var8.field3316 = true;
                        var11 = var11.method2926(8730, class742.field10408);
                    }
                    if (var11 != null) {
                        var8.field3313 = var11.field6911 + arg7 << 9;
                        var8.field3322 = var11.field6911 + arg6 << 9;
                        var8.field3329 = class475.method2868(arg1, 105);
                        var8.field3330 = var11.field6952;
                        var8.field3325 = var11.field6975;
                        var8.field3320 = var11.field6924;
                        var8.field3312 = var11.field6950 << 9;
                        var8.field3314 = var11.field6974;
                    }
                    class240.field3372.method1526(var8, 127);
                }
            } else {
                var8.field3339 = arg2;
                int var9 = arg2.field5800;
                int var10 = arg2.field5732;
                if (arg4 == 1 || ~arg4 == -4) {
                    var9 = arg2.field5732;
                    var10 = arg2.field5800;
                }
                var8.field3317 = arg2.field5776;
                var8.field3330 = arg2.field5740;
                var8.field3312 = arg2.field5741 << 9;
                var8.field3332 = arg2.field5791;
                var8.field3322 = arg6 + var10 << 9;
                var8.field3325 = arg2.field5772;
                var8.field3314 = arg2.field5725;
                var8.field3331 = arg2.field5785;
                var8.field3321 = arg2.field5763;
                var8.field3329 = arg2.field5714;
                var8.field3320 = arg2.field5778;
                var8.field3313 = arg7 + var9 << 9;
                if (arg2.field5720 != null) {
                    var8.field3316 = true;
                    var8.method1602((byte) -58);
                }
                if (var8.field3331 != null) {
                    var8.field3318 = var8.field3317 + (int) ((double) (var8.field3321 - var8.field3317) * Math.random());
                }
                class152.field2292.method1526(var8, 90);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)I", line = 340)
    public final int method58(int arg0, int arg1) {
        ++field3271;
        if (arg1 != 11260) {
            return -90;
        } else {
            return !class283.method1849(super.field1286.field6684.method1843(27669), (byte) -103) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)Z", line = 355)
    public final boolean method1576(int arg0) {
        ++field3274;
        if (!class283.method1849(super.field1286.field6684.method1843(27669), (byte) -82)) {
            return false;
        } else {
            return arg0 >= 97;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lcq;)V", line = 373)
    public class229(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(ILcq;)V", line = 378)
    public class229(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 381)
    public static void method1577(byte arg0) {
        field3275 = null;
        if (arg0 != -66) {
            method1575(-92, (class84) null, (class414) null, (class349) null, 75, 15, 26, -39);
        }
        field3266 = null;
    }
}
