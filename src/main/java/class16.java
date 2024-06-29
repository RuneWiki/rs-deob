import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class16 extends class15 {

    @OriginalMember(owner = "mapview!i", name = "n", descriptor = "Lna;")
    public static class26 field217 = class30.method205((byte) 44, "Overview");

    @OriginalMember(owner = "mapview!i", name = "m", descriptor = "Lna;")
    public static class26 field216 = class30.method205((byte) 106, "Silver Shop");

    @OriginalMember(owner = "mapview!i", name = "o", descriptor = "Lna;")
    public static class26 field218 = class30.method205((byte) 89, "world");

    @OriginalMember(owner = "mapview!i", name = "q", descriptor = "Lna;")
    public static class26 field220 = class30.method205((byte) 22, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!i", name = "p", descriptor = "[B")
    public static byte[] field219;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(II)I", line = 4)
    public static final int method102(int arg0, int arg1) {
        if (arg0 >= 65 && arg0 <= 90) {
            arg0 += 32;
        }
        return arg1 == 0 ? arg0 : 86;
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(I)B", line = 17)
    public static final byte method103(int arg0) {
        if (arg0 != 0) {
            field220 = null;
        }
        return class35.field461 == null ? 0 : class35.field461[class19.field239];
    }

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "(I)V", line = 48)
    public static void method104(int arg0) {
        field219 = null;
        if (arg0 == 1001) {
            field220 = null;
            field216 = null;
            field218 = null;
            field217 = null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IIILb;)[Lm;", line = 79)
    public static final class23[] method105(int arg0, int arg1, int arg2, class3 arg3) {
        if (class36.method230((byte) 124, arg3, arg2, arg0)) {
            if (arg1 != -91) {
                field219 = null;
            }
            return class15.method98((byte) 105);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Lv;ILjava/lang/Object;)V", line = 108)
    public static final void method106(class40 arg0, int arg1, Object arg2) {
        if (arg0.field514 == null) {
            return;
        }
        int var3 = 0;
        int var4 = 21 % ((arg1 - 75) / 42);
        while (var3 < 50 && arg0.field514.peekEvent() != null) {
            class33.method218(1L, 10);
            var3++;
        }
        if (arg2 != null) {
            arg0.field514.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }
}
