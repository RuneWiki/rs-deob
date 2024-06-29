import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class59 extends class107 {

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "Lpk;")
    public static class106 field862 = new class106(0, 0);

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Ljava/lang/String;")
    public static String field863 = "Loading config - ";

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field864 = 1;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field866 = 0;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static final void method380(boolean arg0) {
        field859++;
        if (class262.field4273 == null) {
            return;
        }
        if (class92.field1462 < 10) {
            if (!class262.field4266.method1163(34, class262.field4273.field2752)) {
                class92.field1462 = class236.field3710.method1148(125, class262.field4273.field2752) / 10;
                return;
            }
            class241.method1634(-2600);
            class92.field1462 = 10;
        }
        if (class92.field1462 == 10) {
            class262.field4276 = class262.field4273.field2748 >> 6 << 6;
            class262.field4278 = (class262.field4273.field2745 >> 6 << 6) - (class262.field4276 - 64);
            class262.field4275 = class262.field4273.field2754 >> 6 << 6;
            class262.field4277 = (class262.field4273.field2741 >> 6 << 6) + 64 - class262.field4275;
            int[] var1 = new int[3];
            int var2 = -1;
            int var3 = -1;
            if (class262.field4273.method1186((class217.field3408.field929 >> 7) + class145.field2327, class214.field3389, 2048, var1, (class217.field3408.field994 >> 7) + class75.field1211)) {
                var3 = class262.field4276 + class262.field4278 - var1[2] - 1;
                var2 = var1[1] - class262.field4275;
            }
            if (!class173.field2900 && var2 >= 0 && var2 < class262.field4277 && var3 >= 0 && class262.field4278 > var3) {
                int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
                class249.field4095 = var4;
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class45.field667 = var5;
            } else if (class116.field1764 == -1 || class133.field2138 == -1) {
                class262.field4273.method1188(class262.field4273.field2751 & 0x3FFF, class262.field4273.field2751 >> 14 & 0x3FFF, var1, 0);
                class45.field667 = class262.field4278 - (var1[2] + -class262.field4276) - 1;
                class249.field4095 = var1[1] - class262.field4275;
            } else {
                class262.field4273.method1188(class133.field2138, class116.field1764, var1, 0);
                if (var1 != null) {
                    class45.field667 = class262.field4278 + class262.field4276 - var1[2] - 1;
                    class249.field4095 = var1[1] - class262.field4275;
                }
                class173.field2900 = false;
                class133.field2138 = -1;
                class116.field1764 = -1;
            }
            if (class262.field4273.field2755 == 37) {
                class262.field4270 = 3.0F;
                class262.field4269 = 3.0F;
            } else if (class262.field4273.field2755 == 50) {
                class262.field4270 = 4.0F;
                class262.field4269 = 4.0F;
            } else if (class262.field4273.field2755 == 75) {
                class262.field4270 = 6.0F;
                class262.field4269 = 6.0F;
            } else if (class262.field4273.field2755 == 100) {
                class262.field4270 = 8.0F;
                class262.field4269 = 8.0F;
            } else if (class262.field4273.field2755 == 200) {
                class262.field4270 = 16.0F;
                class262.field4269 = 16.0F;
            } else {
                class262.field4270 = 8.0F;
                class262.field4269 = 8.0F;
            }
            class66.method441(-122);
            class262.field4284 = new int[class307.field4986 + 1];
            int var6 = class262.field4278 >> 6;
            int var7 = class262.field4277 >> 6;
            class262.field4282 = new int[var7][var6][];
            class262.field4283 = new byte[var7][var6][];
            class262.field4287 = new byte[var7][var6][];
            class262.field4288 = new byte[var7][var6][];
            class262.field4289 = new byte[var7][var6][];
            class262.field4292 = new byte[var7][var6][];
            class262.field4286 = new int[var7][var6][];
            class102.field1621 = new class223();
            class229.field3593 = new class277();
            int var8 = class106.field1654 >> 1;
            int var9 = class44.field658 >> 2 << 10;
            class262.method1758(var9, var8);
            class297.method2038(256, 1024, 1);
            class122.method838(256, 0);
            class92.field1462 = 20;
        } else if (class92.field1462 == 20) {
            class215.method1478(new class274(class262.field4266.method1169("underlay", 99, class262.field4273.field2752)), (byte) 123);
            class92.field1462 = 30;
            class21.method165(true, -86);
            class92.method639(51);
        } else if (class92.field1462 == 30) {
            class262.method1756(new class274(class262.field4266.method1169("overlay", 99, class262.field4273.field2752)));
            class92.field1462 = 40;
            class92.method639(107);
        } else if (class92.field1462 == 40) {
            class262.method1755(new class274(class262.field4266.method1169("overlay2", 99, class262.field4273.field2752)));
            class92.field1462 = 50;
            class92.method639(69);
        } else if (class92.field1462 == 50) {
            class262.method1760(new class274(class262.field4266.method1169("loc", 99, class262.field4273.field2752)), class213.field3383);
            class92.field1462 = 60;
            class21.method165(true, -92);
            class92.method639(98);
        } else {
            if (arg0) {
                field864 = 102;
            }
            if (class92.field1462 == 60) {
                if (class262.field4266.method1143(-126, class262.field4273.field2752 + "_labels")) {
                    if (!class262.field4266.method1163(-121, class262.field4273.field2752 + "_labels")) {
                        return;
                    }
                    class262.field4268 = client.method1127(class262.field4273.field2752 + "_labels", class213.field3383, (byte) 86, class262.field4266);
                } else {
                    class262.field4268 = new class198(0);
                }
                class262.method1752();
                class92.field1462 = 70;
                class92.method639(54);
            } else if (class92.field1462 == 70) {
                class246.field3874 = new class212(11, true, class122.field1926);
                class92.field1462 = 73;
                class21.method165(true, -92);
                class92.method639(105);
            } else if (class92.field1462 == 73) {
                class184.field3052 = new class212(12, true, class122.field1926);
                class92.field1462 = 76;
                class21.method165(true, 124);
                class92.method639(88);
            } else if (class92.field1462 == 76) {
                class117.field1805 = new class212(14, true, class122.field1926);
                class92.field1462 = 79;
                class21.method165(true, -58);
                class92.method639(96);
            } else if (class92.field1462 == 79) {
                class134.field2180 = new class212(17, true, class122.field1926);
                class92.field1462 = 82;
                class21.method165(true, 122);
                class92.method639(74);
            } else if (class92.field1462 == 82) {
                class259.field4247 = new class212(19, true, class122.field1926);
                class92.field1462 = 85;
                class21.method165(true, -2);
                class92.method639(93);
            } else if (class92.field1462 == 85) {
                class60.field875 = new class212(22, true, class122.field1926);
                class92.field1462 = 88;
                class21.method165(true, -79);
                class92.method639(58);
            } else if (class92.field1462 == 88) {
                class193.field3148 = new class212(26, true, class122.field1926);
                class92.field1462 = 91;
                class21.method165(true, -6);
                class92.method639(59);
            } else {
                class102.field1625 = new class212(30, true, class122.field1926);
                class92.field1462 = 100;
                class21.method165(true, -32);
                class92.method639(60);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
    public static void method381(boolean arg0) {
        if (arg0) {
            field862 = null;
            field863 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        field861++;
        int var3 = 50 / ((arg0 + 34) / 49);
        return class221.field3486;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lgi;ZLgi;)V")
    public static final void method382(class164 arg0, boolean arg1, class164 arg2) {
        if (!arg1) {
            method380(true);
        }
        field857++;
        class195.field3157 = arg2;
        class238.field3738 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class59() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V")
    public static final void method383(byte arg0) {
        while (true) {
            if (class229.field3584.method2079(-19053, class271.field4366) >= 11) {
                int var1 = class229.field3584.method2087(11, (byte) 120);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class28.field494[var1] == null) {
                        var2 = true;
                        class28.field494[var1] = new class12();
                        if (class191.field3113[var1] != null) {
                            class28.field494[var1].method98(class191.field3113[var1], (byte) -94);
                        }
                    }
                    class111.field1708[class134.field2172++] = var1;
                    class12 var3 = class28.field494[var1];
                    var3.field907 = class274.field4472;
                    int var4 = class229.field3584.method2087(1, (byte) -37);
                    if (var4 == 1) {
                        class189.field3100[class57.field830++] = var1;
                    }
                    int var5 = class229.field3584.method2087(5, (byte) -111);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class229.field3584.method2087(5, (byte) -78);
                    int var7 = class229.field3584.method2087(1, (byte) -116);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var8 = class120.field1908[class229.field3584.method2087(3, (byte) 121)];
                    if (var2) {
                        var3.field963 = var3.field954 = var8;
                    }
                    var3.method97(var7 == 1, 512, class217.field3408.field956[0] + var6, class217.field3408.field965[0] + var5);
                    continue;
                }
            }
            class229.field3584.method2075(21423);
            field860++;
            if (arg0 != -37) {
                field862 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
    public static final void method384(int arg0) {
        field865++;
        if (arg0 != 3) {
            field866 = 6;
        }
        class106.field1652.method1873(-7401);
        class179.field2964.method1873(-7401);
    }
}
