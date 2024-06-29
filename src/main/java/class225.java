import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public abstract class class225 {

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "Lod;")
    public static class673 field3367;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
    public static void method1487(boolean arg0) {
        if (!arg0) {
            method1487(false);
        }
        field3367 = null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILhm;)Lhm;")
    public abstract class216 method1488(int arg0, class216 arg1);

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)Lvp;")
    public static final class613 method1489(boolean arg0) {
        field3366++;
        if (arg0) {
            return class603.field8672 < class432.field6219.length ? class432.field6219[class603.field8672++] : null;
        } else {
            return null;
        }
    }
}
