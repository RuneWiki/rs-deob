import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class77 extends class601 {

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "I")
    public static int field805 = -60;

    @OriginalMember(owner = "client!dha", name = "l", descriptor = "I")
    public static int field812 = -2;

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "J")
    public static long field804 = (long) (9.999999999E9D * Math.random());

    @OriginalMember(owner = "client!dha", name = "f", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!dha", name = "g", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!dha", name = "h", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!dha", name = "i", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!dha", name = "j", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!dha", name = "k", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!dha", name = "m", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!dha", name = "n", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(ILgn;)V")
    public class77(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        ++field810;
        if (arg1 != 15706) {
            field804 = 24L;
        }
        return 1;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        ++field808;
        if (arg1) {
            field812 = 72;
        }
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BZLpk;)V")
    public static final void method547(byte arg0, boolean arg1, class197 arg2) {
        ++field809;
        if (~class343.field4449 > -401) {
            class326 var3 = arg2.field2293;
            if (var3.field4199 != null) {
                var3 = var3.method1939(true, class722.field10125);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field4160) {
                if (arg0 < -87) {
                    String var4 = var3.field4230;
                    if (~var3.field4191 != -1) {
                        String var5 = class99.field1034 != class15.field130 ? class486.field6932.method2936(class489.field6978, -94) : class486.field6934.method2936(class489.field6978, -109);
                        var4 = var4 + class123.method787(class90.field937.field2174, var3.field4191, (byte) -101) + " (" + var5 + var3.field4191 + ")";
                    }
                    if (class568.field8075 && !arg1) {
                        class703 var6 = ~class262.field3260 == 0 ? null : class84.field884.method98(true, class262.field3260);
                        if ((2 & class12.field96) != 0 && (var6 == null || ~var3.method1946(var6.field9906, class262.field3260, (byte) -125) != ~var6.field9906)) {
                            class723.method4030((long) arg2.field7107, false, -1, false, (long) arg2.field7107, false, 59, class52.field548, 0, 0, true, class192.field2266, class175.field2063 + " -> <col=ffff00>" + var4);
                            ++class397.field5445;
                        }
                    }
                    if (!arg1) {
                        String[] var7 = var3.field4206;
                        if (class230.field2687) {
                            var7 = class606.method3442(var7, 0);
                        }
                        if (var7 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (var7[var8] != null && (var3.field4222 == 0 || !var7[var8].equalsIgnoreCase(class486.field6927.method2936(class489.field6978, 118)))) {
                                    byte var9 = 0;
                                    int var10 = class472.field6761;
                                    if (~var8 == -1) {
                                        var9 = 4;
                                    }
                                    if (var8 == 1) {
                                        var9 = 23;
                                    }
                                    if (var8 == 2) {
                                        var9 = 49;
                                    }
                                    if (var8 == 3) {
                                        var9 = 30;
                                    }
                                    if (~var3.field4228 == ~var8) {
                                        var10 = var3.field4172;
                                    }
                                    if (var8 == 4) {
                                        var9 = 16;
                                    }
                                    if (var3.field4192 == var8) {
                                        var10 = var3.field4207;
                                    }
                                    ++class163.field1817;
                                    class723.method4030((long) arg2.field7107, false, -1, false, (long) arg2.field7107, false, var9, var7[var8], 0, 0, true, var7[var8].equalsIgnoreCase(class486.field6927.method2936(class489.field6978, -124)) ? var3.field4177 : var10, "<col=ffff00>" + var4);
                                }
                            }
                        }
                        if (~var3.field4222 == -2 && var7 != null) {
                            for (int var11 = 4; ~var11 <= -1; --var11) {
                                if (var7[var11] != null && var7[var11].equalsIgnoreCase(class486.field6927.method2936(class489.field6978, -106))) {
                                    short var12 = 0;
                                    if (var3.field4191 > class90.field937.field2174) {
                                        var12 = 2000;
                                    }
                                    short var13 = 0;
                                    if (~var11 == -1) {
                                        var13 = 4;
                                    }
                                    if (var11 == 1) {
                                        var13 = 23;
                                    }
                                    if (var11 == 2) {
                                        var13 = 49;
                                    }
                                    if (~var11 == -4) {
                                        var13 = 30;
                                    }
                                    if (var11 == 4) {
                                        var13 = 16;
                                    }
                                    if (~var13 != -1) {
                                        var13 += var12;
                                    }
                                    ++class136.field1546;
                                    class723.method4030((long) arg2.field7107, false, -1, false, (long) arg2.field7107, false, var13, var7[var11], 0, 0, true, var3.field4177, "<col=ffff00>" + var4);
                                }
                            }
                        }
                    }
                    ++class329.field4257;
                    class723.method4030((long) arg2.field7107, false, -1, arg1, (long) arg2.field7107, false, 1011, class486.field6926.method2936(class489.field6978, -67), 0, 0, true, class634.field9125, "<col=ffff00>" + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        if (super.field8563.field9872.method2435(false) && ~super.field8565 == -3) {
            super.field8565 = 1;
        }
        ++field814;
        if (~super.field8565 > -1 || ~super.field8565 < -3) {
            super.field8565 = this.method39((byte) -17);
        }
        if (arg0 > -37) {
            this.method549(35);
        }
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lgn;)V")
    public class77(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            field807 = 38;
        }
        ++field806;
        return 2;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)V")
    public static final void method548(boolean arg0) {
        ++field811;
        if (!arg0) {
            if (class219.field2535) {
                while (true) {
                    while (class476.field6778.length > class446.field6454) {
                        class526 var1 = class476.field6778[class446.field6454];
                        if (var1 != null && ~var1.field7495 == 0) {
                            if (class515.field7345 == null) {
                                class515.field7345 = class247.field3000.method4107(2, var1.field7493);
                            }
                            int var2 = class515.field7345.field7005;
                            if (~var2 == 0) {
                                return;
                            }
                            class515.field7345 = null;
                            var1.field7495 = var2;
                            ++class446.field6454;
                        } else {
                            ++class446.field6454;
                        }
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)I")
    public final int method549(int arg0) {
        ++field813;
        int var2 = 66 / ((arg0 - -59) / 61);
        return super.field8565;
    }
}
