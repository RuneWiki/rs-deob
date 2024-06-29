import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class528 {

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Lofa;")
    public static class347 field7306 = null;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field7308 = 0;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static void method3057(int arg0) {
        field7306 = null;
        if (arg0 != 28447) {
            method3058(6);
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
    public static final void method3058(int arg0) {
        field7307++;
        if (arg0 != 0) {
            method3058(-120);
        }
        if (!class446.field6417) {
            class446.field6417 = true;
            class7.field61 = true;
            class49.field495 += (-12.0F - class49.field495) / 2.0F;
        }
    }
}
