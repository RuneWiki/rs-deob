import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class120 extends class644 {

    @OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
    public int field1746 = 0;

    @OriginalMember(owner = "client!oda", name = "s", descriptor = "Lfh;")
    public static class653 field1747 = new class653();

    @OriginalMember(owner = "client!oda", name = "x", descriptor = "Lhg;")
    public static class693 field1752 = new class693(0, 7);

    @OriginalMember(owner = "client!oda", name = "t", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!oda", name = "u", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!oda", name = "v", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!oda", name = "w", descriptor = "[Liea;")
    public static class481[] field1751;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLsl;)V", line = 4)
    public final void method924(byte arg0, class461 arg1) {
        while (true) {
            int var3 = arg1.method2600((byte) -123);
            if (var3 == 0) {
                if (arg0 <= 54) {
                    return;
                }
                field1748++;
                return;
            }
            this.method925(104, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILsl;I)V", line = 24)
    private final void method925(int arg0, class461 arg1, int arg2) {
        if (arg2 == 2) {
            this.field1746 = arg1.method2566(-2);
        }
        field1749++;
        int var4 = -63 / ((arg0 + 17) / 63);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)I", line = 47)
    public static final int method926(int arg0) {
        field1750++;
        if (class353.field4533 != null) {
            return 3;
        } else if (arg0 == 15492) {
            return class64.field895 ? 2 : 1;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)V", line = 64)
    public static void method927(int arg0) {
        field1751 = null;
        if (arg0 != 2) {
            field1752 = null;
        }
        field1747 = null;
        field1752 = null;
    }
}
