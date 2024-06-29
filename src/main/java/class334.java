import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class334 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field5054 = 0;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Ls;")
    public static class186 field5055 = new class186(76, 7);

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "[Lnn;")
    public static class289[] field5057 = new class289[2048];

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method2105(int arg0) {
        field5055 = null;
        field5057 = null;
        if (arg0 != -15664) {
            field5054 = -41;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static final void method2106(byte arg0) {
        class479.field7061.method2475((byte) 67);
        field5056++;
        class50.field1009.method2475((byte) 67);
        class41.field575.method2475((byte) 67);
        class306.field4561.method2475((byte) 67);
        if (arg0 < 67) {
            field5057 = null;
        }
        class103.field1951.method2475((byte) 67);
    }
}
