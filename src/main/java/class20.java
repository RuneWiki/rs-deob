import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class20 extends class41 {

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field212;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field214 = 0;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field218 = -60;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "Z")
    public static boolean field211 = true;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field220 = 0;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "Lhq;")
    public static class365 field219 = new class365(5);

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "B")
    public static byte field217;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Luk;Ljava/lang/Object;)V", line = 3)
    public class20(class309 arg0, Object arg1) {
        super(arg0);
        this.field212 = arg1;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Z", line = 14)
    public final boolean method118(int arg0) {
        if (arg0 != 29257) {
            this.method121(62);
        }
        field216++;
        return false;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V", line = 26)
    public static void method119(byte arg0) {
        field219 = null;
        if (arg0 > -82) {
            field219 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(B)V", line = 36)
    public static final void method120(byte arg0) {
        field215++;
        class276.field3581.method777(class277.field3590, class115.field1329, class49.field575);
        if (arg0 <= 18) {
            method120((byte) 106);
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 62)
    public final Object method121(int arg0) {
        field213++;
        return arg0 < 92 ? null : this.field212;
    }
}
