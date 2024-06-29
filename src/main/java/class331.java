import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class331 {

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "Let;")
    public static class596 field4230 = new class596(2);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "F")
    public static float field4225;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "[[I")
    public static int[][] field4227;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V", line = 6)
    public static void method1916(byte arg0) {
        field4230 = null;
        if (arg0 < -119) {
            field4227 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1917(int arg0) {
        if (arg0 == 2) {
            class719.method4022(-29891);
            field4226++;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZZ)V", line = 30)
    public static final void method1918(boolean arg0, boolean arg1) {
        if (arg0) {
            if (class540.field7482 != -1) {
                class173.method1194(class540.field7482, (byte) -35);
            }
            for (class491 var2 = (class491) class290.field3804.method1156(0); var2 != null; var2 = (class491) class290.field3804.method1158(22706)) {
                if (!var2.method1176((byte) 68)) {
                    var2 = (class491) class290.field3804.method1156(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class178.method1218(256, false, var2, true);
            }
            class540.field7482 = -1;
            class290.field3804 = new class165(8);
            class662.method3720(-72);
            class540.field7482 = class161.field2225;
            class203.method1317(false, false);
            class433.method2476(-122);
            class188.method1270(class540.field7482);
        }
        field4229++;
        class721.field10041 = "";
        class310.field4085 = "";
        class159.field2165 = false;
        class552.method3203(-99);
        class740.field10331 = -1;
        class741.method4131(class603.field8397, (byte) -118);
        class380.field4847 = new class724();
        class380.field4847.field5801 = class409.field5183 * 512 / 2;
        class380.field4847.field264[0] = class409.field5183 / 2;
        class380.field4847.field5797 = class543.field7597 * 512 / 2;
        class380.field4847.field260[0] = class543.field7597 / 2;
        class318.field4121 = 0;
        class450.field5953 = 0;
        if (class650.field9023 == 2) {
            class450.field5953 = class685.field9555 << 9;
            class318.field4121 = class458.field6082 << 9;
        } else {
            class491.method2899((byte) -49);
        }
        if (!arg1) {
            field4230 = null;
        }
        class421.method2347((byte) -47);
    }
}
