import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class618 {

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[I")
    public static int[] field8610 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Llh;")
    public static class487 field8609 = new class487(11, 16);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lo;")
    public static class28 field8608;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 3)
    public static void method3443(int arg0) {
        field8609 = null;
        int var1 = 62 / ((arg0 + 46) / 61);
        field8610 = null;
        field8608 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 19)
    public static final void method3444(byte arg0) {
        field8607++;
        class199.field2830.method3749(7648);
        if (arg0 >= -45) {
            method3443(-70);
        }
    }
}
