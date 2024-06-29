import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class212 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lqe;")
    public static class179 field3951 = class206.method1380("event_opbase", (byte) -37);

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field3954 = -1;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "[[I")
    public static int[][] field3953 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static final void method1403(int arg0) {
        field3952++;
        class201.field3727++;
        class81.field1564.method70((byte) -62, arg0);
        for (class98 var1 = (class98) class36.field797.method913(0); var1 != null; var1 = (class98) class36.field797.method907(true)) {
            if (var1.field1829 == 0) {
                class110.method716(1, true, var1);
            }
        }
        if (class120.field2249 != null) {
            class139.method880(class120.field2249, 115);
            class120.field2249 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method1404(byte arg0) {
        field3953 = null;
        field3951 = null;
        if (arg0 != -45) {
            field3953 = null;
        }
    }
}
