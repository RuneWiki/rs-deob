import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public abstract class class464 {

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "Lbi;")
    public static class104 field7123 = new class104(112, -1);

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "[I")
    public static int[] field7126 = new int[32];

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field7124 = 1403;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field7128 = 0;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Lqu;")
    public static class219 field7125 = new class219(69, 8);

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "F")
    public static float field7127;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Lj;")
    public static class235 field7130;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method2907(int arg0) {
        field7130 = null;
        field7125 = null;
        field7123 = null;
        if (arg0 <= 63) {
            field7129 = 97;
        }
        field7126 = null;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
    public abstract void method168(int arg0);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)I")
    public abstract int method170(int arg0, int arg1);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)J")
    public abstract long method169(boolean arg0);
}
