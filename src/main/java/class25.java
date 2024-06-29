import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class25 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Z")
    public static boolean field245 = true;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 15)
    public static final void method154(int arg0) {
        field248++;
        if (class225.field3064 != null) {
            class225.field3064.method1868(-29804);
        }
        if (class444.field6488 != null) {
            class444.field6488.method1868(-29804);
        }
        class45.method285(22050, 2, class159.field2255, 48000);
        if (arg0 != 5) {
            field247 = 115;
        }
        class225.field3064 = class444.method2751(class323.field4554, (byte) 126, 22050, class348.field5096, 0);
        class225.field3064.method1865(class153.field2153, 126);
        class444.field6488 = class444.method2751(class323.field4554, (byte) 125, 2048, class348.field5096, 1);
        class444.field6488.method1865(class135.field1884, arg0 + 92);
    }
}
