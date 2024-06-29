import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class63 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[Z")
    public static boolean[] field1521 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1525 = -1;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1526 = 0;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lva;")
    private static class121 field1533 = class107.method797("No response from server)3", -10983);

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lva;")
    public static class121 field1531 = class107.method797("scrollbar", -10983);

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lva;")
    private static class121 field1539 = class107.method797("Loading title screen )2 ", -10983);

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lva;")
    public static class121 field1529 = field1533;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lva;")
    public static class121 field1523 = field1539;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lbc;")
    public static class10 field1522;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lbc;")
    public static class10 field1527;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lw;")
    public static class125 field1530;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lw;")
    public static class125 field1534;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lw;")
    public static class125 field1540;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 6)
    public static final void method452(int arg0) {
        if (class48.field1149) {
            class48.field1149 = false;
            class18.method148(false);
            class9.field140 = true;
            class97.field2168 = true;
            class91.field2070 = true;
            class25.field630 = true;
        }
        field1524++;
        class91.method625(true);
        if (class100.field2245 && class13.field240 == 1) {
            class97.field2168 = true;
        }
        if (arg0 != 17) {
            field1540 = null;
        }
        if (class69.field1651 != -1) {
            boolean var1 = class127.method994(class69.field1651, -1);
            if (var1) {
                class97.field2168 = true;
            }
        }
        if (class126.field2884 == 2) {
            class97.field2168 = true;
        }
        if (class90.field2048 == 2) {
            class97.field2168 = true;
        }
        if (class97.field2168) {
            class97.field2168 = false;
            class40.method265(true);
        }
        if (class90.field2038 == -1) {
            class29.field762.field481 = class50.field1187 - class33.field811 - 77;
            if (class34.field822 > 448 && class34.field822 < 560 && class19.field514 > 332) {
                class108.method801(class19.field514 - 357, 77, arg0 - 141, -1, 463, class29.field762, class34.field822 - 17, 0, class50.field1187);
            }
            int var2 = class50.field1187 - class29.field762.field481 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class50.field1187 - 77) {
                var2 = class50.field1187 - 77;
            }
            if (class33.field811 != var2) {
                class33.field811 = var2;
                class9.field140 = true;
            }
        }
        if (class90.field2038 == -1 && class1.field16 == 3) {
            int var3 = class67.field1620 * 14 + 7;
            class29.field762.field481 = class60.field1446;
            if (class34.field822 > 448 && class34.field822 < 560 && class19.field514 > 332) {
                class108.method801(class19.field514 - 357, 77, arg0 ^ 0x64, -1, 463, class29.field762, class34.field822 - 17, 0, var3);
            }
            int var4 = class29.field762.field481;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > var3 - 77) {
                var4 = var3 - 77;
            }
            if (class60.field1446 != var4) {
                class9.field140 = true;
                class60.field1446 = var4;
            }
        }
        if (class90.field2038 != -1) {
            boolean var5 = class127.method994(class90.field2038, -1);
            if (var5) {
                class9.field140 = true;
            }
        }
        if (class126.field2884 == 3) {
            class9.field140 = true;
        }
        if (class90.field2048 == 3) {
            class9.field140 = true;
        }
        if (class64.field1544 != null) {
            class9.field140 = true;
        }
        if (class100.field2245 && class13.field240 == 2) {
            class9.field140 = true;
        }
        if (class9.field140) {
            class9.field140 = false;
            class84.method592(-17910);
        }
        class120.method927(arg0 ^ 0x31);
        if (class118.field2677 != -1) {
            class25.field630 = true;
        }
        if (class25.field630) {
            if (class118.field2677 != -1 && class28.field716 == class118.field2677) {
                class118.field2677 = -1;
                class13.field235++;
                class60.field1437.method622(225, true);
                class60.field1437.method836(0, class28.field716);
            }
            class25.field630 = false;
            class9.field146 = true;
            class43.method286(class115.field2614 % 20 >= 10 ? class118.field2677 : -1, arg0 - 14676, class42.field956, class28.field716, class69.field1651 == -1);
        }
        if (class91.field2070) {
            class9.field146 = true;
            class91.field2070 = false;
            class16.method132(class4.field69, class19.field492, field1526, (byte) 90, class119.field2757);
        }
        class128.field2955 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ld;I)Z", line = 168)
    public static final boolean method453(class19 arg0, int arg1) {
        field1528++;
        int var2 = arg0.field518;
        if (arg1 <= 81) {
            return false;
        } else if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 >= 101) {
                var2 -= 101;
            } else {
                var2--;
            }
            class33.field803++;
            class129.method1005(0, 0, 48, 0, class113.method866((byte) -47, new class121[] { class79.field1841, class80.field1855, class128.field2962[var2] }), -46);
            class52.field1202++;
            class129.method1005(0, 0, 55, 0, class113.method866((byte) -91, new class121[] { class41.field914, class80.field1855, class128.field2962[var2] }), -96);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class91.field2058++;
            class129.method1005(0, 0, 30, 0, class113.method866((byte) -110, new class121[] { class79.field1841, class80.field1855, arg0.field468 }), -127);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 232)
    public static void method454(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field1539 = null;
        field1522 = null;
        field1530 = null;
        field1531 = null;
        field1533 = null;
        field1540 = null;
        field1534 = null;
        field1523 = null;
        field1529 = null;
        field1527 = null;
        field1521 = null;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V", line = 266)
    public static final void method455(int arg0) {
        class125.method983(17696);
        field1532++;
        if (class14.field253 != 10) {
            return;
        }
        int var1 = class21.field568;
        int var2 = class15.field280 - 202;
        if (arg0 <= 93) {
            field1530 = null;
        }
        int var3 = class82.field1909 - 171;
        if (class54.field1240 == 0) {
            byte var4 = 120;
            byte var5 = 100;
            if (var1 == 1 && var2 >= var5 - 75 && var5 + 75 >= var2 && var3 >= var4 - 20 && var4 + 20 >= var3) {
                class54.field1240 = 3;
                class42.field966 = 0;
            }
            short var6 = 260;
            if (var1 == 1 && var6 - 75 <= var2 && var6 + 75 >= var2 && var3 >= var4 - 20 && var4 + 20 >= var3) {
                class54.field1240 = 2;
                class42.field966 = 0;
                class18.field394 = class18.field382;
                class18.field384 = class66.field1593;
                class18.field417 = class18.field367;
            }
        } else if (class54.field1240 == 2) {
            byte var7 = 100;
            byte var8 = 60;
            short var9 = 150;
            int var15 = var8 + 30;
            if (var1 == 1 && var3 >= var15 - 15 && var3 < var15) {
                class42.field966 = 0;
            }
            var15 += 15;
            if (var1 == 1 && var15 - 15 <= var3 && var3 < var15) {
                class42.field966 = 1;
            }
            var15 += 15;
            if (var1 == 1 && var2 >= var7 - 75 && var7 + 75 >= var2 && var3 >= var9 - 20 && var3 <= var9 + 20) {
                class18.field365 = class18.field365.method937(-61).method963(-14767);
                class56.method410(class18.field373, class18.field408, class115.field2608, -4774);
                class60.method437((byte) 67, 20);
            } else {
                short var10 = 260;
                if (var1 == 1 && var2 >= var10 - 75 && var2 <= var10 + 75 && var9 - 20 <= var3 && var9 + 20 >= var3) {
                    class54.field1240 = 0;
                    class18.field365 = class18.field378;
                    class18.field406 = class18.field378;
                }
                while (true) {
                    boolean var11;
                    label141: do {
                        while (class96.method648(true)) {
                            var11 = false;
                            for (int var12 = 0; class64.field1548.method942(36) > var12; var12++) {
                                if (class120.field2769 == class64.field1548.method947(true, var12)) {
                                    var11 = true;
                                    break;
                                }
                            }
                            if (class42.field966 != 0) {
                                continue label141;
                            }
                            if (class43.field991 == 85 && class18.field365.method942(36) > 0) {
                                class18.field365 = class18.field365.method957(class18.field365.method942(36) - 1, true, 0);
                            }
                            if (class43.field991 == 84 || class43.field991 == 80) {
                                class42.field966 = 1;
                            }
                            if (var11 && class18.field365.method942(36) < 12) {
                                class18.field365 = class18.field365.method958(38, class120.field2769);
                            }
                        }
                        return;
                    } while (class42.field966 != 1);
                    if (class43.field991 == 85 && class18.field406.method942(36) > 0) {
                        class18.field406 = class18.field406.method957(class18.field406.method942(36) - 1, true, 0);
                    }
                    if (class43.field991 == 84 || class43.field991 == 80) {
                        class42.field966 = 0;
                    }
                    if (var11 && class18.field406.method942(36) < 20) {
                        class18.field406 = class18.field406.method958(38, class120.field2769);
                    }
                }
            }
        } else if (class54.field1240 == 3) {
            short var13 = 150;
            short var14 = 180;
            if (var1 == 1 && var2 >= var14 - 75 && var14 + 75 >= var2 && var13 - 20 <= var3 && var3 <= var13 + 20) {
                class54.field1240 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Lcc;", line = 426)
    public static final class16 method456(byte arg0, int arg1) {
        field1536++;
        class16 var2 = (class16) class26.field651.method345(111, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = -63 % ((-arg0 - 42) / 32);
        byte[] var4 = class12.field203.method315(9, true, arg1);
        class16 var5 = new class16();
        var5.field334 = arg1;
        if (var4 != null) {
            var5.method128((byte) -110, new class113(var4));
        }
        var5.method134(0);
        class26.field651.method350((byte) 123, var5, (long) arg1);
        return var5;
    }
}
