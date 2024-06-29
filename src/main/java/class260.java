import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class260 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "Lwa;")
    public static class281 field4260 = new class281();

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "Lec;")
    public static class25 field4262 = new class25(64);

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Z")
    public static boolean field4264 = false;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[I")
    public static int[] field4263 = new int[4096];

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "[I")
    public static int[] field4266;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILfa;)V")
    public static final void method1803(int arg0, class273 arg1) {
        field4261++;
        if (arg0 == 19326) {
            class285.field4761 = arg1;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BZ)V")
    public static final void method1804(byte arg0, boolean arg1) {
        class11.field141 = new int[104];
        class144.field2263 = new int[104];
        class196.field3121 = new int[104];
        if (arg0 != -41) {
            return;
        }
        class78.field1244 = new int[104];
        class161.field2538 = 99;
        field4259++;
        class178.field2769 = new int[104];
        class179.field2779 = new int[5];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class137.field2118 = new byte[var2][104][104];
        class202.field3233 = new int[var2][105][105];
        class92.field1406 = new byte[var2][105][105];
        class225.field3573 = new byte[var2][104][104];
        class22.field282 = new byte[var2][104][104];
        class216.field3442 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    public static void method1805(int arg0) {
        field4266 = null;
        field4263 = null;
        field4260 = null;
        field4262 = null;
        if (arg0 != -1) {
            method1803(72, (class273) null);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4263[var0] = class71.method449(-33, var0);
        }
        field4266 = new int[100];
    }
}
