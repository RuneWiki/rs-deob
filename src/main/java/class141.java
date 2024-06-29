import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class141 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Ltja;")
    private class288 field1757 = new class288(256);

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lbt;")
    private class48 field1762;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lpe;")
    public static class636 field1759 = new class636(4);

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "[Lrq;")
    public static class371[] field1765 = new class371[16];

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "F")
    public static float field1766;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "[Lpt;")
    public static class557[] field1767;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLkg;)V")
    public static final void method1023(byte arg0, class287 arg1) {
        field1761++;
        if (arg1.field3399 != -1) {
            class582 var2 = class362.field4504.method3600(-93, arg1.field3399);
            if (var2 == null || var2.field7955 == null) {
                arg1.field3399 = -1;
                arg1.field3426 = false;
            } else {
                label280: {
                    arg1.field3367++;
                    if (var2.field7955.length > arg1.field3409 && var2.field7936[arg1.field3409] < arg1.field3367) {
                        arg1.field3407++;
                        arg1.field3367 = 1;
                        arg1.field3409++;
                        if (!arg1.field3363) {
                            class60.method520(arg1.field3409, (byte) -80, arg1, var2);
                        }
                    }
                    if (arg1.field3409 >= var2.field7955.length) {
                        arg1.field3409 = 0;
                        arg1.field3367 = 0;
                        if (arg1.field3426) {
                            arg1.field3399 = arg1.method1676(0).method196(-101);
                            if (arg1.field3399 == -1) {
                                arg1.field3426 = false;
                                break label280;
                            }
                            var2 = class362.field4504.method3600(-64, arg1.field3399);
                        }
                        if (!arg1.field3363) {
                            class60.method520(arg1.field3409, (byte) -125, arg1, var2);
                        }
                    }
                    arg1.field3407 = arg1.field3409 + 1;
                    if (var2.field7955 == null) {
                        arg1.field3426 = false;
                        arg1.field3399 = -1;
                    } else if (var2.field7955.length <= arg1.field3407) {
                        arg1.field3407 = 0;
                    }
                }
            }
        }
        for (int var3 = 0; var3 < arg1.field3439.length; var3++) {
            if (arg1.field3439[var3].field9372 != -1 && arg1.field3439[var3].field9369 <= class228.field2707) {
                class308 var10 = class740.field10303.method1473(-52, arg1.field3439[var3].field9372);
                int var11 = var10.field3824;
                if (var11 == -1) {
                    arg1.field3439[var3].field9372 = -1;
                } else {
                    class582 var12 = class362.field4504.method3600(-80, var11);
                    if (var10.field3804) {
                        if (var12.field7943 == 3) {
                            if (arg1.field3456 > 0 && class228.field2707 >= arg1.field3375 && arg1.field3428 < class228.field2707) {
                                arg1.field3439[var3].field9372 = -1;
                                continue;
                            }
                        } else if (var12.field7943 == 1 && arg1.field3456 > 0 && class228.field2707 >= arg1.field3375 && class228.field2707 > arg1.field3428) {
                            arg1.field3439[var3].field9369 = class228.field2707 + 1;
                            continue;
                        }
                    }
                    if (var12 == null || var12.field7955 == null) {
                        arg1.field3439[var3].field9372 = -1;
                    } else {
                        if (arg1.field3439[var3].field9366 < 0) {
                            arg1.field3439[var3].field9366 = 0;
                            if (!arg1.field3363) {
                                class60.method520(0, (byte) -84, arg1, var12);
                            }
                        }
                        arg1.field3439[var3].field9370++;
                        if (arg1.field3439[var3].field9366 < var12.field7955.length && arg1.field3439[var3].field9370 > var12.field7936[arg1.field3439[var3].field9366]) {
                            arg1.field3439[var3].field9370 = 1;
                            arg1.field3439[var3].field9366++;
                            if (!arg1.field3363) {
                                class60.method520(arg1.field3439[var3].field9366, (byte) -75, arg1, var12);
                            }
                        }
                        if (var12.field7955.length <= arg1.field3439[var3].field9366) {
                            if (var10.field3804) {
                                arg1.field3439[var3].field9366 -= var12.field7957;
                                arg1.field3439[var3].field9375++;
                                if (arg1.field3439[var3].field9375 >= var12.field7945) {
                                    arg1.field3439[var3].field9372 = -1;
                                } else if (arg1.field3439[var3].field9366 < 0 || var12.field7955.length <= arg1.field3439[var3].field9366) {
                                    arg1.field3439[var3].field9372 = -1;
                                } else if (!arg1.field3363) {
                                    class60.method520(arg1.field3439[var3].field9366, (byte) -111, arg1, var12);
                                }
                            } else {
                                arg1.field3439[var3].field9372 = -1;
                            }
                        }
                        arg1.field3439[var3].field9365 = arg1.field3439[var3].field9366 + 1;
                        if (var12.field7955.length <= arg1.field3439[var3].field9365) {
                            if (var10.field3804) {
                                arg1.field3439[var3].field9365 -= var12.field7957;
                                if ((arg1.field3439[var3].field9375 + 1) >= var12.field7945) {
                                    arg1.field3439[var3].field9365 = -1;
                                } else if (arg1.field3439[var3].field9365 < 0 || var12.field7955.length <= arg1.field3439[var3].field9365) {
                                    arg1.field3439[var3].field9365 = -1;
                                }
                            } else {
                                arg1.field3439[var3].field9365 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field3420 != -1 && arg1.field3359 <= 1) {
            class582 var4 = class362.field4504.method3600(-89, arg1.field3420);
            if (var4.field7943 == 3) {
                if (arg1.field3456 > 0 && class228.field2707 >= arg1.field3375 && class228.field2707 > arg1.field3428) {
                    arg1.field3420 = -1;
                    arg1.field3430 = null;
                }
            } else if (var4.field7943 == 1 && arg1.field3456 > 0 && arg1.field3375 <= class228.field2707 && arg1.field3428 < class228.field2707) {
                arg1.field3359 = 2;
            }
        }
        if (arg1.field3420 != -1 && arg1.field3359 == 0) {
            class582 var5 = class362.field4504.method3600(-46, arg1.field3420);
            if (var5 == null || var5.field7955 == null) {
                arg1.field3420 = -1;
                arg1.field3430 = null;
            } else {
                arg1.field3368++;
                if (arg1.field3392 < var5.field7955.length && arg1.field3368 > var5.field7936[arg1.field3392]) {
                    arg1.field3392++;
                    arg1.field3368 = 1;
                    if (!arg1.field3363) {
                        class60.method520(arg1.field3392, (byte) -94, arg1, var5);
                    }
                }
                if (arg1.field3392 >= var5.field7955.length) {
                    arg1.field3392 -= var5.field7957;
                    arg1.field3423++;
                    if (arg1.field3423 >= var5.field7945) {
                        arg1.field3420 = -1;
                        arg1.field3430 = null;
                    } else if (arg1.field3392 < 0 || var5.field7955.length <= arg1.field3392) {
                        arg1.field3430 = null;
                        arg1.field3420 = -1;
                    } else if (!arg1.field3363) {
                        class60.method520(arg1.field3392, (byte) -123, arg1, var5);
                    }
                }
                arg1.field3376 = arg1.field3392 + 1;
                if (arg1.field3376 >= var5.field7955.length) {
                    arg1.field3376 -= var5.field7957;
                    if (var5.field7945 <= (arg1.field3423 + 1)) {
                        arg1.field3376 = -1;
                    } else if (arg1.field3376 < 0 || arg1.field3376 >= var5.field7955.length) {
                        arg1.field3376 = -1;
                    }
                }
            }
        }
        if (arg1.field3359 > 0) {
            arg1.field3359--;
        }
        int var6 = -42 / ((arg0 - 26) / 57);
        for (int var7 = 0; var7 < arg1.field3435.length; var7++) {
            class756 var8 = arg1.field3435[var7];
            if (var8 != null) {
                if (var8.field10468 > 0) {
                    var8.field10468--;
                } else {
                    class582 var9 = class362.field4504.method3600(-49, var8.field10471);
                    if (var9 == null || var9.field7955 == null) {
                        arg1.field3435[var7] = null;
                    } else {
                        var8.field10470++;
                        if (var9.field7955.length > var8.field10473 && var9.field7936[var8.field10473] < var8.field10470) {
                            var8.field10470 = 1;
                            var8.field10473++;
                            if (!arg1.field3363) {
                                class60.method520(var8.field10473, (byte) -120, arg1, var9);
                            }
                        }
                        if (var8.field10473 >= var9.field7955.length) {
                            var8.field10473 -= var9.field7957;
                            var8.field10469++;
                            if (var8.field10469 >= var9.field7945) {
                                arg1.field3435[var7] = null;
                            } else if (var8.field10473 < 0 || var9.field7955.length <= var8.field10473) {
                                arg1.field3435[var7] = null;
                            } else if (!arg1.field3363) {
                                class60.method520(var8.field10473, (byte) -78, arg1, var9);
                            }
                        }
                        var8.field10467 = var8.field10473 + 1;
                        if (var8.field10467 >= var9.field7955.length) {
                            var8.field10467 -= var9.field7957;
                            if ((var8.field10469 + 1) >= var9.field7945) {
                                var8.field10467 = -1;
                            } else if (var8.field10467 < 0 || var8.field10467 >= var9.field7955.length) {
                                var8.field10467 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lvq;")
    public final class487 method1024(int arg0, int arg1) {
        field1763++;
        class288 var3 = this.field1757;
        class487 var4;
        synchronized (this.field1757) {
            var4 = (class487) this.field1757.method1684((long) arg0, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field1762;
        byte[] var6;
        synchronized (this.field1762) {
            var6 = this.field1762.method437(arg1, (byte) -120, arg0);
        }
        class487 var7 = new class487();
        if (var6 != null) {
            var7.method2891(new class403(var6), (byte) 83);
        }
        class288 var8 = this.field1757;
        synchronized (this.field1757) {
            this.field1757.method1686(arg1 - 25664, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final void method1025(int arg0) {
        field1758++;
        class288 var2 = this.field1757;
        synchronized (this.field1757) {
            this.field1757.method1690(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method1026(int arg0) {
        field1767 = null;
        if (arg0 == 1) {
            field1759 = null;
            field1765 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
    public final void method1027(int arg0, int arg1) {
        class288 var3 = this.field1757;
        synchronized (this.field1757) {
            if (arg0 != -9355) {
                this.method1027(-64, -43);
            }
            this.field1757.method1694(arg1, -53);
        }
        field1764++;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lmja;ILbt;)V")
    public class141(class441 arg0, int arg1, class48 arg2) {
        this.field1762 = arg2;
        this.field1762.method431(4, 26);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public final void method1028(byte arg0) {
        int var2 = -87 % ((arg0 - 25) / 61);
        class288 var3 = this.field1757;
        synchronized (this.field1757) {
            this.field1757.method1687((byte) 61);
        }
        field1760++;
    }
}
