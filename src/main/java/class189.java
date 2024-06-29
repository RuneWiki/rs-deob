import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class189 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[I")
    public static int[] field2469 = new int[1000];

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lm;")
    public static class110 field2468;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 7)
    public static void method1219(int arg0) {
        field2468 = null;
        if (arg0 != 1297579256) {
            field2468 = null;
        }
        field2469 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 18)
    public static final void method1220(byte arg0) {
        class275.method1673();
        field2470++;
        int var1 = 60 / ((76 - arg0) / 44);
        for (int var2 = 0; var2 < 4; var2++) {
            class624.field8489[var2].method1502(false);
        }
        class578.method3254(true);
        class308.method1848(true);
        System.gc();
    }
}
