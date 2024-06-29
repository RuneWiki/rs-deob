import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class273 {

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lmq;")
    public static class78 field3453 = new class78(118, 0);

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[[Z")
    public static boolean[][] field3457 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Llea;I)V", line = 7)
    public static final void method1637(class546 arg0, int arg1) {
        field3450++;
        class389 var2 = (class389) class297.field3854.method3248((long) arg0.field354, 0);
        if (arg1 != -25108) {
            field3457 = null;
        }
        if (var2 == null) {
            class274.method1642(arg0.field435[0], arg0, arg0.field426[0], arg0.field5779, (byte) -108, null, 0, null);
        } else {
            var2.method2322(98);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 26)
    public static void method1638(byte arg0) {
        field3453 = null;
        if (arg0 == 5) {
            field3457 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V", line = 38)
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class224.field2949 != null) {
            class224.field2949[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class340.field4391 != null) {
            class340.field4391[arg0][arg1] = (short) arg3;
        }
        if (class84.field1088 != null) {
            class84.field1088[arg0][arg1] = (byte) arg4;
        }
    }
}
