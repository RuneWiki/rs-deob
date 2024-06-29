import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class69 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1545 = 0;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1546 = 0;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1551 = 78;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field1550 = -1;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lec;")
    public static class28 field1549 = class28.method210(-46, "button near the top of that page)3");

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lec;")
    public static class28 field1554 = class28.method210(-46, "Cancel");

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Lec;")
    public static class28 field1556 = class28.method210(-46, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lcc;")
    public static class16 field1543;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)V")
    public static final void method540(int arg0, long arg1) {
        field1544++;
        if (arg1 == 0L) {
            return;
        }
        if (class36.field829 >= 100 && class96.field2130 != 1) {
            class87.method645(-34, class83.field1904, class125.field2721, 0);
        } else if (class36.field829 >= 200) {
            class87.method645(101, class83.field1904, class125.field2721, 0);
        } else {
            class28 var3 = class46.method365(-61, arg1).method212((byte) 124);
            for (int var4 = 0; var4 < class36.field829; var4++) {
                if (class1.field5[var4] == arg1) {
                    class87.method645(-45, class68.method537(1, new class28[] { var3, class46.field1038 }), class125.field2721, 0);
                    return;
                }
            }
            for (int var5 = 0; var5 < field1546; var5++) {
                if (class5.field92[var5] == arg1) {
                    class87.method645(arg0 ^ 0x3287, class68.method537(1, new class28[] { class105.field2218, var3, class74.field1630 }), class125.field2721, 0);
                    return;
                }
            }
            if (!var3.method219(arg0 + 13053, class37.field848.field919)) {
                class23.field516++;
                if (arg0 != -12942) {
                    method544(123, -38, true, null);
                }
                class93.field2048[class36.field829] = var3;
                class1.field5[class36.field829] = arg1;
                class61.field1348[class36.field829] = 0;
                class36.field829++;
                class30.field646 = true;
                class5.field85.method161((byte) 101, 98);
                class5.field85.method854(false, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lqc;")
    public static final class98 method541(int arg0, int arg1) {
        field1553++;
        class98 var2 = (class98) class42.field888.method660(-2, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class98 var3 = class20.method140(arg1, 26, false, class17.field321, class91.field2000);
        if (arg0 < 112) {
            return null;
        } else {
            if (var3 != null) {
                class42.field888.method666(false, var3, (long) arg1);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
    public static final void method542(int arg0, int arg1) {
        if (arg0 != 22858) {
            return;
        }
        if (arg1 == -3) {
            class25.method175(class36.field793, class36.field792, -101);
        } else if (arg1 == -2) {
            class25.method175(class125.field2721, class14.field268, -124);
        } else if (arg1 == -1) {
            class25.method175(class28.field590, class36.field792, arg0 - 22969);
        } else if (arg1 == 3) {
            class25.method175(class125.field2721, class118.field2525, -112);
        } else if (arg1 == 4) {
            class25.method175(class129.field2793, class77.field1726, arg0 - 22962);
        } else if (arg1 == 5) {
            class25.method175(class22.field509, class3.field43, 31);
        } else if (arg1 == 6) {
            class25.method175(class48.field1121, class124.field2703, arg0 - 22955);
        } else if (arg1 == 7) {
            class25.method175(class3.field44, class43.field942, -98);
        } else if (arg1 == 8) {
            class25.method175(class1.field4, class65.field1478, arg0 ^ 0xFFFFA6EB);
        } else if (arg1 == 9) {
            class25.method175(class129.field2785, class25.field537, arg0 - 22958);
        } else if (arg1 == 10) {
            class25.method175(class1.field4, class79.field1833, 115);
        } else if (arg1 == 12) {
            class25.method175(class16.field318, class3.field34, -108);
        } else if (arg1 == 13) {
            class25.method175(client.field398, class36.field792, -114);
        } else if (arg1 == 14) {
            class25.method175(class129.field2776, class78.field1819, arg0 ^ 0x5913);
        } else if (arg1 == 16) {
            class25.method175(class112.field2417, class78.field1819, -126);
        } else if (arg1 == 17) {
            class25.method175(class77.field1730, class62.field1376, 106);
        } else if (arg1 == 18) {
            class25.method175(class123.field2666, class50.field1173, -111);
        } else if (arg1 == 20) {
            class25.method175(class23.field527, class36.field792, -116);
        } else if (arg1 == 22) {
            class25.method175(class124.field2696, class77.field1732, -127);
        } else if (arg1 == 23) {
            class25.method175(class98.field2165, class78.field1819, -93);
        } else if (arg1 == 24) {
            class25.method175(class126.field2729, class1.field8, 84);
        } else if (arg1 == 25) {
            class25.method175(class40.field865, class36.field792, -123);
        } else if (arg1 == 26) {
            class25.method175(class21.field457, class37.field850, -93);
        } else {
            class25.method175(class68.method537(1, new class28[] { class88.field1969, class5.method25(6366, arg1) }), class36.field792, 80);
        }
        field1547++;
        class74.method574(0, 10);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static void method543(boolean arg0) {
        field1554 = null;
        field1556 = null;
        field1549 = null;
        if (arg0) {
            field1543 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZLbb;)V")
    public static final void method544(int arg0, int arg1, boolean arg2, class9 arg3) {
        field1555++;
        class42 var4 = class114.field2426;
        synchronized (class114.field2426) {
            boolean var5 = false;
            if (arg0 > -2) {
                field1543 = null;
            }
            for (class105 var6 = (class105) class114.field2426.method326(0); var6 != null; var6 = (class105) class114.field2426.method325((byte) 124)) {
                if (var6.field2217 == arg1 && var6.field2215 == arg3) {
                    if (var6.field2222 == 1) {
                        return;
                    }
                    if (var6.field2222 == 0) {
                        var5 = true;
                    }
                }
                if (var6.field2222 == 2) {
                    var5 = true;
                }
            }
            if (arg2 && !var5 && class21.field481) {
                arg3.field2634[arg1] = arg3.field152.method502((byte) 15, arg1);
                if (arg3.field2634[arg1] == null) {
                    arg3.field173[arg1] = false;
                }
                return;
            }
            class105 var7 = new class105();
            var7.field2217 = arg1;
            var7.field2222 = 1;
            var7.field2215 = arg3;
            class114.field2426.method337(25563, var7);
        }
        class94.method676(false);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method545(byte arg0, int arg1) {
        field1552++;
        if (arg1 == 100 && class88.field1965 > 0) {
            byte[] var2 = class106.field2257[--class88.field1965];
            class106.field2257[class88.field1965] = null;
            return var2;
        } else if (arg1 == 5000 && class95.field2093 > 0) {
            byte[] var3 = class43.field928[--class95.field2093];
            class43.field928[class95.field2093] = null;
            return var3;
        } else {
            if (arg0 != -76) {
                method541(-92, -114);
            }
            if (arg1 == 30000 && class37.field847 > 0) {
                byte[] var4 = class31.field655[--class37.field847];
                class31.field655[class37.field847] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }
}
