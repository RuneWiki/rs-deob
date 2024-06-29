import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class388 {

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field5401 = 0;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Z")
    public static boolean field5402 = false;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZLvg;)V")
    public static final void method2416(int arg0, int arg1, boolean arg2, class108 arg3) {
        if (!arg2) {
            field5398 = 113;
        }
        class109.field1683 = arg1;
        field5403++;
        class177.field2532 = arg3;
        class233.field3337 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)I")
    public static final int method2417(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field5400++;
        if (arg3 == var4) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2418(int arg0, String arg1) {
        field5397++;
        return arg0 < 81 ? -36 : class144.method1044(true, arg1, 10, (byte) -117);
    }
}
