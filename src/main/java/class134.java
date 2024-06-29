import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class134 extends class130 {

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "[I")
    public int[] field2595 = new int[] { -1 };

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "[I")
    public int[] field2594 = new int[1];

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Lsd;")
    public static class166 field2603 = class135.method935("Der Server wird gerade aktualisiert)3", 0);

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "Lsd;")
    private static class166 field2604 = class135.method935("level)2", 0);

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Lsd;")
    public static class166 field2599 = field2604;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lsd;")
    public static class166 field2598 = class135.method935("mn", 0);

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Lsc;")
    public static class165 field2596 = new class165();

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "[[S")
    public static short[][] field2607 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "Lsd;")
    public static class166 field2606 = class135.method935("Ausw-=hlen", 0);

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "Lcb;")
    public static class22 field2608;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Lf;")
    public static class47 field2600;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "Lf;")
    public static class47 field2605;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method928(byte arg0) {
        field2598 = null;
        if (arg0 <= 107) {
            method929(null, 86, null);
        }
        field2600 = null;
        field2604 = null;
        field2605 = null;
        field2599 = null;
        field2607 = null;
        field2603 = null;
        field2608 = null;
        field2606 = null;
        field2596 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/Object;ILih;)V")
    public static final void method929(Object arg0, int arg1, class80 arg2) {
        field2602++;
        if (arg2.field1627 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field1627.peekEvent() != null; var3++) {
            class189.method1260(1L, 1);
        }
        if (arg0 != null) {
            arg2.field1627.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
        if (arg1 != 1001) {
            field2600 = null;
        }
    }
}
