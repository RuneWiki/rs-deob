import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class197 {

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lug;")
    private class200 field3431 = new class200();

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[Z")
    public static boolean[] field3426 = new boolean[5];

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[I")
    public static int[] field3430 = new int[5];

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Loa;")
    private static class99 field3434 = class221.method1463(2844, "glow1:");

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field3437 = 0;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Loa;")
    public static class99 field3428 = field3434;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Loa;")
    public static class99 field3442 = field3434;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lug;")
    private class200 field3436;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[I")
    public static int[] field3441;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1320(int arg0) {
        if (arg0 != -10454) {
            method1320(-13);
        }
        field3428 = null;
        field3441 = null;
        field3430 = null;
        field3426 = null;
        field3434 = null;
        field3442 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I")
    public final int method1321(int arg0) {
        field3433++;
        class200 var2 = this.field3431.field3472;
        int var3 = 0;
        int var4 = 41 / ((arg0 - 9) / 54);
        while (this.field3431 != var2) {
            var3++;
            var2 = var2.field3472;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public final void method1322(boolean arg0) {
        field3440++;
        if (arg0) {
            this.method1322(false);
        }
        while (true) {
            class200 var2 = this.field3431.field3472;
            if (this.field3431 == var2) {
                this.field3436 = null;
                return;
            }
            var2.method1346(122);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILug;)V")
    public final void method1323(int arg0, class200 arg1) {
        if (arg0 != -27664) {
            return;
        }
        field3429++;
        if (arg1.field3478 != null) {
            arg1.method1346(arg0 ^ 0xFFFF93E1);
        }
        arg1.field3472 = this.field3431;
        arg1.field3478 = this.field3431.field3478;
        arg1.field3478.field3472 = arg1;
        arg1.field3472.field3478 = arg1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Luk;III)V")
    public static final void method1324(class98 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class253.field4372) {
            class216 var4 = class128.field2236[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3757 != null && var4.field3757.field4891.method653()) {
                arg0.method651(var4.field3757.field4891, 128, 0, 0, true);
            }
        }
        if (arg3 < class253.field4372) {
            class216 var5 = class128.field2236[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3757 != null && var5.field3757.field4891.method653()) {
                arg0.method651(var5.field3757.field4891, 0, 0, 128, true);
            }
        }
        if (arg2 < class253.field4372 && arg3 < class172.field3051) {
            class216 var6 = class128.field2236[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3757 != null && var6.field3757.field4891.method653()) {
                arg0.method651(var6.field3757.field4891, 128, 0, 128, true);
            }
        }
        if (arg2 < class253.field4372 && arg3 > 0) {
            class216 var7 = class128.field2236[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3757 != null && var7.field3757.field4891.method653()) {
                arg0.method651(var7.field3757.field4891, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Lug;")
    public final class200 method1325(int arg0) {
        field3438++;
        class200 var2 = this.field3431.field3472;
        if (this.field3431 == var2) {
            this.field3436 = null;
            return null;
        } else {
            this.field3436 = var2.field3472;
            int var3 = 29 % ((arg0 + 8) / 43);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Lug;")
    public final class200 method1326(int arg0) {
        field3432++;
        class200 var2 = this.field3436;
        if (this.field3431 == var2) {
            this.field3436 = null;
            return null;
        } else if (arg0 > -41) {
            return null;
        } else {
            this.field3436 = var2.field3472;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method1327(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3439++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg1;
        if (arg5) {
            method1327(111, 101, -81, 53, -15, true, -28, 67);
        }
        int var11 = arg1 - arg0;
        int var12 = arg3 - arg0;
        int var13 = arg3 * arg3;
        int var14 = arg1 * arg1;
        int var15 = var12 * var12;
        int var16 = var11 * var11;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = var13 << 1;
        int var21 = arg1 << 1;
        int var22 = var11 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var20);
        int var25 = (1 - var22) * var15 + var18;
        int var26 = var13 << 2;
        int var27 = var15 << 2;
        int var28 = var16 - (var22 - 1) * var19;
        int var29 = var14 << 2;
        int var30 = (var21 - 3) * var20;
        int var31 = var16 << 2;
        int var32 = var18 * 3;
        int var33 = (var22 - 3) * var19;
        int var34 = var17 * 3;
        int var35 = (arg1 - 1) * var26;
        int var36 = var31;
        if (arg4 >= class178.field3101 && class137.field2414 >= arg4) {
            int[] var37 = class124.field2177[arg4];
            int var38 = class166.method1127(class79.field1395, arg2 - arg3, field3437, 8946);
            int var39 = class166.method1127(class79.field1395, arg2 + arg3, field3437, 8946);
            int var40 = class166.method1127(class79.field1395, arg2 - var12, field3437, 8946);
            int var41 = class166.method1127(class79.field1395, arg2 + var12, field3437, 8946);
            class175.method1174(var37, arg7, -7, var38, var40);
            class175.method1174(var37, arg6, -7, var40, var41);
            class175.method1174(var37, arg7, -7, var41, var39);
        }
        int var42 = var29;
        int var43 = (var11 - 1) * var27;
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var34;
                    var8++;
                    var24 += var42;
                    var34 += var29;
                    var42 += var29;
                }
            }
            if (var24 < 0) {
                var23 += var34;
                var8++;
                var24 += var42;
                var42 += var29;
                var34 += var29;
            }
            boolean var44 = var10 <= var11;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var9++;
                        var28 += var36;
                        var36 += var31;
                        var25 += var32;
                        var32 += var31;
                    }
                }
                if (var28 < 0) {
                    var28 += var36;
                    var36 += var31;
                    var25 += var32;
                    var32 += var31;
                    var9++;
                }
                var28 += -var33;
                var33 -= var27;
                var25 += -var43;
                var43 -= var27;
            }
            var23 += -var35;
            var10--;
            var24 += -var30;
            var30 -= var26;
            int var45 = arg4 + var10;
            int var46 = arg4 - var10;
            if (var45 >= class178.field3101 && class137.field2414 >= var46) {
                int var47 = class166.method1127(class79.field1395, arg2 + var8, field3437, 8946);
                int var48 = class166.method1127(class79.field1395, arg2 - var8, field3437, 8946);
                if (var44) {
                    int var49 = class166.method1127(class79.field1395, arg2 + var9, field3437, 8946);
                    int var50 = class166.method1127(class79.field1395, arg2 - var9, field3437, 8946);
                    if (class178.field3101 <= var46) {
                        int[] var51 = class124.field2177[var46];
                        class175.method1174(var51, arg7, -7, var48, var50);
                        class175.method1174(var51, arg6, -7, var50, var49);
                        class175.method1174(var51, arg7, -7, var49, var47);
                    }
                    if (class137.field2414 >= var45) {
                        int[] var52 = class124.field2177[var45];
                        class175.method1174(var52, arg7, -7, var48, var50);
                        class175.method1174(var52, arg6, -7, var50, var49);
                        class175.method1174(var52, arg7, -7, var49, var47);
                    }
                } else {
                    if (class178.field3101 <= var46) {
                        class175.method1174(class124.field2177[var46], arg7, -7, var48, var47);
                    }
                    if (var45 <= class137.field2414) {
                        class175.method1174(class124.field2177[var45], arg7, -7, var48, var47);
                    }
                }
            }
            var35 -= var26;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZIIII)Lpi;")
    public static final class139 method1328(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3425++;
        int var7 = (arg5 << 19) + arg2 - (-(arg0 ? 65536 : 0) + -(arg4 << 17));
        if (!arg1) {
            method1328(false, true, -55, 101, 115, -15);
        }
        long var8 = (long) arg3 * 3147483667L + (long) var7 * 3849834839L;
        class139 var10 = (class139) class232.field3993.method1811(var8, 63);
        if (var10 != null) {
            return var10;
        }
        class134.field2351 = false;
        class139 var11 = class240.method1563(arg0, -19051, arg3, false, arg2, arg5, arg4, false);
        if (var11 != null && !class134.field2351) {
            class232.field3993.method1817(var8, 16, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class197() {
        this.field3431.field3472 = this.field3431;
        this.field3431.field3478 = this.field3431;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Lug;")
    public final class200 method1329(byte arg0) {
        if (arg0 != 52) {
            this.method1326(-1);
        }
        field3427++;
        class200 var2 = this.field3431.field3472;
        if (this.field3431 == var2) {
            return null;
        } else {
            var2.method1346(8);
            return var2;
        }
    }
}
