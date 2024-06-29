import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class308 {

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public static int field4432 = 0;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    public int field4429;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public int field4430;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "Lhu;")
    public static class133 field4428;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "[Lhu;")
    public static class133[] field4431;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "[Lhu;")
    public static class133[] field4434;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)V", line = 10)
    public static void method1900(boolean arg0) {
        field4428 = null;
        if (arg0) {
            field4432 = -31;
        }
        field4431 = null;
        field4434 = null;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1901(int arg0) {
        class238.field3352.method1093((byte) 85);
        field4433++;
        for (int var1 = arg0; var1 < 32; var1++) {
            class298.field4239[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class433.field5954[var2] = 0L;
        }
        class167.field2587 = 0;
    }
}
