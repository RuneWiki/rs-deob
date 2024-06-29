import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class95 extends class165 {

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    private int field1225 = -1;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "[I")
    public static int[] field1222 = new int[1];

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "Lpda;")
    public static class654 field1228 = new class654(0, -1);

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "B")
    private byte field1229;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILmia;)V")
    public final void method612(int arg0, class69 arg1) {
        field1223++;
        if (arg0 > -100) {
            field1222 = null;
        }
        arg1.method548((byte) 102, this.field1229, this.field1225);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static void method671(int arg0) {
        if (arg0 == -6) {
            field1222 = null;
            field1228 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lrv;I)V")
    public final void method614(class120 arg0, int arg1) {
        field1224++;
        this.field1225 = arg0.method898((byte) -103);
        this.field1229 = arg0.method877(arg1 - 1322);
        if (arg1 != 1070) {
            method671(-74);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Z")
    public static final boolean method672(int arg0, int arg1) {
        if (arg1 != 6) {
            field1222 = null;
        }
        field1227++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }
}
