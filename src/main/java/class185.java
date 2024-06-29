import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class185 {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2774 = "wishes to trade with you.";

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[B")
    public static byte[] field2773 = new byte[520];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lwj;")
    public static class270 field2771;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 4)
    public static void method1325(int arg0) {
        field2774 = null;
        field2773 = null;
        if (arg0 != 18669) {
            method1327((byte) 32, (class133) null, (class133) null, (class135) null);
        }
        field2771 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)V", line = 19)
    public static final void method1326(byte arg0, int arg1, int arg2) {
        field2770++;
        class338 var3 = class195.method1391(5, (byte) -92, arg2);
        int var4 = 83 / ((arg0 - 51) / 37);
        var3.method2352((byte) 125);
        var3.field5279 = arg1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLl;Ll;Luk;)V", line = 34)
    public static final void method1327(byte arg0, class133 arg1, class133 arg2, class135 arg3) {
        class326.field5082 = arg3;
        class161.field2425 = arg2;
        class333.field5204 = arg1;
        if (class161.field2425 != null) {
            class205.field3079 = class161.field2425.method954(-24001, 1);
        }
        if (arg0 != 107) {
            field2771 = (class270) null;
        }
        if (class333.field5204 != null) {
            class18.field245 = class333.field5204.method954(-24001, 1);
        }
        field2775++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lqb;", line = 57)
    public static final class26 method1328(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2204; var4++) {
            class26 var5 = var3.field2197[var4];
            if ((var5.field402 >> 29 & 0x3L) == 2L && var5.field411 == arg1 && var5.field410 == arg2) {
                class195.method1389(var5);
                return var5;
            }
        }
        return null;
    }
}
