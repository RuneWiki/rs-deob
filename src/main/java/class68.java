import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class68 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field1123 = 0;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "F")
    public static float field1125 = 0.0F;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1122 = 0;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Lvh;")
    public static class108 field1124;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method417(int arg0) {
        if (arg0 == -3) {
            field1124 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IJ)V")
    public static final void method418(int arg0, long arg1) {
        field1126++;
        class168.field2778.field1762 = 0;
        class168.field2778.method682(21, arg0 + 22555);
        class168.field2778.method640(arg0 ^ 0x54BB, arg1);
        class139.field2396 = -3;
        class150.field2514 = arg0;
        class166.field2715 = 1;
        class54.field934 = 0;
    }
}
