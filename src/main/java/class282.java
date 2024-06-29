import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class282 {

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field3701 = 0;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "[[S")
    public static short[][] field3705 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field3707 = 4;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "B")
    public static byte field3704;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)I")
    public static final int method1677(int arg0, int arg1) {
        if (arg1 != 5702) {
            field3704 = 77;
        }
        field3706++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1678(int arg0, byte arg1, int arg2) {
        field3702++;
        if (arg1 != 1) {
            field3704 = 112;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1679(String arg0, int arg1) {
        field3708++;
        if (!class32.field529) {
            return;
        }
        boolean var2 = false;
        int var3 = class461.field6368;
        int[] var4 = class461.field6370;
        for (int var5 = 0; var5 < var3; var5++) {
            class515 var6 = class499.field6901[var4[var5]];
            if (var6 != null && class385.field5232 != var6 && var6.field7638 != null && var6.field7638.equalsIgnoreCase(arg0)) {
                class118.method822(-122, class285.field3721);
                class360.field4855++;
                class193.field2708.method2241(0, class94.field1415);
                class193.field2708.method2229((byte) 98, 0);
                class193.field2708.method2227(class196.field2749, (byte) -125);
                class193.field2708.method2198(class246.field3275, (byte) -23);
                class193.field2708.method2188(var4[var5], arg1 ^ 0xFFFF97ED);
                class279.method1654(-2, -1, var6.method2590(0), var6.field6266[0], 0, var6.method2590(0), true, var6.field6261[0], 0);
                var2 = true;
                break;
            }
        }
        if (arg1 != -26734) {
            field3701 = 62;
        }
        if (!var2) {
            class414.method2404(class347.field4682.method1764(class489.field6789, false) + arg0, -73);
        }
        if (class32.field529) {
            class506.method2892(arg1 + 92269);
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(I)V")
    public class282(int arg0) {
        this.field3703 = arg0;
    }

    @OriginalMember(owner = "client!fr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3700++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
    public static void method1680(byte arg0) {
        field3705 = null;
        if (arg0 < 64) {
            field3705 = null;
        }
    }
}
