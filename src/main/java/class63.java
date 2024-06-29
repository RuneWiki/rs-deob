import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 extends RuntimeException {

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Ljava/lang/String;")
    public String field1336;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1345;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lue;")
    public static class143 field1348 = new class143(30);

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "[J")
    public static long[] field1351 = new long[100];

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "[J")
    public static long[] field1353 = new long[32];

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field1354 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "J")
    public static long field1352;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lmd;")
    public static class87 field1339;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Lmd;")
    public static class87 field1359;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "Ljava/awt/Frame;")
    public static Frame field1357;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V")
    public static final void method471(int arg0, boolean arg1) {
        field1350++;
        if (arg0 != -23767) {
            field1348 = null;
        }
        for (int var2 = 0; var2 < class51.field1145; var2++) {
            class67 var3 = class122.field2846[class139.field3237[var2]];
            int var4 = (class139.field3237[var2] << 14) + 536870912;
            if (var3 != null && var3.method91(78) && var3.field1428.field2305 == arg1 && var3.field1428.method735((byte) -69)) {
                int var5 = var3.field3580 >> 7;
                int var6 = var3.field3578 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field3565 == 1 && (var3.field3580 & 0x7F) == 64 && (var3.field3578 & 0x7F) == 64) {
                        if (class73.field1534[var5][var6] == class136.field3190) {
                            continue;
                        }
                        class73.field1534[var5][var6] = class136.field3190;
                    }
                    if (!var3.field1428.field2270) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class146.field3366.method743(class62.field1331, var3.field3580, var3.field3578, class65.method486(class62.field1331, (byte) -42, (var3.field3565 - 1) * 64 + var3.field3578, var3.field3565 * 64 + -64 + var3.field3580), (var3.field3565 - 1) * 64 + 60, var3, var3.field3610, var4, var3.field3584);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)Lrc;")
    public static final class121 method472(int arg0, byte arg1) {
        field1349++;
        class121 var2 = (class121) class108.field2550.method1162((long) arg0, true);
        int var3 = 23 / ((53 - arg1) / 59);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class112.field2604.method669(arg0, 10, -71);
        class121 var5 = new class121();
        var5.field2755 = arg0;
        if (var4 != null) {
            var5.method950(false, new class127(var4));
        }
        var5.method945(101);
        if (var5.field2801 != -1) {
            var5.method941(method472(var5.field2801, (byte) 127), (byte) 105, method472(var5.field2758, (byte) -114));
        }
        if (!class110.field2588 && var5.field2780) {
            var5.field2756 = 0;
            var5.field2800 = null;
            var5.field2789 = class9.field167;
            var5.field2770 = null;
        }
        class108.field2550.method1164((long) arg0, var5, (byte) 127);
        return var5;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Ltd;")
    public static final class136 method473(int arg0, int arg1, int arg2) {
        field1343++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class28.field609;
        } else if (var3 < -6) {
            return class108.field2535;
        } else if (var3 < -3) {
            return class70.field1481;
        } else if (var3 < 0) {
            return class133.field3143;
        } else if (var3 > 9) {
            return class64.field1364;
        } else if (var3 > 6) {
            return class5.field93;
        } else if (arg0 != 8374) {
            return null;
        } else if (var3 > 3) {
            return class153.field3495;
        } else if (var3 > 0) {
            return class29.field645;
        } else {
            return class101.field2418;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method474(byte arg0) {
        field1344++;
        int var1 = -91 / ((arg0 - 83) / 33);
        class8.field144.method1165((byte) -73);
        class122.field2832.method1165((byte) -73);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IZ)V")
    public static final void method475(int arg0, boolean arg1) {
        class154.field3520 = arg0;
        if (arg1) {
            field1359 = null;
        }
        field1333++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIB)I")
    public static final int method476(int arg0, int arg1, byte arg2) {
        field1342++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return arg2 == -12 ? var5 >> 19 & 0xFF : -20;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IB)Lcc;")
    public static final class18 method477(int arg0, byte arg1) {
        class18 var2 = (class18) class78.field1796.method1162((long) arg0, true);
        field1356++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = field1339.method669(arg0, 3, -35);
        int var4 = 94 / ((arg1 - 63) / 56);
        class18 var5 = new class18();
        if (var3 != null) {
            var5.method128(new class127(var3), 27);
        }
        class78.field1796.method1164((long) arg0, var5, (byte) 127);
        return var5;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static final void method478(int arg0) {
        field1335++;
        while (class4.field70.method866(class11.field179, (byte) 94) >= 11) {
            int var1 = class4.field70.method877(false, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class154.field3518[var1] == null) {
                var2 = true;
                class154.field3518[var1] = new class13();
                if (class1.field15[var1] != null) {
                    class154.field3518[var1].method95(15, class1.field15[var1]);
                }
            }
            class24.field564[class55.field1255++] = var1;
            class13 var3 = class154.field3518[var1];
            var3.field3555 = class44.field1013;
            int var4 = class4.field70.method877(false, 1);
            if (var4 == 1) {
                class108.field2532[class26.field591++] = var1;
            }
            int var5 = class4.field70.method877(false, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class4.field70.method877(false, 1);
            int var7 = class4.field70.method877(false, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class145.field3336[class4.field70.method877(false, 3)];
            if (var2) {
                var3.field3538 = var3.field3610 = var8;
            }
            var3.method1209(class24.field555.field3560[0] + var5, 128, var6 == 1, class24.field555.field3581[0] + var7);
        }
        class4.field70.method865(arg0 ^ 0x6A28);
        if (arg0 != 0) {
            field1339 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class63(Throwable arg0, String arg1) {
        this.field1336 = arg1;
        this.field1345 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public static void method479(int arg0) {
        field1357 = null;
        if (arg0 <= 75) {
            field1353 = null;
        }
        field1353 = null;
        field1339 = null;
        field1351 = null;
        field1348 = null;
        field1359 = null;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)Z")
    public static final boolean method480(int arg0) {
        field1338++;
        try {
            if (class155.field3604 == 2) {
                if (class139.field3231 == null) {
                    class139.field3231 = class82.method610(class49.field1128, class12.field227, class76.field1716);
                    if (class139.field3231 == null) {
                        return false;
                    }
                }
                if (client.field459 == null) {
                    client.field459 = new class40(class135.field3157, class91.field2156);
                }
                if (class18.field367.method580(22050, (byte) -121, client.field459, class139.field3231, class77.field1764)) {
                    class18.field367.method591(-1519024087);
                    class18.field367.method571((byte) 98, class7.field120);
                    class18.field367.method586(class59.field1289, 27176, class139.field3231);
                    class49.field1128 = null;
                    class155.field3604 = 0;
                    client.field459 = null;
                    class139.field3231 = null;
                    return true;
                }
            }
            if (arg0 != 22050) {
                field1348 = null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class18.field367.method599((byte) -119);
            class139.field3231 = null;
            class155.field3604 = 0;
            client.field459 = null;
            class49.field1128 = null;
        }
        return false;
    }
}
