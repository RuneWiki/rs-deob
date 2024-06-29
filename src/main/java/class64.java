import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class64 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lid;")
    public static class226 field1045 = new class226();

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Leg;")
    public static class37 field1046 = class174.method1167("blinken2:", -124);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Ljl;")
    public static class101 field1042;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Leg;")
    public class37 field1047;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lbe;")
    public static final class17 method449(int arg0, int arg1) {
        field1043++;
        if (class80.field1258 && arg0 >= class230.field3936 && arg0 <= class44.field682) {
            if (arg1 != -1428) {
                field1042 = null;
            }
            return class29.field417[arg0 - class230.field3936];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method450(int arg0) {
        class137.field2350 = arg0;
        for (int var1 = 0; var1 < class175.field2936; var1++) {
            for (int var2 = 0; var2 < class160.field2675; var2++) {
                if (class286.field5048[arg0][var1][var2] == null) {
                    class286.field5048[arg0][var1][var2] = new class111(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)J")
    public static final long method451(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        return var3 == null || var3.field1875 == null ? 0L : var3.field1875.field4781;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method452(int arg0) {
        field1042 = null;
        field1045 = null;
        field1046 = null;
        if (arg0 != 0) {
            method450(-29);
        }
    }
}
