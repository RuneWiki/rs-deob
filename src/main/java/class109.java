import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class109 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lub;")
    public static class15 field1413 = new class15(50);

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
    public static int[] field1414 = new int[3];

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLvq;J)V", line = 3)
    public static final void method663(byte arg0, class269 arg1, long arg2) {
        class317.field4655 = 0;
        class140.field2138 = class56.field748;
        field1415++;
        class56.field748 = 0;
        if (arg0 != -53) {
            return;
        }
        long var4 = class18.method107(-16145);
        for (class328 var6 = (class328) class130.field1904.method1082(126); var6 != null; var6 = (class328) class130.field1904.method1078(false)) {
            if (var6.method2161(arg1, arg2)) {
                class317.field4655++;
            }
        }
        if (class413.field5904 && (arg2 % 100L) == 0L) {
            System.out.println("Particle system count: " + class130.field1904.method1070(0) + ", running: " + class317.field4655 + ". Particles: " + class56.field748 + ". Time taken: " + (class18.method107(-16145) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)V", line = 43)
    public static void method669(int arg0) {
        field1413 = null;
        field1414 = null;
        if (arg0 != 23355) {
            field1414 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)I")
    public abstract int method664(int arg0);

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)C")
    public abstract char method665(int arg0);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)J")
    public abstract long method666(byte arg0);

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Z")
    public abstract boolean method667(int arg0);

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)I")
    public abstract int method668(int arg0);
}
