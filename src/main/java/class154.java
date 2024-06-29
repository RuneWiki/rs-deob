import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class154 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Luf;")
    private static class168 field2427 = class148.method1019(-1720, "Started 3d library");

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Luf;")
    private static class168 field2431 = class148.method1019(-1720, "K");

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Luf;")
    public static class168 field2428 = field2427;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Luf;")
    public static class168 field2432 = field2431;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Luf;")
    public static class168 field2429 = field2431;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lfj;")
    public static class283 field2426;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[I")
    public static int[] field2430;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 23)
    public static void method1099(int arg0) {
        field2429 = null;
        field2430 = null;
        field2428 = null;
        field2427 = null;
        if (arg0 < 85) {
            method1099(41);
        }
        field2431 = null;
        field2432 = null;
        field2426 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Lsk;", line = 40)
    public static final class193 method1100(boolean arg0) {
        if (arg0) {
            return (class193) null;
        } else {
            field2425++;
            class232 var1 = new class232(class56.field724, class206.field3381, field2430[0], class254.field4341[0], class205.field3374[0], class214.field3490[0], class236.field3779[0], class123.field1905);
            class244.method1679(-14642);
            return var1;
        }
    }
}
