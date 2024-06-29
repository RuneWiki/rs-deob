import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class294 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field3824 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lwg;")
    public static class58 field3823 = new class58(64);

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lpaa;")
    public static class317 field3826 = new class317(10, 16);

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1800(int arg0, String arg1) {
        System.out.println("Error: " + class311.method1871((byte) 120, "%0a", arg1, "\n"));
        int var2 = -118 % ((arg0 + 59) / 48);
        field3825++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method1801(int arg0) {
        if (arg0 != 16) {
            method1800(87, null);
        }
        field3826 = null;
        field3823 = null;
    }
}
