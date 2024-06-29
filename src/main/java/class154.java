import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class154 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public int field2485 = 0;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public int field2484 = 0;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    private int field2493 = -1;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    private int field2488 = -1;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Ljava/lang/String;")
    private String field2483 = "";

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public int field2486 = 16777215;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public int field2496 = 0;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public int field2499 = -1;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public int field2500 = -1;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    private int field2491 = -1;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public int field2490 = 70;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public int field2504 = -1;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    private int field2503 = -1;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lmia;")
    public static class63 field2492 = new class63(26, 3);

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Lhe;")
    public static class372 field2501 = new class372(4);

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "F")
    public static float field2506;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lu;")
    public class74 field2502;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Ljava/lang/String;", line = 9)
    public final String method1146(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field2496 = -73;
        }
        field2482++;
        String var3 = this.field2483;
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class343.method2177(0, false, arg1) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILha;)V", line = 34)
    private final void method1147(int arg0, class60 arg1) {
        field2505++;
        class39 var3 = this.field2502.field1036;
        if (this.field2488 >= 0 && this.field2502.field1035.method803(116, (long) this.field2488) == null && var3.method208(this.field2488, (byte) 70)) {
            class129 var4 = class129.method911(var3, this.field2488);
            this.field2502.field1035.method801(1, arg1.method422(var4, true), (long) this.field2488);
        }
        if (this.field2493 >= 0 && this.field2502.field1035.method803(124, (long) this.field2493) == null && var3.method208(this.field2493, (byte) 70)) {
            class129 var5 = class129.method911(var3, this.field2493);
            this.field2502.field1035.method801(1, arg1.method422(var5, true), (long) this.field2493);
        }
        if (~this.field2491 <= arg0 && this.field2502.field1035.method803(127, (long) this.field2491) == null && var3.method208(this.field2491, (byte) 70)) {
            class129 var6 = class129.method911(var3, this.field2491);
            this.field2502.field1035.method801(1, arg1.method422(var6, true), (long) this.field2491);
        }
        if (this.field2503 >= 0 && this.field2502.field1035.method803(112, (long) this.field2503) == null && var3.method208(this.field2503, (byte) 70)) {
            class129 var7 = class129.method911(var3, this.field2503);
            this.field2502.field1035.method801(1, arg1.method422(var7, true), (long) this.field2503);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLha;)Lpga;", line = 96)
    public final class536 method1148(boolean arg0, class60 arg1) {
        if (!arg0) {
            return null;
        }
        field2495++;
        if (this.field2493 < 0) {
            return null;
        }
        class536 var3 = (class536) this.field2502.field1035.method803(109, (long) this.field2493);
        if (var3 == null) {
            this.method1147(-1, arg1);
            var3 = (class536) this.field2502.field1035.method803(112, (long) this.field2493);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lrg;I)V", line = 120)
    public final void method1149(class645 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3745(-6314);
            if (var3 == 0) {
                int var4 = -123 % ((32 - arg1) / 38);
                field2507++;
                return;
            }
            this.method1151((byte) 91, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 140)
    public static final boolean method1150(byte arg0, String arg1) {
        field2497++;
        if (arg0 != 102) {
            method1150((byte) -93, null);
        }
        return class188.field2855.containsKey(arg1);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLrg;I)V", line = 162)
    private final void method1151(byte arg0, class645 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2500 = arg1.method3712((byte) 75);
        } else if (arg2 == 2) {
            this.field2486 = arg1.method3747((byte) -74);
        } else if (arg2 == 3) {
            this.field2488 = arg1.method3712((byte) 127);
        } else if (arg2 == 4) {
            this.field2491 = arg1.method3712((byte) -122);
        } else if (arg2 == 5) {
            this.field2493 = arg1.method3712((byte) 43);
        } else if (arg2 == 6) {
            this.field2503 = arg1.method3712((byte) -124);
        } else if (arg2 == 7) {
            this.field2484 = arg1.method3756(65536);
        } else if (arg2 == 8) {
            this.field2483 = arg1.method3696(-120);
        } else if (arg2 == 9) {
            this.field2490 = arg1.method3712((byte) -116);
        } else if (arg2 == 10) {
            this.field2485 = arg1.method3756(65536);
        } else if (arg2 == 11) {
            this.field2504 = 0;
        } else if (arg2 == 12) {
            this.field2499 = arg1.method3745(-6314);
        } else if (arg2 == 13) {
            this.field2496 = arg1.method3756(65536);
        } else if (arg2 == 14) {
            this.field2504 = arg1.method3712((byte) -6);
        }
        field2487++;
        int var4 = -37 % ((arg0 - 26) / 49);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 250)
    public static void method1152(byte arg0) {
        field2501 = null;
        if (arg0 != 0) {
            field2501 = null;
        }
        field2492 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lha;B)Lpga;", line = 261)
    public final class536 method1153(class60 arg0, byte arg1) {
        field2494++;
        int var3 = -75 / ((74 - arg1) / 35);
        if (this.field2491 < 0) {
            return null;
        }
        class536 var4 = (class536) this.field2502.field1035.method803(121, (long) this.field2491);
        if (var4 == null) {
            this.method1147(-1, arg0);
            var4 = (class536) this.field2502.field1035.method803(120, (long) this.field2491);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(ILha;)Lpga;", line = 290)
    public final class536 method1154(int arg0, class60 arg1) {
        field2489++;
        if (arg0 > this.field2503) {
            return null;
        }
        class536 var3 = (class536) this.field2502.field1035.method803(121, (long) this.field2503);
        if (var3 == null) {
            this.method1147(-1, arg1);
            var3 = (class536) this.field2502.field1035.method803(arg0 ^ 0x7E, (long) this.field2503);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lha;Z)Lpga;", line = 332)
    public final class536 method1155(class60 arg0, boolean arg1) {
        field2498++;
        if (this.field2488 < 0) {
            return null;
        }
        class536 var3 = (class536) this.field2502.field1035.method803(112, (long) this.field2488);
        if (!arg1) {
            this.method1151((byte) -100, null, 105);
        }
        if (var3 == null) {
            this.method1147(-1, arg0);
            var3 = (class536) this.field2502.field1035.method803(118, (long) this.field2488);
        }
        return var3;
    }
}
