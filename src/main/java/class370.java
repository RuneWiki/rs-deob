import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class370 extends InputStream {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "F")
    public static float field5059 = 1.0F;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field5058 = 0;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "F")
    public static float field5062;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Z")
    public static boolean field5061;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/lang/String;)V", line = 11)
    public static final void method2158(byte arg0, String arg1) {
        field5056++;
        if (class145.field1611 == null) {
            return;
        }
        class2.field11++;
        if (arg0 <= 46) {
            field5061 = true;
        }
        class653 var2 = class699.method3845((byte) 45, class39.field395, class471.field6757);
        var2.field9158.method658(class72.method382(2018672392, arg1), (byte) 114);
        var2.field9158.method672((byte) -108, arg1);
        class568.method3220(var2, (byte) 112);
    }

    @OriginalMember(owner = "client!ic", name = "read", descriptor = "()I", line = 30)
    public final int read() {
        class452.method2602(30000L, (byte) -97);
        field5060++;
        return -1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZZ)V", line = 44)
    public static final void method2159(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class330.field4163++;
            class204.method1227(-4481);
        }
        if (arg0 >= -6) {
            field5061 = true;
        }
        field5057++;
        if (arg1) {
            class385.field5196++;
            class168.method915(23876);
        }
    }
}
