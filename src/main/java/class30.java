import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class30 extends class215 {

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
    private int field413 = 4096;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
    private int field418 = 4096;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    private int field410 = 4096;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "Lkg;")
    public static class103 field416;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method168(byte arg0, Throwable arg1, String arg2) {
        ++field411;
        if (arg0 > -6) {
            method171((class264) null, 95, -63, 59);
        }
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class147.method1017(arg1, (byte) 74);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class78.method434(var3, (byte) -109);
            String var4 = class45.method255(var3, -88, "%3a", ":");
            String var5 = class45.method255(var4, -111, "%40", "@");
            String var6 = class45.method255(var5, -107, "%26", "&");
            String var7 = class45.method255(var6, -110, "%23", "#");
            if (class115.field1642.field609 != null) {
                class243 var8 = class115.field1642.method268(-48, new URL(class115.field1642.field609.getCodeBase(), "clienterror.ws?c=" + class285.field4536 + "&u=" + class121.field1729 + "&v1=" + class48.field611 + "&v2=" + class48.field600 + "&e=" + var7));
                while (~var8.field3995 == -1) {
                    class115.method752((byte) -62, 1L);
                }
                if (~var8.field3995 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field3992;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lpb;IIIII)V")
    public static final void method169(class264 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class34.field444 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class88.field1076) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class59.field752 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class246 var14 = class46.field585[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class17.field209[var11][var12 + 1][var13] + class17.field209[var11][var12][var13] + class17.field209[var11][var12][var13 + 1] + class17.field209[var11][var12 + 1][var13 + 1]) / 4 - (class17.field209[arg1][arg2 + 1][arg3] + class17.field209[arg1][arg2][arg3] + class17.field209[arg1][arg2][arg3 + 1] + class17.field209[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class187 var16 = var14.field4046;
                                    if (var16 != null) {
                                        if (var16.field2983.method1440()) {
                                            arg0.method1423(var16.field2983, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2990 != null && var16.field2990.method1440()) {
                                            arg0.method1423(var16.field2990, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4044; ++var17) {
                                        class19 var18 = var14.field4038[var17];
                                        if (var18 != null && var18.field234.method1440() && (var18.field240 == var12 || var7 == var12) && (var18.field235 == var13 || var9 == var13)) {
                                            int var19 = var18.field239 - var18.field240 + 1;
                                            int var20 = var18.field233 - var18.field235 + 1;
                                            arg0.method1423(var18.field234, (var18.field240 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field235 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)V")
    public static void method170(byte arg0) {
        int var1 = -99 % ((arg0 - 42) / 32);
        field416 = null;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591) {
            int[][] var4 = this.method1504(-101, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class244.field4015 < ~var11; ++var11) {
                int var12 = var8[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (var12 == var14 && ~var12 == ~var13) {
                    var7[var11] = this.field410 * var14 >> 12;
                    var9[var11] = this.field413 * var12 >> 12;
                    var10[var11] = this.field418 * var13 >> 12;
                } else {
                    var7[var11] = this.field410;
                    var9[var11] = this.field413;
                    var10[var11] = this.field418;
                }
            }
        }
        if (arg0 != -1) {
            field416 = null;
        }
        ++field417;
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lpb;III)V")
    public static final void method171(class264 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class88.field1076) {
            class246 var4 = class46.field585[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4056 != null && var4.field4056.field127.method1440()) {
                arg0.method1423(var4.field4056.field127, 128, 0, 0, true);
            }
        }
        if (arg3 < class88.field1076) {
            class246 var5 = class46.field585[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4056 != null && var5.field4056.field127.method1440()) {
                arg0.method1423(var5.field4056.field127, 0, 0, 128, true);
            }
        }
        if (arg2 < class88.field1076 && arg3 < class59.field752) {
            class246 var6 = class46.field585[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4056 != null && var6.field4056.field127.method1440()) {
                arg0.method1423(var6.field4056.field127, 128, 0, 128, true);
            }
        }
        if (arg2 < class88.field1076 && arg3 > 0) {
            class246 var7 = class46.field585[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4056 != null && var7.field4056.field127.method1440()) {
                arg0.method1423(var7.field4056.field127, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field419;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field418 = arg2.method549(255);
                }
            } else {
                this.field413 = arg2.method549(255);
            }
        } else {
            this.field410 = arg2.method549(255);
        }
        if (arg0 != 1521146348) {
            method169((class264) null, 112, 78, 92, -29, -64);
        }
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
    public static final void method172(int arg0) {
        int var1 = -9 / ((82 - arg0) / 42);
        ++field414;
        class81.field1004.method1699(0);
        class21.field266.method1699(0);
        class235.field3886.method1699(0);
        class221.field3560.method1699(0);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class30() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lpd;I)V")
    public static final void method173(class96 arg0, int arg1) {
        ++field415;
        if (~(arg0.field1218.length + -arg0.field1228) <= -2) {
            int var2 = arg0.method584(255);
            if (var2 >= 0 && ~var2 >= -12) {
                byte var3;
                if (~var2 == -12) {
                    var3 = 33;
                } else if (~var2 == -11) {
                    var3 = 32;
                } else if (var2 != 9) {
                    if (var2 != 8) {
                        if (var2 == 7) {
                            var3 = 29;
                        } else if (var2 != 6) {
                            if (var2 != 5) {
                                if (var2 == 4) {
                                    var3 = 24;
                                } else if (var2 != 3) {
                                    if (~var2 != -3) {
                                        if (var2 != 1) {
                                            var3 = 19;
                                        } else {
                                            var3 = 23;
                                        }
                                    } else {
                                        var3 = 22;
                                    }
                                } else {
                                    var3 = 23;
                                }
                            } else {
                                var3 = 28;
                            }
                        } else {
                            var3 = 28;
                        }
                    } else {
                        var3 = 30;
                    }
                } else {
                    var3 = 31;
                }
                if (var3 <= arg0.field1218.length - arg0.field1228) {
                    class32.field430 = arg0.method584(255);
                    if (~class32.field430 > -2) {
                        class32.field430 = 1;
                    } else if (~class32.field430 < -5) {
                        class32.field430 = 4;
                    }
                    class200.method1397(arg0.method584(arg1 + 127) == 1, -95);
                    class137.field2207 = arg0.method584(255) == 1;
                    class96.field1281 = ~arg0.method584(255) == -2;
                    class98.field1321 = arg0.method584(255) == 1;
                    class259.field4204 = ~arg0.method584(255) == -2;
                    class285.field4525 = ~arg0.method584(arg1 + 127) == -2;
                    class196.field3131 = arg0.method584(255) == 1;
                    class113.field1624 = ~arg0.method584(arg1 ^ 127) == -2;
                    class160.field2549 = arg0.method584(255);
                    if (class160.field2549 > 2) {
                        class160.field2549 = 2;
                    }
                    if (arg1 != 128) {
                        field416 = null;
                    }
                    if (~var2 > -3) {
                        class213.field3429 = arg0.method584(255) == 1;
                        arg0.method584(255);
                    } else {
                        class213.field3429 = ~arg0.method584(255) == -2;
                    }
                    class82.field1021 = ~arg0.method584(255) == -2;
                    class39.field486 = arg0.method584(255) == 1;
                    class194.field3109 = arg0.method584(255);
                    if (~class194.field3109 < -3) {
                        class194.field3109 = 2;
                    }
                    class22.field294 = class194.field3109;
                    class212.field3405 = ~arg0.method584(arg1 + 127) == -2;
                    class272.field4350 = arg0.method584(255);
                    if (class272.field4350 > 127) {
                        class272.field4350 = 127;
                    }
                    class218.field3493 = arg0.method584(255);
                    class63.field818 = arg0.method584(arg1 + 127);
                    if (~class63.field818 < -128) {
                        class63.field818 = 127;
                    }
                    if (~var2 <= -2) {
                        class98.field1315 = arg0.method549(arg1 ^ 127);
                        class138.field2213 = arg0.method549(255);
                    }
                    if (~var2 <= -4 && ~var2 > -7) {
                        arg0.method584(255);
                    }
                    if (var2 >= 4) {
                        int var4 = arg0.method584(255);
                        if (class202.field3202 < 96) {
                            var4 = 0;
                        }
                        class268.method1801(var4);
                    }
                    if (~var2 <= -6) {
                        class74.field933 = arg0.method597(arg1 + -1197332696);
                    }
                    if (~var2 <= -7) {
                        class67.field855 = arg0.method584(255);
                    }
                    if (var2 >= 7) {
                        class272.field4348 = ~arg0.method584(255) == -2;
                    }
                    if (var2 >= 8) {
                        class129.field2065 = ~arg0.method584(255) == -2;
                    }
                    if (~var2 <= -10) {
                        class95.field1201 = arg0.method584(arg1 + 127);
                    }
                    if (~var2 <= -11) {
                        class71.field905 = ~arg0.method584(255) != -1;
                    }
                    if (var2 >= 11) {
                        class85.field1050 = arg0.method584(255) != 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILbl;)I")
    public static final int method174(int arg0, class259 arg1) {
        ++field412;
        int var2 = arg1.field4205;
        class154 var3 = arg1.method1636(0);
        if (arg0 != 19058) {
            field416 = null;
        }
        if (arg1.field3793 == var3.field2405) {
            var2 = arg1.field4190;
        } else if (~arg1.field3793 != ~var3.field2385 && arg1.field3793 != var3.field2382 && ~arg1.field3793 != ~var3.field2397 && ~arg1.field3793 != ~var3.field2389) {
            if (arg1.field3793 == var3.field2390 || ~arg1.field3793 == ~var3.field2416 || ~arg1.field3793 == ~var3.field2421 || ~arg1.field3793 == ~var3.field2400) {
                var2 = arg1.field4209;
            }
        } else {
            var2 = arg1.field4201;
        }
        return var2;
    }
}
