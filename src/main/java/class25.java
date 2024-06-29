import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class25 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lkg;")
    public static class115 field406 = new class115(128);

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Llc;")
    public static class122 field409 = new class122(4096);

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[Z")
    public static boolean[] field410 = new boolean[100];

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lpb;")
    public static class165 field405;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static void method190(boolean arg0) {
        field405 = null;
        field406 = null;
        if (arg0) {
            method190(false);
        }
        field409 = null;
        field410 = null;
    }
}
