import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class242 {

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Lcf;")
    private static class93 field4370 = class147.method1066("pt", -48);

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lcf;")
    public static class93 field4372 = class147.method1066("Hidden)2", -48);

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lcf;")
    private static class93 field4368 = class147.method1066("de", -48);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lcf;")
    private static class93 field4364 = class147.method1066("fr", -48);

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field4371 = -2;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lcf;")
    public static class93 field4373 = class147.method1066("hint_headicons", -48);

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lcf;")
    private static class93 field4366 = class147.method1066("en", -48);

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[Lcf;")
    public static class93[] field4365 = new class93[] { field4366, field4368, field4364, field4370 };

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Ldh;")
    public static class120 field4374;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[Lli;")
    public static class288[] field4367;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1649(int arg0) {
        field4364 = null;
        field4372 = null;
        if (arg0 != -27250) {
            return;
        }
        field4368 = null;
        field4365 = null;
        field4366 = null;
        field4374 = null;
        field4370 = null;
        field4373 = null;
        field4367 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static final void method1650(boolean arg0) {
        class287.field5139.method294(0);
        field4375++;
        if (!arg0) {
            method1650(true);
        }
    }
}
