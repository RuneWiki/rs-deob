import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class338 extends class403 {

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public int field4546 = 0;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "Lhu;")
    public static class76 field4547 = new class76(4);

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "Lh;")
    public static class434 field4548 = new class434(61, 4);

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "Lse;")
    public static class154 field4549 = new class154(0, 0);

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field4550 = 1406;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "Lr;")
    public static class110 field4543;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)V")
    public static void method1926(byte arg0) {
        int var1 = 23 / ((56 - arg0) / 34);
        field4547 = null;
        field4549 = null;
        field4543 = null;
        field4548 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lbt;I)V")
    public final void method1927(class32 arg0, int arg1) {
        if (arg1 != 0) {
            this.field4546 = -28;
        }
        while (true) {
            int var3 = arg0.method201((byte) -122);
            if (var3 == 0) {
                field4542++;
                return;
            }
            this.method1928(arg1 ^ 0xFFFFFFFD, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILbt;I)V")
    private final void method1928(int arg0, class32 arg1, int arg2) {
        field4545++;
        if (~arg2 == arg0) {
            this.field4546 = arg1.method215((byte) 90);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BJ)V")
    public static final void method1929(byte arg0, long arg1) {
        if (class289.field3897 != null) {
            if (class56.field772 == 1 || class56.field772 == 5) {
                class114.method726(-1, arg1);
            } else if (class56.field772 == 4) {
                class230.method1285(-1, arg1);
            }
        }
        field4541++;
        class31.method179((long) class70.field968, 0, class98.field1432);
        if (class196.field2674 != -1) {
            class208.method1183(5173, class196.field2674);
        }
        int var3 = 0;
        int var4 = 89 / ((-arg0 - 88) / 35);
        while (var3 < class318.field4195) {
            if (class102.field1468[var3]) {
                class385.field5327[var3] = true;
            }
            class42.field595[var3] = class102.field1468[var3];
            class102.field1468[var3] = false;
            var3++;
        }
        class59.field794 = class70.field968;
        if (class98.field1432.method1999()) {
            class243.field3239 = true;
        }
        if (class196.field2674 != -1) {
            class318.field4195 = 0;
            class472.method2770(66);
        }
        class98.field1432.method2006();
        class100.method619(class98.field1432, 1);
        int var5 = class447.method2625(114);
        if (var5 == -1) {
            var5 = class186.field2558;
        }
        class213.method1204(var5, false);
        class458.method2695(class233.field3103.field6501, class233.field3103.field6507, class448.field6098, -15724, class233.field3103.field6502);
        class448.field6098 = 0;
    }
}
