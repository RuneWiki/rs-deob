import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class63 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lhi;")
    public static class82 field979 = class95.method664((byte) -121, "Annuler");

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lhi;")
    public static class82 field980 = class95.method664((byte) -98, "document)3cookie=(R");

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lhi;")
    public static class82 field983 = class95.method664((byte) -119, ")2");

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lum;")
    public static class222 field982;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 19)
    public static final void method406(int arg0) {
        if (class67.field1046 != null) {
            class26 var1 = class67.field1046;
            synchronized (class67.field1046) {
                class67.field1046 = null;
            }
        }
        if (arg0 != 0) {
            field984 = 17;
        }
        field978++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 41)
    public static void method407(boolean arg0) {
        field980 = null;
        field982 = null;
        field983 = null;
        field979 = null;
        if (!arg0) {
            field980 = (class82) null;
        }
    }
}
