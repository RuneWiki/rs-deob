import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class249 extends class130 {

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "[I")
    public int[] field4406 = new int[] { -1 };

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "[I")
    public int[] field4411 = new int[1];

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Lqj;")
    public static class196 field4409 = class80.method502("Sprites geladen)3", -48);

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field4408 = 0;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Log;")
    public static class38 field4404;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "[[[Lid;")
    public static class61[][][] field4410;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)V")
    public static final void method1690(int arg0, int arg1) {
        class120.field1737 = -1;
        int var2 = -106 % ((arg0 - 30) / 56);
        field4405++;
        class157.field2537 = arg1;
        class45.field537 = -1;
        class24.method142(-5522);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method1691(int arg0) {
        field4410 = null;
        field4409 = null;
        if (arg0 != 20259) {
            field4404 = null;
        }
        field4404 = null;
    }
}
