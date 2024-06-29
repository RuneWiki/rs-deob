import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class471 extends IOException {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field6716 = 0;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lke;")
    public static class622 field6714 = new class622(128, -2);

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lcr;")
    public static class597 field6717 = new class597();

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lpd;")
    public static class267 field6718 = new class267();

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "F")
    public static float field6719;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lcb;")
    public static class544 field6715;

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class471(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method2787(byte arg0) {
        field6717 = null;
        field6718 = null;
        field6715 = null;
        int var1 = 119 / ((4 - arg0) / 59);
        field6714 = null;
    }
}
