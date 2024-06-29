import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class197 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "Lpi;")
    public static class340 field2543 = new class340(71, 4);

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "Ldn;")
    public static class201 field2545;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method1269(int arg0) {
        int var1 = 21 % ((-arg0 - 20) / 43);
        field2543 = null;
        field2545 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)I")
    public static final int method1270(byte arg0, int arg1) {
        field2544++;
        int var2 = -16 / ((arg0 - 22) / 47);
        return arg1 & 0x3FF;
    }
}
