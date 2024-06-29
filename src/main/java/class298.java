import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class298 {

    @OriginalMember(owner = "client!es", name = "a", descriptor = "Lln;")
    public static class472 field4517 = new class472(1, 2, 2, 0);

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "[I")
    public static int[] field4520;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 3)
    public static void method1915(int arg0) {
        field4517 = null;
        if (arg0 != 1) {
            field4520 = null;
        }
        field4520 = null;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V", line = 14)
    public static final void method1916(int arg0) {
        field4519++;
        int var1 = 94 % ((arg0 + 49) / 52);
        if (class51.field824 <= 1) {
            class654.field9289.method2292(-86, 2, class654.field9289.field5419);
        } else {
            class654.field9289.method2292(93, 4, class654.field9289.field5419);
        }
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V", line = 43)
    public static final void method1917(int arg0) {
        class695.field9855.method71((byte) 44);
        field4521++;
        if (arg0 != -43) {
            field4517 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([[F[[SB)[[S", line = 54)
    public static final short[][] method1918(float[][] arg0, short[][] arg1, byte arg2) {
        field4518++;
        int var3 = 0;
        if (arg2 != -78) {
            method1915(36);
        }
        while (var3 < arg0.length) {
            for (int var4 = 0; var4 < arg1[var3].length; var4++) {
                arg1[var3][var4] = (short) ((int) (arg0[var3][var4] * 16383.0F));
            }
            var3++;
        }
        return arg1;
    }
}
