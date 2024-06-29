import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class186 {

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "[I")
    public static int[] field2568 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2573 = new String[100];

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public int field2567;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "J")
    public long field2569;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lhc;")
    public static class235 field2559;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lhc;")
    public static class235 field2571;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lsa;")
    public class268 field2561;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lsa;")
    public class268 field2566;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lsa;")
    public class268 field2572;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/Object;BLd;)V")
    public static final void method1194(Object arg0, byte arg1, class244 arg2) {
        if (arg1 != 13) {
            return;
        }
        field2560++;
        if (arg2.field3720 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field3720.peekEvent() != null; var3++) {
            class28.method182(1L, arg1 ^ 0x76);
        }
        if (arg0 != null) {
            arg2.field3720.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1195(int arg0) {
        field2568 = null;
        field2571 = null;
        field2559 = null;
        if (arg0 != 0) {
            method1196((class235) null, (class133) null, -6, (class235) null);
        }
        field2573 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lhc;Lob;ILhc;)V")
    public static final void method1196(class235 arg0, class133 arg1, int arg2, class235 arg3) {
        if (arg2 <= 70) {
            method1196((class235) null, (class133) null, -104, (class235) null);
        }
        field2571 = arg3;
        class120.field1683 = arg1;
        field2565++;
        class221.field3322 = arg0;
        if (class221.field3322 != null) {
            class61.field853 = class221.field3322.method1577(1, -6339);
        }
        if (field2571 != null) {
            class12.field117 = field2571.method1577(1, -6339);
        }
    }
}
