import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class15 {

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "Lf;")
    public static class10 field137 = class23.method139("world", (byte) -74);

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "J")
    public static volatile long field138 = 0L;

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Lf;")
    public static class10 field141 = class23.method139("Tannery", (byte) -75);

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "I")
    public static int field144 = 0;

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "J")
    public static long field139;

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "La;")
    public static class1 field142;

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "[B")
    public static byte[] field140;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(ILea;Ljava/lang/Object;)V", line = 6)
    public static final void method106(int arg0, class9 arg1, Object arg2) {
        if (arg1.field95 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field95.peekEvent() != null; var3++) {
            class24.method142(112, 1L);
        }
        if (arg0 != 26972) {
            field140 = null;
        }
        if (arg2 != null) {
            arg1.field95.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V", line = 52)
    public static void method107(int arg0) {
        field140 = null;
        field137 = null;
        field141 = null;
        if (arg0 > -41) {
            field137 = null;
        }
        field142 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(I)B", line = 82)
    public static final byte method108(int arg0) {
        int var1 = -13 % ((54 - arg0) / 48);
        return class20.field185 == null ? 0 : class20.field185[class41.field538];
    }
}
