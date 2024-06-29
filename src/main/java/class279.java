import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class279 extends class276 {

    @OriginalMember(owner = "client!en", name = "n", descriptor = "Lpu;")
    public class411 field4577 = new class411();

    @OriginalMember(owner = "client!en", name = "p", descriptor = "Lnk;")
    public static class326 field4579 = new class326(68, 3);

    @OriginalMember(owner = "client!en", name = "q", descriptor = "J")
    public static long field4580 = -1L;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public static int field4581 = 0;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "F")
    public static float field4583;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "Lce;")
    public static class404 field4582;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)Z", line = 4)
    public static final boolean method1834(int arg0, int arg1) {
        field4578++;
        if (arg0 != 68) {
            field4584 = -31;
        }
        return arg1 == 9 || arg1 == 10 || arg1 == 11;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 15)
    public static void method1835(int arg0) {
        field4579 = null;
        field4582 = null;
        if (arg0 != 3) {
            field4583 = 0.55445236F;
        }
    }
}
