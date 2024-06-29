import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class610 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
    public static int[] field8247 = new int[25];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Ljb;")
    public static class519 field8246 = new class519(80, 9);

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public int field8248;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public int field8249;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field8250;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public int field8251;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public int field8252;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field8253;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lfq;III)V")
    public static final void method3393(class214 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class196.field2540) {
            class194 var4 = class443.field6387[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2519 != null && var4.field2519.method126((byte) -34)) {
                arg0.method129(0, var4.field2519, (byte) -103, class30.field299, 0, class34.field372, true);
            }
        }
        if (arg3 < class196.field2540) {
            class194 var5 = class443.field6387[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2519 != null && var5.field2519.method126((byte) -34)) {
                arg0.method129(0, var5.field2519, (byte) -103, 0, class30.field299, class34.field372, true);
            }
        }
        if (arg2 < class196.field2540 && arg3 < class247.field3229) {
            class194 var6 = class443.field6387[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2519 != null && var6.field2519.method126((byte) -34)) {
                arg0.method129(0, var6.field2519, (byte) -103, class30.field299, class30.field299, class34.field372, true);
            }
        }
        if (arg2 < class196.field2540 && arg3 > 0) {
            class194 var7 = class443.field6387[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2519 != null && var7.field2519.method126((byte) -34)) {
                arg0.method129(0, var7.field2519, (byte) -103, class30.field299, -class30.field299, class34.field372, true);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method3394(byte arg0) {
        int var1 = -107 % ((arg0 + 27) / 44);
        field8247 = null;
        field8246 = null;
    }
}
