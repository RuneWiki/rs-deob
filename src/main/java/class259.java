import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class259 {

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
    public static int[] field3699 = new int[3];

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lvd;")
    public static class39 field3698;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Llh;")
    public static class528 field3702;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[Lpga;")
    public static class536[] field3701;

    @OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3703++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static void method1687(boolean arg0) {
        field3701 = null;
        if (!arg0) {
            field3699 = null;
            field3698 = null;
            field3702 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
    public class259(int arg0) {
        this.field3704 = arg0;
    }
}
