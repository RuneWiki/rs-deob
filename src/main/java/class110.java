import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class110 {

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
    public static int field1715 = -1;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "Lbl;")
    public static class677 field1712 = new class677();

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V", line = 3)
    public static void method926(byte arg0) {
        int var1 = -37 % ((arg0 + 81) / 41);
        field1712 = null;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(III)I", line = 14)
    public static final int method927(int arg0, int arg1, int arg2) {
        field1714++;
        if (arg1 != 2346) {
            field1715 = -67;
        }
        int var3 = arg0 >>> 24;
        int var4 = ((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(JJ)J", line = 32)
    public static long method928(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZ)V", line = 40)
    public static final void method929(int arg0, boolean arg1) {
        if (arg1) {
            field1712 = null;
        }
        field1713++;
        class214.method1497((byte) 48);
        int var2 = class637.field8794.method4313(19500, arg0).field8513;
        if (var2 == 0) {
            return;
        }
        int var3 = class694.field9613.field447[arg0];
        if (var2 == 5) {
            class302.field4147 = var3;
        }
        if (var2 == 6) {
            class656.field9084 = var3;
        }
    }
}
