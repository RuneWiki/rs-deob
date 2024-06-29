import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class114 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Lvh;")
    public static class125 field1822 = new class125(71, 6);

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Z")
    public static boolean field1824 = false;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method923(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            method924(64);
        }
        while (class548.field8052.length > var1) {
            for (int var2 = 0; var2 < class548.field8052[0].length; var2++) {
                for (int var3 = 0; var3 < class548.field8052[0][0].length; var3++) {
                    class548.field8052[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
        field1825++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 55)
    public static void method924(int arg0) {
        if (arg0 != -1) {
            field1822 = null;
        }
        field1822 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjga;Ljga;)V", line = 70)
    public static final void method925(int arg0, class143 arg1, class143 arg2) {
        if (arg2.field2471 != null) {
            arg2.method1113(32730);
        }
        field1823++;
        if (arg0 < 51) {
            method923(true);
        }
        arg2.field2471 = arg1;
        arg2.field2473 = arg1.field2473;
        arg2.field2471.field2473 = arg2;
        arg2.field2473.field2471 = arg2;
    }
}
