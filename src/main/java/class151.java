import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class151 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field2393 = 0;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I")
    public static final int method1121(int arg0, int arg1, int arg2) {
        if (arg1 <= 7) {
            return -72;
        }
        field2395++;
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static final void method1122(int arg0) {
        class269.field4330.method1420((byte) -84);
        field2394++;
        class289.field4618.method1420((byte) 112);
        if (arg0 != -1) {
            field2393 = -31;
        }
    }
}
