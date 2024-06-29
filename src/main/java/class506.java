import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class506 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Lhe;")
    public static class573 field7352 = new class573("WTI", 5);

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Liga;")
    public static class494 field7353;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    public static void method3088(boolean arg0) {
        if (!arg0) {
            method3088(true);
        }
        field7353 = null;
        field7352 = null;
    }
}
