import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class76 extends class331 {

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field1271 = 0;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "Lph;")
    private static class229 field1276 = class266.method1858("wave:", 0);

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Lph;")
    public static class229 field1273 = class266.method1858("ondulation:", 0);

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static volatile int field1274 = 0;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field1277 = -1;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lph;")
    public static class229 field1272 = field1276;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "Lph;")
    public static class229 field1280 = field1276;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field1278 = 2;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V", line = 22)
    public static final void method576(int arg0, int arg1) {
        field1279++;
        if (arg0 == -1 || !class133.field2164[arg0]) {
            return;
        }
        class75.field1264.method518(arg0, arg1);
        if (class37.field604[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class37.field604[arg0].length; var3++) {
            if (class37.field604[arg0][var3] != null) {
                if (class37.field604[arg0][var3].field4920 == 2) {
                    var2 = false;
                } else {
                    class37.field604[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class37.field604[arg0] = null;
        }
        class133.field2164[arg0] = false;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V", line = 74)
    public static void method577(int arg0) {
        field1273 = null;
        field1280 = null;
        int var1 = -26 / ((-arg0 - 72) / 54);
        field1272 = null;
        field1276 = null;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)V", line = 122)
    public static final void method578(int arg0, int arg1) {
        int var2 = -16 / ((39 - arg1) / 33);
        field1275++;
        class294.field4803.method1418((byte) -17, arg0);
        class208.field3419.method1418((byte) -17, arg0);
    }
}
