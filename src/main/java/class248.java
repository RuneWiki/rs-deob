import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class248 implements Runnable {

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "Lfh;")
    private class381 field3454 = new class352();

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "Lfh;")
    private class381 field3458 = null;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    private int field3457;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    private int field3461;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "J")
    private long field3459;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "J")
    private long field3460;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "Lsp;")
    private class471 field3455;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ol", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field3462;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Ljava/lang/String;")
    private String field3456;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Z")
    private volatile boolean field3434;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Z")
    private boolean field3447;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1585(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Z", line = 3)
    public final synchronized boolean method1570(int arg0) {
        field3452++;
        if (arg0 != 7) {
            this.field3458 = null;
        }
        return this.field3454.method258(this.field3459, -20712);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIII)V", line = 14)
    public static final void method1571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3437++;
        if (arg4 != 20 || arg2 < 0 || arg7 < 0 || arg2 >= (class514.field7179 - 1) || (class456.field6281 - 1) <= arg7) {
            return;
        }
        if (class352.field4549 == null) {
            return;
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                class649 var8 = (class649) class744.method4146(arg1, arg2, arg7);
                if (var8 != null) {
                    if (!(var8 instanceof class40)) {
                        int var9 = var8.method275(24263);
                        if (arg3 != 4 && arg3 != 5) {
                            if (arg3 != 6) {
                                if (arg3 == 7) {
                                    class262.method1623((arg6 + 2 & 0x3) + 4, arg1, arg0, var9, arg2, -122, arg5, arg7, 4);
                                } else if (arg3 == 8) {
                                    class262.method1623(arg6 + 4, arg1, arg0, var9, arg2, -113, arg5, arg7, 4);
                                    class262.method1623((arg6 + 2 & 0x3) + 4, arg1, arg0, var9, arg2, -126, arg5, arg7, 4);
                                    return;
                                }
                                return;
                            }
                            class262.method1623(arg6 + 4, arg1, arg0, var9, arg2, -115, arg5, arg7, 4);
                            return;
                        }
                        class262.method1623(arg6, arg1, arg0, var9, arg2, -124, arg5, arg7, 4);
                        return;
                    }
                    ((class40) var8).field562.method2501(arg5, true);
                    return;
                }
            } else if (arg0 == 2) {
                class649 var10 = (class649) class151.method970(arg1, arg2, arg7, field3462 == null ? (field3462 = method1585("vea")) : field3462);
                if (var10 != null) {
                    if (arg3 == 11) {
                        arg3 = 10;
                    }
                    if (!(var10 instanceof class541)) {
                        class262.method1623(arg6, arg1, arg0, var10.method275(24263), arg2, arg4 ^ 0xFFFFFF9E, arg5, arg7, arg3);
                        return;
                    }
                    ((class541) var10).field7567.method2501(arg5, true);
                    return;
                }
            } else if (arg0 == 3) {
                class649 var11 = (class649) class340.method1963(arg1, arg2, arg7);
                if (var11 == null) {
                    return;
                }
                if (var11 instanceof class313) {
                    ((class313) var11).field4030.method2501(arg5, true);
                    return;
                }
                class262.method1623(arg6, arg1, arg0, var11.method275(arg4 + 24243), arg2, -116, arg5, arg7, arg3);
            } else {
                return;
            }
            return;
        }
        class649 var12 = (class649) class204.method1367(arg1, arg2, arg7);
        class649 var13 = (class649) class324.method1893(arg1, arg2, arg7);
        if (var12 != null && arg3 != 2) {
            if (var12 instanceof class314) {
                ((class314) var12).field4036.method2501(arg5, true);
            } else {
                class262.method1623(arg6, arg1, arg0, var12.method275(24263), arg2, -126, arg5, arg7, arg3);
            }
        }
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class314) {
            ((class314) var13).field4036.method2501(arg5, true);
            return;
        }
        class262.method1623(arg6, arg1, arg0, var13.method275(24263), arg2, -112, arg5, arg7, arg3);
        return;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 138)
    public final void method1572(byte arg0) {
        field3443++;
        this.field3434 = true;
        if (arg0 != -5) {
            this.field3460 = -126L;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V", line = 150)
    public final synchronized void method1573(byte arg0) {
        this.field3447 = true;
        if (arg0 == 69) {
            field3450++;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLvj;)Lcaa;", line = 161)
    public static final class638 method1574(byte arg0, class26 arg1) {
        int var2 = 53 % ((arg0 + 4) / 38);
        field3435++;
        return new class638(arg1.method173(-3), arg1.method173(-3), arg1.method173(-3), arg1.method173(-3), arg1.method186((byte) 118), arg1.method194((byte) 119));
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(BLvj;)Luv;", line = 171)
    public static final class751 method1575(byte arg0, class26 arg1) {
        if (arg0 != 95) {
            field3438 = -123;
        }
        field3439++;
        class679 var2 = class664.method3813(arg1, -19264);
        int var3 = arg1.method189(255);
        int var4 = arg1.method189(255);
        int var5 = arg1.method193(arg0 ^ 0x5D);
        return new class751(var2.field9569, var2.field9563, var2.field9562, var2.field9570, var2.field9575, var2.field9561, var2.field9568, var2.field9572, var2.field9571, var3, var4, var5);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lkha;IIII)V", line = 192)
    public static final void method1576(class30 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 38) {
            return;
        }
        field3442++;
        for (class67 var5 = (class67) class154.field2122.method3118((byte) 73); var5 != null; var5 = (class67) class154.field2122.method3111(124)) {
            if (var5.field933 == arg3 && arg1 << 9 == var5.field916 && arg2 << 9 == var5.field944 && var5.field931.field442 == arg0.field442) {
                if (var5.field927 != null) {
                    class237.field3299.method3761(var5.field927);
                    var5.field927 = null;
                }
                if (var5.field919 != null) {
                    class237.field3299.method3761(var5.field919);
                    var5.field919 = null;
                }
                var5.method3065(-17363);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lsp;", line = 230)
    public final class471 method1577(int arg0) {
        field3445++;
        int var2 = -73 % ((arg0 - 68) / 44);
        return this.field3455;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I", line = 241)
    public final int method1578(int arg0) {
        if (arg0 > -67) {
            return 40;
        } else {
            field3451++;
            return this.field3457;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILsp;Ljava/lang/String;JB)V", line = 255)
    public final synchronized void method1579(int arg0, class471 arg1, String arg2, long arg3, byte arg4) {
        this.field3455 = arg1;
        this.field3456 = arg2;
        field3444++;
        this.field3457 = arg0;
        this.field3460 = arg3;
        int var7 = 13 % ((-arg4 - 43) / 62);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lfh;I)V", line = 272)
    public final synchronized void method1580(class381 arg0, int arg1) {
        this.field3458 = this.field3454;
        field3446++;
        if (arg1 != 1) {
            method1576(null, 121, 11, 99, -10);
        }
        this.field3454 = arg0;
        this.field3459 = class224.method1457((byte) -62);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)I", line = 286)
    public final int method1581(byte arg0) {
        field3448++;
        if (this.field3455 == null) {
            return 0;
        }
        int var2 = this.field3455.method2807((byte) 84);
        if (this.field3455.field6439 && this.field3455.field6429 > this.field3457) {
            return this.field3457 + 1;
        } else if (var2 < 0 || (class97.field1410.length - 1) <= var2) {
            return 100;
        } else if (this.field3455.field6432 == this.field3457) {
            return this.field3455.field6429;
        } else {
            if (arg0 < 88) {
                this.field3459 = -9L;
            }
            return this.field3455.field6432;
        }
    }

    @OriginalMember(owner = "client!ol", name = "run", descriptor = "()V", line = 315)
    public final void run() {
        field3453++;
        while (!this.field3434) {
            long var1 = class224.method1457((byte) -62);
            synchronized (this) {
                try {
                    this.field3461++;
                    if (this.field3454 instanceof class352) {
                        this.field3454.method255(this.field3447, -21878);
                    } else {
                        long var4 = class224.method1457((byte) -62);
                        if (class96.field1401 == null || this.field3458 == null || this.field3458.method253(-4505) == 0 || this.field3459 < var4 - (long) this.field3458.method253(-4505)) {
                            if (this.field3458 != null) {
                                this.field3447 = true;
                                this.field3458.method254((byte) -75);
                                this.field3458 = null;
                            }
                            if (this.field3447) {
                                class183.method1221(0);
                                if (class96.field1401 != null) {
                                    class96.field1401.method563(0);
                                }
                            }
                            this.field3454.method255(this.field3447 || class96.field1401 != null && class96.field1401.method2214(), -21878);
                        } else {
                            int var6 = (int) ((var4 - this.field3459) * 255L / (long) this.field3458.method253(-4505));
                            int var7 = 255 - var6;
                            class183.method1221(0);
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class96.field1401.method563(0);
                            class21 var10 = class96.field1401.method2113(class58.field807, class582.field8281, true);
                            class96.field1401.method3261(var10, 1);
                            this.field3458.method255(true, -21878);
                            class96.field1401.method635();
                            var10.method104(0, 0, 0, var8, 1);
                            class96.field1401.method3261(var10, 1);
                            class96.field1401.method563(0);
                            this.field3454.method255(true, -21878);
                            class96.field1401.method635();
                            var10.method104(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class96.field1401 != null && !(this.field3454 instanceof class352)) {
                                class96.field1401.method3262(0);
                            }
                        } catch (class425 var18) {
                            class233.method1495((byte) -79, var18, var18.getMessage() + " (Recovered) " + class306.field3966.method2686((byte) -71));
                            class736.method4088((byte) 122, true, 0);
                        }
                    }
                    Container var12;
                    if (class244.field3384 != null) {
                        var12 = class244.field3384;
                    } else if (class622.field8847 == null) {
                        var12 = class128.field1752;
                    } else {
                        var12 = class622.field8847;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class244.field3384 == var12) {
                        class244.field3384.getInsets();
                    }
                    this.field3447 = false;
                    if (class96.field1401 != null && !(this.field3454 instanceof class352) && class312.field4004 == -1) {
                        class611.method3571(true);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class224.method1457((byte) -62);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class740.method4124((long) var15, 127);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)I", line = 442)
    public final int method1582(int arg0) {
        if (arg0 != -9) {
            this.field3434 = false;
        }
        field3440++;
        return this.field3461;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)J", line = 457)
    public final long method1583(boolean arg0) {
        if (arg0) {
            field3449++;
            return this.field3460;
        } else {
            return 78L;
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)Ljava/lang/String;", line = 468)
    public final String method1584(byte arg0) {
        field3441++;
        int var2 = -125 % ((59 - arg0) / 50);
        return this.field3456;
    }
}
