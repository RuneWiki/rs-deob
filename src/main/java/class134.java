import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class134 {

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field1970 = 0;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Laj;")
    public static class333 field1966;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 3)
    public static void method1057(byte arg0) {
        int var1 = 60 % ((arg0 - 51) / 46);
        field1966 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 12)
    public static final void method1058(int arg0) {
        field1969++;
        if (class292.field4270 != null) {
            class209.field2778 = new class771();
            class209.field2778.method4272(arg0, class292.field4270.field304.method2780(99, class38.field589), class292.field4270, class292.field4270.field309, class28.field410);
            class644.field8950 = new Thread(class209.field2778, "");
            class644.field8950.start();
        }
    }
}
