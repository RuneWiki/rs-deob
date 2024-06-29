import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class266 implements Runnable {

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Lro;")
    private class1 field3713 = new class1();

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Z")
    private boolean field3726 = false;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public int field3717 = 0;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field3722;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "[Z")
    public static boolean[] field3723 = new boolean[100];

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field3721 = 0;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Lch;")
    public static class270 field3718 = new class270();

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3728 = "glow3:";

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "Lra;")
    public static class57 field3731;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3712;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[[[B")
    public static byte[][][] field3716;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 4)
    public final void method1691(int arg0) {
        this.field3726 = true;
        if (arg0 != 15745) {
            return;
        }
        field3727++;
        class1 var2 = this.field3713;
        synchronized (this.field3713) {
            this.field3713.notifyAll();
        }
        try {
            this.field3722.join();
        } catch (InterruptedException var3) {
        }
        this.field3722 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZLnl;I)V", line = 27)
    public static final void method1692(int arg0, int arg1, boolean arg2, class327 arg3, int arg4) {
        field3715++;
        class81 var5 = (class81) class310.field4420.method1124(-1);
        if (arg2) {
            method1695(69, (byte) -25);
        }
        while (var5 != null) {
            if (var5.field929 == arg0 && arg4 * 128 == var5.field911 && (arg1 * 128) == var5.field902 && var5.field916.field4592 == arg3.field4592) {
                if (var5.field909 != null) {
                    class135.field1884.method2807(var5.field909);
                    var5.field909 = null;
                }
                if (var5.field926 != null) {
                    class135.field1884.method2807(var5.field926);
                    var5.field926 = null;
                }
                var5.method2290((byte) 98);
                return;
            }
            var5 = (class81) class310.field4420.method1119(false);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 68)
    public static void method1693(boolean arg0) {
        field3728 = null;
        field3723 = null;
        field3712 = null;
        field3716 = null;
        field3718 = null;
        if (!arg0) {
            field3731 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lam;)V", line = 478)
    public class266(class378 arg0) {
        class241 var2 = arg0.method2386(5, this, (byte) -55);
        while (var2.field3268 == 0) {
            class278.method1757(10L, 0);
        }
        if (var2.field3268 == 2) {
            throw new RuntimeException();
        }
        this.field3722 = (Thread) var2.field3270;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBLwq;)Lds;", line = 89)
    public final class10 method1694(int arg0, byte arg1, class93 arg2) {
        field3725++;
        if (arg1 <= 106) {
            return null;
        }
        class10 var4 = new class10();
        var4.field122 = 3;
        var4.field123 = arg2;
        var4.field1145 = false;
        var4.field5780 = (long) arg0;
        this.method1697(var4, (byte) -113);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)V", line = 107)
    public static final void method1695(int arg0, byte arg1) {
        field3729++;
        if (class105.field1191 == arg0) {
            return;
        }
        if (class105.field1191 == 0) {
            class21.method142(2);
        }
        if (arg0 == 40) {
            class329.method2037(0);
        }
        int var2 = -113 / ((-arg1 - 30) / 41);
        if (arg0 != 40 && class289.field4089 != null) {
            class289.field4089.method1503(false);
            class289.field4089 = null;
        }
        if (class105.field1191 == 25 || class105.field1191 == 28) {
            class324.field4574.field665 = 2;
            class151.field2129.field665 = 2;
            class162.field2280.field665 = 2;
            class364.field5295.field665 = 2;
            class362.field5273.field665 = 2;
            class6.field70.field665 = 2;
            class8.field98.field665 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class150.field2110 = 0;
            class260.field3591 = 0;
            class70.field783 = 0;
            class356.field5217 = 1;
            class223.field3050 = 1;
            class193.method1236(4079, true);
            class324.field4574.field665 = 1;
            class151.field2129.field665 = 1;
            class162.field2280.field665 = 1;
            class364.field5295.field665 = 1;
            class362.field5273.field665 = 1;
            class6.field70.field665 = 1;
            class8.field98.field665 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class102.method549(-114);
        }
        if (arg0 == 5) {
            class102.method553(true, class218.field2991, class92.field1012);
        } else {
            class402.method2550(false);
        }
        boolean var3 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var4 = class105.field1191 == 5 || class105.field1191 == 10 || class105.field1191 == 28;
        if (var3 != var4) {
            if (var3) {
                class423.field6072 = class67.field765;
                if (class75.field834 == 0) {
                    class195.method1239(false, 2);
                } else {
                    class343.method2196(255, 2, 0, class354.field5165, false, 1, class67.field765);
                }
                class355.field5204.method1410(false, true);
            } else {
                class195.method1239(false, 2);
                class355.field5204.method1410(true, true);
                if (class180.field2475 != null) {
                    class180.field2475.method1262(-120);
                    class180.field2475 = null;
                }
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class218.field2991.method977();
        }
        class105.field1191 = arg0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([BIILwq;)Lds;", line = 213)
    public final class10 method1696(byte[] arg0, int arg1, int arg2, class93 arg3) {
        field3714++;
        if (arg2 != -1) {
            return null;
        }
        class10 var5 = new class10();
        var5.field123 = arg3;
        var5.field119 = arg0;
        var5.field122 = 2;
        var5.field5780 = (long) arg1;
        var5.field1145 = false;
        this.method1697(var5, (byte) -124);
        return var5;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lds;B)V", line = 236)
    private final void method1697(class10 arg0, byte arg1) {
        class1 var3 = this.field3713;
        synchronized (this.field3713) {
            this.field3713.method6(86, arg0);
            this.field3717++;
            this.field3713.notifyAll();
        }
        field3719++;
        if (arg1 >= -96) {
            method1695(83, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILwq;I)Lds;", line = 251)
    public final class10 method1698(int arg0, class93 arg1, int arg2) {
        field3724++;
        class10 var4 = new class10();
        var4.field122 = arg2;
        class1 var5 = this.field3713;
        synchronized (this.field3713) {
            class10 var6 = (class10) this.field3713.method2(15056);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field5780 && var6.field123 == arg1 && var6.field122 == 2) {
                    var4.field119 = var6.field119;
                    var4.field1141 = false;
                    return var4;
                }
                var6 = (class10) this.field3713.method10(arg2 + 125);
            }
        }
        var4.field119 = arg1.method498(arg0, -124);
        var4.field1145 = true;
        var4.field1141 = false;
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)V", line = 287)
    public static final void method1699(boolean arg0) {
        class101.method543((byte) -62, class193.field2632);
        field3711++;
        class397.field5786++;
        if (class19.field203 && class170.field2378) {
            int var1 = class57.field654;
            int var2 = var1 - class388.field5682;
            int var3 = class48.field562;
            int var4 = var3 - class383.field5619;
            if (class314.field4476 > var2) {
                var2 = class314.field4476;
            }
            if (var4 < class98.field1110) {
                var4 = class98.field1110;
            }
            if (arg0) {
                field3716 = null;
            }
            if ((class193.field2632.field1552 + var2) > (class314.field4476 + class382.field5600.field1552)) {
                var2 = class382.field5600.field1552 + class314.field4476 - class193.field2632.field1552;
            }
            if (class98.field1110 + class382.field5600.field1498 < var4 - -class193.field2632.field1498) {
                var4 = class98.field1110 + class382.field5600.field1498 - class193.field2632.field1498;
            }
            int var5 = var2 - class58.field699;
            int var6 = var4 - class257.field3501;
            int var7 = class193.field2632.field1596;
            if (class193.field2632.field1469 < class397.field5786 && (var7 < var5 || -var7 > var5 || var6 > var7 || var6 < (-var7))) {
                class173.field2409 = true;
            }
            int var8 = var2 + class382.field5600.field1501 - class314.field4476;
            int var9 = class382.field5600.field1467 + var4 - class98.field1110;
            if (class193.field2632.field1548 != null && class173.field2409) {
                class191 var10 = new class191();
                var10.field2602 = class193.field2632.field1548;
                var10.field2609 = var9;
                var10.field2605 = class193.field2632;
                var10.field2614 = var8;
                class387.method2471(var10);
            }
            if (class137.field1922 == 0) {
                if (class173.field2409) {
                    if (class193.field2632.field1484 != null) {
                        class191 var11 = new class191();
                        var11.field2602 = class193.field2632.field1484;
                        var11.field2609 = var9;
                        var11.field2614 = var8;
                        var11.field2605 = class193.field2632;
                        var11.field2603 = class376.field5507;
                        class387.method2471(var11);
                    }
                    if (class376.field5507 != null && client.method1086(class193.field2632) != null) {
                        class169.field2360.method809(225, -28022);
                        class128.field1790++;
                        class169.field2360.method1361((byte) -121, class193.field2632.field1424);
                        class169.field2360.method1386((byte) 54, class376.field5507.field1424);
                        class169.field2360.method1380(class376.field5507.field1495, (byte) -8);
                        class169.field2360.method1371(class193.field2632.field1495, 29594);
                    }
                } else if ((class354.field5175 == 1 || class247.method1555(0)) && class433.field6324 > 2) {
                    class437.method2719(0, 2);
                } else if (class231.method1474(-1)) {
                    class437.method2719(0, 1);
                }
                class193.field2632 = null;
            }
        } else if (class397.field5786 > 1) {
            class193.field2632 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "run", descriptor = "()V", line = 412)
    public final void run() {
        while (!this.field3726) {
            class1 var1 = this.field3713;
            class10 var2;
            synchronized (this.field3713) {
                var2 = (class10) this.field3713.method9(-6596);
                if (var2 == null) {
                    try {
                        this.field3713.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3717--;
            }
            try {
                if (var2.field122 == 2) {
                    var2.field123.method502(0, var2.field119, (int) var2.field5780, var2.field119.length);
                } else if (var2.field122 == 3) {
                    var2.field119 = var2.field123.method498((int) var2.field5780, -101);
                }
            } catch (Exception var6) {
                class411.method2578(var6, (String) null, (byte) -68);
            }
            var2.field1141 = false;
        }
        field3710++;
    }
}
