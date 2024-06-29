import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class400 implements Runnable {

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "Llfa;")
    private class334 field5536 = new class22();

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "Llfa;")
    private class334 field5545 = null;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "J")
    public static long field5538 = 0L;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "Ldh;")
    public static class286 field5535 = new class286("runescape", 0);

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
    private int field5542;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!vba", name = "w", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!vba", name = "x", descriptor = "I")
    private int field5550;

    @OriginalMember(owner = "client!vba", name = "y", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!vba", name = "A", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "J")
    private long field5543;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "J")
    private long field5552;

    @OriginalMember(owner = "client!vba", name = "v", descriptor = "Loq;")
    private class218 field5548;

    @OriginalMember(owner = "client!vba", name = "t", descriptor = "Ljava/lang/String;")
    private String field5546;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "Z")
    private boolean field5531;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "Z")
    private volatile boolean field5537;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)Loq;", line = 6)
    public final class218 method2365(int arg0) {
        field5529++;
        return arg0 == 1 ? this.field5548 : null;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I", line = 20)
    public final int method2366(int arg0) {
        field5539++;
        if (this.field5548 == null) {
            return 0;
        }
        int var2 = this.field5548.method1319(true);
        if (arg0 >= -26) {
            this.method2377(97);
        }
        if (this.field5548.field2751 && this.field5548.field2743 > this.field5542) {
            return this.field5542 + 1;
        } else if (var2 >= 0 && class340.field4393.length - 1 > var2) {
            return this.field5548.field2749 == this.field5542 ? this.field5548.field2743 : this.field5548.field2749;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)V", line = 51)
    public static void method2367(int arg0) {
        if (arg0 == -20802) {
            field5535 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "(I)I", line = 62)
    public static final int method2368(int arg0) {
        field5551++;
        boolean var1 = false;
        if (arg0 != -21867) {
            field5535 = null;
        }
        boolean var2 = false;
        boolean var3 = false;
        if (class681.field9312.field3251 && !class681.field9312.field3240) {
            var1 = true;
            if (class241.field3102.field8654 < 512 && class241.field3102.field8654 != 0) {
                var1 = false;
            }
            if (class256.field3250.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
        }
        if (class199.field2552) {
            var1 = false;
        }
        if (class597.field8275) {
            var2 = false;
        }
        if (class446.field6285) {
            var3 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class201.method1251(100);
        }
        int var4 = -1;
        int var5 = -1;
        if (var1) {
            try {
                var4 = class442.method2604(2, (byte) -28, 1000);
            } catch (Exception var15) {
            }
        }
        int var6 = -1;
        if (var3) {
            try {
                var6 = class442.method2604(3, (byte) -94, 1000);
                if (class223.field2944.field633.method4191((byte) -123) == 3) {
                    class633 var7 = class458.field6407.method79();
                    long var8 = var7.field8782 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field8783;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class442.method2604(1, (byte) -53, 1000);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class201.method1251(arg0 + 21967);
        }
        int var11 = (int) ((float) var6 * 1.1F);
        int var12 = (int) ((float) var5 * 1.1F);
        if (var11 < var4 && var12 < var4) {
            return class441.method2598(-2679, var4);
        } else if (var12 >= var11) {
            return class167.method1053(1, false, var12);
        } else {
            return class167.method1053(3, false, var11);
        }
    }

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "(I)V", line = 233)
    public final void method2369(int arg0) {
        if (arg0 != 4098) {
            this.field5536 = null;
        }
        field5549++;
        this.field5537 = true;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)I", line = 244)
    public final int method2370(boolean arg0) {
        field5547++;
        if (!arg0) {
            this.field5536 = null;
        }
        return this.field5542;
    }

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "(I)Z", line = 255)
    public final synchronized boolean method2371(int arg0) {
        field5540++;
        if (arg0 != 4782) {
            this.field5543 = 23L;
        }
        return this.field5536.method240(-2865, this.field5543);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Ljava/lang/String;Loq;IJB)V", line = 267)
    public final synchronized void method2372(String arg0, class218 arg1, int arg2, long arg3, byte arg4) {
        field5534++;
        this.field5546 = arg0;
        this.field5542 = arg2;
        this.field5552 = arg3;
        if (arg4 >= -36) {
            this.field5545 = null;
        }
        this.field5548 = arg1;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BLlfa;)V", line = 283)
    public final synchronized void method2373(byte arg0, class334 arg1) {
        field5527++;
        this.field5545 = this.field5536;
        this.field5536 = arg1;
        if (arg0 >= -31) {
            this.method2369(-49);
        }
        this.field5543 = class97.method654((byte) 79);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V", line = 296)
    public final synchronized void method2374(byte arg0) {
        if (arg0 < 54) {
            this.field5548 = null;
        }
        field5530++;
        this.field5531 = true;
    }

    @OriginalMember(owner = "client!vba", name = "run", descriptor = "()V", line = 307)
    public final void run() {
        while (!this.field5537) {
            long var1 = class97.method654((byte) 90);
            synchronized (this) {
                try {
                    this.field5550++;
                    if (this.field5536 instanceof class22) {
                        this.field5536.method232(125, this.field5531);
                    } else {
                        long var4 = class97.method654((byte) 84);
                        if (class458.field6407 == null || this.field5545 == null || this.field5545.method238(false) == 0 || this.field5543 < var4 - ((long) this.field5545.method238(false))) {
                            if (this.field5545 != null) {
                                this.field5531 = true;
                                this.field5545.method242(-29379);
                                this.field5545 = null;
                            }
                            if (this.field5531) {
                                class452.method2653(256);
                                if (class458.field6407 != null) {
                                    class458.field6407.method166(0);
                                }
                            }
                            this.field5536.method232(92, this.field5531 || class458.field6407 != null && class458.field6407.method152());
                        } else {
                            int var6 = (int) ((var4 - this.field5543) * 255L / (long) this.field5545.method238(false));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class452.method2653(256);
                            class458.field6407.method166(0);
                            class712 var10 = class458.field6407.method70(class599.field8320, class84.field1083, true);
                            class458.field6407.method2657(126, var10);
                            this.field5545.method232(55, true);
                            class458.field6407.method62();
                            var10.method690(0, 0, 0, var8, 1);
                            class458.field6407.method2657(127, var10);
                            class458.field6407.method166(0);
                            this.field5536.method232(126, true);
                            class458.field6407.method62();
                            var10.method690(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class458.field6407 != null && !(this.field5536 instanceof class22)) {
                                class458.field6407.method2662((byte) 127);
                            }
                        } catch (class510 var18) {
                            class486.method2844((byte) -1, var18.getMessage() + " (Recovered) " + class612.field8463.method714(76), var18);
                            class462.method2730(1, true, 0);
                        }
                    }
                    Container var12;
                    if (class95.field1205 != null) {
                        var12 = class95.field1205;
                    } else if (class745.field10393 == null) {
                        var12 = class689.field9789;
                    } else {
                        var12 = class745.field10393;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class95.field1205 == var12) {
                        class95.field1205.getInsets();
                    }
                    this.field5531 = false;
                    if (class458.field6407 != null && !(this.field5536 instanceof class22) && this.field5548.method1319(true) < class218.field2769.method1319(true)) {
                        class147.method919((byte) -99);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class97.method654((byte) 72);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class517.method2965((long) var15, -111);
            }
        }
        field5533++;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLkha;)V", line = 437)
    public static final void method2375(boolean arg0, class687 arg1) {
        if (!arg0) {
            method2367(-35);
        }
        class284.field3617 = arg1.method3820("hitmarks", -1);
        field5528++;
        class34.field524 = arg1.method3820("hitbar_default", -1);
        class401.field5558 = arg1.method3820("timerbar_default", -1);
        class1.field4 = arg1.method3820("headicons_pk", -1);
        class84.field1085 = arg1.method3820("headicons_prayer", -1);
        class634.field8785 = arg1.method3820("hint_headicons", -1);
        class574.field8014 = arg1.method3820("hint_mapmarkers", -1);
        class244.field3143 = arg1.method3820("mapflag", -1);
        class463.field6706 = arg1.method3820("cross", -1);
        class462.field6703 = arg1.method3820("mapdots", -1);
        class270.field3408 = arg1.method3820("scrollbar", -1);
        class266.field3366 = arg1.method3820("name_icons", -1);
        class536.field7503 = arg1.method3820("floorshadows", -1);
        class28.field456 = arg1.method3820("compass", -1);
        class477.field6823 = arg1.method3820("otherlevel", -1);
        class449.field6310 = arg1.method3820("hint_mapedge", -1);
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)J", line = 463)
    public final long method2376(byte arg0) {
        field5541++;
        if (arg0 >= -57) {
            field5553 = 91;
        }
        return this.field5552;
    }

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "(I)Ljava/lang/String;", line = 480)
    public final String method2377(int arg0) {
        if (arg0 != -1) {
            this.field5546 = null;
        }
        field5544++;
        return this.field5546;
    }

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "(I)I", line = 494)
    public final int method2378(int arg0) {
        if (arg0 != -5925) {
            this.method2378(31);
        }
        field5532++;
        return this.field5550;
    }
}
