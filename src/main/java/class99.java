import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class99 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
    public static int[] field1470 = new int[2];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Ld;")
    public static class267 field1467;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)J")
    public abstract long method815(boolean arg0);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
    public static final void method816(int arg0, int arg1, int arg2) {
        class114 var3 = class488.field7062[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class542.method3172(var3.field1762);
        class542.method3172(var3.field1764);
        if (var3.field1762 != null) {
            var3.field1762 = null;
        }
        if (var3.field1764 != null) {
            var3.field1764 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method817(int arg0) {
        field1467 = null;
        field1470 = null;
        if (arg0 != 13416) {
            field1469 = 78;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)[Lnha;")
    public static final class686[] method818(byte arg0) {
        if (arg0 != 18) {
            method816(58, -65, -81);
        }
        field1471++;
        return new class686[] { class256.field4031, class665.field9444, class651.field9248 };
    }
}
