import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class356 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "J")
    public static long field4831 = 0L;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lgj;")
    public static class593 field4832 = new class593();

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "[S")
    public static short[] field4834 = new short[256];

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Ldb;")
    public static class298 field4833 = new class298(102, 7);

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Loa;")
    public static class651 field4835;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method2106(int arg0) {
        field4832 = null;
        field4834 = null;
        field4833 = null;
        if (arg0 != 19857) {
            method2106(-39);
        }
        field4835 = null;
    }
}
