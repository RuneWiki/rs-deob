import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public abstract class class147 extends class381 {

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "J")
    public static long field2091 = 0L;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field2095 = 0;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "Liba;")
    public static class211 field2094 = new class211(21, -1);

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "Lmv;")
    public static class295 field2096;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public static void method1059(int arg0) {
        if (arg0 != 0) {
            field2094 = null;
        }
        field2094 = null;
        field2096 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)I")
    public abstract int method476(boolean arg0);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)J")
    public abstract long method477(byte arg0);

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)I")
    public abstract int method475(int arg0);

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "(I)I")
    public abstract int method478(int arg0);

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)I")
    public abstract int method479(byte arg0);
}
