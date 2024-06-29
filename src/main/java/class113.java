import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class113 extends class107 {

    @OriginalMember(owner = "client!se", name = "ob", descriptor = "Lrc;")
    public static class105 field2659 = class43.method374("Benutzername: ", 0);

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
    public static int field2652 = 0;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "Lrc;")
    public static class105 field2647 = class43.method374("Ihr Spielkonto wird bereits benutzt)3", 0);

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public static volatile int field2645 = 0;

    @OriginalMember(owner = "client!se", name = "lb", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "I")
    public static int field2651 = 0;

    @OriginalMember(owner = "client!se", name = "ib", descriptor = "[I")
    public static int[] field2653 = new int[5];

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "Lrc;")
    private static class105 field2650 = class43.method374("Public chat", 0);

    @OriginalMember(owner = "client!se", name = "tb", descriptor = "Lrc;")
    public static class105 field2664 = field2650;

    @OriginalMember(owner = "client!se", name = "vb", descriptor = "Lrc;")
    public static class105 field2666 = class43.method374("und Ihr Passwort ein)3", 0);

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!se", name = "jb", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!se", name = "kb", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!se", name = "nb", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!se", name = "pb", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!se", name = "qb", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!se", name = "rb", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!se", name = "sb", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!se", name = "ub", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "[I")
    public static int[] field2646;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V", line = 5)
    public static final void method924(boolean arg0) {
        field2655++;
        if (class74.field1634 == null) {
            return;
        }
        if (arg0) {
            field2646 = null;
        }
        if (class64.field1431 >= 0) {
            if (class67.field1518 > 0) {
                class125.field3054 += class104.field2356;
                class74.field1634.method734(class64.field1431, !arg0, class125.field3054);
                class67.field1518--;
                if (class67.field1518 == 0) {
                    class74.field1634.method738((byte) 125);
                    class67.field1518 = 20;
                    class64.field1431 = -1;
                }
            }
        } else if (class67.field1518 > 0) {
            class67.field1518--;
            if (class67.field1518 == 0) {
                if (class112.field2619 == null) {
                    class74.field1634.method735(256, false);
                } else {
                    class74.field1634.method735(class18.field416, false);
                    class64.field1431 = class18.field416;
                    class74.field1634.method733(class112.field2619, class75.field1677, class18.field416, -100);
                    class112.field2619 = null;
                }
                class125.field3054 = 0;
            }
        }
        class74.field1634.method732(arg0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljc;IILmd;)V", line = 70)
    public static final void method925(class57 arg0, int arg1, int arg2, class76 arg3) {
        field2644++;
        class64 var4 = new class64();
        var4.field1448 = arg2;
        var4.field1426 = arg0;
        var4.field1436 = arg3;
        var4.field1425 = 1;
        if (arg1 < 5) {
            return;
        }
        class3 var5 = class109.field2507;
        synchronized (class109.field2507) {
            class109.field2507.method23(1024, var4);
        }
        class15.method165((byte) 127);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILb;B)V", line = 94)
    private final void method926(int arg0, class7 arg1, byte arg2) {
        field2663++;
        if (arg2 != 48) {
            this.method926(-72, null, (byte) -93);
        }
        if (arg0 == 1) {
            this.field2657 = arg1.method101(2);
            this.field2661 = arg1.method96(27023);
            this.field2660 = arg1.method96(27023);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILpb;)V", line = 118)
    public static final void method927(int arg0, class92 arg1) {
        class111.field2600 = arg1;
        field2649++;
        int var2 = -31 % ((-arg0 - 63) / 55);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLb;)V", line = 128)
    public final void method928(byte arg0, class7 arg1) {
        if (arg0 >= -2) {
            field2666 = null;
        }
        field2662++;
        while (true) {
            int var3 = arg1.method96(27023);
            if (var3 == 0) {
                return;
            }
            this.method926(var3, arg1, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I", line = 165)
    public static final int method929(byte arg0, int arg1) {
        if (arg0 < 118) {
            return 37;
        } else {
            field2654++;
            return (int) (Math.log((double) arg1 * 0.00390625D) * 868.5889638065036D + 0.5D);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V", line = 194)
    public static final void method930(int arg0, byte arg1) {
        field2665++;
        if (arg0 == -1 || !class73.field1611[arg0]) {
            return;
        }
        class96.field2219.method770(0, arg0);
        if (class14.field282[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 != 58) {
            field2650 = null;
        }
        for (int var3 = 0; var3 < class14.field282[arg0].length; var3++) {
            if (class14.field282[arg0][var3] != null) {
                if (class14.field282[arg0][var3].field2811 == 2) {
                    var2 = false;
                } else {
                    class14.field282[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class14.field282[arg0] = null;
        }
        class73.field1611[arg0] = false;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V", line = 250)
    public static void method931(int arg0) {
        field2664 = null;
        field2646 = null;
        field2659 = null;
        field2666 = null;
        field2647 = null;
        field2650 = null;
        field2653 = null;
        int var1 = 83 / ((64 - arg0) / 57);
    }
}
