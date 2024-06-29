import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class150 {

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Lsv;")
    public static class570 field2403 = new class570(71, 2);

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "[I")
    public static int[] field2406 = new int[25];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Los;")
    public static class277 field2404;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[Lmq;")
    public static class85[] field2405;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)Z", line = 7)
    public static final boolean method1181(byte arg0, int arg1) {
        int var2 = -90 / ((-arg0 - 82) / 35);
        field2402++;
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 29)
    public static void method1182(byte arg0) {
        field2405 = null;
        field2403 = null;
        field2404 = null;
        field2406 = null;
        int var1 = -119 % ((arg0 - 61) / 54);
    }
}
