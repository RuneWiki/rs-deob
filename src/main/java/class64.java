import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class64 extends class37 {

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    private int field1535 = 4096;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "Z")
    private boolean field1536 = true;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "Ldd;")
    private static class35 field1530 = class180.method1196((byte) 126, "OFF");

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "Ldd;")
    public static class35 field1532 = field1530;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "Lld;")
    public static class111 field1528 = new class111(30);

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "Ldd;")
    private static class35 field1542 = class180.method1196((byte) -73, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    public static int field1539 = 0;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "[Ldd;")
    public static class35[] field1541 = new class35[500];

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "Ldd;")
    private static class35 field1543 = class180.method1196((byte) -26, "FULL");

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "Ldd;")
    public static class35 field1540 = field1543;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "Ldd;")
    public static class35 field1544 = field1542;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "Loa;")
    public static class135 field1538;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public static final void method530(int arg0) {
        ++field1529;
        Object var1 = class97.field2149;
        synchronized (class97.field2149) {
            if (arg0 != 2103893900) {
                field1544 = null;
            }
            if (~class69.field1673 == -1) {
                class182.field3734.method387(new class147(), false, 5);
            }
            class69.field1673 = 600;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class64() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field1534;
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (arg1 <= 5) {
            return null;
        } else {
            if (super.field832.field1978) {
                int[] var4 = this.method369(0, arg0 - 1 & class105.field2348, (byte) 127);
                int[] var5 = this.method369(0, arg0, (byte) 124);
                int[] var6 = this.method369(0, arg0 - -1 & class105.field2348, (byte) 126);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; ~var10 > ~class72.field1719; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field1535;
                    int var12 = (var5[class71.field1691 & var10 + 1] + -var5[var10 + -1 & class71.field1691]) * this.field1535;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var14 * var14 >> 12;
                    int var16 = var13 * var13 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((var16 + 4096 + var15) / 4096)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var19 = 16777216 / var17;
                        var20 = var12 / var17;
                        var18 = var11 / var17;
                    }
                    if (this.field1536) {
                        var18 = 2048 - -(var18 >> 1);
                        var19 = (var19 >> 1) + 2048;
                        var20 = 2048 - -(var20 >> 1);
                    }
                    var7[var10] = var20;
                    var8[var10] = var18;
                    var9[var10] = var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(III)V")
    public static final void method531(int arg0, int arg1, int arg2) {
        ++field1531;
        if (arg1 == 1) {
            class179 var3 = client.method281((byte) 95, arg2);
            int var4 = var3.field3668;
            int var5 = var3.field3669;
            int var6 = var3.field3667;
            int var7 = class176.field3588[-var4 + var5];
            if (~arg0 > -1 || ~var7 > ~arg0) {
                arg0 = 0;
            }
            int var8 = var7 << var4;
            class115.field2557[var6] = class152.method1027(class208.method1372(var8, arg0 << var4), class208.method1372(~var8, class115.field2557[var6]));
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field1527;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field1536 = ~arg2.method221(-109) == -2;
            }
        } else {
            this.field1535 = arg2.method256((byte) -78);
        }
        if (arg1 != 1) {
            field1541 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public static void method532(int arg0) {
        field1538 = null;
        field1544 = null;
        field1540 = null;
        if (arg0 == 0) {
            field1528 = null;
            field1541 = null;
            field1542 = null;
            field1532 = null;
            field1530 = null;
            field1543 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)Z")
    public static final boolean method533(int arg0, int arg1) {
        ++field1533;
        if (~arg1 <= -98 && ~arg1 >= -123) {
            return true;
        } else if (~arg1 <= -66 && arg1 <= 90) {
            return true;
        } else {
            if (arg0 != -58) {
                method530(75);
            }
            return ~arg1 <= -49 && ~arg1 >= -58;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILkd;BI)V")
    public static final void method534(int arg0, int arg1, class102 arg2, byte arg3, int arg4) {
        ++field1537;
        if (arg3 > -109) {
            field1543 = null;
        }
        if (class71.field1704 != arg2) {
            if (class59.field1469 < 400) {
                class35 var5;
                if (~arg2.field2273 == -1) {
                    var5 = class63.method529(new class35[] { arg2.field2254, class39.method378(8, class71.field1704.field2262, arg2.field2262), class200.field3999, class24.field466, class3.method19(arg2.field2262, -29578), class35.field768 }, (byte) 62);
                } else {
                    var5 = class63.method529(new class35[] { arg2.field2254, class200.field3999, class30.field599, class3.method19(arg2.field2273, -29578), class35.field768 }, (byte) 120);
                }
                if (class128.field2765 == 1) {
                    class15.method125(arg1, class63.method529(new class35[] { class159.field3233, class132.field2837, var5 }, (byte) 114), -21056, class63.field1516, (short) 34, arg4, (long) arg0);
                    ++class20.field405;
                } else if (!class130.field2799) {
                    for (int var6 = 7; ~var6 <= -1; --var6) {
                        if (class25.field512[var6] != null) {
                            boolean var7 = false;
                            ++class28.field581;
                            short var8 = 0;
                            if (!class25.field512[var6].method337(122, class124.field2721)) {
                                if (class88.field1953[var6]) {
                                    var8 = 2000;
                                }
                            } else {
                                if (~class71.field1704.field2262 > ~arg2.field2262) {
                                    var8 = 2000;
                                }
                                if (~class71.field1704.field2283 != -1 && arg2.field2283 != 0) {
                                    if (~class71.field1704.field2283 != ~arg2.field2283) {
                                        var8 = 0;
                                    } else {
                                        var8 = 2000;
                                    }
                                }
                            }
                            short var9 = class71.field1699[var6];
                            short var10 = (short) (var8 + var9);
                            class15.method125(arg1, class63.method529(new class35[] { class115.field2569, var5 }, (byte) 115), -21056, class25.field512[var6], var10, arg4, (long) arg0);
                        }
                    }
                } else if (~(class123.field2700 & 8) == -9) {
                    class15.method125(arg1, class63.method529(new class35[] { class165.field3343, class132.field2837, var5 }, (byte) 56), -21056, class125.field2736, (short) 23, arg4, (long) arg0);
                    ++class36.field798;
                }
                for (int var11 = 0; var11 < class59.field1469; ++var11) {
                    if (class165.field3340[var11] == 4) {
                        class183.field3756[var11] = class63.method529(new class35[] { class115.field2569, var5 }, (byte) 84);
                        return;
                    }
                }
            }
        }
    }
}
