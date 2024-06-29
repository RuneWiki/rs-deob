import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lmb;")
    public static class84 field700 = class79.method672(true, "(Udns");

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lmb;")
    public static class84 field704 = class79.method672(true, "scape main");

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field701 = -1;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field703 = 0;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lsa;")
    public static class119 field702 = new class119(30);

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "[I")
    public static int[] field709 = new int[25];

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[J")
    public static long[] field710 = new long[200];

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Z")
    public static boolean field708 = false;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lmb;")
    private static class84 field711 = class79.method672(true, "Loaded textures");

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lmb;")
    public static class84 field714 = field711;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lmb;")
    public static class84 field712 = class79.method672(true, "Hidden)2use");

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lmb;")
    public static class84 field713 = class79.method672(true, "@gr2@");

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public static final void method225(int arg0, int arg1) {
        field705++;
        if (arg0 >= -90) {
            method228(77);
        }
        class62.field1544 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lia;I)V")
    public static final void method226(class57 arg0, int arg1) {
        field706++;
        int var2 = arg0.field1382;
        if (var2 >= 1 && var2 <= 100 || !(var2 < 701 || var2 > 800)) {
            if (class77.field1933 == 0) {
                if (var2 == 1) {
                    arg0.field1377 = class123.field2971;
                    arg0.field1384 = 0;
                    return;
                }
                if (var2 == 2) {
                    arg0.field1377 = class115.field2774;
                    arg0.field1384 = 0;
                    return;
                }
            }
            if (class77.field1933 == 1) {
                if (var2 == 1) {
                    arg0.field1384 = 0;
                    arg0.field1377 = class124.field3004;
                    return;
                }
                if (var2 == 2) {
                    arg0.field1384 = 0;
                    arg0.field1377 = class115.field2776;
                    return;
                }
                if (var2 == 3) {
                    arg0.field1377 = class76.field1905;
                    arg0.field1384 = 0;
                    return;
                }
            }
            if (var2 > 700) {
                var2 -= 601;
            } else {
                var2--;
            }
            int var3 = class125.field3024;
            if (class77.field1933 != 2) {
                var3 = 0;
            }
            if (var2 >= var3) {
                arg0.field1377 = class95.field2361;
                arg0.field1384 = 0;
            } else {
                arg0.field1377 = class27.field646[var2];
                arg0.field1384 = 1;
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 <= 800) {
                var2 -= 101;
            } else {
                var2 -= 701;
            }
            int var4 = class125.field3024;
            if (class77.field1933 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field1377 = class95.field2361;
                arg0.field1384 = 0;
            } else {
                if (class71.field1741[var2] == 0) {
                    arg0.field1377 = class51.method408(new class84[] { class75.field1838, class37.field828 }, -88);
                } else if (class71.field1741[var2] >= 5000) {
                    if (class71.field1741[var2] == class77.field1944) {
                        arg0.field1377 = class51.method408(new class84[] { class108.field2612, class70.field1712, class93.method787(22245, class71.field1741[var2] - 5000) }, arg1 ^ 0xFFFFFF86);
                    } else {
                        arg0.field1377 = class51.method408(new class84[] { class96.field2382, class70.field1712, class93.method787(22245, class71.field1741[var2] - 5000) }, 102);
                    }
                } else if (class71.field1741[var2] == class77.field1944) {
                    arg0.field1377 = class51.method408(new class84[] { class108.field2612, class88.field2216, class93.method787(arg1 + 22243, class71.field1741[var2]) }, -38);
                } else {
                    arg0.field1377 = class51.method408(new class84[] { class96.field2382, class88.field2216, class93.method787(22245, class71.field1741[var2]) }, -34);
                }
                arg0.field1384 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class125.field3024;
            if (class77.field1933 != 2) {
                var5 = 0;
            }
            arg0.field1314 = var5 * 15 + 20;
            if (arg0.field1314 <= arg0.field1332) {
                arg0.field1314 = arg0.field1332 + 1;
            }
        } else {
            if (arg1 != 2) {
                field710 = null;
            }
            if (var2 >= 401 && var2 <= 500) {
                var2 -= 401;
                if (var2 == 0 && class77.field1933 == 0) {
                    arg0.field1384 = 0;
                    arg0.field1377 = class117.field2793;
                } else if (var2 == 1 && class77.field1933 == 0) {
                    arg0.field1384 = 0;
                    arg0.field1377 = class115.field2774;
                } else {
                    int var6 = class86.field2133;
                    if (class77.field1933 == 0) {
                        var6 = 0;
                    }
                    if (var6 <= var2) {
                        arg0.field1384 = 0;
                        arg0.field1377 = class95.field2361;
                    } else {
                        arg0.field1377 = class15.method91(-20821, class71.field1747[var2]).method704(-68);
                        arg0.field1384 = 1;
                    }
                }
            } else if (var2 == 503) {
                arg0.field1314 = class86.field2133 * 15 + 20;
                if (arg0.field1332 >= arg0.field1314) {
                    arg0.field1314 = arg0.field1332 + 1;
                }
            } else if (var2 == 324) {
                if (class24.field563 == -1) {
                    class22.field530 = arg0.field1440;
                    class24.field563 = arg0.field1321;
                }
                if (class44.field966.field1170) {
                    arg0.field1321 = class24.field563;
                } else {
                    arg0.field1321 = class22.field530;
                }
            } else if (var2 == 325) {
                if (class24.field563 == -1) {
                    class22.field530 = arg0.field1440;
                    class24.field563 = arg0.field1321;
                }
                if (class44.field966.field1170) {
                    arg0.field1321 = class22.field530;
                } else {
                    arg0.field1321 = class24.field563;
                }
            } else if (var2 == 327) {
                arg0.field1381 = 150;
                arg0.field1319 = (int) (Math.sin((double) class5.field100 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1355 = 0;
                arg0.field1430 = 5;
            } else if (var2 == 328) {
                arg0.field1381 = 150;
                arg0.field1319 = (int) (Math.sin((double) class5.field100 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1430 = 5;
                arg0.field1355 = 1;
            } else if (var2 == 600) {
                arg0.field1377 = class51.method408(new class84[] { class95.field2345, client.field468 }, -56);
            } else if (var2 == 620) {
                if (class102.field2478 < 1) {
                    arg0.field1377 = class95.field2361;
                } else if (class20.field411) {
                    arg0.field1377 = class43.field957;
                    arg0.field1316 = 16711680;
                } else {
                    arg0.field1316 = 16777215;
                    arg0.field1377 = class53.field1222;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static void method227(boolean arg0) {
        field700 = null;
        field713 = null;
        if (arg0) {
            method228(28);
        }
        field714 = null;
        field712 = null;
        field711 = null;
        field710 = null;
        field702 = null;
        field709 = null;
        field704 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static final void method228(int arg0) {
        if (arg0 >= -50) {
            field709 = null;
        }
        for (class59 var1 = (class59) class62.field1536.method104((byte) 101); var1 != null; var1 = (class59) class62.field1536.method107(-2)) {
            if (var1.field1461 != null) {
                var1.method519(true);
            }
        }
        field707++;
    }
}
