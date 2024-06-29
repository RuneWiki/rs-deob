import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class160 {

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lig;")
    public static class206 field1972 = new class206(69, 6);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lxa;")
    public static class433 field1971;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 6)
    public static void method923(int arg0) {
        if (arg0 != -11133) {
            method923(-44);
        }
        field1972 = null;
        field1971 = null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 17)
    public static final void method924(int arg0) {
        class608.field8878 = class281.field3921.field6077 + class281.field3921.field6073 + 2;
        class236.field3378 = new String[500];
        class122.field1532 = class261.field3710.field6077 + class261.field3710.field6073 + arg0;
        field1970++;
        for (int var1 = 0; var1 < class236.field3378.length; var1++) {
            class236.field3378[var1] = "";
        }
    }
}
