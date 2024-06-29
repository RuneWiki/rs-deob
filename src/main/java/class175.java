import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class175 extends class583 {

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Lqfa;")
    public static class98 field2357 = new class98(81, 3);

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method1115(byte arg0, int arg1) {
        field2358++;
        class25.field351 = arg1;
        int var2 = 79 / ((arg0 + 32) / 37);
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V", line = 16)
    public static void method1117(int arg0) {
        if (arg0 == -10550) {
            field2357 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V", line = 32)
    public class175(int arg0) {
        this.field2359 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1116(int arg0);

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)Z")
    public abstract boolean method1118(byte arg0);
}
