import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class126 extends class324 {

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public volatile int field1563 = -1;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field1560;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "[Z")
    public static boolean[] field1553 = new boolean[5];

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "[Lpb;")
    public static class571[] field1561 = new class571[32];

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Lhp;")
    public static class277 field1555 = new class277(8);

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Lkea;")
    public static class203 field1558;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Loa;I)V", line = 8)
    public static final void method772(class605 arg0, int arg1) {
        if (arg1 <= 67) {
            field1564 = -16;
        }
        field1556++;
        if (class438.field6510) {
            class421.method2650(-120, arg0);
        } else {
            class557.method3229((byte) 120, arg0);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lqf;B)V", line = 34)
    public static final void method773(class593 arg0, byte arg1) {
        field1554++;
        if (class27.field291 != arg0.field8603) {
            int var2 = 87 % ((arg1 - 34) / 50);
        } else if (class439.field6548.field9452 == null) {
            arg0.field8641 = 0;
            arg0.field8555 = 0;
        } else {
            arg0.field8618 = 150;
            arg0.field8584 = (int) (Math.sin((double) class287.field3982 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field8577 = 5;
            arg0.field8555 = class244.field3460;
            arg0.field8641 = class407.method2577(122, class439.field6548.field9452);
            arg0.field8631 = 0;
            arg0.field8571 = class439.field6548.field2454;
            arg0.field8558 = class439.field6548.field2434;
            arg0.field8524 = class439.field6548.field2460;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 67)
    public static void method774(int arg0) {
        field1553 = null;
        field1555 = null;
        if (arg0 == 15534) {
            field1561 = null;
            field1558 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 103)
    public class126(String arg0) {
        this.field1560 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V", line = 84)
    public static final void method775(int arg0) {
        field1557++;
        if (arg0 != -26515) {
            field1561 = null;
        }
        if (class595.field8694.method2426(class81.field908, -5) || class394.field6023 == class226.field3179) {
            class647.method3707(class413.field6264, false);
            if (class245.field3466 != class226.field3179) {
                class395.method2536(arg0 ^ 0xFFFF9858);
            }
        } else {
            class258.method1722(class400.field6066, class568.field8159, 10, 120, false);
        }
    }
}
