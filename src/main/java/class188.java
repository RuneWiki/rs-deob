import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class188 extends class5 {

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "Lhj;")
    public static class69 field3413 = class181.method1318("(U5", (byte) -119);

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "Lhj;")
    public static class69 field3418 = class181.method1318("null", (byte) -127);

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Lc;")
    private class103 field3419;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "Lhj;")
    public static class69 field3416;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILhj;I)Lhj;")
    public final class69 method1366(int arg0, class69 arg1, int arg2) {
        field3417++;
        if (this.field3419 == null) {
            return arg1;
        }
        class244 var4 = (class244) this.field3419.method769(true, (long) arg0);
        if (arg2 <= 98) {
            return null;
        } else if (var4 == null) {
            return arg1;
        } else {
            return var4.field4475;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)J")
    public static final long method1367(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        return var3 == null || var3.field3932 == null ? 0L : var3.field3932.field2238;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILfh;)V")
    public final void method1368(int arg0, class128 arg1) {
        while (true) {
            int var3 = arg1.method937(false);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field3414++;
                return;
            }
            this.method1371(var3, (byte) -101, arg1);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
    public static final void method1369() {
        class12.field143 = 0;
        label191: for (int var0 = 0; var0 < class51.field893; var0++) {
            class192 var1 = class231.field4228[var0];
            if (class254.field4580 != null) {
                for (int var2 = 0; var2 < class254.field4580.length; var2++) {
                    if (class254.field4580[var2] != -1000000 && (var1.field3481 <= class254.field4580[var2] || var1.field3490 <= class254.field4580[var2]) && (var1.field3468 <= class224.field4077[var2] || var1.field3471 <= class224.field4077[var2]) && (var1.field3468 >= class48.field702[var2] || var1.field3471 >= class48.field702[var2]) && (var1.field3472 <= class163.field3013[var2] || var1.field3475 <= class163.field3013[var2]) && (var1.field3472 >= client.field2808[var2] || var1.field3475 >= client.field2808[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3477 == 1) {
                int var3 = var1.field3482 + class53.field950 - class78.field1496;
                if (var3 >= 0 && var3 <= class53.field950 + class53.field950) {
                    int var4 = var1.field3464 + class53.field950 - class45.field646;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3478 + class53.field950 - class45.field646;
                    if (var5 > class53.field950 + class53.field950) {
                        var5 = class53.field950 + class53.field950;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class186.field3348[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class108.field2050 - var1.field3468;
                        if (var7 > 32) {
                            var1.field3489 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3489 = 2;
                            var7 = -var7;
                        }
                        var1.field3488 = (var1.field3472 - class88.field1673 << 8) / var7;
                        var1.field3493 = (var1.field3475 - class88.field1673 << 8) / var7;
                        var1.field3476 = (var1.field3481 - class79.field1526 << 8) / var7;
                        var1.field3485 = (var1.field3490 - class79.field1526 << 8) / var7;
                        class233.field4258[class12.field143++] = var1;
                    }
                }
            } else if (var1.field3477 == 2) {
                int var8 = var1.field3464 + class53.field950 - class45.field646;
                if (var8 >= 0 && var8 <= class53.field950 + class53.field950) {
                    int var9 = var1.field3482 + class53.field950 - class78.field1496;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3470 + class53.field950 - class78.field1496;
                    if (var10 > class53.field950 + class53.field950) {
                        var10 = class53.field950 + class53.field950;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class186.field3348[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class88.field1673 - var1.field3472;
                        if (var12 > 32) {
                            var1.field3489 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3489 = 4;
                            var12 = -var12;
                        }
                        var1.field3469 = (var1.field3468 - class108.field2050 << 8) / var12;
                        var1.field3484 = (var1.field3471 - class108.field2050 << 8) / var12;
                        var1.field3476 = (var1.field3481 - class79.field1526 << 8) / var12;
                        var1.field3485 = (var1.field3490 - class79.field1526 << 8) / var12;
                        class233.field4258[class12.field143++] = var1;
                    }
                }
            } else if (var1.field3477 == 4) {
                int var13 = var1.field3481 - class79.field1526;
                if (var13 > 128) {
                    int var14 = var1.field3464 + class53.field950 - class45.field646;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3478 + class53.field950 - class45.field646;
                    if (var15 > class53.field950 + class53.field950) {
                        var15 = class53.field950 + class53.field950;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3482 + class53.field950 - class78.field1496;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3470 + class53.field950 - class78.field1496;
                        if (var17 > class53.field950 + class53.field950) {
                            var17 = class53.field950 + class53.field950;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class186.field3348[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3489 = 5;
                            var1.field3469 = (var1.field3468 - class108.field2050 << 8) / var13;
                            var1.field3484 = (var1.field3471 - class108.field2050 << 8) / var13;
                            var1.field3488 = (var1.field3472 - class88.field1673 << 8) / var13;
                            var1.field3493 = (var1.field3475 - class88.field1673 << 8) / var13;
                            class233.field4258[class12.field143++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Z)V")
    public static void method1370(boolean arg0) {
        if (!arg0) {
            field3416 = null;
        }
        field3413 = null;
        field3416 = null;
        field3418 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBLfh;)V")
    private final void method1371(int arg0, byte arg1, class128 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method937(false);
            if (this.field3419 == null) {
                int var5 = class127.method903(124, var4);
                this.field3419 = new class103(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method937(false) == 1;
                int var8 = arg2.method952((byte) -69);
                class88 var9;
                if (var7) {
                    var9 = new class244(arg2.method963(false));
                } else {
                    var9 = new class3(arg2.method923(true));
                }
                this.field3419.method761((long) var8, 0, var9);
            }
        }
        field3412++;
        int var10 = 15 % ((38 - arg1) / 37);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)I")
    public final int method1372(int arg0, int arg1, int arg2) {
        field3415++;
        if (this.field3419 == null) {
            return arg2;
        } else if (arg1 == 4) {
            class3 var4 = (class3) this.field3419.method769(true, (long) arg0);
            return var4 == null ? arg2 : var4.field6;
        } else {
            return -8;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)Z")
    public static final boolean method1373(byte arg0, int arg1, int arg2) {
        if (arg0 != 54) {
            method1373((byte) -40, 115, -116);
        }
        class12 var3 = class145.method1102(arg1, 0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        field3420++;
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method57(arg2, (byte) -76);
    }
}
