import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class222 {

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "Lau;")
    public static class692 field2941 = new class692(10);

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "[I")
    public static int[] field2942 = new int[32];

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2944 = null;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field2943 = -1;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1390(boolean arg0) {
        field2945++;
        class489 var1 = class704.method3942(0, 15, 0);
        if (!arg0) {
            var1.method2799(-115);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V", line = 33)
    public static void method1391(byte arg0) {
        field2941 = null;
        field2944 = null;
        field2942 = null;
        if (arg0 != -68) {
            method1391((byte) 119);
        }
    }
}
