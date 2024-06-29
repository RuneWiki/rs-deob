import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class620 {

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field8986 = 0;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "Lkea;")
    public static class203 field8988;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I[Lqf;I)V")
    public static final void method3565(int arg0, class593[] arg1, int arg2) {
        field8989++;
        if (arg2 != 2961) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class593 var4 = arg1[var3];
            if (var4 != null && var4.field8533 == arg0 && !client.method1684(var4)) {
                if (var4.field8507 == 0) {
                    method3565(var4.field8579, arg1, arg2);
                    if (var4.field8512 != null) {
                        method3565(var4.field8579, var4.field8512, arg2);
                    }
                    class563 var5 = (class563) class234.field3309.method524((byte) 101, (long) var4.field8579);
                    if (var5 != null) {
                        class268.method1753(-118, var5.field8022);
                    }
                }
                if (var4.field8507 == 6 && var4.field8558 != -1) {
                    class177 var6 = class259.field3686.method2961(var4.field8558, 8);
                    if (var6 != null) {
                        var4.field8631 += class529.field7661;
                        while (var6.field2150[var4.field8524] < var4.field8631) {
                            var4.field8631 -= var6.field2150[var4.field8524];
                            var4.field8524++;
                            if (var4.field8524 >= var6.field2181.length) {
                                var4.field8524 -= var6.field2168;
                                if (var4.field8524 < 0 || var4.field8524 >= var6.field2181.length) {
                                    var4.field8524 = 0;
                                }
                            }
                            var4.field8571 = var4.field8524 + 1;
                            if (var6.field2181.length <= var4.field8571) {
                                var4.field8571 -= var6.field2168;
                                if (var4.field8571 < 0 || var6.field2181.length <= var4.field8571) {
                                    var4.field8571 = -1;
                                }
                            }
                            class33.method187(var4, (byte) -71);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIZII)V")
    public static final void method3566(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field8990++;
        long var6 = (long) (arg0 | (arg3 ? Integer.MIN_VALUE : 0));
        if (arg2 != -1) {
            return;
        }
        class594 var8 = (class594) class194.field2581.method524((byte) 89, var6);
        if (var8 == null) {
            var8 = new class594();
            class194.field2581.method520((byte) -53, var8, var6);
        }
        if (var8.field8680.length <= arg5) {
            int[] var9 = new int[arg5 + 1];
            int[] var10 = new int[arg5 + 1];
            for (int var11 = 0; var11 < var8.field8680.length; var11++) {
                var9[var11] = var8.field8680[var11];
                var10[var11] = var8.field8676[var11];
            }
            for (int var12 = var8.field8680.length; var12 < arg5; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field8676 = var10;
            var8.field8680 = var9;
        }
        var8.field8680[arg5] = arg4;
        var8.field8676[arg5] = arg1;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Leba;IILeba;Z)I")
    public static final int method3567(class511 arg0, int arg1, int arg2, class511 arg3, boolean arg4) {
        field8992++;
        if (arg1 == 1) {
            int var5 = arg0.field6347;
            int var6 = arg3.field6347;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class82.method541(0, class35.field396, arg3.method3041((byte) -42).field3735, arg0.method3041((byte) -112).field3735);
        } else if (arg1 == 3) {
            if (arg0.field7467.equals("-")) {
                if (arg3.field7467.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field7467.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class82.method541(0, class35.field396, arg3.field7467, arg0.field7467);
            }
        } else if (arg1 == 4) {
            if (arg0.method2668((byte) 87)) {
                return arg3.method2668((byte) 87) ? 0 : 1;
            } else if (arg3.method2668((byte) 87)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg0.method2663((byte) -107)) {
                return arg3.method2663((byte) -107) ? 0 : 1;
            } else if (arg3.method2663((byte) -68)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 6) {
            if (arg0.method2666(4)) {
                return arg3.method2666(4) ? 0 : 1;
            } else if (arg3.method2666(4)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 7) {
            if (arg0.method2665(7289)) {
                return arg3.method2665(7289) ? 0 : 1;
            } else if (arg3.method2665(7289)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 8) {
            int var7 = arg0.field7475;
            int var8 = arg3.field7475;
            if (arg4) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            if (arg2 != 0) {
                method3568(null, 102);
            }
            return arg0.field7469 - arg3.field7469;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Leca;I)V")
    public static final void method3568(class655 arg0, int arg1) {
        field8991++;
        class588 var2 = (class588) class281.field3922.method524((byte) 103, (long) arg0.field2495);
        if (var2 != null) {
            if (var2.field8455 != null) {
                class44.field469.method934(var2.field8455);
                var2.field8455 = null;
            }
            var2.method2108(true);
        }
        if (arg1 != 0) {
            field8987 = 0;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)V")
    public static final void method3569(int arg0, int arg1) {
        class252 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class132 var4 = class544.field7780[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class91.field1047; var5++) {
                    for (int var6 = 0; var6 < class588.field8441; var6++) {
                        var2 = var4.method250(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class465.field6917;
                            int var8 = var5 << class465.field6917;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class132 var10 = class544.field7780[var9];
                                if (var10 != null) {
                                    int var11 = var4.method259(var6, var5) - var10.method259(var6, var5);
                                    int var12 = var4.method259(var6 + 1, var5) - var10.method259(var6 + 1, var5);
                                    int var13 = var4.method259(var6 + 1, var5 + 1) - var10.method259(var6 + 1, var5 + 1);
                                    int var14 = var4.method259(var6, var5 + 1) - var10.method259(var6, var5 + 1);
                                    var10.method256(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V")
    public static void method3570(byte arg0) {
        int var1 = 82 / ((14 - arg0) / 49);
        field8988 = null;
    }
}
